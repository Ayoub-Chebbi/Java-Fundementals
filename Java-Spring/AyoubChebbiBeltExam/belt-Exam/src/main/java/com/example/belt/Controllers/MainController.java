package com.example.belt.Controllers;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.belt.Models.LoginUser;
import com.example.belt.Models.User;
import com.example.belt.Models.TableMaster;
import com.example.belt.Services.TableMasterService;
import com.example.belt.Services.UserService;

@Controller
public class MainController {

  @Autowired
  private UserService userServ;
  
  @Autowired
  private TableMasterService tbServ;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("newUser", new User());
    model.addAttribute("newLogin", new LoginUser());
    return "index.jsp";
  }

  @PostMapping("/register")
  public String register(@Valid @ModelAttribute("newUser") User newUser,
      BindingResult result, Model model, HttpSession session) {

    userServ.register(newUser, result);

    if (result.hasErrors()) {
      model.addAttribute("newLogin", new LoginUser());
      return "index.jsp";
    }

    session.setAttribute("userId", newUser.getId());

    return "redirect:/home";
  }

  @PostMapping("/login")
  public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin,
      BindingResult result, Model model, HttpSession session) {

    User user = userServ.login(newLogin, result);

    if (result.hasErrors()) {
      model.addAttribute("newUser", new User());
      return "index.jsp";
    }

    session.setAttribute("userId", user.getId());

    return "redirect:/home";
  }

  @GetMapping("/logout")
  public String logout(HttpSession session) {
    session.removeAttribute("userId");
    return "redirect:/";
  }

  @GetMapping("/home")
  public String welcome(Model model, HttpSession session) {
      Long userId = (Long) session.getAttribute("userId");
      if (userId == null) {
          return "redirect:/";
      }
      User user = userServ.findById(userId);
      List<TableMaster> serverTables = tbServ.findByUserSortedByArrivalTime(user);
      model.addAttribute("user", user);
      model.addAttribute("serverTables", serverTables);
      return "dashboard.jsp";
  }


  @GetMapping("/tables")
  public String showAllTables(Model model) {
      List<TableMaster> tableMasters = tbServ.allTables();
      model.addAttribute("tableMasters", tableMasters);
      return "ShowAllTables.jsp";
  }

  @GetMapping("/tables/{id}/edit")
  public String editTable(@PathVariable("id") Long id, Model model) {
    TableMaster table = tbServ.findTable(id);
    model.addAttribute("table", table);
    return "edit.jsp";
  }

  @PostMapping("/tables/{id}/update")
  public String updateTable(@PathVariable("id") Long id, @Valid @ModelAttribute("table") TableMaster table,
      BindingResult result) {
    if (result.hasErrors()) {
      return "edit.jsp";
    }
    tbServ.updateTable(table);
    return "redirect:/tables";
  }
  
  @PostMapping("/tables/new")
  public String addTable(@Valid @ModelAttribute("table") TableMaster table, BindingResult result, HttpSession session) {
      if (result.hasErrors()) {
          return "redirect:/";
      }
      
      Long userId = (Long) session.getAttribute("userId");
      if (userId == null) {
          return "redirect:/";
      }
      
      User user = userServ.findById(userId);
      table.setUser(user);
      
      tbServ.createTable(table);
      return "redirect:/home";
  }

  
  @GetMapping("/tables/new")
  public String showTable() {
    return "newTable.jsp";
  }
  
  @DeleteMapping("/tables/delete/{id}")
  public String delete(@PathVariable("id") Long id) {
      tbServ.deleteTable(id);
      return "redirect:/home";
  }

  /*@GetMapping("/tables/giveup/{id}")
  public String giveUpTable(@PathVariable("id") Long id) {
      tbServ.giveUpTable(id);
      return "redirect:/home";
  }

  @GetMapping("/see-other-tables")
  public String seeOtherTables(Model model) {
      List<TableMaster> otherTables = tbServ.findGaveUpTables();
      model.addAttribute("otherTables", otherTables);
      return "gaveUpTables.jsp";
  }

  @GetMapping("/tables/takeback/{id}")
  public String takeBackTable(@PathVariable("id") Long id) {
      tbServ.takeBackTable(id);
      return "redirect:/home";
  }
  
*/
}

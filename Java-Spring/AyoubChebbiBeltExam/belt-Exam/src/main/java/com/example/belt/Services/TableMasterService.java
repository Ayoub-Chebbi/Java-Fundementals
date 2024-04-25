package com.example.belt.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.belt.Models.TableMaster;
import com.example.belt.Models.User;
import com.example.belt.Repositories.TableMasterRepository;

@Service
public class TableMasterService {
	private final TableMasterRepository tableMasterRepository;
	
	public TableMasterService(TableMasterRepository tableMasterRepository) {
		this.tableMasterRepository = tableMasterRepository;
	}
	
	public List<TableMaster> allTables(){
		return tableMasterRepository.findAll();
	}
	
	public List<TableMaster> findByUser(User user) {
        return tableMasterRepository.findByUser(user);
    }
	public TableMaster createTable(TableMaster book) {
		return tableMasterRepository.save(book);
	}
	
	public TableMaster findTable(Long id) {
		Optional<TableMaster> optionalTable = tableMasterRepository.findById(id);
		if(optionalTable.isPresent()) {
			return optionalTable.get();
		}else {
			return null;
		}
	}
	
	public List<TableMaster> findByUserSortedByArrivalTime(User user) {
        return tableMasterRepository.findByUserOrderByCreatedAtDesc(user);
    }
	
	public TableMaster updateTable(TableMaster table) {
		return tableMasterRepository.save(table);
	}
	
	public void deleteTable(Long id) {
		Optional<TableMaster> optionalTable = tableMasterRepository.findById(id);
		if(optionalTable.isPresent()) {
			tableMasterRepository.deleteById(id);
		}
	}
	
	public void giveUpTable(Long id) {
        Optional<TableMaster> tableOptional = tableMasterRepository.findById(id);
        if (tableOptional.isPresent()) {
            TableMaster table = tableOptional.get();
            table.setGaveUp(true);
            tableMasterRepository.save(table);
        }
    }

    public List<TableMaster> findGaveUpTables() {
        return tableMasterRepository.findByGaveUpTrue();
    }

    public void takeBackTable(Long id) {
        Optional<TableMaster> tableOptional = tableMasterRepository.findById(id);
        if (tableOptional.isPresent()) {
            TableMaster table = tableOptional.get();
            table.setGaveUp(false);
            tableMasterRepository.save(table);
        }
    }
}
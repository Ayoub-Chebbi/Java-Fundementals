package com.example.belt.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.belt.Models.TableMaster;
import com.example.belt.Models.User;

@Repository
public interface TableMasterRepository extends CrudRepository<TableMaster, Long> {
	List<TableMaster> findAll();
	List<TableMaster> findByUser(User user);
	List<TableMaster> findByUserOrderByCreatedAtDesc(User user);
	List<TableMaster> findByGaveUpTrue();
}



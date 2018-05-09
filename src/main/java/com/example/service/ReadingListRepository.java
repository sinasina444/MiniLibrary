package com.example.service;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.*;

//long 是book类的id的属性
public interface ReadingListRepository extends JpaRepository<Book,Long>{
	List<Book> findByReader(String reader);
}	

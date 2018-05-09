package com.example.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.service.ReadingListRepository;

import java.util.List;

@RestController
@RequestMapping("/")
public class ReadingListController {
	private ReadingListRepository readingListRepository;
	@Autowired
	public ReadingListController(ReadingListRepository readingListRepository){
		this.readingListRepository = readingListRepository;
	}
	
	@RequestMapping(value="/{reader}",method=RequestMethod.GET)
	public String readersBooks(@PathVariable("reader") String reader, Model model) {
		List<Book> readingList = readingListRepository.findByReader(reader);
		if(readingList != null) {
			model.addAttribute("books",readingList);
		}
		return "readingList";
	}
	
	/*
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	String testString() {
		return "nihao";
	}
	*/
	
	@RequestMapping(value="/{reader}",method=RequestMethod.POST)
	public String addToReadingList(@PathVariable("reader") String reader, Book book){
		book.setReader(reader);
		readingListRepository.save(book);
		return "redirect:/{reader}";
	}
}

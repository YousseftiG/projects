package com.ensah.Biblio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.app.business.bo.Book;
import com.app.business.dao.BookDao;
import com.app.business.dao.impl.BookDaoImpl;
import com.app.business.service.BookService;
import com.app.business.service.impl.BookServiceImpl;
import com.configuration.AppConfig;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

public class TestUser  {
	public static void main(String[] args) {
		ApplicationContext springcontext = new AnnotationConfigApplicationContext(AppConfig.class);
		
	  BookService  bookService= springcontext.getBean(BookServiceImpl.class);
	  				
	  
		Book o = new Book();
		bookService.addNewBook(o);
	
		
	} 
}

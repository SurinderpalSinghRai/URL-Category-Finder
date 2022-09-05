package com.fetchUrlText;

import java.util.ArrayList;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fetchUrlText.Model.CategoryKeywords;

@SpringBootApplication
public class FetchUrlTextApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(FetchUrlTextApplication.class, args);
	}
	


	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//adding data to the hashmap category     
	   ArrayList<String> FirstKeywordsList = new ArrayList<String>();
	   	FirstKeywordsList.add("starwars");
	   	FirstKeywordsList.add("star wars");
	   	FirstKeywordsList.add("starwar");
	    FirstKeywordsList.add("star");
	    FirstKeywordsList.add("r2d2");
	   	
	   	ArrayList<String> secondKeywordsList = new ArrayList<String>();
	   	secondKeywordsList .add("basketball");
	   	secondKeywordsList .add("nba");
	   	secondKeywordsList .add("lebron james");
	   	secondKeywordsList .add("ncaa");
		secondKeywordsList .add("john stokton");
		secondKeywordsList .add("anthony davis");

		
		CategoryKeywords ck = new CategoryKeywords();

		ck.add("Basketball", secondKeywordsList );
	    ck.add("starwars", FirstKeywordsList);
//	   	ck.display();
	    //System.out.println(ck.getMap());
	
		
	}
	
	
}

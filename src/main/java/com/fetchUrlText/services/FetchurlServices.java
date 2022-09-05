package com.fetchUrlText.services;

import org.springframework.stereotype.Service;

import com.fetchUrlText.Model.CategoryKeywords;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


@Service
public class FetchurlServices {
	
	String urlText;
	
	public String getUrlText(String url) throws IOException
	{
		Document doc =Jsoup.connect(url).get();
	    String txt=doc.getElementsByTag("body").get(0).text();
	    urlText=txt;
	    return txt;
	    
	}
	
	public String checkCategory()
	{
		String result=null;
		String low;
		 //creating object for modelclass     
	       CategoryKeywords catKey = new CategoryKeywords();
		  //injecting the hashmap from model
	      HashMap<String, ArrayList<String>> hm= catKey.getMap();
	      
	      //comparing the list and map and priniting the matched value
	      for(Map.Entry<String, ArrayList<String>> entry : hm.entrySet()) {
	    	  low=urlText.toLowerCase();
	      	  for (String value : entry.getValue())
	      		  if(urlText.contains(value) | low.contains(value)) {
	      			  result=("The url has a keyword as: "+ value+" and it belongs to"+" "+entry.getKey()+" "+"category");
	      			//hm.entrySet().stream().filter(v->urlText.contains(v.getValue()).forEach(obj->System.out.println(obj));

	      		  }
	        
	    	  
	    	 /* hm.entrySet().stream()
	          .forEach(e->e.getValue().stream().forEach(value->{

	          if(list1.contains(value)){System.out.println("The category is :"+e.getKey());}*/
	      
	      /*hm.entrySet().stream().forEach(e->e.getValue().stream().filter(v->{
	    	  if(urlText.contains(v))
	    	  { 
	    		  System.out.println("The category is :"+ v);
	    		  return true;
	    	  }
	    	  else {
	    		  System.out.println("abc");
	    		  return false;
	    	  }
	      }));*/
	      
	
	      		 
	      	  
           
	     
	     
	      /*for(Map.Entry<String, ArrayList<String>> entry : hm.entrySet()) {
    	  low=urlText.toLowerCase();*/
      	  /*for (String value : entry.getValue())
      		  if(urlText.contains(value) | low.contains(value)) {
      			  result=("The url has a keyword as: "+ value+" and it belongs to"+" "+entry.getKey()+" "+"category");
      		  }*/
      		  //hm.entrySet().stream().filter(v->urlText.contains((CharSequence) v.getValue())).forEach(obj->System.out.println(obj));

      	  

     //return "abc";
	    

    }
	      return result;
}
}


















// low=urlText.toLowerCase();
/*hm.entrySet().stream()
.forEach(e->e.getValue().stream()
.filter(v->urlText.contains(v) | low.contains(v))
.collect(Collectors.toList()).forEach(word->System.out.println(word)));*/

/*hm.entrySet().stream()
.forEach(e->{
	 if (e.getValue().stream().filter(v->urlText.contains(v) | low.contains(v)) != null) {
		 System.out.println(e.getKey());
		 return;
		 
	 }
});*/











/*ArrayList<String> list= new ArrayList<String>();
ArrayList<String> list1= new ArrayList<String>();*/


/* list1 = (ArrayList<String>) list.stream()
.map(String::toLowerCase)
.collect(Collectors.toList());*/

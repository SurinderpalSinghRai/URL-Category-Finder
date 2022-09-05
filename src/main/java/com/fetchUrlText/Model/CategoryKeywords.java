package com.fetchUrlText.Model;

import java.util.ArrayList;
import java.util.HashMap;

public class CategoryKeywords {
	
	static HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	
	public void add(String category, ArrayList<String> keyword)
	{
		map.put(category, keyword);
	}
	
	public void display()
	{
		System.out.println(map);
	}

	public HashMap<String, ArrayList<String>> getMap() {
		return map;
	}

	public void setMap(HashMap<String, ArrayList<String>> map) {
		this.map = map;
	}

}

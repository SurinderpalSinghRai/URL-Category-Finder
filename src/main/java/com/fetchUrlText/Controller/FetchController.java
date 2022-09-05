package com.fetchUrlText.Controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fetchUrlText.services.FetchurlServices;

@Controller
public class FetchController {
	
	@Autowired
	private FetchurlServices fetchServ;
	
	@GetMapping("/urlFormToGetText")
	public String getUrl()
	{
		return "urlForm";
	}
	
	@GetMapping("/urlFormToCheckCategory")
	public String getUrlForm()
	{
		return "urlForm2";
	}
	
	@GetMapping("/getUrlText")
	@ResponseBody
	public String getUrl(@RequestParam("url") String url , Model m) throws IOException
	{
		String str = fetchServ.getUrlText(url);
		m.addAttribute("url" , url);
		m.addAttribute("str", str);
		System.out.println(str);
		return str;
	}
	
	@GetMapping("/urlCategory")
	public String getUrlToCheckCategory(@RequestParam("url") String url , Model m) throws IOException
	{
		m.addAttribute("url" , url);
		String str = fetchServ.getUrlText(url);
		m.addAttribute("str", str);
		String str2 = fetchServ.checkCategory();
		m.addAttribute("str2", str2);
		//System.out.println(str2);
		return "CategoryView";
	}
}

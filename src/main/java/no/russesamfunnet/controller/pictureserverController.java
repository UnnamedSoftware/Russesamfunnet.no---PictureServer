package no.russesamfunnet.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class pictureserverController {
	
	@RequestMapping(value="/hello", produces=MediaType.APPLICATION_JSON_VALUE)
	public String hello(@RequestParam("name") String name){
		if(name != null) {
			return "Hello, " + name;
		}else {
			return "Hello, World!";
		}
		
	}

}

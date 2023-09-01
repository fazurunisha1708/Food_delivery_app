package com.online_delivery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online_delivery.model.ApiModel;
import com.online_delivery.service.ApiService;

@RestController
public class ApiController {
	
   @Autowired
   ApiService apiser;
   
   @PostMapping ("/post")
   public ApiModel add(@RequestBody ApiModel am) {
	   return apiser.saveinfo(am);
   }
   
	@GetMapping ("get")
	public List<ApiModel> show(){
		return apiser.showinfo();
	}
	
	@PutMapping("put")
	public ApiModel updatedetails(@RequestBody ApiModel am)
	{
		return apiser.updateinfo(am);
	}
	
	@DeleteMapping("delete")
	public String delete(@RequestBody ApiModel am)
	{
		apiser.del(am);
		return "successfull deleted";
	}
}
 
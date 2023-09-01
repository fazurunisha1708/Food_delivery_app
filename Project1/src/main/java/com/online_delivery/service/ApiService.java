package com.online_delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_delivery.Repository.Repo;
import com.online_delivery.model.ApiModel;

@Service
public class ApiService {
	
	@Autowired
	Repo project;
	
	public ApiModel saveinfo (ApiModel am) {
		return project.save(am);
	}
    public List<ApiModel> showinfo()
    {
    	return project.findAll();
    }
    public ApiModel updateinfo(ApiModel am)
    {
    	return project.saveAndFlush(am);
    }
    public void del(ApiModel am)
    {
    	 project.delete(am);
    }
}

package com.myboottest.application.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	@RequestMapping(value = "/searchuserdb", method = RequestMethod.POST, produces = {"application/json"})
	@ResponseBody
	public  void searchUserDB(@RequestBody Map<String, Object> params) {
		
		System.out.println("ajax call : " + params.get("searchName") + ", " + params.get("searchAge") + ", " + params.get("searchNo"));
		
	}

}

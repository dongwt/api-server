package com.shildon.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shildon.api.vo.AjaxResult;

/**
 * 
 * @author shildon<shildondu@gmail.com>
 * @date Jul 10, 2016
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
	
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	@ResponseBody
	public AjaxResult test() {
		return new AjaxResult();
	}

}

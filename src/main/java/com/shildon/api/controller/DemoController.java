package com.shildon.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shildon.api.model.AjaxResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 
 * @author shildon<shildondu@gmail.com>
 * @date Jul 10, 2016
 */
@Controller
@RequestMapping("/demo")
@Api(tags = "A Demo")
public class DemoController {
	
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "just test", notes = "again")
	public AjaxResult test(@ApiParam("identity") String id) {
		return new AjaxResult();
	}

}

package com.shildon.api.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author shildon<shildondu@gmail.com>
 * @date Jul 10, 2016
 */
@ApiModel("result")
public class AjaxResult {
	
	@ApiModelProperty("status code")
	private String code;
	@ApiModelProperty("model")
	private Object data;

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

}

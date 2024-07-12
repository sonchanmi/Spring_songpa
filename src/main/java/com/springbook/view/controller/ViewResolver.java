package com.springbook.view.controller;

public class ViewResolver {
	public String prefix;
	public String sufix;
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSufix(String sufix) {
		this.sufix = sufix;
	}
	
	public String getView(String viewName) {
		return prefix + viewName + sufix;
	}

}

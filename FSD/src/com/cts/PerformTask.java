package com.cts;

import java.io.Serializable;

public class PerformTask implements Serializable {

	public PerformTask() {
		// TODO Auto-generated constructor stub
	}
	private String data;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String doTask()
	{
		return "hello world";
	}
}

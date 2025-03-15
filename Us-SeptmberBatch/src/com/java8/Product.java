package com.java8;

public class Product {

	private int pid;
	private String pname;
	private float pprice;
	
	public Product(int pid,String pname,float pprice)
	{
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public float getPprice() {
		return pprice;
	}

	public void setPprice(float pprice) {
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	
	
}

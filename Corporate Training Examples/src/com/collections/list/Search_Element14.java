package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Search_Element14 {
	public static void main(String[] args)
	{
		List<String> list_Col = new ArrayList<String>();
		list_Col.add("Red");
		list_Col.add("Green");
		list_Col.add("Orange");
		list_Col.add("White");
		list_Col.add("Black");
		if (list_Col.contains("Orange"))
		{
			System.out.println("Found the element");
		}
		else
		{
			System.out.println("There is no such element");
		}
	}
}

package com.Strings;

public class Demo2 {
public static void main(String[] args) {
	
	String input="welocome to india good moring welcome to india";
	String[] names=input.split(" ");
	
	int wordcount=1;
	
	for(int i=0;i<names.length;i++)
	{
	  for(int j=i+1;j<names.length;j++)
	  {
		  if(names[i].equals(names[j]))
		  {
			  wordcount=wordcount+1;
			  names[i]="0";
		  }
	  }
	  if(names[i]!="0")
	  {
		  System.out.println(names[i]+" = "+wordcount);
		   wordcount=1;
	  }
	}
	
	
	
}
}

package com.dss;

public class ArrayExcercise5 {

	public static void main(String[] args)
	{
       String s="my name is vivek";
       
       String s1[]=s.split(" ");
       String s2[]=new String[s1.length];
       for(int i=0;i<s1.length;i++)
       {
    	   String s3=s1[i];
    	   String s5="";
    	   for(int j=s3.length()-1;j>=0;j--)
    	   {
    		   s5=s5+s3.charAt(j);
    	   }
    	   s2[i]=s5;
       }
       
       System.out.println("reverse of each word will be :");
       for(int i=0;i<s1.length;i++)
       {
    	   System.out.print(" "+s2[i]);
       }

	}

}

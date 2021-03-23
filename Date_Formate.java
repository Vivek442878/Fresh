package com.velociters.chapter4;

public class Date_Formate 
{

	public static void main(String[] args)
	{
		    
			       int start = 0;                                                     // Word start index
			       int end = 0;                                                       // Word end index
			    
			       String dayStr="";
			       String monthStr="";
			       
			                 ending = "th ";            //if dayStr is greater than 3 then we have to append th and single space
			         
			        	   int maxLength=(monthName[8].length())+7;       //It gives the maximum length of month is september
			        	   
			        	   int lengthOfMonth=(monthName[monthArr[index]-1]).length();
			        
			        	   int total=5+lengthOfMonth;  //add 5 in each length of month for 3rd-- or 10thx+1;
			           
			        
					//		monthStr.length() == 1 ? monthStr.charAt(0) - '1': 9 + monthStr.charAt(1) - '0'  t
					//		it is ternary condition if monthStr.length() is 1 then subtract with '1' with ascii value ex '1'-'1' ,48-48=0;
					//		if monthStr.charAt.length() !=1 then add  9 in monthStr.charAt(0) with ascii and subtract ascii of 0 ex. 11 charAt(0)=1; add 9+49-48=10
			    
			              System.out.println(dayStr + ending + " " +
			              monthName[monthStr.length() == 1 ? monthStr.charAt(0) - '1': 9 + monthStr.charAt(1) - '0'] +
			              sb+"19" + yearStr);
			       
			       }
		}
		
}





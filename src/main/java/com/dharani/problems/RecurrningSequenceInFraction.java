package com.dharani.problems;

import java.util.HashMap;
import java.util.Map;

public class RecurrningSequenceInFraction {


 
    // Driver code
    public static void main(String[] args)
    {
        int numr = 8, denr = 3;
        String res = fractionToDecimal(numr, denr);
        if (res == "")
            System.out.print("No recurring sequence");
        else
            System.out.print("Recurring sequence is "
                             + res);
    }

	private static String fractionToDecimal(int numr, int denr) {
		String res = "";
		
		   int div = 0;
		   int rem = numr % denr;
		
		   Map<Integer,String> records = new HashMap<>();
				   
				   
		   while(rem != 0 && !records.containsKey(rem)) {
			   
			  records.put(rem, res);
			  div = (rem*10) / denr;
			  res = res + div;
              rem = (rem*10) % denr;			   
			   
		   }
		   
		   if( rem == 0) {
			   return "";
		   }
		
		return res;
	}
}
 
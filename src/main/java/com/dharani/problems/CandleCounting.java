package com.dharani.problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandleCounting {

    /*
     * Complete the candlesCounting function below.
     */
    static int candlesCounting(int k, int[][] candles) {
	
        /*
         * Write your code here.
         */
    	int noOfCandles = candles.length;
    	
    	List<int[][]> myList = new ArrayList<>();

    	
    	for(int i=0 ;i <= noOfCandles -k ; i++) {
    		
    		System.out.print(" {"+ candles[i][0] + " ," + candles[i][1]+"} ");
    		
    		for(int j=i+1;j< i+k;j++) {
    			System.out.print(" { "+candles[j][0] + " ," + candles[j][1] +"}");
    			
    			
    			
    		}
    		System.out.println();
    		
    	}
    	
    	
    	
    	return k;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int n = 4;

        int k = 3;

        int[][] candles = {{1,1},{3,2},{2,2},{4,3}};
        
  

 

        int result = candlesCounting(k, candles);
        System.out.println(candles.length);

    }}

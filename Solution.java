
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	class Result {

	    /*
	     * Complete the 'plusMinus' function below.
	     *
	     * The function accepts INTEGER_ARRAY arr as parameter.
	     */

	    public static void plusMinus(List<Integer> arr) {
	    // Write your code here
	    int n=arr.size();
	    int array[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	       array[i]=arr.get(i); 
	    }
	    int pos=0,neg=0,zero=-1;
	    for(int i=0;i<array.length;i++)
	    {
	        if(array[i]>0)
	        {
	            pos++;
	        }
	        else if(array[i]<0)
	        {
	            neg++;
	        }
	        else
	        {
	            if(zero==-1)
	            zero=1;
	            else{
	                zero++;
	            }
	        }
	        System.out.println(pos/n);
	        System.out.println(neg/n);
	        if(zero!=-1)
	        System.out.println(zero/n);
	    }
	    

	    }

	}

	public class Solution {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> arr = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrTemp[i]);
	            arr.add(arrItem);
	        }

	        Result.plusMinus(arr);

	        bufferedReader.close();
	    }
	}



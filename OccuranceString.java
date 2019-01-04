package com.org.collectionPgm;

import java.util.HashMap;
import java.util.Map;

public class OccuranceString {

	public static void main(String[] args) {
		
	    int oneMillion_ = 1_000_000; //new

	    int oneMillion = 1000000;

	    if (oneMillion_ == oneMillion){

	        System.out.println(true);

	    } else{

	        System.out.println(false);

	    }
	    
        int binary = 0b1000; //2^3 = 8

        if (binary == 8){

            System.out.println(true);

        } else{

            System.out.println(false);

        }
		
		// character occurrence more than one
		String s = "geeksforgeeks";
		//not working on string geeksforgeeks
		//s.append("pooja"); not defined for type String 
		char[] a = s.toCharArray();
		for(int i=0; i< a.length; i++){
			char temp = a[i];
			for (int j=i+1 ; j <a.length ; j++){
				if(temp == a[j]){
					System.out.print(temp + "  ");
				}
			}
		}

		System.out.println();
		System.out.println("**************************************************************************");		
		System.out.println("Using HashMap");
		int count = 0; 
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		for (int i=0 ; i < a.length ; i++){
			//if(h.containsKey(a[i])){
				//count = h.get(a[i]);
			//	count++;
				h.put(a[i], 1);
		//	}
		//	else{
			//	h.put(a[i], 1);
		//	}
		}

		for(Map.Entry e : h.entrySet()){
			System.out.println("Character " + e.getKey() + " has occurred " + e.getValue() + " times");
		}

		System.out.println();
		System.out.println("**************************************************************************");	
		//array sort ascending or descending 
		int[] n = {54,62,1,31,42};
		for (int i =0 ; i< n.length; i++){
			int min = n[i];
			for(int j = i+1 ; j < n.length; j++){
				if (min > n[j]){
					n[i] = n[j];
					n[j] = min; 
					min= n[i];
				}
			}
		}
		System.out.println("Sorted Array Elements : ");
		for ( int idx : n){
			System.out.print(idx + " ");
		}
		System.out.println();

		System.out.println();
		System.out.println("**************************************************************************");	

		System.out.println("Array Elemnets without loop (Recurrsion) ");
		printArrayElement(n, 0);

		System.out.println();
		System.out.println("**************************************************************************");	

		String org1 = "POONAM";
		char[] t = org1.toCharArray();
		int idx = t.length-1;
		boolean flag = false;
		for(int i=0 ; i <= (t.length/2) ; i++){
			if ( t[i] == t[idx]){
				idx--;
				flag = true;
			}
			else{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("String Palindrome");
		else
			System.out.println("Not Palindrome");
	}

	
	
	public static void printArrayElement(int[] a, int len){
		if (len < a.length){
			System.out.println(a[len]);
			len++;
			printArrayElement(a, len);
		}
	}

}



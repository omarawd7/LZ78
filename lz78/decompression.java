package lz78;

import java.util.ArrayList;
import java.util.Scanner;

public class decompression {
	
	static ArrayList<String> dictionary2 = new ArrayList<String>(); //for decompression
	
	static void decompress( int index ,String c) {
		if(index==0) {
			 
			 dictionary2.add(c);	
	        }
		else {
			String s= dictionary2.get(index)+c;  
			//System.out.println(s);
			 dictionary2.add(s);
		}		
	}
	////////////////////////////////////
	static void PrintDecompression(){
		System.out.println("The Decompression code");
		for(int i=0;i<dictionary2.size();i++)
		{	
			System.out.print(dictionary2.get(i));
		}		
	}
	/////////////////////////////
	 public static void main(String[] args) {
		    dictionary2.add(0, "");
		    int index;
			int n;
			String c;
			System.out.print("Enter numbers of tags: ");
			Scanner in = new Scanner(System.in);
			n = in.nextInt();

			
			System.out.println("Enter < index , syembol >");
			for (int i = 0; i < n; ++i) {
				index = in.nextInt();
			    c = in.nextLine();
			    
			    decompress(index,c);
			}
			PrintDecompression();

		  //abaababaababbbbbbbbbba

		 /*
					  
			0 a
			0 b
			1 a
			2 a
			4 a
			4 b
			2 b
			7 b	
			8 b
			0 a
		  */
			
	 }

}

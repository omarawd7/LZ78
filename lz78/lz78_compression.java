package lz78;
import java.util.ArrayList;
import java.util.Scanner;

//abaababaababbbbbbbbbba

public class lz78_compression {

	static ArrayList<String> dictionary = new ArrayList<String>();//for  compression

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your code:->");
        String code = inp.next();
        System.out.println("The compressed code:");
        dictionary.add(0, "");
     
        for (int i = 0; i < code.length(); i++) {//loop on all string length
            String s = code.substring(i, i + 1);//current element
        //  System.out.println(s);
            int index = 0;
            int key = i;

            if (i == 0) {
         
                System.out.println("<"+ 0 + "," + code.charAt(0) + '>');
                dictionary.add((code.charAt(0) + ""));
            } else {//if i not = 0
            	for(int j=0;j<dictionary.size();j++) {
                if (dictionary.lastIndexOf(s) > 0 && i + 1 < code.length()) {//checking that the substring is exist in the dictionary + checking that  I am not at the end of the array
                    index = dictionary.lastIndexOf(s); //getting the the index in the dictionary                  
                    s = code.substring(key, i + 2);
                    i++;
                }
                else {
                    break;
                    } 

                } 
            	
            	if (key != i) {
                  
                    System.out.println("<"+ index + "," + code.charAt(i) + '>');
                    dictionary.add(s);

                } else {               
                    System.out.println("<"+ index + "," + code.charAt(i) + '>');
                    dictionary.add(code.charAt(i) + "");

                }
            }
        }
    
    }
}

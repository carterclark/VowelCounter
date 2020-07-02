package ics141;

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		String[] test = {"A","E", "I", "O", "U",	//vowel array for testing
				"a","e","i","o","u"};
		
		Scanner input = new Scanner(System.in);	//scanner object
		String str = "GO";
		
		while(str != "q") {
			System.out.println("Please enter a string ('q' to exit): ");
			str = input.nextLine();
			
			if(str.equals("q")) {					//ends program
				System.out.println("Goodbye!");
				break;
			}
			
			else {
				String[] arr = stringToArray(str);	//converts string to array
				arr = removeNonVowels(arr,test);	//removes non vowels from array
				
				String result = checksForVowels(arr,test);	//checks for vowels and returns string with the count
				System.out.println("The vowels counts are");
				System.out.println(result);
				
				}
			}
		
		input.close();	//close input

	}
	//method to convert string to array
	public static String[] stringToArray(String str) {
		String arr[] = str.split("");
		return arr;
		
	}
	
	//method to remove non-vowels from array
	public static String[] removeNonVowels(String[] arr, String[] test) {
		int i, j, count = 0;
		int arrLen = arr.length;
		int testLen = test.length;
		
		String[] newArr = new String[arrLen];
		
		for(i=0; i<arrLen; i++) {
			for(j=0; j<testLen; j++) {
				if(arr[i].equals(test[j])) {
					newArr[count] = arr[i];
					count += 1;
				}
			}
		}
		return newArr;
	}
	
	//method to check for number of each vowel and display it
	public static String checksForVowels(String[] arr, String[] test) {
		int A,E,I,O,U,a,e,i,o,u;		//vowel count variables
		A=E=I=O=U=a=e=i=o=u=0;
		
		int arrLoop;
		int arrLen = arr.length;
		
		for(arrLoop=0; arrLoop<arrLen; arrLoop++) {	//test each element in array for vowels
			if(arr[arrLoop] == null);
			
			else if(arr[arrLoop].equals("A")) A += 1;
			else if(arr[arrLoop].equals("E")) E += 1;
			else if(arr[arrLoop].equals("I")) I += 1;
			else if(arr[arrLoop].equals("O")) O += 1;
			else if(arr[arrLoop].equals("U")) U += 1;
			
			else if(arr[arrLoop].equals("a")) a += 1;
			else if(arr[arrLoop].equals("e")) e += 1;
			else if(arr[arrLoop].equals("i")) i += 1;
			else if(arr[arrLoop].equals("o")) o += 1;
			else if(arr[arrLoop].equals("u")) u += 1;

			}
		
		
		String result = ("A:" + A + " | " + "E:" + E + " | " + "I:" + I + " | " //upper case AEIOU
		+ "O:" + O +  " | " + "U:" + U + " | " + 
				
		"a:" + a + " | " + "e:" + e + " | " + "i:" + i + " | " //lower case aeiou
		+ "o:" + o + " | " + "u:" + u + "\n");
		
		return result;
	}

}

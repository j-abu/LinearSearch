import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
//simple Linear Search
//takes file of integers
//finds the location of specified integer

public class LinearSearch {
	private static ArrayList<Integer> search(ArrayList<Integer> data, int x){
		//int x = in.nextInt();
		int n = 0;
		
		while (n<data.size()){
			if(data.get(n)==x){
				System.out.println("the location of value x ("+x+") is at index "+n+" of the list");
			}
			n++;
		}
		return data;
	}
	
	private static ArrayList<Integer> readInputToArray() throws IOException{
		File file = new File("Data.txt");
		Scanner fileReader = new Scanner(file).useDelimiter(",");
		
		//System.out.println(new File(".").getAbsoluteFile());
		
		ArrayList<Integer> inputData = new ArrayList<>();
		
		int i=0;
		while(fileReader.hasNext()){
				int num = fileReader.nextInt();
				inputData.add(num);
				i++;
		}
		
		i=inputData.size();
		
		System.out.println("Given " +inputData.size()+" integers:");
		System.out.println("~~~~");
		
		for(int j = 0; j<i; j++){
			System.out.print(inputData.get(j));
			System.out.print(" ");
		}
		System.out.println(" ");
		
		fileReader.close();
		return inputData;
	}
	
	public static void main(String[] args){
		System.out.println("integer to locate? :");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		try {
			search(readInputToArray(), x);
		} catch (IOException e) {
			System.out.print("file not found");
		}
		System.out.println();
		//System.out.print("done");
		in.close();
	}
}

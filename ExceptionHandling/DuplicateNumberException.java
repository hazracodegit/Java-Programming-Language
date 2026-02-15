### Throw Exception for Duplicate Integers

Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.


  
import java.util.*;
class DuplicateNumberException extends Exception{
	DuplicateNumberException(String message){
		super(message);
	}
}
public class ExceptionHandling1{
	public static void main(String[] args) throws DuplicateNumberException{
		Scanner sc=new Scanner(System.in);
		List<Integer> list =new ArrayList<>();
		System.out.print("Enter the number of elements: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int num=sc.nextInt();
			if (list.contains(num)){
				throw new DuplicateNumberException("You have Entered a Duplicate");
			}
			else{
				list.add(num);
			}

		}

	}
}

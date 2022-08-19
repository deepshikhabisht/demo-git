import java.util.Scanner;

public class trial {

	public static void main(String[] args) 
	{
		int a[] = {3,5,6,8,10};
		
		int find=778;
		
		int found =0;
		System.out.println("Please enter the number you want to find in the array");
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<a.length;i++) {
			if(a[i]==find) {
				System.out.println(" Number Exist");
				found =1;
			}
			
		}
		if(found==0) {
			System.out.println(" Number does not Exist");
		}
			

	}

}


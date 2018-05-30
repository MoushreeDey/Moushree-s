import java.lang.*;
import java.util.*;
class test1
{       
        static int MAX_CHAR=256;//static variable MAX_CHAR
	test1(String str)//parametarized constructor
	{
		int i,j;
		int count[]=new int[MAX_CHAR]; //declaration of integer array
		//to find the length of the string
		int l=str.length();
		System.out.println("The required string after capitalizing the alternate characters is:");
		for(i=0;i<l;i++)
		{	
			if(i%2==0)//condition to capitalize the even position characters
			{
			  System.out.println(Character.toUpperCase(str.charAt(i)));
			}
			else
			{
			  System.out.println(str.charAt(i));
			}
					
		}
		System.out.println("The number of occurences of a particular character in a string are as follows:");
		for(i=0;i<l;i++)
		{
			count[str.charAt(i)]++;//to increment the counter value of each character
		}
		char ch[]=new char[str.length()];//declaration of character array
		for(i=0;i<l;i++)
		{
			ch[i]=str.charAt(i);
			int find=0;
			for(j=0;j<=i;j++)
			{
				if(str.charAt(i)==ch[j])//to check the equality of the given string characters and the character array
					find++;//counter to increment the value if the characters are equal
			}
			if(find==1)//if the counter value is equal to one
				System.out.println("Number of occurences of "+str.charAt(i)+" is: "+count[str.charAt(i)]);

               }	
	}
}		
class test
{
	public static void main(String args[])
	{
		String str;
		Scanner in=new Scanner((System.in));//declaration of scanner class object to input string
		System.out.print("Enter the string:");
		str=in.nextLine();//using scanner class object to input string	
		test1 obj=new test1(str);//creation of parameterized object of class test1
	}
}
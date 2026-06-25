package learningbasics;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class lauchbrowser_userchoice {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser name chrome or edge:");
		String choice=sc.next().toLowerCase();
		
		if(choice.equals("chrome"))
		{
			new ChromeDriver();
		}
		else if(choice.equals("edge"))
		{
			new EdgeDriver();
		}
		else
		{
			System.out.println("enter valid input");
		}
		sc.close();
	}

}

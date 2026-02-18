/*

OOPSBannerApp UC5 - OOPS Banner Display Application

This class demonstrate a simple Java application that display the 
Object Oriented Programming System OOPS acroym to the console

@author Developer
@version 5.0
*/

public class OOPSBannerApp{
	public static void main(String args[]){
		String[] lines = {
			String.join(" ", "******" ,"******" ,"******" , "******"), 
			String.join(" ", "*    *" ,"*    *" ,"*    *" , "*     "),
			String.join(" ", "*    *" ,"*    *" ,"******" , "******"),
			String.join(" ", "*    *" ,"*    *" ,"*     " , "     *"),
			String.join(" ", "******" ,"******" ,"*     " , "******"),
		};
		
		for(String line: lines){
			System.out.println(line);
		}
	}
}
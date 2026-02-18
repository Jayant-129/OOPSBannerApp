/*

OOPSBannerApp UC4 - OOPS Banner Display Application

This class demonstrate a simple Java application that display the 
Object Oriented Programming System OOPS acroym to the console

@author Developer
@version 4.0
*/

public class OOPSBannerApp{
	public static void main(String args[]){
		String[] lines = new String[5];
		lines[0] = String.join(" ", "******" ,"******" ,"******" , "******");   
		lines[1] = String.join(" ", "*    *" ,"*    *" ,"*    *" , "*     ");
		lines[2] = String.join(" ", "*    *" ,"*    *" ,"******" , "******");
		lines[3] = String.join(" ", "*    *" ,"*    *" ,"*     " , "     *");
		lines[4] = String.join(" ", "******" ,"******" ,"*     " , "******");
		
		for(String line: lines){
			System.out.println(line);
		}
	}
}
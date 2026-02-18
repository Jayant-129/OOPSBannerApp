/*

OOPSBannerApp UC6 - OOPS Banner Display Application

This class demonstrate a simple Java application that display the 
Object Oriented Programming System OOPS acroym to the console with proper code modularity

@author Developer
@version 6.0
*/

public class OOPSBannerApp{
	public static void main(String[] args){
		String[] oPattern=getOPattern();
		String[] pPattern=getPPattern();
		String[] sPattern=getSPattern();
		for(int i=0;i<oPattern.length;i++){
			System.out.println(oPattern[i]+" "+oPattern[i]+" "+pPattern[i]+" "+sPattern[i]);
		}
	}
	public static String[] getOPattern(){
		return new String[]{
			"   ***   ",
			" **   ** ",
			"**     **",
			"**     **",
			"**     **",
			" **   ** ",
			"   ***   "
		};
	}
	public static String[] getPPattern(){
		return new String[]{
			"******   ",
			"**    ** ",
			"**     **",
			"**    ** ",
			"******   ",
			"**       ",
			"**       "
		};
	}
	public static String[] getSPattern(){
		return new String[]{
			"   ***** ",
			" **      ",
			"**       ",
			"  ****   ",
			"     **  ",
			"**    ** ",
			"  ****   "
		};
	}
}
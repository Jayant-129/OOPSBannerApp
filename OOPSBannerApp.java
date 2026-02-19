/*

OOPSBannerApp UC7 - OOPS Banner Display Application

This class demonstrate a simple Java application that display the 
Object Oriented Programming System OOPS acroym to the console with proper code modularity

@author Developer
@version 7.0
*/


public class OOPSBannerApp{
	static class CharacterPatternMap{
		//class is Data structutre to store character and it pattern
		Character character;
		String[] pattern;
		
		public CharacterPatternMap(Character character,String[] pattern){
			this.character = character;
			this.pattern = pattern;
		}

		public Character getCharacter(){
			return character;
		}

		public String[] getPattern(){
			return pattern;
		}
	}

	public static CharacterPatternMap[] createCharacterPatternMap(){
		//Function maps Character to there Star pattern
		OOPSBannerApp.CharacterPatternMap[] characterPatternMaps = new  OOPSBannerApp.CharacterPatternMap[4];
		characterPatternMaps[0] = new OOPSBannerApp.CharacterPatternMap('S', getSPattern());
		characterPatternMaps[1] = new OOPSBannerApp.CharacterPatternMap('O', getOPattern());
		characterPatternMaps[2] = new OOPSBannerApp.CharacterPatternMap('P', getPPattern());
		characterPatternMaps[3] = new OOPSBannerApp.CharacterPatternMap(' ', getSpacePattern());

		return characterPatternMaps;
 	}

	public static String[] getCharacterPattern(Character ch,CharacterPatternMap[] charMaps){
		// Function to get Character pattern with help of Character
		for(int i = 0; i < charMaps.length; i++){
			if(charMaps[i].getCharacter() == ch){
				return charMaps[i].getPattern();
			}
		}
		return new String[]{" "}; 
	}

	public static void printMessage(String Message,CharacterPatternMap[] charMaps){
		//Function take Message as Input and Print it Character Pattern in Output
		String[][] patternsMap = new String[Message.length()][7];
		String[] spacePattern = getCharacterPattern(' ', charMaps);
		for(int i = 0; i < Message.length(); i++){
			patternsMap[i] = getCharacterPattern(Message.charAt(i), charMaps);
		}
		for(int i = 0; i < 7; i++){
			for(int j = 0; j < Message.length(); j++){
				System.out.print(String.join("",patternsMap[j][i],spacePattern[i]));
			}
			System.out.println();
		} 
	}


	public static void main(String[] args){
		CharacterPatternMap charMaps[] = createCharacterPatternMap();
		String Message = "OOPS";
		printMessage(Message, charMaps);
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
	public static String[] getSpacePattern(){
		return new String[]{
			"  ",
			"  ",
			"  ",
			"  ",
			"  ",
			"  ",
			"  "
		};
	}
}
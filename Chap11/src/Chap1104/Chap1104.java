package Chap1104;

public class Chap1104 {

	public static void main(String[] args) {
		String[] title = {"Mr.","Mrs.","Ms.","Your Highness","Sir","Madame","Pope"};
		String[] name = {"Steve McQueen","Gandalf","Lightning McQueen","Bill Gates","Elon Musk","X ae a12"};
		String[] action= {"build the largest teddy bear", "eat a chili dog","give me all your money","go jousting","sell bath water"};
		String[] location= {"in St. Louis","in the corner","in the basement","on Mustafar","in space"};
		
		int randTitle=(int)(Math.random()*title.length);
		int randName=(int)(Math.random()*name.length);
		int randAct=(int)(Math.random()*action.length);
		int randLoc=(int)(Math.random()*location.length);
		
		System.out.println(title[randTitle]+" "+name[randName]+", "+action[randAct]+" "+location[randLoc]+".");
		
	}
}

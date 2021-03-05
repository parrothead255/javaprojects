
public class Magpie {
	public String getGreeting() {
		return "Hello Human";
	}

	public String getResponce(String statement) {
		// TODO Auto-generated method stub
		statement=statement.toLowerCase();
		String response="";
		if(findWord("no",statement))
			response="Why so negative?";
		else if(findWord("father",statement)||findWord("mother",statement));
		response="Tell me more about your family.";
		else
			response= randomResponse(statement);

		return response;
	}
	private boolean findWord(String needle, String haystack) {
		int index=haystack.indexOf(needle);
		boolean afterOk=true;
		boolean beforeOk=true;
		while(index>=0) {
			afterOk=true;
			beforeOk=true;
			if(index>0) {
				String before=haystack.substring(index-1,index);
				beforeOk=before.compareTo("a")<0||before.compareTo("z")>0;
				System.out.println(before+" "+beforeOk);

			}
			if(index+needle.length()<haystack.length()) {
				int endIndex=index+needle.length();
				String after=haystack.substring(endIndex,endIndex+1);
				afterOk=after.compareTo("a")<0|| after.compareTo("z")>0;
				System.out.println(after+" "+afterOk);


			}
			if(beforeOk&&afterOk)
				return true;
			index=haystack.indexOf(needle,index+1);
		}
		return false;
	}
	public String getGoodbye() {
		// TODO Auto-generated method stub
		return "Goodbye Human";
	}
	private String randomResponse() {
		String response="";
		int choice=(int)(Math.random()*3+1);
		switch(choice) {
		case 1:response="You are bad at the English lexicon";
		break;
		case 2: response="aa.";
		break;
		case 3: response="Huh?";
		break;
		}
		return response;
	}

}

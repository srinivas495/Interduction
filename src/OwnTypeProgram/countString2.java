package OwnTypeProgram;

public class countString2 {

	public static void main(String[] args) {
		int count = countString("srinivas", 's');
		System.out.println(count);

	}

	private static int countString(String word, char character) 
	{
		int count = 0;
		for(int i=0; i<word.length(); i++) 
		{
			if(word.charAt(i)==character) 
			{
				count++;
				
			}
		}
		
		return count;
	}

}

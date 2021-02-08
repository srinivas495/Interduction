package OwnTypeProgram;

public class countSting {

	public static void main(String[] args) 
	{
		int count = countStingCharacter("srinivas" , 's');
		System.out.println(count);
		
	}

	private static int countStingCharacter(String word, char character) 
	{
		int count = 0;
		for(int i =0; i<word.length(); i++) 
		{
			if(word.charAt(i)==character) 
			{
				count++;
			}
		}
		return count;
	}

}

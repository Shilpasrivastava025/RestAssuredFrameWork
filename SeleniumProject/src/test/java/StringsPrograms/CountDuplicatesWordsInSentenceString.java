package StringsPrograms;

import java.util.LinkedHashSet;

public class CountDuplicatesWordsInSentenceString {

	public static void main(String[] args) {
		String s= "welcome to to bangalore bangalore city";
		String[] str= s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++)
		{
			set.add(str[i]);
		}
		for(String stri: set)
		{
			int count =0;
			for(int i=0;i<str.length;i++)
			{
				if(stri.equals(str[i]))
				{
					count++;
				}
			}
			if(count==1)
			{
			System.out.println(stri+" = "+count);
		}
	}

}
}

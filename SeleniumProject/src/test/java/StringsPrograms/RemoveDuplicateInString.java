package StringsPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		String s="Tester";
		// String s= str.toLowerCase();
		LinkedHashSet<Character>set = new LinkedHashSet<Character>();
		for(int i=0; i<s.length();i++)
		{
			System.out.print(s.charAt(i));
			set.add(s.charAt(i));
			System.out.println(set);
		}
		
		System.out.println(set);
	}

}

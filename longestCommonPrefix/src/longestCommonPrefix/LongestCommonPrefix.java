package longestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []strs = {"dog","racecar","car"};
		System.out.print("result "+longestCommonPrefix(strs));
	}

	private static String longestCommonPrefix(String[] strs) {
		// TODO Auto-generated method stub
		Arrays.sort(strs);
		String s1=strs[0];
		String s2=strs[strs.length-1];
		int idx = 0;
		while(idx<s1.length()&&idx<s2.length()) {
			if(s1.charAt(idx)==s2.charAt(idx)) {
				idx++;
			}
			else {
				break;
			}
		}
		return s1.substring(0, idx);
	}

}

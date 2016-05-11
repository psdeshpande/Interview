/*Assume you have a method isSubstring which checks if one word is a substring
of another. Given two strings, si and s2, write code to check Ifs2 is a rotation of si
using only onecalltoisSubstring (e.g., "waterbottLe" is a rotation of "erbottLewat").*/

package main;

public class RotationStringSol {

	public boolean isRotation(String str1, String str2){
		if(str1==null || str2==null) throw new NullPointerException("string 2 is null");
		int len = str1.length();
		if(len == str2.length() && len > 0){
			String concate = str1+str2;
			return concate.contains(str2);
		}
		return false;
	}
	/*public static void main(String[] args) {
		
		
	}*/

}

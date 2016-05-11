/*
Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become
a2blc5a3. If the "compressed" string would not become smaller than the original
string, your method should return the original string.
*/
class CompressStringSol {

    public static String compressStr(String str){
        if(str == null) throw new NullPointerException();
        StringBuffer strBuff = new StringBuffer();
        int count = 1, i=1;
        char currentChar = str.charAt(0);
        for(;i<str.length();i++){
            if(currentChar == str.charAt(i)){
                count++;
            }
            else{
                strBuff.append(currentChar);
                strBuff.append(count);
                count = 1;
                currentChar = str.charAt(i);
            }
        }
        if(i==str.length()){
             strBuff.append(currentChar);
             strBuff.append(count);
        }
        if(strBuff.length() > str.length())
            return str;
        
        return strBuff.toString();
        
    }
    
    public static void main(String [] args) {
        System.out.println(compressStr("aaab"));
    }
}

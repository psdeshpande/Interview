class Solution {

    public static String replaceStr(String str){
        if(str == null) throw new NullPointerException();
        char[] charArray = str.toCharArray();
        int spaceCount = 0;
        for(int i=0;i<charArray.length;i++){
            if(charArray[i] == ' ' && charArray[i-1]!=' ' && charArray[i+1]!=' '){
                spaceCount++;
            }
        }    
        if(spaceCount==0) return str;
        for(int i=charArray.length-1;i>=0;i--){
            if(charArray[i]!=' '){
                charArray[i+(2*spaceCount)] = charArray[i];
            }
            else if(charArray[i]==' ' && charArray[i-1]!=' ' && charArray[i+1]!=' '){
                charArray[i+(2*spaceCount)] = '0';
                charArray[i+(2*spaceCount)-1] = '2';
                charArray[i+(2*spaceCount)-2] = '%';
                spaceCount--;
            }
        }

        return new String(charArray);
    }
    
    public static void main(String [] args) {
        System.out.println(replaceStr("Mr John Smith       "));
    }
}

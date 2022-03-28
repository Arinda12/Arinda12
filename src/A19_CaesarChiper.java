public class A19_CaesarChiper {
    public static void main(String[] args){
        //the caesar cipher
        //variable initialization
        String s="blackholesarewheregoddevidedbyzero";
        System.out.printf("Original message:%s\n",s);
        String message="";
        int shift=1;
        //convert from string to charArray
        char arrayStr[]=s.toCharArray();

        //loop iterating over characters
        for(char c: arrayStr){
            int i=(int) c;
            i +=shift;
            if(i>((int)'z')){
                i-=26;
            }
            char newChar=(char)i;
            message +=newChar;
        }
        //printing
        System.out.printf("Encrypted message:%s\n",message);
    }

}

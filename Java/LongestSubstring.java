public class LongestSubstring {
    public  static int lengthOfLongestSubstring(String s) {

        int len=0; String sub="";
        if(s.length()==1){
            return 1;
        }
        else if(s.length()==0){
            return 0;
        }
        else{
            for(int i=0;i<s.length();i++){
                if(sub.contains(Character.toString(s.charAt(i)))){
                    if(len<=sub.length()){
                        len=sub.length();
                    }

                    int index=sub.indexOf(Character.toString(s.charAt(i)));
                    //System.out.println(index);
                    sub=sub.substring(index+1);

                }

                sub+=Character.toString(s.charAt(i));


            }}
        if(len<=sub.length()){
            len=sub.length();
        }
        return len;

    }
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abcadc"));
    }

}

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class parantheses {
    public static boolean sol(String s){
        char arr[]=s.toCharArray();
        char[] stack=new char[arr.length];
        int count=0;
        for (char c : arr){

            if (c=='(' || c=='{' || c=='[') {
                stack[count++]=c;
           }
            else if(count!=0){

                if (c == ')'){
                    if (stack[--count] != '(') {
                        return false;
                    } }
                else if (c == '}') {
                    if (stack[--count] != '{') {
                        return false;
                    }
                }
                        else if (c == ']') {
                    if (stack[--count] != '[') {

                        return false;
                    }
                }

            }
            else{return false;}




        }
        return true;

    }
    public static void main(String[] args) {
        String s = "()";
 System.out.println(sol(s));

    }
}


public class PrintKpermutations {
    public static void printkelements(char[] ch,int k,String prefix){
        if(prefix.length()==k){
            System.out.println(prefix);
            return;
        }else{
            for(int i=0;i<ch.length;i++){
                printkelements(ch,k,prefix+ch[i]);
            }
        }


    }
    public static void main(String[] args)
    {
        System.out.println("First Test");
        char[] set1 = {'a', 'b','c','d'};
        int k = 3;
        printkelements(set1, k,"");

        System.out.println("\nSecond Test");
        char[] set2 = {'a', 'b', 'c', 'd'};
        k = 1;
        printkelements(set2, k,"");
    }
}

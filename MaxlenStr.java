import java.util.*;
public class MaxlenStr{
    public static void main(String[] args){
        String str="abcdabcdabb";
        int i=0,strlen=str.length();
        Set<Character> st=new HashSet<>();
        while(i<strlen){
            st.add(str.charAt(i));
            i++;
        }
        System.out.println(st.size());
    }
}
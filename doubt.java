output:
saaaaaai
saai

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s1=scan.next();
        int i=1;
        char[] n=s1.toCharArray();
        StringBuffer sb=new StringBuffer();
        int c=0;
        while(i<n.length-1) {
            if(n[i]==n[i+1]) {
                c++;
                if(c>2) {
                    sb.append(n[i]);
                } 
                else if(c==1) {
                    sb.append(n[i]);
                }

                else if(c>3) {

                    sb.append(n[i]);
                    sb.deleteCharAt(i);
                }
            } else {
                c=0;
                sb.append(n[i+1]);
            }
            i++;
        }
        System.out.println("reduced string: "+sb);

    }
}

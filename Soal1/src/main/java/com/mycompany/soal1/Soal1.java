/**
 * @author Yumi Febriana 211511063
 */

package com.mycompany.soal1;
import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args){
        String s = "";
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Yumi Febriana 211511063");
            System.out.println("Masukkan String : ");
            s = input.nextLine();
            if(s.length() < 1)
                System.out.println("Tolong masukkan teks");
        } while (s.length() < 1);
        String[] words = s.split(" |\\!|\\,|\\?|\\.|\\_|\\'|\\@");
        int n = words.length;
        
        System.out.println(n);
        for(String w : words){
            System.out.println(w);
        }
    }
}

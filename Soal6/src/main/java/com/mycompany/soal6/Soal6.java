/**
 * @author Yumi Febriana 211511063
 */
package com.mycompany.soal6;
import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yumi Febriana 211511063");
	BigInteger a = new BigInteger(scan.nextLine()); 
	BigInteger b = new BigInteger(scan.nextLine());
        BigInteger tambah = a.add(b);
        BigInteger kali = a.multiply(b);
        
        System.out.println(tambah+"\n"+kali);
	}
}

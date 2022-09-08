/**
 * @author Yumi Febriana 211511063
 */
package com.mycompany.soal2;
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        System.out.println("Yumi Febriana 211511063");
        Scanner scan = new Scanner(System.in);
		StringBuilder DataPertama, tempDataKedua;
		System.out.println("===========================================");
		for(int i = 0; i < 3; i++) {
			System.out.println("Insert your data: ");
			String kolomPertama = scan.next();
			if(kolomPertama.length() <= 10) {
				DataPertama = new StringBuilder(kolomPertama);
				DataPertama.setLength(10);
			}else {
				DataPertama = new StringBuilder(kolomPertama.substring(0, 10));
			}
			int kolomKedua = scan.nextInt();
			if(kolomKedua > 999) {
				String tempNumber = Integer.toString(kolomKedua); 
				tempDataKedua = new StringBuilder(tempNumber.substring(0, 3));
				int DataKedua = Integer.parseInt(tempDataKedua.toString());
				System.out.printf("%s		%03d\n", DataPertama, DataKedua);
			}else  {System.out.printf("%s		%03d\n", DataPertama, kolomKedua);}
		}
		System.out.println("===========================================");
		scan.close();
	}
}

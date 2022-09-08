package com.mycompany.soal7;
/**
 * @author Yumi Febriana 211511063
 */
public class Soal7 {
    public static void main(String[] args) {
        System.out.println("Yumi Febriana 211511063");
        int[] firstArray = {2, 5, 3};
        int[] ArrayKedua = {9, 5, 3};
	int[] ArrayKetiga = {2, 4, 9};
	int[] ArrayKeempat = {10, 11, 12};
	int[] ArrayKelima = {13, 14, 15};
	int[] ArrayKeenam = {16, 17, 18};
	int[] ArrayKetujuh = {19, 20, 21};
	int[] ArrayKedelapan = {22, 23, 24};
	int[] ArrayKesembilan = {25, 26, 27};
	//Two Dimensional Arrays
	int[][] ArrayDuaDimensi1 = {firstArray, ArrayKedua, ArrayKetiga};
	int[][] ArrayDuaDimensi2 = {ArrayKeempat, ArrayKelima, ArrayKeenam};
	int[][] ArrayDuaDimensi3 = {ArrayKetujuh, ArrayKedelapan, ArrayKesembilan};
	//Three Dimensional Array
	int[][][] threeDimensionalArray = {ArrayDuaDimensi1, ArrayDuaDimensi2, ArrayDuaDimensi3};
            for(int x = 0; x < 3; x++) {
		System.out.print("{");
		for(int y = 0; y < 3; y++) {
			System.out.print("{");
			for(int z = 0; z < 3; z++) {
                            System.out.print(threeDimensionalArray[x][y][z] + " ");
				 }
				 System.out.print("} ");
			 }
			 System.out.print("}");
			 System.out.println();
		 }
	}
}
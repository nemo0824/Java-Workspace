package com.kh.array;

public class ArrayPractice {

	public void practice1() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요
		
	int arr [] =new int[10];
	
	for(int i=0; i<10; i++) {
	arr[i] = i+1;
		}
	for(int i =0; i<10; i++) {
		System.out.printf("%d번 인덱스의 값 : %d \n", i, arr[i] );
	}
	
	}
	
	public void practice2() {
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요
		
	int [] arr = new int [10];
	int value =10;		
	for(int i=0; i<10; i++) {
		arr[i] = value -i;
		
	}
		
	for(int i=0; i<10; i++){
		System.out.printf(arr[i] + " ");
	}
	
		
	}
	
	
}

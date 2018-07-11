package arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String [] subject = {"Java", "Oracle", "Web Front End", "Web Back End - Java","Android", "iOS"};
		
		Arrays.sort(subject);
		for(String temp:subject) {
			System.out.println(temp);
		}
		// binarySearch는 정렬된 데이터를 검색할 수 있습니다.
		//Oracale의 위치 검색 
		int idx = Arrays.binarySearch(subject, "Oracle");
		System.out.println(idx);//- 운좋게 결과가 나왔음
		//Android의 검색 
		idx = Arrays.binarySearch(subject, "Android");
		System.out.println(idx);
		
	
	}

}

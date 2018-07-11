package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Movie [] movies = new Movie[5];
		
		movies[0] = new Movie();
		movies[0].setName("Moonlight");
		movies[0].setDirector("Barry Jenkins");
		movies[0].setReleasedate("2016-10-21");
		movies[0].setDuration(110);
		
		movies[1] = new Movie();
		movies[1].setName("Manchester by the Sea");
		movies[1].setDirector("Kenneth Lonergan");
		movies[1].setReleasedate("2016-11-18");
		movies[1].setDuration(137);
		
		movies[2] = new Movie();
		movies[2].setName("Trainspotting");
		movies[2].setDirector("Danny Boyle");
		movies[2].setReleasedate("1996-2-23");
		movies[2].setDuration(94);
		
		movies[3] = new Movie();
		movies[3].setName("Lock, Stock and Two Smoking Barrels");
		movies[3].setDirector("Guy Ritchie");
		movies[3].setReleasedate("1998-8-28");
		movies[3].setDuration(107);
		
		movies[4] = new Movie();
		movies[4].setName("Django Unchained ");
		movies[4].setDirector("Kenneth Lonergan");
		movies[4].setReleasedate("2012-12-25");
		movies[4].setDuration(165);
		
		/*Comparator <Movie> comp = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				//데이터 형변환
				Movie first = (Movie)o1;
				Movie second = (Movie)o2;
				
				return first.getDuration() - second.getDuration();
			}
			
		};
		Arrays.sort(movies, comp);*/
		/*Scanner sc = new Scanner(System.in);
		while(true) {
			Comparator <Movie> comparator = null;
			System.out.print("0:종료 1: 제목오름차순 2:제목내림차순");
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			else if(menu == 1) {
				comparator = new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Movie first = (Movie)o1;
						Movie second = (Movie)o2;
						return first.getDuration() - second.getDuration();
					}
					
				};
			}
			else if(menu == 2) {
				comparator = new Comparator() {

					@Override
					public int compare(Object o1, Object o2) {
						Movie first = (Movie)o1;
						Movie second = (Movie)o2;
						return second.getDuration() - first.getDuration();
					}
					
				};
			}
			Arrays.sort(movies, comparator);
			for(Movie movie : movies) {
				System.out.println(movie);
			}
		}*/
		//배열을 정열
		Arrays.sort(movies);
		
		for(Movie movie : movies) {
			System.out.println(movie);
		}

	}

}

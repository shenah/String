
public class Main {

	public static void main(String[] args) {
		
		//윈도우에서는 printf를 못씀. 문자열을 "+"쓰는 것이 위험함. 
		//그래서 format()메소드사용
		int x = 200;
		int y = 100;
		String str = String.format("x:%d y:%d", x, y);
		System.out.println(str);
		
		String msg = "I like Java";
		//위의 문자열에서 java가 포함하는지 판단하기
		int idx = msg.toLowerCase().indexOf("java".toLowerCase());
		if(idx >= 0) {
			System.out.println("java가 존재합니다.");
		} else {
			System.out.println("java가 존재하지 않습니다.");
		}
		
		//msg를 공백을 기준으로 분할해서 하나씩 출력하기
		String [] ar = msg.split(" ");
		for(int i=0; i<ar.length; i++) 
		{
			System.out.println(ar[i]);
		}

		//msg의 3번째부터 7번째 글자까지 출력하기
		String sub = msg.substring(3, 8);
		System.out.println(sub);
		
		
	}

}

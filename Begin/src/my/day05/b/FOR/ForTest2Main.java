package my.day05.b.FOR;

public class ForTest2Main {

	public static void main(String[] args) {
		
		System.out.println(">>> 1. 반복문을 빠져나오는 명령인 break <<<");
		
		
		for(int i=0; i<10; i++) {
			if(i==5) break; // 반복문에서 break;를 만나면 가장 가까운 반복문을 벗어나는 것이다.
			System.out.println(i+1);
		}// end of for
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		int cnt=0;
		
		for(;;) {
			System.out.println(++cnt + "번째 반복");
			if(cnt == 5) {break;} // 반복문에서 break;를 만나면 가장 가까운 반복문을 벗어나는 것이다.
		}
		
		
		
		System.out.println("\n>>> 2. 반복문의 실행을 하지 않고 바로 증감식으로 올라가는 명령어인 continue <<<");
		
	
		for(int i=0; i<10; i++) {
			if((i+1)%2 == 0 ) // 출력하고자 하는 값 (==> (i+1) )이 짝수라면 
			continue;         // continue; 를 만나면 실행순서가 밑으로 내려가지 않고
			                  // 가장 가까운 반복문의 증감식으로 이동시켜준다.
			System.out.print((i+1)+ " ");
		}
		
		
		
	} // end of main(String[] args)

}

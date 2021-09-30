package my.day13.d.polymorphism;

public class Main {

   // >>> 다형성(Polymorphism) <<< 
   // ==> 상속을 이용하여 여러 클래스 타입을 하나의 클래스 타입으로 다루는 기술.
   // 자식클래스로 생성되어진 객체를 부모 클래스 타입으로 받을 수 있다는 것이 다형성(Polymorphism)이다.
   //     ** 암기!! 

	public static void main(String[] args) {
		
		Animal[] aniArr = new Animal[5];
		
		 Dog dog = new Dog();  // 기본생성자
		//aniArr[0]  = new Dog();
		//Animal ani1 = new Dog(); // 가능하다.
		
		  dog.setName("뽀삐");
		  dog.setbirthYear(2019);
		  dog.setWeight(5);
		  
		  
		// aniArr[0] = dog;
		   aniArr[Animal.count++] = dog;

 
		  Cat cat = new Cat();
		//aniArr[1]  = new Cat();
		//Animal ani2 = new Cat(); // 가능하다.
		  cat.setName("톰");
		  cat.setbirthYear(2020);
		  cat.setColor("하양검정");
		  
		 // aniArr[1] = cat;
		  aniArr[Animal.count++] = cat;
		
		  
		 Duck duck = new Duck();
		//aniArr[2]  = new Duck();
		//Animal ani3 = new Duck(); // 가능하다.
		  duck.setName("도널드");
		  duck.setbirthYear(2021);
		  duck.setPrice(5000);
		  
		 // aniArr[2] = duck;	
		  aniArr[Animal.count++] = duck;
		
		  
		  Dog dog2 = new Dog();  // 기본생성자
			//aniArr[3]  = new Dog();
			//Animal ani1 = new Dog(); // 가능하다.
			dog2.setName("쵸코");
			dog2.setbirthYear(2019);
			dog2.setWeight(3);
		  
			aniArr[Animal.count++] = dog2;
		  
			
		for(int i=0; i<Animal.count; i++) {
			aniArr[i].showInfo();
			aniArr[i].cry();
			
			if( aniArr[i] instanceof Dog) { // aniArr[i]가 실제로 강아지의 인스턴스인가?
				((Dog)aniArr[i]).run();  //이렇게 되면, (Dog)aniArr[i] 이 상태면 Animal에서 Dog로 바뀐다. 그리고 괄호를 한번 더 해야한다.
			}
			else if(aniArr[i] instanceof Cat) {
				((Cat)aniArr[i]).jump();
			}
			else if(aniArr[i] instanceof Duck) {
				((Duck)aniArr[i]).swim();
			}
			
		}
		  
		
	}// end of main

	
}

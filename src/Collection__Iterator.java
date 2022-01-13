import java.util.*;

public class Collection__Iterator {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();//
//		Collection list = new HashSet<>(); //실무에서 Collection간의 class이동 변경 할 경우 많으니, 이렇게 매개변수를 Collection 으로 해놓으면 용이 
		Collection list = new Stack();
	//	Collection list = new LinkedList<>();
			
		list.add("1"); //add 함수는 Collection Interface의 함수 
		list.add("2");// Collection Interface는 List와 Set의 공통점을 모아놓은 Interface --> 가장 기본적인 함수는 Collection에 있다.
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();  //iterator()함수를 이용해서 Iterator 객체를 돌려준다.
		
		 //iterator() ArrayList class에서 가져옴 
		//Collection interface를 구현한 List class와 Set class는 각각의 class에 맞게 iterator()함수 override 되어있다. 
		
		
		//Iterator의 존재 이유는 Collection를 상속하는 List Set 내의 ArrayList LinkedList Stack Queue HashSet TreeSet 모두 요소를 꺼내는 함수도 방법도 다르다.    
		//이렇게 많은 class들의 요소를 꺼내는 방법을 하나로 통일한 것(표준화)이 Iterator이다. <== Iterator의 존재 이유		
		
		while(it.hasNext()) { 
			Object obj = it.next(); //iterator는 1회용이기 때문에 한 번 next()로 사용하고 나면 다음 요소로 넘어간다. 
			System.out.println(obj);
		}
		

		while(it.hasNext()) {  //불가 iterator는 1회용
			Object obj = it.next();  
			System.out.println(obj);
		}
		
		
		
		
		
		

	}

}

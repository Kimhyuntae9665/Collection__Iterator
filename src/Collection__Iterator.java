import java.util.*;

public class Collection__Iterator {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();//
//		Collection list = new HashSet<>(); //�ǹ����� Collection���� class�̵� ���� �� ��� ������, �̷��� �Ű������� Collection ���� �س����� ���� 
		Collection list = new Stack();
	//	Collection list = new LinkedList<>();
			
		list.add("1"); //add �Լ��� Collection Interface�� �Լ� 
		list.add("2");// Collection Interface�� List�� Set�� �������� ��Ƴ��� Interface --> ���� �⺻���� �Լ��� Collection�� �ִ�.
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();  //iterator()�Լ��� �̿��ؼ� Iterator ��ü�� �����ش�.
		
		 //iterator() ArrayList class���� ������ 
		//Collection interface�� ������ List class�� Set class�� ������ class�� �°� iterator()�Լ� override �Ǿ��ִ�. 
		
		
		//Iterator�� ���� ������ Collection�� ����ϴ� List Set ���� ArrayList LinkedList Stack Queue HashSet TreeSet ��� ��Ҹ� ������ �Լ��� ����� �ٸ���.    
		//�̷��� ���� class���� ��Ҹ� ������ ����� �ϳ��� ������ ��(ǥ��ȭ)�� Iterator�̴�. <== Iterator�� ���� ����		
		
		while(it.hasNext()) { 
			Object obj = it.next(); //iterator�� 1ȸ���̱� ������ �� �� next()�� ����ϰ� ���� ���� ��ҷ� �Ѿ��. 
			System.out.println(obj);
		}
		

		while(it.hasNext()) {  //�Ұ� iterator�� 1ȸ��
			Object obj = it.next();  
			System.out.println(obj);
		}
		
		
		
		
		
		

	}

}

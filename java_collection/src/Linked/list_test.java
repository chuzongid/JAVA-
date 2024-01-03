package Linked;

public class list_test {

	public static void main(String[] args) {
		linkedList list = new linkedList();
		list.add("이순신");
		list.add("김유신");
		list.add("장영실");
		list.add("이성계");
		list.add("문익점");
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		list.remove(4);
		System.out.println(list);
		
		list.add(0,"서종우");
		System.out.println(list);
	}

}

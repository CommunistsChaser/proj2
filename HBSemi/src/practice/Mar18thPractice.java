package practice;

import java.util.*;


public class Mar18thPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1�ܰ�: 
		��̸���Ʈ�� ����� ���� �������� �ְ�,
		���ο� ��̸���Ʈ�� ���� ���ͷ����ͷ� �����ض�.
		
		2�ܰ�:
		����Ʈ�� ���� ���� ������ ũ�� ������ �����ض�.
		*/
		System.out.println("--------------------------");
		System.out.println("STAGE 1");
		System.out.println("--------------------------");
		ArrayList list1 = new ArrayList();
		
		list1.add(1);
		list1.add(3);
		list1.add(2);
		list1.add(5);
		list1.add(9);
		list1.add(7);
		
		Iterator it;
		it = list1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("--------------------------");
		
		ListIterator lit;
		lit = list1.listIterator();
		
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		
		System.out.println("--------------------------");

		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
		
		/*
		���:
		���ͷ����ʹ� ������ �ȴ�.
		����Ʈ ���ͷ����ʹ� ������ �Ǵµ�, �� ���� ������ �� �� �ؾ� �Ѵ�.
		
		�ǹ�:
		�ٵ� ��͸� ���� ���ͷ����͸� �������� �̾Ƴ� ���� ���� �� ������ �̰� �����ð��� �߾���?
		 */
		
		
		System.out.println("--------------------------");
		System.out.println("STAGE 2");
		System.out.println("--------------------------");
		
		
		Integer[] arr1 =
		    { 1, 3, 2, 5, 9, 7};
		    Arrays.sort(arr1, new Comparator<Integer>()
		    {
		        @Override
		        public int compare(Integer x, Integer y) //��Ʈ��
		        {
		            return x - y;
		        }
		    });
		    
		System.out.println("��������:" + Arrays.toString(arr1));
		
		    System.out.println("--------------------------");
		    
		Integer [] arr2 =
			{ 1, 3, 2, 5, 9, 7};
			Arrays.sort(arr2, new Comparator<Integer>()
			{
		        @Override
		        public int compare(Integer x, Integer y) //��Ʈ��
		        {
		            return (x - y)*(-1);
		        }
		    });
	    
	    System.out.println("��������:" + Arrays.toString(arr2));	
				
		    
		/*
		���:
		�������� ���.
		
		�ǹ�:
		��̸���Ʈ�� ������ �̾Ƴ��� ����? �ƴϸ� ���� �״�� ������ �� �� ����?
		
		 */	    
	}

}

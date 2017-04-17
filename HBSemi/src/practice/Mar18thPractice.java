package practice;

import java.util.*;


public class Mar18thPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1단계: 
		어레이리스트를 만들어 값을 무작위로 넣고,
		새로운 어레이리스트를 만들어서 이터레이터로 소팅해라.
		
		2단계:
		리스트에 넣은 값을 숫자의 크기 순으로 소팅해라.
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
		요약:
		이터레이터는 직진만 된다.
		리스트 이터레이터는 후진도 되는데, 그 전에 직진을 한 번 해야 한다.
		
		의문:
		근데 재귀를 쓰면 이터레이터를 역순으로 뽑아낼 수도 있을 것 같은데 이걸 수업시간에 했었나?
		 */
		
		
		System.out.println("--------------------------");
		System.out.println("STAGE 2");
		System.out.println("--------------------------");
		
		
		Integer[] arr1 =
		    { 1, 3, 2, 5, 9, 7};
		    Arrays.sort(arr1, new Comparator<Integer>()
		    {
		        @Override
		        public int compare(Integer x, Integer y) //인트형
		        {
		            return x - y;
		        }
		    });
		    
		System.out.println("오름차순:" + Arrays.toString(arr1));
		
		    System.out.println("--------------------------");
		    
		Integer [] arr2 =
			{ 1, 3, 2, 5, 9, 7};
			Arrays.sort(arr2, new Comparator<Integer>()
			{
		        @Override
		        public int compare(Integer x, Integer y) //인트형
		        {
		            return (x - y)*(-1);
		        }
		    });
	    
	    System.out.println("내림차순:" + Arrays.toString(arr2));	
				
		    
		/*
		요약:
		컴페어레이터 써라.
		
		의문:
		어레이리스트를 베열로 뽑아낼수 없나? 아니면 저걸 그대로 가져다 쓸 수 없나?
		
		 */	    
	}

}

package org.sp.app0704.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 자바의 컬렉션프레임웍이 지원하는 객체 중, 순서없는 집합을 표현하는 Set을 학습
 */

public class SetTest {
	
	public static void main(String[] args) {
		Set set=new HashSet();
		
		set.add("사과");
		set.add("딸기");
		set.add("바나나");
		
		//순서를 부여하기 위해 일렬로 늘어뜨리는 도구
		//즉, 순서없는 집합의 요소들을 순서있게 정렬해줌
		Iterator<String> it=set.iterator();
		/*
		it.hasNext();
		String s1=it.next(); //커서 이동과 함께 해당 위치의 객체를 반환함 
		System.out.println(s1);
		
		boolean result= it.hasNext();
		System.out.println(result);
		String s2=it.next(); //두번째 요소 접근
		System.out.println(s2);
		
		boolean result3= it.hasNext();
		System.out.println(result3);
		String s3=it.next(); //세번째 요소 접근
		System.out.println(s3);
		
		boolean result4= it.hasNext();
		System.out.println(result4);
		*/
		
		//Iterator에 의해 순서가 있는 상태이므로, 반복문으로 요소들을 꺼낼수 있음
		while(it.hasNext()==true) { //요소가 존재하는 동안만
			String s=it.next();
			System.out.println(s);
		}
		
		//자바의 컬렉션 중 set과 map은 순서가 없기때문에 반복문으로 직접 요소들을 제어할 수는 없지만
		//Iterator, Enumeration과 같은 도구들을 이용하면 순서있게 처리가 가능함
		
		
	}

}

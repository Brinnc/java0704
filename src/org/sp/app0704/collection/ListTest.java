package org.sp.app0704.collection;

import java.util.ArrayList;
import java.util.List;

/*
 * 자바의 컬렉션프레임워크 중 리스트를 학습
 * List는 순서가 있는 객체의 모임을 표현하며, 우리가 기존에 알고 있었던 배열과 거의 같음
 * 당지 차이가 있다면
 * 
 * 1) 크기가 동적으로 변할 수 있음
 * 2) 배열은 int[], byte[]... 등등 모든 자료형마다 지원되지만
 * 		컬렉션프레임워크는 그 대상이 오직 객체만 다루기때문에 
 * 		List에 들어올 수 있는 데이터는 오직 객체형 데이터만 가능함
*/
public class ListTest {
	
	
	public static void main(String[] args) {
		//ArrayList는 List인터페이스의 자식
		ArrayList list=new ArrayList();
		
		list.add("사과");
		list.add("복숭아");
		list.add("딸기");
		
		System.out.println("현재까지 채워진 과일 수는 "+list.size());
		
	}

}

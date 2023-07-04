package org.sp.app0704.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;

/*
 *자바의 컬렉션 프레임웍의 객체 중 key-value의 쌍으로 데이터를 모아서 처리하는 Map 학습 
 */

public class MapTest {
	
	public static void main(String[] args) {
		Map<String, JButton> map=new HashMap<String, JButton>();
		
		map.put("b1", new JButton("나버튼1"));
		map.put("b2", new JButton("나버튼2"));
		map.put("b3", new JButton("나버튼3"));
		
		//JButton obj=(JButton)map.get("b3");
		//JButton obj=map.get("b3"); //<제너릭> 사용하면서 형변환 필요x
		//System.out.println(obj);
		
		//Map또한 순서가 없기때문에 모든 요소를 반복문으로 접근하려면 무언가 순서있는 객체의 도움을 받아야함
		//이미 순서없는 집합을 잘 지원해주고 있는 Set을 활용해보자
		//맵에 들어있는 객체들을 대상으로 모두 추출하는 것이 아닌, key만을 추출하여 Set으로 담아 놓음 
		Set keys=map.keySet();
		//Iterator 도구를 활용해 일렬로 정렬함
		Iterator<String> it=keys.iterator();
		
		while(it.hasNext()) { //다음 요소가 존재하는 동안
			String key=it.next();
			
			//키를 이용하여 맵에서 객체를 꺼냄
			JButton bt=map.get(key);
			System.out.println(bt.getText());
			
		}
		
		
	}
}

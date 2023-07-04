package org.sp.app0704.collection;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class ListTest2 {

	
	public static void main(String[] args) {
		List<JButton> list=new ArrayList<JButton>();
		//제너릭 사용해서 <JButton>만 넣을 수 있는 리스트로 만듬
		
		//컬렉션 사용 시 <Generic> 타입을 명시하면, 불순물을 방지할 수 있음
		//더욱이 꺼낼 때 형변환 과정을 거치지 않아도 되는 편리함이 있음
		//보통 최종적으로 사용하기 직전에 명시함
		
		list.add(new JButton("나버튼1"));
		list.add(new JButton("나버튼2"));
		list.add(new JButton("나버튼3"));
		//list.add("안녕"); <JButton>으로 명시했기 때문에 String객체는 넣을 수 없음
		
		//JButton obj=(JButton)list.get(0); 
		//get()은 Object형으로 반환되므로, obj로 뭔가 하기위해서는 자료형을 변경
		
		JButton obj=list.get(0); 
		
		
	}
	
}

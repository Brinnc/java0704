package org.sp.app0704.collection;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
1) 배열의 사용목적
	일반적으로 배열을 사용하게 되면, 메모리에 올려진 데이터에 순서를 적용할 수 있으므로,
	규칙을 이용한 프로그래밍에 사용됨. 또한 규칙을 이용하다보니 반복문과 친숙함.
  
2) 선언 상 특징
	반드시 생성할 때 그 크기를 명시해야함
	이미 정해진 크기는 변경할 수 없음
	-> 유연한 처리를 하기에는 불리함
 
3) 해결책
	자바의 Collection Framework를 이용하면,
	배열보다 더욱 다양하면서 유연한 객체를 모아서 처리하는 기술을 지원해줌
  
4) Collection Framework
	"객체"를 "모아서" 처리할 때 유용형 기능을 지원하는 기술을 의미함
	자바에선, java.util패키지에서 지원함
--------------------------
순서X -> ★Set구조
순서O -> ★List구조
★Map구조
순서가x. key, value 구조
-------------------------- 
 */

public class Test1 extends JFrame implements ActionListener {
	JPanel p_north;
	JButton bt_create;
	JButton bt_bg;
	JPanel p_center;
	int n; // 디폴트 0
	// JS는 배열의 크기가 동적으로 변할 수 있지만 일반적인 프로그래밍 언어(C, C# 등등..)에서는
	// 배열은 최초 생성 시 그 크기가 고정됨. 또한 반드시 사용 전에는 크기가 정해져 있어야 함
	//JButton[] btArray;
	// Button[] btn=new Button[];
	ArrayList<JButton> btArray;

	public Test1() {
		p_north = new JPanel();
		bt_create = new JButton("생성");
		bt_bg = new JButton("색상");
		p_center = new JPanel();

		p_center.setBackground(Color.CYAN);

		// 버튼 10개 담을 수 있는 크기의 배열 선언
		// !주의! 버튼을 10개 생성한 것이 아니라, 장차 버튼 10개가 들어갈 공간을 확보한 것임
		// 결론) 버튼이 아직 만들어진 적 없음
		
		btArray = new ArrayList<JButton>(); 

		// 북쪽 패널에 버튼 2개 부착
		p_north.add(bt_create);
		p_north.add(bt_bg);
		// 패널을 북쪽에 부착
		add(p_north, BorderLayout.NORTH);
		// 패널을 중앙에 부착
		add(p_center, BorderLayout.CENTER);

		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 버튼과 리스너 연결
		bt_create.addActionListener(this);
		bt_bg.addActionListener(this);
	}

	public void createButton() {
		JButton bt = new JButton("버튼" + n);
		
		btArray.add(bt);
		System.out.println("현재까지 채워진 버튼 수는 " + btArray.size());

		p_center.add(bt);

		// 자바로 하여금 현재 화면을 갱신, 컴포넌트 새로고침
		p_center.updateUI();

		//n++;
	}

	// 현재 화면에 생성되어있는 버튼들에 색상을 노란 색으로 바꿈
	// 갯수가 많으므로 for문을 적용해야함
	public void setBg() {
		// 첫번째 버튼의 색상 변경
		for (int i = 0; i < btArray.size(); i++) {
			JButton obj=btArray.get(i); 
			//get()으로 반환되는 건 가장 최상위의 Object형, 배경색상을 설정하기 위해서는 JButton으로 형변환해줘야함
			//단! <Generic> 사용 시 형변환 필요 x
			obj.setBackground(Color.YELLOW);
		}
	}

	public void actionPerformed(ActionEvent e) {
		// 어떤 버튼을 클릭했ㅇ는지에 따라 구현이벤트가 달라야함
		if (e.getSource() == bt_create) {
			createButton();
		} else {
			setBg();
		}

	}

	public static void main(String[] args) {
		new Test1();
	}

}

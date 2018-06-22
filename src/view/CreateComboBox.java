package view;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class CreateComboBox {
	JPanel centerPan;
	JComboBox<?> combo;
	String[] menu = {"사용자 등록","직원 추가"};
	
	public void create() {
		combo = new JComboBox<>(menu);
		centerPan = new JPanel();
		centerPan.add(combo);
	}
}

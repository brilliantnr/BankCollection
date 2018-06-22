package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreateTextField {
		JLabel idLab;
		JPanel idPan;
	public void crate() {
		idLab = new JLabel("ID", JLabel.CENTER);
		idPan = new JPanel();
		idPan.add(idLab);
	}
}

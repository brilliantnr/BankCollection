package view;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class CreateLabel {
		JTextField idTxt;
		JPanel idPan;
	public void crate() {
		idTxt = new JTextField();
		idPan = new JPanel();
		idPan.add(idTxt);
	}
}

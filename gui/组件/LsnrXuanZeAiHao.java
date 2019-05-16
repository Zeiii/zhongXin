package zz516;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.Iterator;

import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class LsnrXuanZeAiHao implements ActionListener {

	private ArrayDeque<JCheckBox> ckbArr;
	private JLabel lblInfo;
	
	private String s;
	
	public LsnrXuanZeAiHao(FrmCheckBox frmCheckBox) {
		ckbArr=new ArrayDeque<JCheckBox>();
		this.ckbArr.add(frmCheckBox.getCkbLanQiu());
		this.ckbArr.add(frmCheckBox.getCkbZuQiu());
		this.lblInfo=frmCheckBox.getLblInfo();
		s=lblInfo.getText();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String temp_s=new String(s);
		if(ckbArr==null) return;
		
		String conj="";
		
		Iterator<JCheckBox> ite=ckbArr.iterator();
		
		while(ite.hasNext()) {
			JCheckBox jb=ite.next();
			if(jb.isSelected()) {
				temp_s+=conj+jb.getText();
				conj="ºÍ";
			}	
		}
		
		lblInfo.setText(temp_s);
	}
	
}

package zz516;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrmCheckBox extends JFrame{
	
	private JCheckBox ckbZuQiu=new JCheckBox("足球");
	private JCheckBox ckbLanQiu=new JCheckBox("篮球");
	
	private JLabel lblInfo=new JLabel("你选择的爱好是：");
	
	
	
	
	public JCheckBox getCkbZuQiu() {
		return ckbZuQiu;
	}

	public JCheckBox getCkbLanQiu() {
		return ckbLanQiu;
	}

	public JLabel getLblInfo() {
		return lblInfo;
	}

	public FrmCheckBox(String title){
		super(title);
		init();
	}
		
	private void init() {
		this.setSize(800,600);
		
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel pnlComp=addComp();
		this.add(pnlComp);
		this.setVisible(true);
	}
	
	private JPanel addComp(){
		JPanel pnlComp=new JPanel();
		
		pnlComp.add(ckbLanQiu);
		pnlComp.add(ckbZuQiu);
		
		this.lblInfo.setBorder(
				BorderFactory.createLineBorder(Color.red));
		
		pnlComp.add(lblInfo);
		
		
		addListener();
		return pnlComp;
	}
	
	private void addListener() {
		LsnrXuanZeAiHao l=new LsnrXuanZeAiHao(this);
		this.ckbLanQiu.addActionListener(l);
		this.ckbZuQiu.addActionListener(l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrmCheckBox("标题");
	}

}

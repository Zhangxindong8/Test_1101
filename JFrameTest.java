import java.awt.*;
import javax.swing.*;
public class JFrameTest extends JFrame
{
	//���崰���а����Ŀؼ�
	public JLabel userLa;
	public JLabel passLa;
	public JTextField userTxt;
	public JPasswordField passTxt;
	public JButton sureBt;
	public JButton quitBt;
	
	public JFrameTest()
	{
		setSize(300,230);//���ô��ڴ�С
		setTitle("���Դ���");//���ô��ڱ���
		//���´����û������ؼ����󣬲���ӵ�������
		/*userLa=new JLabel("�û���");
		this.add(userLa,BorderLayout.NORTH);
		passLa=new JLabel("��    ��");
		this.add(passLa,BorderLayout.SOUTH);
		userTxt=new JTextField();
		this.add(userTxt,BorderLayout.EAST);
		passTxt=new JPasswordField();
		this.add(passTxt,BorderLayout.WEST);
		sureBt=new JButton("��¼");
		this.add(sureBt,BorderLayout.CENTER);
		//quitBt=new JButton("�˳�");
		//this.add(quitBt);*/
		
		/*this.setLayout(new FlowLayout());
		//�����ڵĲ��ַ�ʽ��Ϊ�����ַ�ʽ
		userLa=new JLabel("�û���");
		this.add(userLa);
		passLa=new JLabel("��    ��");
		this.add(passLa);
		userTxt=new JTextField();
		this.add(userTxt);
		passTxt=new JPasswordField();
		this.add(passTxt);
		sureBt=new JButton("��¼");
		this.add(sureBt);
		quitBt=new JButton("�˳�");
		this.add(quitBt);*/
		
		/*this.setLayout(new GridLayout(3,2));
		//�����ڵĲ��ַ�ʽ��Ϊ��񲼾ַ�ʽ
		userLa=new JLabel("�û���");
		this.add(userLa);
		passLa=new JLabel("��    ��");
		this.add(passLa);
		userTxt=new JTextField();
		this.add(userTxt);
		passTxt=new JPasswordField();
		this.add(passTxt);
		sureBt=new JButton("��¼");
		this.add(sureBt);
		quitBt=new JButton("�˳�");
		this.add(quitBt);*/
		
		this.setLayout(null);
		//ȡ�����ڵĲ��ַ�ʽ
		userLa=new JLabel("�û���");
		userLa.setSize(60, 30);
		userLa.setLocation(30, 30);
		this.add(userLa);
		passLa=new JLabel("��    ��");
		passLa.setSize(60, 30);
		passLa.setLocation(30, 80);
		this.add(passLa);
		userTxt=new JTextField();
		userTxt.setSize(120, 30);
		userTxt.setLocation(110, 30);
		this.add(userTxt);
		passTxt=new JPasswordField();
		passTxt.setSize(120, 30);
		passTxt.setLocation(110, 80);
		this.add(passTxt);
		sureBt=new JButton("��¼");
		sureBt.setSize(60, 30);
		sureBt.setLocation(50, 130);
		this.add(sureBt);
		quitBt=new JButton("�˳�");
		quitBt.setSize(60, 30);
		quitBt.setLocation(130, 130);
		this.add(quitBt);
		
		
		setVisible(true);//���ô��ڿɼ�
	}
}

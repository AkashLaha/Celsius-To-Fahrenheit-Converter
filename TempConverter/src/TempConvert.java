import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TempConvert {
	
	public static JFrame frame; 
	public static JLabel labelCel;
	public static JTextField txtCel;
	public static JLabel labelFah;
	public static JTextField txtFah;
	public static JButton btnCtoF;
	public static JButton btnFtoC;

	public static void main(String[] args) {
		frame=new JFrame("Temperature Converter");
		frame.setBounds(500, 300, 150, 200);
		frame.getContentPane().setBackground(Color.gray);//change bg of frame
		frame.setResizable(false);//cant resize the frame
		frame.setLayout(new FlowLayout());
		
		
		//Create GUI Elements
		labelCel=new JLabel("Celsius");
		labelCel.setBackground(Color.orange);
		labelCel.setOpaque(true);
		txtCel=new JTextField(10);
		labelFah=new JLabel("Fahrenheit");
		labelFah.setBackground(Color.orange);
		labelFah.setOpaque(true);
		txtFah=new JTextField(10);
		btnCtoF=new JButton("Convert CtoF");
		btnCtoF.setBackground(Color.cyan);
		//Add listener
		btnCtoF.addActionListener(
			new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					//Convert CtoF
					String str1=txtCel.getText();//whatever i type to the textfield of cel it will be assigned to str1
					double c=Double.parseDouble(str1);
					double f=(c*9/5)+32;
					txtFah.setText(String.valueOf(f));//returns the double value in f formula to string
					
				}
				
			}
		);
		
		btnFtoC=new JButton("Convert FtoC");
		btnFtoC.setBackground(Color.magenta);
		btnFtoC.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String str2=txtFah.getText();
				double f=Double.parseDouble(str2);
				double c=(f-32)*5/9;
				txtCel.setText(String.valueOf(c));
				
			}
			
		});
		
		
		//make gui visible and add elements
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(labelCel);
		frame.add(txtCel);
		frame.add(labelFah);
		frame.add(txtFah);
		frame.add(btnCtoF);
		frame.add(btnFtoC);
	}

}

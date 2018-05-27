package unidad1;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class HelloWorldCuatro extends JFrame implements ActionListener
{
	
	private JLabel lbl_mensaje;
	private JButton btn_aceptar;
	private JTextField tf_mensaje;
	
	public HelloWorldCuatro()
	{
		super("Hello World 4 !!!!");
		setSize(400, 200);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbl_mensaje = new JLabel();
		lbl_mensaje.setBounds(145, 40, 100, 25);
		add(lbl_mensaje);
		
		tf_mensaje= new JTextField(20);
		tf_mensaje.setBounds(100, 70, 200, 25);
		add(tf_mensaje);
		
		btn_aceptar= new JButton("Aceptar");
		btn_aceptar.setBounds(150, 100, 100, 25);
		btn_aceptar.addActionListener(this);
		add(btn_aceptar);
		
		
		
		setVisible(true);
		
		
	}

	public static void main(String[]args)
	{
		HelloWorldCuatro noce = new HelloWorldCuatro();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn_aceptar)
		{
			
			String nombre;
			nombre=tf_mensaje.getText();
			lbl_mensaje.setText("Hello "+nombre);
			tf_mensaje.setText("");
			//tf_mensaje.setVisible(false);
			//tf_mensaje.setEnabled(false);
			
		}
		
		
	}
}

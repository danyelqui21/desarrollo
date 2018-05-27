package unidad1;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class HelloWorldTres extends JFrame implements ActionListener
{
	
	private JLabel lbl_mensaje;
	private JButton btn_aceptar;
	private JTextField tf_mensaje;
	
	public HelloWorldTres()
	{
		super("Hello World 3 !!!!");
		setSize(400, 200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbl_mensaje = new JLabel();
		add(lbl_mensaje);
		
		tf_mensaje= new JTextField(20);
		add(tf_mensaje);
		
		btn_aceptar= new JButton("Aceptar");
		btn_aceptar.addActionListener(this);
		add(btn_aceptar);
		
		
		
		setVisible(true);
		
		
	}

	public static void main(String[]args)
	{
		HelloWorldTres noce = new HelloWorldTres();
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

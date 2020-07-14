import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import java.io.*;

class AddStu extends JFrame
{
		Container c;
		JLabel rno ;
		JLabel name ;
		JLabel marks ;
		JTextField txtrno;
		JTextField txtname;
		JTextField txtmarks;
		JButton save;
		JButton back;
	AddStu()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		rno = new JLabel("enter roll no ");
		name = new JLabel("enter name  ");
		marks = new JLabel("enter marks ");
		txtrno = new JTextField(10);
		txtname = new JTextField(10);
		txtmarks = new JTextField(10);
		save = new JButton("Save");
		back = new JButton("Back");
		c.add(rno);
		c.add(txtrno);
		c.add(name);
		c.add(txtname);
		c.add(marks);
		c.add(txtmarks);
		c.add(save);
		c.add(back);

		
		ActionListener a1 = (ae) -> {
			MainFrame a = new MainFrame();
			dispose();
		};
		back.addActionListener(a1);

		ActionListener a2 = (ae) -> {
			int rno = Integer.parseInt(txtrno.getText());
			String name = txtname.getText();
			int marks = Integer.parseInt(txtmarks.getText());
			DbHandler db = new DbHandler();
			db.addStudent(rno,name,marks);
		};
		save.addActionListener(a2);


		setTitle("Add Student");
		setSize(250,300);
		c.setBackground(Color.CYAN);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String args[])
	{
		AddStu add = new AddStu();
	}
}

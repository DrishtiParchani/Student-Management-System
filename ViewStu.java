import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.text.*;
import java.io.*;

class ViewStu extends JFrame
{
		Container c;
		TextArea txtview;
		JButton back;
	ViewStu()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		txtview = new TextArea(10,40);
		back = new JButton("Back");
		c.add(txtview);
		c.add(back);
		setTitle("View Student");
		setSize(350,300);
		c.setBackground(Color.CYAN);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String args[])
	{
		ViewStu view = new ViewStu();
	}
}

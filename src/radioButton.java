import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class radioButton extends JFrame {
	private JTextField field;
	private JRadioButton normal;
	private JRadioButton calibri;
	private JRadioButton arial;
	private JRadioButton impact;
	private ButtonGroup group;
	
	public radioButton() {
		super("JRadioButton Demo");
		setLayout(new FlowLayout());
		
		field = new JTextField("Hello Utopian, JRadioButton Demo", 30);
		normal = new JRadioButton("Default", true);
		calibri = new JRadioButton("Calibri", false);
		arial = new JRadioButton("Arial", false);
		impact = new JRadioButton("Impact", false);
		add(field);
		add(normal);
		add(calibri);
		add(arial);
		add(impact);
		
		group = new ButtonGroup();
		group.add(normal);
		group.add(calibri);
		group.add(arial);
		group.add(impact);
		
		newClass eventHandler = new newClass();
		normal.addItemListener(eventHandler);
		calibri.addItemListener(eventHandler);
		arial.addItemListener(eventHandler);
		impact.addItemListener(eventHandler);
	}
	
	private class newClass implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			if (normal.isSelected())
				field.setFont(new Font("Serif", Font.PLAIN, 18));
			else if (calibri.isSelected())
				field.setFont(new Font("Calibri", Font.PLAIN, 18));
			else if (arial.isSelected())
				field.setFont(new Font("Arial", Font.PLAIN, 18));
			else if (impact.isSelected())
				field.setFont(new Font("Impact", Font.PLAIN, 18));
			else
				field.setFont(new Font("Serif", Font.PLAIN, 18));
		}
	}
}

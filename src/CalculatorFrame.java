import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame{

	public CalculatorFrame(){
		super("Calculator");
		setLayout(new GridLayout(2, 1));

		DisplayPanel display = new DisplayPanel();
		InputPanel input = new InputPanel();
		
		add(display);
		add(input);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
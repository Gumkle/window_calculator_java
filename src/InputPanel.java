import javax.swing.JPanel;

public class InputPanel extends JPanel{

	public InputPanel(){
		super();

		NumberPanel numbers = new NumberPanel();
		OperationsPanel operations = new OperationsPanel();

		add(numbers);
		add(operations);
	}
}
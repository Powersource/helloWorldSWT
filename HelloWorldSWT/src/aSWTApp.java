import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class aSWTApp {

	protected Shell shell;
	private Text txtHi;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			aSWTApp window = new aSWTApp();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");

		Button btnClick = new Button(shell, SWT.NONE);
		btnClick.addMouseListener(new MouseAdapter() {
			public void mouseDown(MouseEvent e) {
				if (txtHi.getText() != "Hi") {
					txtHi.setText("Hello");
				} else if (txtHi.getText() == "Hello"){
					txtHi.setText("Hi");
				}
			}
		});
		btnClick.setBounds(104, 111, 75, 25);
		btnClick.setText("Click");

		txtHi = new Text(shell, SWT.BORDER);
		txtHi.setEditable(false);
		txtHi.setText("Hi");
		txtHi.setBounds(197, 113, 76, 21);

	}
}

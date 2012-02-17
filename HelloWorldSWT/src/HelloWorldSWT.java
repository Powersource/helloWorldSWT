import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class HelloWorldSWT {

	public static void main(String[] args) {

		Display display = new Display();
		Shell shell = new Shell(display);

		// window settings
		shell.setText("Hello world!");
		// shell.setBounds(300, 300, 300, 300);
		shell.setMinimumSize(250, 250);
		shell.setMaximized(true);
		// shell.setFullScreen(true);
		
		// button
		Button myButton = new Button(shell, SWT.PUSH);
		String knappText = "Hejsan";
		myButton.setText(knappText);

		RowLayout layout = new RowLayout();
		layout.pack = true;
		shell.setLayout(layout);
		// den här andra tar mindre plats
		// shell.setLayout (new RowLayout ());
		// pack() trycker ihop fönstret till minsta behövda utrymme
		// shell.pack ();

		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

}

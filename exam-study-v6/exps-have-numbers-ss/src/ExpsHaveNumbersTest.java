// ExpsHaveNumbersTest -- a simple, incomplete test of SpreadSheet,
// modified to implement the Spreadsheet-exps-have-numbers task

import junit.framework.Assert;
import junit.framework.TestCase;

import java.lang.reflect.InvocationTargetException;

public class ExpsHaveNumbersTest extends TestCase {

	// this method is designed to run on the AWT thread
	public void reportError(String msg) {
		throw new RuntimeException(msg);
	}

	public final void testEvaluate() {
		try {
			javax.swing.SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					SpreadSheet spreadsheet = new SpreadSheet("SpreadSheet");
					// Set up the content pane.
					spreadsheet.addComponentsToPane(spreadsheet
							.getContentPane());
					// Display the window.
					spreadsheet.pack();
					spreadsheet.setVisible(true);
					spreadsheet.setCell(0, 0, "123");
					spreadsheet.setCell(0, 1, "=A1+3");
					spreadsheet.evaluate();
                    String cellText0 = spreadsheet.getCellText(0, 0);
					String cellText1 = spreadsheet.getCellText(0, 1);
					assertTrue("corrupted a cell", cellText0.equals("123"));
					assertTrue("failed to evaluate formula with 3",
							Double.valueOf(cellText1) == 126.0);
				}
			});
		} catch (InvocationTargetException e) {
			Assert.fail(e.getCause().getMessage());
		} catch (Exception e) {
			Assert.fail("invokeAndWait (Swing task) raised exception");
		}
	}
}

package Customcode;

import com.hcl.products.onetest.datasets.DataSetException;
import com.hcl.products.onetest.datasets.DataSetRow;
import com.ibm.rational.test.lt.kernel.services.IDataSetController;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;

/**
 * @author unknown
 */
public class Jerry implements com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */
	public Jerry() {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		IDataSetController Excel = tes.getDataSetController("/RFT/Jerry/set.csv");
		DataSetRow row;
		try 
		{
			row = Excel.getRow(3);
		
			// TODO Auto-generated catch block
			
tes.getTestLogManager().alwaysReportMessage("Row 3: " + row.getValue("Column1")); // Dawn

row.changeValue("Column1", "Steve");

tes.getTestLogManager().alwaysReportMessage("Row 3: " + row.getValue("Column1")); 
// Steve

// we're not there yet.. up to this point, we have only updated the internal memory            

//Excel.writeRow(3, row.getValues(), true);
Excel.writeRow(1, row.getValues(), true);
		}
		catch ( DataSetException e) {
			e.printStackTrace();
			}
		
		return null;
	}

}

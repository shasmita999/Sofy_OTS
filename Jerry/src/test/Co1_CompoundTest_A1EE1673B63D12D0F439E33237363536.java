/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.datacorrelation.datapoolAction.Datapool;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.DatapoolAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class Co1_CompoundTest_A1EE1673B63D12D0F439E33237363536
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public Co1_CompoundTest_A1EE1673B63D12D0F439E33237363536(IContainer parent, String name) {
		super(parent, "co1", "A1EE1673B63D12D0F439E33237363536");
	}

	public void execute() {

		this.add(datapool_1(this));
		this.add(new test.Dataset_Test_A1EE16725965F140F439E33237363536(this, "A1EE169475CDDA60F439E33237363536") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

	private DatapoolAction datapool_1(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "set.csv", "A1EE169A658F5153F439E33237363536", true);
		Datapool dp = new Datapool("/L0plcnJ5L3NldC5jc3Y=.csv", "D:\\RFT_Workspaces\\RFT\\Jerry\\set.csv", 2, false,
				false, Datapool.SEQUENTIAL, null, 0, true, getVirtualUserName());
		dp.addHarvestInstruction("Column1", "Column1", false);
		dpAction.setDatapool(dp, true);
		return dpAction;
	}

}
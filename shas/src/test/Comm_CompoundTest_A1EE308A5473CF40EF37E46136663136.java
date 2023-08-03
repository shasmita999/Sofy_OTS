/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import java.util.HashMap;

@SuppressWarnings("all")
public class Comm_CompoundTest_A1EE308A5473CF40EF37E46136663136
		extends com.ibm.rational.test.lt.kernel.action.impl.CompoundTest {

	public Comm_CompoundTest_A1EE308A5473CF40EF37E46136663136(IContainer parent, String name) {
		super(parent, "comm", "A1EE308A5473CF40EF37E46136663136");
	}

	public void execute() {

		this.add(new test.Chrom_Test_A1EE3089EA012360EF37E46136663136(this, "A1EE308A5DE62CD0EF37E46136663136") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		this.add(new test.Ed_Test_A1EE308A449E28E0EF37E46136663136(this, "A1EE308A61DB34C0EF37E46136663136") {
			public void execute() {
				this.setRtbEnabled(false);
				super.execute();
			}
		});

		super.execute();
	}

}
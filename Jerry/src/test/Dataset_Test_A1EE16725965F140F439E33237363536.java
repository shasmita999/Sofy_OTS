/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.datapoolAction.Datapool;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.DatapoolAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.CustomCodeAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.moeb.action.EndMoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction;
import com.ibm.rational.test.lt.execution.moeb.services.*;
import com.ibm.rational.test.lt.execution.moeb.services.MoebActionFailedEvent;
import com.ibm.rational.test.lt.execution.moeb.services.MoebFatalErrorEvent;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.custom.ICustomCode2;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTCustomCodeExceptionEvent;
import com.ibm.rational.test.lt.kernel.services.RPTCustomCodeVPFailureEvent;
import com.ibm.rational.test.lt.kernel.services.RPTEvent;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Dataset_Test_A1EE16725965F140F439E33237363536 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(2);
	private DataVar[] vars = new DataVar[2];
	
    
    
	
	public Dataset_Test_A1EE16725965F140F439E33237363536(IContainer container, String invocationId) {
		super(container, "dataset", invocationId, "A1EE16725965F140F439E33237363536");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		
	}

    public void execute() {
    	try {
			
	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun()){
this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	this.addEventBehavior(new RPTEventStructure(new MoebActionFailedEvent(), new RPTContinueEvent("Playback of UI Action failed"), 0, "Playback of UI Action failed"));
	this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(), new RPTStopUserEvent("Playback of UI step has a fatal error"), 0, "Playback of UI step has a fatal error"));
	}
	
	
	        	this.add(datapool_1(this));
	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(new CustomCode_1(this, dcVars[1]));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Dataset_Test_A1EE16725965F140F439E33237363536 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		
		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	
	private DatapoolAction datapool_1(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "set.csv", "A1EE1699EC4DC0B0F439E33237363536", false);
		Datapool dp = new Datapool(
				 "/L0plcnJ5L3NldC5jc3Y=.csv",
				 "D:\\RFT_Workspaces\\RFT\\Jerry\\set.csv",
				 2,
				 false,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0, false, getVirtualUserName());
		dp.addHarvestInstruction("Column1", dcVars[0], false);
		dpAction.setDatapool(dp, true);
		return dpAction;
	}

private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EE16725976E130F439E33237363536");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Chrome", IDataArea.VIRTUALUSER, "IGNORE", false, false);

	
		vars[1] = new DataVar("var", "", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start www.google.co.in",
												  "A1EE1672598698A0F439E33237363536",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>www.google.co.in<\\/b>\",\"to_overriden\":true,\"application_uid\":\"1051d01d-31eb-455e-8b19-b16b2fe1035d\",\"timeout\":77,\"optionalStep\":false,\"uid\":\"A1EE1672598698A0F439E33237363536\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_name\":\"www.google.co.in\",\"application_os\":\"WebUI\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/www.google.co.in\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/Jerry/dataset.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Text area - www.google.co.in",
												  "A1EE1672599BA741F439E33237363536",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Text area<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"1051d01d-31eb-455e-8b19-b16b2fe1035d\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EE1672599BA741F439E33237363536\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:264;left:342;bottom:298;right:896\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 554, \\\"x\\\": 342, \\\"y\\\": 264 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgba(0, 0, 0, 0.87);font-family:arial, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:22px;margin-bottom:8px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none solid rgba(0, 0, 0, 0.87);visibility:visible;z-index:auto;\\\", \\\"aria-autocomplete\\\": \\\"both\\\", \\\"aria-controls\\\": \\\"Alh6id\\\", \\\"aria-expanded\\\": \\\"false\\\", \\\"aria-haspopup\\\": \\\"both\\\", \\\"aria-label\\\": \\\"Search\\\", \\\"aria-owns\\\": \\\"Alh6id\\\", \\\"autocapitalize\\\": \\\"off\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"autocorrect\\\": \\\"off\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 298, \\\"class\\\": \\\"gLFyf\\\", \\\"color\\\": \\\"000000DE\\\", \\\"content\\\": \\\"\\\", \\\"data-ved\\\": \\\"0ahUKEwjgxJa3s-j_AhWF-mEKHbq9Cy0Q39UDCAQ\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"arial, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"APjFqb\\\", \\\"jsaction\\\": \\\"paste:puy29d;\\\", \\\"left\\\": 342, \\\"line-height\\\": \\\"22\\\", \\\"margin-bottom\\\": 8, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"maxlength\\\": \\\"2048\\\", \\\"name\\\": \\\"q\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlTextAreaProxy\\\", \\\"proxyName\\\": \\\"textarea\\\", \\\"right\\\": 896, \\\"role\\\": \\\"combobox\\\", \\\"rows\\\": \\\"1\\\", \\\"spellcheck\\\": \\\"false\\\", \\\"tagname\\\": \\\"textarea\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgba(0, 0, 0, 0.87)\\\", \\\"title\\\": \\\"Search\\\", \\\"top\\\": 264, \\\"type\\\": \\\"search\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"125\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/textarea[@id='APjFqb']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.textarea\"}}],\"timeout\":10}",
												  "/Jerry/dataset.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image button whose Content is No thanks - www.google.co.in",
												  "A1EE167259EFE1C4F439E33237363536",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Image button<\\/b> whose <b>Content<\\/b> is <b>No thanks<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"1051d01d-31eb-455e-8b19-b16b2fe1035d\",\"timeout\":77,\"screenshotPref\":\"ALL\",\"optionalStep\":false,\"uid\":\"A1EE167259EFE1C4F439E33237363536\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"No thanks\"},\"name\":\"content\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:245;left:973;bottom:290;right:1076\\\", \\\"Geometry\\\": { \\\"height\\\": 45, \\\"width\\\": 103, \\\"x\\\": 973, \\\"y\\\": 245 }, \\\"Style$array$\\\": \\\"background-color:rgb(241, 243, 244);background-repeat:repeat;color:rgb(95, 99, 104);font-family:\\\\\\\"Google Sans\\\\\\\", Roboto, Helvetica, Arial, sans-serif;font-size:14px;font-style:normal;font-weight:500;line-height:16px;margin-bottom:0px;margin-left:0px;margin-right:12px;margin-top:0px;opacity:1;padding-bottom:8px;padding-left:6px;padding-right:6px;padding-top:8px;text-align:center;text-decoration:none solid rgb(95, 99, 104);visibility:visible;z-index:auto;\\\", \\\"aria-label\\\": \\\"No thanks\\\", \\\"background-color\\\": \\\"F1F3F4FF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 290, \\\"class\\\": \\\"M6CB1c rr4y5c\\\", \\\"color\\\": \\\"5F6368FF\\\", \\\"content\\\": \\\"No thanks\\\", \\\"data-dismiss\\\": \\\"n\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"exist\\\": true, \\\"font-family\\\": \\\"\\\\\\\"Google Sans\\\\\\\", Roboto, Helvetica, Arial, sans-serif\\\", \\\"font-size\\\": 14, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"500\\\", \\\"jslog\\\": \\\"71121; track:click;\\\", \\\"jsname\\\": \\\"ZUkOIc\\\", \\\"left\\\": 973, \\\"line-height\\\": \\\"16\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 12, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 8, \\\"padding-left\\\": 6, \\\"padding-right\\\": 6, \\\"padding-top\\\": 8, \\\"proxyClass\\\": \\\"HtmlSubmitProxy\\\", \\\"proxyName\\\": \\\"button\\\", \\\"right\\\": 1076, \\\"tagname\\\": \\\"button\\\", \\\"text-align\\\": \\\"center\\\", \\\"text-decoration\\\": \\\"none solid rgb(95, 99, 104)\\\", \\\"top\\\": 245, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"27\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='yDmH0d']\\\\\\/c-wiz\\\\\\/div\\\\\\/div\\\\\\/c-wiz\\\\\\/div\\\\\\/div\\\\\\/div\\\\\\/div[2]\\\\\\/div[2]\\\\\\/button\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.button\"}}],\"timeout\":10}",
												  "/Jerry/dataset.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}


	public class CustomCode_1 extends CustomCodeAction {

		IDataCorrelationVar outVar;
		/**
		 * @param parent
		 * @param name
		 */
		public CustomCode_1(IContainer parent, IDataCorrelationVar outVar) {
			super(parent, "Customcode.Jerry", "A1EE1696877C7490F439E33237363536");
			this.outVar = outVar;
		}
	
		/**
		 * @see com.ibm.rational.test.lt.kernel.action.IKAction#execute()
		 */
		public void execute() {
		
				
	
	
	
	
	
	
			IDCCoreVar[] inputVars = {
				dcVars[0]
			};
			
			ICustomCode2 ccclass = 	new Customcode.Jerry();
			
			setCCClass(ccclass);
			setInputVars(inputVars);
			setOutVar(outVar);
			
			super.execute();

		}
	}



}

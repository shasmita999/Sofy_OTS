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
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;

@SuppressWarnings("all")
public class Chrom_Test_A1EE3089EA012360EF37E46136663136 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public Chrom_Test_A1EE3089EA012360EF37E46136663136(IContainer container, String invocationId) {
		super(container, "chrom", invocationId, "A1EE3089EA012360EF37E46136663136");
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
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	this.addEventBehavior(new RPTEventStructure(new MoebActionFailedEvent(), new RPTContinueEvent("Playback of UI Action failed"), 0, "Playback of UI Action failed"));
	this.addEventBehavior(new RPTEventStructure(new MoebFatalErrorEvent(), new RPTStopUserEvent("Playback of UI step has a fatal error"), 0, "Playback of UI step has a fatal error"));
	}
	
	
	        	this.add(varAction_1(this));
	this.add(applicationContext_1(this));
	this.add(applicationContext_2(this));
	this.add(applicationContext_3(this));
	this.add(applicationContext_4(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Chrom_Test_A1EE3089EA012360EF37E46136663136 ",e);
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
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EE3089EA212E83EF37E46136663136");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Chrome", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start www.google.com",
												  "A1EE3089EA2E26D0EF37E46136663136",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>www.google.com<\\/b>\",\"to_overriden\":true,\"application_uid\":\"a3aca1c5-5a9d-4498-b210-014d0d8e12a0\",\"timeout\":47,\"uid\":\"A1EE3089EA2E26D0EF37E46136663136\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_name\":\"www.google.com\",\"application_os\":\"WebUI\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/www.google.com\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/shas/chrom.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Text area - www.google.com",
												  "A1EE3089EA34B684EF37E46136663136",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Text area<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"a3aca1c5-5a9d-4498-b210-014d0d8e12a0\",\"timeout\":47,\"screenshotPref\":\"ALL\",\"uid\":\"A1EE3089EA34B684EF37E46136663136\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:256;left:342;bottom:290;right:896\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 554, \\\"x\\\": 342, \\\"y\\\": 256 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgba(0, 0, 0, 0.87);font-family:arial, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:22px;margin-bottom:8px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none solid rgba(0, 0, 0, 0.87);visibility:visible;z-index:auto;\\\", \\\"aria-autocomplete\\\": \\\"both\\\", \\\"aria-controls\\\": \\\"Alh6id\\\", \\\"aria-expanded\\\": \\\"false\\\", \\\"aria-haspopup\\\": \\\"both\\\", \\\"aria-label\\\": \\\"Search\\\", \\\"aria-owns\\\": \\\"Alh6id\\\", \\\"autocapitalize\\\": \\\"off\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"autocorrect\\\": \\\"off\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 290, \\\"class\\\": \\\"gLFyf\\\", \\\"color\\\": \\\"000000DE\\\", \\\"content\\\": \\\"\\\", \\\"data-ved\\\": \\\"0ahUKEwjl9YvP8ruAAxWxmFYBHTaQAHEQ39UDCAQ\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"arial, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"APjFqb\\\", \\\"jsaction\\\": \\\"paste:puy29d;\\\", \\\"left\\\": 342, \\\"line-height\\\": \\\"22\\\", \\\"margin-bottom\\\": 8, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"maxlength\\\": \\\"2048\\\", \\\"name\\\": \\\"q\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlTextAreaProxy\\\", \\\"proxyName\\\": \\\"textarea\\\", \\\"right\\\": 896, \\\"role\\\": \\\"combobox\\\", \\\"rows\\\": \\\"1\\\", \\\"spellcheck\\\": \\\"false\\\", \\\"tagname\\\": \\\"textarea\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgba(0, 0, 0, 0.87)\\\", \\\"title\\\": \\\"Search\\\", \\\"top\\\": 256, \\\"type\\\": \\\"search\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"133\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/textarea[@id='APjFqb']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.textarea\"}}],\"timeout\":10}",
												  "/shas/chrom.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Image whose Alt is Google - www.google.com",
												  "A1EE3089EA6E8B31EF37E46136663136",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Image<\\/b> whose <b>Alt<\\/b> is <b>Google<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"a3aca1c5-5a9d-4498-b210-014d0d8e12a0\",\"timeout\":33,\"screenshotPref\":\"ALL\",\"uid\":\"A1EE3089EA6E8B31EF37E46136663136\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"alt\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"Google\"},\"name\":\"alt\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:45;left:49;bottom:82;right:164\\\", \\\"Geometry\\\": { \\\"height\\\": 37, \\\"width\\\": 115, \\\"x\\\": 49, \\\"y\\\": 45 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgb(26, 13, 171);font-family:arial, sans-serif;font-size:14px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none solid rgb(26, 13, 171);visibility:visible;z-index:auto;\\\", \\\"alt\\\": \\\"Google\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 82, \\\"class\\\": \\\"jfN4p\\\", \\\"color\\\": \\\"1A0DABFF\\\", \\\"data-atf\\\": \\\"1\\\", \\\"data-frt\\\": \\\"0\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"arial, sans-serif\\\", \\\"font-size\\\": 14, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"height\\\": \\\"30\\\", \\\"left\\\": 49, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"img\\\", \\\"right\\\": 164, \\\"src\\\": \\\"\\\\\\/images\\\\\\/branding\\\\\\/googlelogo\\\\\\/2x\\\\\\/googlelogo_color_92x30dp.png\\\", \\\"tagname\\\": \\\"img\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(26, 13, 171)\\\", \\\"top\\\": 45, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"width\\\": \\\"92\\\", \\\"xpath\\\": \\\"1429\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/a[@id='logo']\\\\\\/img\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.img\"}}],\"timeout\":10}",
												  "/shas/chrom.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Text area - www.google.com",
												  "A1EE3089EAEE1B74EF37E46136663136",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1EE3089EAEE1B74EF37E46136663136\",\"preferredThinktime\":0,\"thinktime\":2748,\"isWeb\":false,\"description\":\"Think <i>2,748<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"a3aca1c5-5a9d-4498-b210-014d0d8e12a0\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Text area<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"a3aca1c5-5a9d-4498-b210-014d0d8e12a0\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1EE3089EAEE1B74EF37E46136663136\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:300;left:654;bottom:334;right:1209\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 554, \\\"x\\\": 654, \\\"y\\\": 300 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgba(0, 0, 0, 0.87);font-family:arial, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:22px;margin-bottom:8px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none solid rgba(0, 0, 0, 0.87);visibility:visible;z-index:auto;\\\", \\\"aria-autocomplete\\\": \\\"both\\\", \\\"aria-controls\\\": \\\"Alh6id\\\", \\\"aria-expanded\\\": \\\"false\\\", \\\"aria-haspopup\\\": \\\"both\\\", \\\"aria-label\\\": \\\"Search\\\", \\\"aria-owns\\\": \\\"Alh6id\\\", \\\"autocapitalize\\\": \\\"off\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"autocorrect\\\": \\\"off\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 334, \\\"class\\\": \\\"gLFyf\\\", \\\"color\\\": \\\"000000DE\\\", \\\"content\\\": \\\"\\\", \\\"data-ved\\\": \\\"0ahUKEwjx4YTb8ruAAxWpmlYBHd8XChEQ39UDCAQ\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"arial, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"APjFqb\\\", \\\"jsaction\\\": \\\"paste:puy29d;\\\", \\\"left\\\": 654, \\\"line-height\\\": \\\"22\\\", \\\"margin-bottom\\\": 8, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"maxlength\\\": \\\"2048\\\", \\\"name\\\": \\\"q\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlTextAreaProxy\\\", \\\"proxyName\\\": \\\"textarea\\\", \\\"right\\\": 1209, \\\"role\\\": \\\"combobox\\\", \\\"rows\\\": \\\"1\\\", \\\"spellcheck\\\": \\\"false\\\", \\\"tagname\\\": \\\"textarea\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgba(0, 0, 0, 0.87)\\\", \\\"title\\\": \\\"Search\\\", \\\"top\\\": 300, \\\"type\\\": \\\"search\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"127\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/textarea[@id='APjFqb']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.textarea\"}}],\"timeout\":10}",
												  "/shas/chrom.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}

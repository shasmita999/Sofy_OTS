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
public class Ed_Test_A1EE308A449E28E0EF37E46136663136 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.execution.moeb.dc.MoebDataAdapter", "com.ibm.rational.test.lt.execution.moeb.action.MoebStepBatchAction");
    }
	
	private DataVar[] vars = new DataVar[1];
	
    
    
	
	public Ed_Test_A1EE308A449E28E0EF37E46136663136(IContainer container, String invocationId) {
		super(container, "ed", invocationId, "A1EE308A449E28E0EF37E46136663136");
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
	this.add(applicationContext_5(this));
			this.addFinally(new EndMoebStepBatchAction(this));

	    } catch (Throwable e) {
		     log("Test Execution: Ed_Test_A1EE308A449E28E0EF37E46136663136 ",e);
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

	VariableAction vc = new VariableAction(parent, "", "A1EE308A449E28FEEF37E46136663136");	
			vars[0] = new DataVar("RTW_WebUI_Browser_Selection", "Edge", IDataArea.VIRTUALUSER, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}
	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_1(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Start www.google.com",
												  "A1EE308A44A295B0EF37E46136663136",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"description\":\"Start <b>www.google.com<\\/b>\",\"to_overriden\":true,\"application_uid\":\"a3aca1c5-5a9d-4498-b210-014d0d8e12a0\",\"timeout\":28,\"uid\":\"A1EE308A44A295B0EF37E46136663136\",\"application_package\":\"com.ibm.rational.test.mobile.android.browser\",\"application_name\":\"www.google.com\",\"application_os\":\"WebUI\",\"isWeb\":false,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"start\",\"parameters\":[{\"name\":\"activity\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"com.ibm.rational.test.mobile.android.browser.BrowserMainActivity\"},{\"name\":\"rmot_kind_of_launch\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"playback\"},{\"name\":\"starting_url\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"https:\\/\\/www.google.com\\/\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceHWActionStep\"}],\"timeout\":10}",
												  "/shas/ed.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_2(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Text area - www.google.com",
												  "A1EE308A44A44364EF37E46136663136",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Text area<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"a3aca1c5-5a9d-4498-b210-014d0d8e12a0\",\"timeout\":11,\"screenshotPref\":\"ALL\",\"uid\":\"A1EE308A44A44364EF37E46136663136\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:310;left:620;bottom:344;right:1175\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 554, \\\"x\\\": 620, \\\"y\\\": 310 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgba(0, 0, 0, 0.87);font-family:arial, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:22px;margin-bottom:8px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none solid rgba(0, 0, 0, 0.87);visibility:visible;z-index:auto;\\\", \\\"aria-autocomplete\\\": \\\"both\\\", \\\"aria-controls\\\": \\\"Alh6id\\\", \\\"aria-expanded\\\": \\\"false\\\", \\\"aria-haspopup\\\": \\\"both\\\", \\\"aria-label\\\": \\\"Search\\\", \\\"aria-owns\\\": \\\"Alh6id\\\", \\\"autocapitalize\\\": \\\"off\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"autocorrect\\\": \\\"off\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 344, \\\"class\\\": \\\"gLFyf\\\", \\\"color\\\": \\\"000000DE\\\", \\\"content\\\": \\\"\\\", \\\"data-ved\\\": \\\"0ahUKEwi-jum187uAAxXel1YBHe69CZIQ39UDCAQ\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"arial, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"APjFqb\\\", \\\"jsaction\\\": \\\"paste:puy29d;\\\", \\\"left\\\": 620, \\\"line-height\\\": \\\"22\\\", \\\"margin-bottom\\\": 8, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"maxlength\\\": \\\"2048\\\", \\\"name\\\": \\\"q\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlTextAreaProxy\\\", \\\"proxyName\\\": \\\"textarea\\\", \\\"right\\\": 1175, \\\"role\\\": \\\"combobox\\\", \\\"rows\\\": \\\"1\\\", \\\"spellcheck\\\": \\\"false\\\", \\\"tagname\\\": \\\"textarea\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgba(0, 0, 0, 0.87)\\\", \\\"title\\\": \\\"Search\\\", \\\"top\\\": 310, \\\"type\\\": \\\"search\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"133\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/textarea[@id='APjFqb']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.textarea\"}}],\"timeout\":10}",
												  "/shas/ed.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_3(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Enter value 'cats' in Text area - www.google.com",
												  "A1EE308A44AFB514EF37E46136663136",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1EE308A44AFB514EF37E46136663136\",\"preferredThinktime\":0,\"thinktime\":6961,\"isWeb\":false,\"description\":\"Think <i>6,961<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"a3aca1c5-5a9d-4498-b210-014d0d8e12a0\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Enter value '<b>cats<\\/b>' in <b>Text area<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"a3aca1c5-5a9d-4498-b210-014d0d8e12a0\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1EE308A44AFB514EF37E46136663136\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"oninput\",\"parameters\":[{\"name\":\"newtext\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"cats\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:310;left:610;bottom:344;right:1164\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 554, \\\"x\\\": 610, \\\"y\\\": 310 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgba(0, 0, 0, 0.87);font-family:arial, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:22px;margin-bottom:8px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none solid rgba(0, 0, 0, 0.87);visibility:visible;z-index:auto;\\\", \\\"aria-autocomplete\\\": \\\"both\\\", \\\"aria-controls\\\": \\\"Alh6id\\\", \\\"aria-expanded\\\": \\\"true\\\", \\\"aria-haspopup\\\": \\\"both\\\", \\\"aria-label\\\": \\\"Search\\\", \\\"aria-owns\\\": \\\"Alh6id\\\", \\\"autocapitalize\\\": \\\"off\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"autocorrect\\\": \\\"off\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 344, \\\"class\\\": \\\"gLFyf\\\", \\\"color\\\": \\\"000000DE\\\", \\\"content\\\": \\\"\\\", \\\"data-ved\\\": \\\"0ahUKEwi-jum187uAAxXel1YBHe69CZIQ39UDCAQ\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"arial, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"APjFqb\\\", \\\"jsaction\\\": \\\"paste:puy29d;\\\", \\\"left\\\": 610, \\\"line-height\\\": \\\"22\\\", \\\"margin-bottom\\\": 8, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"maxlength\\\": \\\"2048\\\", \\\"name\\\": \\\"q\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlTextAreaProxy\\\", \\\"proxyName\\\": \\\"textarea\\\", \\\"right\\\": 1164, \\\"role\\\": \\\"combobox\\\", \\\"rows\\\": \\\"1\\\", \\\"spellcheck\\\": \\\"false\\\", \\\"tagname\\\": \\\"textarea\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgba(0, 0, 0, 0.87)\\\", \\\"title\\\": \\\"Search\\\", \\\"top\\\": 310, \\\"type\\\": \\\"search\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"232\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/textarea[@id='APjFqb']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.textarea\"}}],\"timeout\":10}",
												  "/shas/ed.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_4(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Text area whose Content is cats - www.google.com",
												  "A1EE308A44CD0114EF37E46136663136",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"uid\":\"A1EE308A44CD0114EF37E46136663136\",\"preferredThinktime\":0,\"thinktime\":3169,\"isWeb\":false,\"description\":\"Think <i>3,169<\\/i> ms\",\"id\":\"1\",\"to_overriden\":false,\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceThinkTime\",\"application_uid\":\"a3aca1c5-5a9d-4498-b210-014d0d8e12a0\",\"timeout\":0},{\"revealPref\":\"true\",\"description\":\"Click on <b>Text area<\\/b> whose <b>Content<\\/b> is <b>cats<\\/b>\",\"to_overriden\":false,\"skipScrollingIniOSDF\":false,\"application_uid\":\"a3aca1c5-5a9d-4498-b210-014d0d8e12a0\",\"timeout\":0,\"screenshotPref\":\"ALL\",\"uid\":\"A1EE308A44CD0114EF37E46136663136\",\"isWeb\":true,\"action\":{\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"content\",\"id\":\"7\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"cats\"},\"name\":\"content\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:310;left:610;bottom:344;right:1103\\\", \\\"Geometry\\\": { \\\"height\\\": 33, \\\"width\\\": 493, \\\"x\\\": 610, \\\"y\\\": 310 }, \\\"Style$array$\\\": \\\"background-color:rgba(0, 0, 0, 0);background-repeat:repeat;color:rgba(0, 0, 0, 0.87);font-family:arial, sans-serif;font-size:16px;font-style:normal;font-weight:400;line-height:22px;margin-bottom:8px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:0px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none solid rgba(0, 0, 0, 0.87);visibility:visible;z-index:auto;\\\", \\\"aria-autocomplete\\\": \\\"both\\\", \\\"aria-controls\\\": \\\"Alh6id\\\", \\\"aria-expanded\\\": \\\"true\\\", \\\"aria-haspopup\\\": \\\"both\\\", \\\"aria-label\\\": \\\"Search\\\", \\\"aria-owns\\\": \\\"Alh6id\\\", \\\"autocapitalize\\\": \\\"off\\\", \\\"autocomplete\\\": \\\"off\\\", \\\"autocorrect\\\": \\\"off\\\", \\\"background-color\\\": \\\"00000000\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 344, \\\"class\\\": \\\"gLFyf\\\", \\\"color\\\": \\\"000000DE\\\", \\\"content\\\": \\\"cats\\\", \\\"data-ved\\\": \\\"0ahUKEwi-jum187uAAxXel1YBHe69CZIQ39UDCAQ\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"arial, sans-serif\\\", \\\"font-size\\\": 16, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"APjFqb\\\", \\\"jsaction\\\": \\\"paste:puy29d;\\\", \\\"left\\\": 610, \\\"line-height\\\": \\\"22\\\", \\\"margin-bottom\\\": 8, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"maxlength\\\": \\\"2048\\\", \\\"name\\\": \\\"q\\\", \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": 0, \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlTextAreaProxy\\\", \\\"proxyName\\\": \\\"textarea\\\", \\\"right\\\": 1103, \\\"role\\\": \\\"combobox\\\", \\\"rows\\\": \\\"1\\\", \\\"spellcheck\\\": \\\"false\\\", \\\"tagname\\\": \\\"textarea\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgba(0, 0, 0, 0.87)\\\", \\\"title\\\": \\\"Search\\\", \\\"top\\\": 310, \\\"type\\\": \\\"search\\\", \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"666\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/textarea[@id='APjFqb']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.textarea\"}}],\"timeout\":10}",
												  "/shas/ed.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

	// MoebStepBatch_Decl.template
	public MoebStepBatchAction applicationContext_5(IContainer parent) {
		MoebStepBatchAction stepBatch = new MoebStepBatchAction(parent,
												  "Click on Division whose data-st-cnt is top - www.google.com",
												  "A1EE308A44E4A7C4EF37E46136663136",
												  "{\"id\":\"0\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceTestSteps\",\"steps\":[{\"revealPref\":\"true\",\"description\":\"Click on <b>Division<\\/b> whose <b>data-st-cnt<\\/b> is <b>top<\\/b>\",\"to_overriden\":true,\"skipScrollingIniOSDF\":false,\"application_uid\":\"a3aca1c5-5a9d-4498-b210-014d0d8e12a0\",\"timeout\":28,\"screenshotPref\":\"ALL\",\"uid\":\"A1EE308A44E4A7C4EF37E46136663136\",\"isWeb\":true,\"action\":{\"id\":\"2\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceAction\",\"type\":\"onclick\",\"parameters\":[{\"name\":\"enableasyncaction\",\"id\":\"3\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TBoolean\",\"value\":\"false\"}]},\"sync_policy\":\"DEFAULT\",\"id\":\"1\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIActionStep\",\"object\":{\"identifier\":{\"parameter\":{\"name\":\"data-st-cnt\",\"id\":\"6\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceParameter\",\"type\":\"TString\",\"value\":\"top\"},\"name\":\"data-st-cnt\",\"id\":\"5\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceId\",\"operator\":\"TEquals\"},\"propList\":\"{ \\\"Coordinates$array$\\\": \\\"top:180;left:0;bottom:347;right:1831\\\", \\\"Geometry\\\": { \\\"height\\\": 167, \\\"width\\\": 1831, \\\"x\\\": 0, \\\"y\\\": 180 }, \\\"Style$array$\\\": \\\"background-color:rgb(255, 255, 255);background-repeat:repeat;color:rgb(32, 33, 36);font-family:arial, sans-serif;font-size:14px;font-style:normal;font-weight:400;line-height:normal;margin-bottom:0px;margin-left:0px;margin-right:0px;margin-top:0px;opacity:1;padding-bottom:0px;padding-left:181.65px;padding-right:0px;padding-top:0px;text-align:start;text-decoration:none solid rgb(32, 33, 36);visibility:visible;z-index:auto;\\\", \\\"background-color\\\": \\\"FFFFFFFF\\\", \\\"background-repeat\\\": \\\"repeat\\\", \\\"bottom\\\": 347, \\\"class\\\": \\\"appbar\\\", \\\"color\\\": \\\"202124FF\\\", \\\"content\\\": \\\"About 8,89,00,00,000 results (0.56 seconds)\\\\u00a0\\\\nSee results\\\\nabout\\\\nCats\\\\n2019 film\\\", \\\"data-st-cnt\\\": \\\"top\\\", \\\"domainName\\\": \\\"html\\\", \\\"enabled\\\": true, \\\"font-family\\\": \\\"arial, sans-serif\\\", \\\"font-size\\\": 14, \\\"font-style\\\": \\\"normal\\\", \\\"font-weight\\\": \\\"400\\\", \\\"id\\\": \\\"appbar\\\", \\\"left\\\": 0, \\\"line-height\\\": \\\"normal\\\", \\\"margin-bottom\\\": 0, \\\"margin-left\\\": 0, \\\"margin-right\\\": 0, \\\"margin-top\\\": 0, \\\"opacity\\\": \\\"1\\\", \\\"padding-bottom\\\": 0, \\\"padding-left\\\": \\\"181.65\\\", \\\"padding-right\\\": 0, \\\"padding-top\\\": 0, \\\"proxyClass\\\": \\\"HtmlElementProxy\\\", \\\"proxyName\\\": \\\"div\\\", \\\"right\\\": 1831, \\\"tagname\\\": \\\"div\\\", \\\"text-align\\\": \\\"start\\\", \\\"text-decoration\\\": \\\"none solid rgb(32, 33, 36)\\\", \\\"top\\\": 180, \\\"visibility\\\": \\\"visible\\\", \\\"visible\\\": true, \\\"xpath\\\": \\\"1628\\\", \\\"xpathProp\\\": \\\"\\\\\\/\\\\\\/div[@id='appbar']\\\", \\\"z-index\\\": \\\"auto\\\" }\",\"id\":\"4\",\"declaredClass\":\"com.ibm.rational.test.lt.core.moeb.model.transfer.testscript.DeviceUIObject\",\"type\":\"html.div\"}}],\"timeout\":10}",
												  "/shas/ed.testsuite",
												  null,
												  "<default>");



		return stepBatch;
	}

}

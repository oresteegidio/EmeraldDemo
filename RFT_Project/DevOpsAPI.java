
import resources.DevOpsAPIHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author orest
 */
public class DevOpsAPI extends DevOpsAPIHelper
{
	/**
	 * Script Name   : <b>DevOpsAPI</b>
	 * Generated     : <b>Feb 14, 2025 10:22:26 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 22631 ()
	 * 
	 * @since  2025/02/14
	 * @author orest
	 */
	public void testMain(Object[] args) 
	{
		startApp("IntegrationTester");
		
		// Window: IntegrationTester.exe: DevOps Test Integrations and APIs
		devOpsTestIntegrationsAndAPIsw().click(atPoint(120,758));
		devOpsTestIntegrationsAndAPIsw().click(atPoint(120,728));
		devOpsTestIntegrationsAndAPIsw().dragToScreenPoint(
                                        CLOSE_BUTTON, 
                                        atPoint(2408,1270));
		devOpsTestIntegrationsAndAPIsw().click(atPoint(680,1046));
	}
}


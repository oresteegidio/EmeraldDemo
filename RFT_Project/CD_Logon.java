
import resources.CD_LogonHelper;
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
public class CD_Logon extends CD_LogonHelper
{
	/**
	 * Script Name   : <b>CD_Logon</b>
	 * Generated     : <b>Jan 7, 2025 9:53:19 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 22631 ()
	 * 
	 * @since  2025/01/07
	 * @author orest
	 */
	public void testMain(Object[] args) 
	{
		
		// Frame: Member Logon
		existingCustomer().performTest(ExistingCustomer_stateVP());
		// Data Driven Code inserted on Jan 7, 2025
		nameCombo().select(dpString("nameCombo"));
		ok().click();
	}
}


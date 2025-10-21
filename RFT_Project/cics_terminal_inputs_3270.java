
import resources.cics_terminal_inputs_3270Helper;
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
 * @author admin
 */
public class cics_terminal_inputs_3270 extends cics_terminal_inputs_3270Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>Sep 6, 2023 3:14:46 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 19045 ()
	 * 
	 * @since  2023/09/06
	 * @author admin
	 */
	public void testMain(Object[] args) 
	{
		startApp("Extension for Terminal Applications");
		
		// 
		host().click(atPoint(20,5));
		ibmExtensionForTerminalBasedAp(ANY,UNINITIALIZED).inputKeys("{Num1}{Num0}{Num.}{Num1}{Num3}{Num4}{Num.}{Num7}{Num1}{Num.}");
		ibmExtensionForTerminalBasedAp().inputKeys("{Num1}{Num3}{Num6}");
		connectUsingTheCurrentConnecti().click();
		field_22_1().waitForExistence();
		ibmExtensionForTerminalBasedAp().inputKeys("logon applid{(}cic56m11{)}{ENTER}");
		clear().click();
		ibmExtensionForTerminalBasedAp().inputKeys("ssc1{ENTER}");
		ibmExtensionForTerminalBasedAp().inputKeys("{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}");
		ibmExtensionForTerminalBasedAp(ANY,UNINITIALIZED).inputKeys("{ExtRight}{ExtRight}{ExtRight}{Num1}{Num~}");
		ibmExtensionForTerminalBasedAp().inputKeys("{Num1}{Num~}");
		ibmExtensionForTerminalBasedAp().inputKeys("{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}");
		ibmExtensionForTerminalBasedAp(ANY,UNINITIALIZED).inputKeys("{ExtRight}{ExtRight}{ExtRight}{Num2}{Num~}");
		ibmExtensionForTerminalBasedAp().inputKeys("{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}");
		ibmExtensionForTerminalBasedAp(ANY,UNINITIALIZED).inputKeys("{ExtRight}{ExtRight}{ExtRight}{Num3}{Num~}");
		field_13_51().performTest(emailVP());
		disconnectFromTheHost().click();
		ibmExtensionForTerminalBasedAp(ANY,MAY_EXIT).close();
	}
}


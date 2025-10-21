
import resources.script_3270Helper;
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
 * @author STUART.WALKER
 */
public class script_3270 extends script_3270Helper
{
	/**
	 * Script Name   : <b>script3270</b>
	 * Generated     : <b>3 Jul 2023 09:28:18</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 19045 ()
	 * 
	 * @since  2023/07/03
	 * @author STUART.WALKER
	 */
	public void testMain(Object[] args) 
	{
		startApp("Extension for Terminal Applications");
		
		// 
		host().click(atPoint(175,15));
		ibmExtensionForTerminalBasedAp().inputKeys("{Num1}{Num0}{Num.}{Num1}{Num3}{Num4}{Num.}{Num7}{Num1}{Num.}");
		ibmExtensionForTerminalBasedAp(ANY,UNINITIALIZED).inputKeys("{Num1}{Num3}{Num6}");
		connectUsingTheCurrentConnecti().click();
		ibmExtensionForTerminalBasedAp().inputKeys("logon applid{(}cic56m11{)}{ENTER}");
		clear().click();
		ibmExtensionForTerminalBasedAp(ANY,UNINITIALIZED).inputKeys("ssc1{ENTER}");
		ibmExtensionForTerminalBasedAp().inputKeys("{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}");
		ibmExtensionForTerminalBasedAp(ANY,UNINITIALIZED).inputKeys("{ExtRight}{ExtRight}{ExtRight}{Num1}{Num~}");
		ibmExtensionForTerminalBasedAp().inputKeys("{Num1}{Num~}");
		ibmExtensionForTerminalBasedAp().inputKeys("{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}{ExtRight}");
		ibmExtensionForTerminalBasedAp(ANY,UNINITIALIZED).inputKeys("{ExtRight}{ExtRight}{ExtRight}{Num2}{Num~}");
		field_8_51().performTest(HouseNameVP());
		disconnectFromTheHost().click();
		ibmExtensionForTerminalBasedAp(ANY,MAY_EXIT).close();
	}
}



import resources.App_ClassicCDHelper;
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
public class App_ClassicCD extends App_ClassicCDHelper
{
	/**
	 * Script Name   : <b>App_ClassicCD</b>
	 * Generated     : <b>Jan 7, 2025 9:57:33 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 22631 ()
	 * 
	 * @since  2025/01/07
	 * @author orest
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
		// put togheter scripts as Lego
		callScript("CD_StartAppA");
		callScript("CD_Logon", DEFAULT_ARGS, DP_SHARE_CURRENT_RECORD);
		callScript("CD_InsertOrder", DEFAULT_ARGS, DP_SHARE_CURRENT_RECORD);
		
	}
}


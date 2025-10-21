
import resources.CD_InsertOrderHelper;
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
public class CD_InsertOrder extends CD_InsertOrderHelper
{
	/**
	 * Script Name   : <b>CD_InsertOrder</b>
	 * Generated     : <b>Jan 7, 2025 9:54:30 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 22631 ()
	 * 
	 * @since  2025/01/07
	 * @author orest
	 */
	public void testMain(Object[] args) 
	{
		logInfo("numero argomenti="+ args.length);
		logInfo("args 0="+ args[0]);
		logInfo("args 0="+ args[1]);
		
		// Frame: Place an Order
		item().performTest(Item_textVP());
		quantity().click(atPoint(53,12));
		// Data Driven Code inserted on Jan 7, 2025
		quantity().setText(dpString("Quantity"));
		cardNumberIncludeTheSpaces().click(atPoint(75,10));
		placeAnOrder().inputChars("12345678");
		expirationDate().click(atPoint(20,6));
		placeAnOrder().inputChars("12/25");
		placeOrder().click();
		
		// 
		yourOrderHasBeenReceivedYourOr().performTest(YourOrderHasBeenReceivedYourOr_textVP());
		ok().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}



import resources.ClassicsCDHelper;
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
public class ClassicsCD extends ClassicsCDHelper
{
	/**
	 * Script Name   : <b>ClassicsCD</b>
	 * Generated     : <b>Jan 7, 2025 9:32:14 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 22631 ()
	 * 
	 * @since  2025/01/07
	 * @author orest
	 */
	public void testMain(Object[] args) 
	{
		
		logInfo("numero argomenti="+ args.length);
        if (args.length > 0) {
       	 
            // Print statements
            System.out.println("The command line"
                               + " arguments are:");
            logInfo("numero argomenti="+ args[0]);

        }
        else
            // Print statements
        	logInfo("no argomenti=");
		startApp("ClassicsJavaA");
		// Frame: ClassicsCD
		placeOrder().performTest(PlaceOrder_textVP());
		tree2().click(atPath("Composers->Schubert->Location(PLUS_MINUS)"));
		tree2().click(atPath("Composers->Schubert->String Quartets Nos. 4 & 14"));
		placeOrder().click();
		
		// Frame: Member Logon
		nameCombo().click();
		//nameCombo().click(atText("Susan Flontly"));
		// Data Driven Code inserted on Jan 7, 2025
		nameCombo().select(dpString("nameCombo"));
		ok().click();
		// Data Driven Code inserted on Jan 7, 2025
		
		// Frame: Place an Order
		quantity().setText(dpString("Quantity"));
		cardNumberIncludeTheSpaces().click(atPoint(34,7));
		placeAnOrder().inputChars("12345678");
		
		// Frame: Place an Order
		expirationDate().click(atPoint(23,10));
		placeAnOrder().inputKeys("12/25");
		
		placeOrder2().click();
		
		// 
		yourOrderHasBeenReceivedYourOr().performTest(YourOrderHasBeenReceivedYourOr_textVP());
		ok2().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}


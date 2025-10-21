
import resources.StartAppHelper;
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
public class StartApp extends StartAppHelper
{
	/**
	 * Script Name   : <b>StartApp</b>
	 * Generated     : <b>Oct 2, 2024 12:16:22 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 22631 ()
	 * 
	 * @since  2024/10/02
	 * @author orest
	 */
	public void testMain(Object[] args) 
	{
		logInfo("numero argomenti="+ args.length);
		logInfo("args 0="+ args[0]);
		logInfo("args 0="+ args[1]);
		
        if (args.length > 0) {
        	 
            // Print statements
            System.out.println("The command line"
                               + " arguments are:");

            // Iterating the args array
            // using for each loop
		        System.out.println(args[0]);
                System.out.println(args[1]);
        }
        else
            // Print statements
            System.out.println("No command line "
                               + "arguments found.");
    
		
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		classicsCD().resize(1364, 1142);
		tree2().click(atPath("Composers->Schubert->Location(PLUS_MINUS)"));
		tree2().drag(atPath("Composers->Schubert->Die schone Mullerin, Op. 25"));
		placeOrder().click();
		
		// Frame: Member Logon
		ok().click();
	}
}


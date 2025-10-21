
import resources.Pdf_TestHelper;
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
public class Pdf_Test extends Pdf_TestHelper
{
	/**
	 * Script Name   : <b>Pdf_Test</b>
	 * Generated     : <b>Nov 25, 2024 2:38:58 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 22631 ()
	 * 
	 * @since  2024/11/25
	 * @author orest
	 */
	public void testMain(Object[] args) 
	{
		startApp("Acrobat");
		
		// Window: Acrobat.exe: Adobe Acrobat Reader (64-bit)
		avuiTopRightCommandClusterwind().doubleClick(atPoint(44,20));
		avuiTopRightCommandClusterwind().click(atPoint(49,24));
		
		// Window: Acrobat.exe: Context
		contextpopupMenu().click(atPath("Open... Ctrl+O"));
		
		// Window: Acrobat.exe: Open

		navigationPanetree().click(atPath("Desktop->This PC->Local Disk (C:)"));
		nametext().click(atPoint(114,13));
		itemsViewlist().click(atPoint(212,239));
		
		// Window: Acrobat.exe: HCL DevOps Velocity Brochure 2024.pdf - Adobe Acrobat Reader (64-bit)
		avPageViewwindow().click(atPoint(130,452));
	}
}


import team14.teamproject.ClaimModel;
import team14.teamproject.LoginActivity;
import android.test.ActivityInstrumentationTestCase2;


public class ClaimModelTest extends
		ActivityInstrumentationTestCase2<LoginActivity> {

	public ClaimModelTest(){
		super(LoginActivity.class);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		ClaimModel claim = new ClaimModel(); 
	}
	
	public void testExample(){
		// assertTrue/Equals
	}
}
package sierra.cathy.properties;

import java.util.ListResourceBundle;

public class MyLabel_pt_IN extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		Object[][] myObject=new Object[][]{{"Company",new StringBuilder("TCS1")},{"College", "HITK1"}};
		return myObject;
	}

}

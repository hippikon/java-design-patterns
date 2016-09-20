package digital.places.factory.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AndroidOS implements OS{
	private List<Features> featureList = new ArrayList<Features>();
	
	public AndroidOS (Features... features) {
		for (Features feature:features) {
			this.featureList.add(feature);
		}
	}

	  @Override
	  public String toString() {
	    return Arrays.toString(featureList.toArray());
	  }

	@Override
	public List<Features> getFeatures() {
		return featureList;
	}

}

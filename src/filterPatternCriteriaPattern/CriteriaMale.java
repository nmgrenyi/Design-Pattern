package filterPatternCriteriaPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{

	public CriteriaMale() {
		
	}
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> returnList = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.gender.equalsIgnoreCase("male")) {
				returnList.add(person);
			}
		}
		return returnList;
	}

}
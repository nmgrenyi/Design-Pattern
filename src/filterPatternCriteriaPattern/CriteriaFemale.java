package filterPatternCriteriaPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria{

	public CriteriaFemale() {
		
	}
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> returnList = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.gender.equalsIgnoreCase("female")) {
				returnList.add(person);
			}
		}
		return returnList;
	}

}

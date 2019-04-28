package filterPatternCriteriaPattern;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria{
	Criteria criteria;
	Criteria otherCriteria;
	
	public AndCriteria (Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}
	
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> returnPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(returnPersons);
	}
}

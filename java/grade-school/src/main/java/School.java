import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class School {

	private Map<Integer, List<String>> db = new HashMap<Integer, List<String>>();

	/**
	 * 
	 * @return An immutable version of the possibly unsorted grade school db.
	 */
	public Map<Integer, List<String>> db() {
		return Collections.unmodifiableMap(db);
	}
	
	public void add(String name, int grade) {
		List<String> gradeList = db.get(grade);
		if (gradeList == null) {
			gradeList = new LinkedList<String>();
			db.put(grade, gradeList);
		}
		gradeList.add(name);
	}
	
	public List<String> grade(int grade) {
		List<String> list = db.get(grade);
		return (list == null) ? new LinkedList<String>() : list;
	}
	
	/**
	 * Sorts the db and returns an immutable version of it.
	 * @return Sorted immutable reference.
	 */
	public 	Map<Integer, List<String>> sort() {
		db.values().forEach(list -> list.sort(String::compareTo));
		return Collections.unmodifiableMap(db);
	}
	
}

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class School {

	private Map<Integer, List<String>> db = new HashMap<Integer, List<String>>();

	/**
	 * 
	 * @return An unsorted copy of the grade school db.
	 */
	public Map<Integer, List<String>> db() {
		return getDb(false);
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
	 * 
	 * @return A sorted copy of the grade school db.
	 */
	public 	Map<Integer, List<String>> sort() {
		return getDb(true);
	}
	
	/**
	 * 
	 * @param sorted Declares whether the grade lists have to be sorted.
	 * @return A copy of the grade school db.
	 */
	private Map<Integer, List<String>> getDb(boolean sorted) {
		Map<Integer, List<String>> dbCopy = new HashMap<Integer, List<String>>();
		for (int grade : db.keySet()) {
			LinkedList<String> copiedList = new LinkedList<String>(db.get(grade));
			if (sorted) {
				copiedList.sort(String::compareTo);
			}
			dbCopy.put(grade, copiedList);
		}
		return dbCopy;
	}
	
}

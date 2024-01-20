package udemy;

//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code> {
	private String courseId;
	private String rollNo;

	public Code(String courseId, String rollNo) {
		this.courseId = courseId;
		this.rollNo = rollNo;
	}

	public String getcourseId() {
		return courseId;
	}

	public String getRollNo() {
		return rollNo;
	}

	@Override
	public String toString() {
		return "Code [courseId=" + courseId + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int compareTo(Code obj) {
		String code1 = courseId.concat(rollNo);
		String code2 = obj.getcourseId() + obj.getRollNo();
		return code1.compareTo(code2);

	}
}

public class App2 {

	public static void main(String[] args) {
		Map<Code, String> students = new TreeMap<>();
		students.put(new Code("S001", "210"), "Ali");
		students.put(new Code("S003", "215"), "Raj");
		students.put(new Code("S003", "241"), "Teena");
		students.put(new Code("S002", "220"), "Mufaddal");
		students.put(new Code("S001", "213"), "Lubaina");
		students.put(new Code("S004", "211"), "Mia");

		for (Map.Entry<Code, String> i : students.entrySet()) {
			System.out.println("Key:" + i.getKey() + ", value:" + i.getValue());
		}
	}

}


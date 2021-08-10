/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Darren, 31 Jul 2021 11:45:57 am
 */

/**
 * @author Yi Liang
 *
 */
public class Subject {
	private int SubjectID;
	private String Description;
	
	public Subject(int id, String desc) {
		this.SubjectID = id;
		this.Description = desc;
	}
	
	public int getSubjectID() {
		return SubjectID;
	}
	
	public String getDesc() {
		return Description;
	}
	
}

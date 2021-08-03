/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Darren, 31 Jul 2021 11:45:41 am
 */

/**
 * @author Darren
 *
 */
public class Career_Information {
	
	public int careerID;
	public String careerName;
	
	public Career_Information(int careerID, String careerName) {
		this.careerID = careerID;
		this.careerName = careerName;
	}

	public int getCareerID() {
		return careerID;
	}

	public void setCareerID(int careerID) {
		this.careerID = careerID;
	}

	public String getCareerName() {
		return careerName;
	}

	public void setCareerName(String careerName) {
		this.careerName = careerName;
	}
}

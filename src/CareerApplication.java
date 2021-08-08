import java.util.ArrayList;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Darren, 31 Jul 2021 11:15:38 am
 */

/**
 * @author Darren
 *
 */
public class CareerApplication {
	/**
	 * @param args
	 */
	ArrayList<User_Account> userList = new ArrayList<User_Account>();
	ArrayList<Subject> subjectList = new ArrayList<Subject>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CareerApplication app = new CareerApplication();
		app.start();
	}

	private void start() {

		int option = -1;

		while (option != 5) {

			menu();
			option = Helper.readInt("Enter Choice > ");

			if (option == 1) {
				int sub_option = -1;
				while (sub_option != 4) {
					SubMenuUser();
					sub_option = Helper.readInt("Enter Choice > ");

					if (sub_option == 1) {
						addUser();
					} else if (sub_option == 2) {
						viewUser();

					} else if (sub_option == 3) {
						deleteUser();
					}
				}

			} else if (option == 2) {
				int sub_option = -1;
				while (sub_option != 4) {
					SubMenuCluster();
					sub_option = Helper.readInt("Enter Choice > ");

					if (sub_option == 1) {

					} else if (sub_option == 2) {

					} else if (sub_option == 3) {

					}
				}

			} else if (option == 3) {
				int sub_option = -1;
				while (sub_option != 4) {
					SubMenuCareer();
					sub_option = Helper.readInt("Enter Choice > ");

					if (sub_option == 1) {

					} else if (sub_option == 2) {

					} else if (sub_option == 3) {

					}
				}
			} else if (option == 4) {
				int sub_option = -1;
				while (sub_option != 4) {
					SubMenuSubject();
					sub_option = Helper.readInt("Enter Choice > ");

					if (sub_option == 1) {

					} else if (sub_option == 2) {

					} else if (sub_option == 3) {

					}
				}

			} else if (option == 5) {
				System.out.println("Thank you for using the application!");
			}
		}
	}

	// Primary menu for career application
	public static void menu() {
		Helper.line(30, "=");
		System.out.println("CAREER APPLICATION");
		Helper.line(30, "=");
		System.out.println("1) Manage User Account");
		System.out.println("2) Manage Academic Cluster");
		System.out.println("3) Manage Career Information");
		System.out.println("4) Manage Subject");
		System.out.println("5) Quit");
	}

	// -----------------------------------------------
	// Sub menu for the management of the User Account
	public static void SubMenuUser() {
		Helper.line(30, "-");
		System.out.println("Manage User Account");
		Helper.line(30, "-");
		System.out.println("1) Add User Account");
		System.out.println("2) View All User Account");
		System.out.println("3) Delete User Account");
		System.out.println("4) Exit");
	}

	// Add the methods for the options in the Sub menu below
	private void addUser() {
		Helper.line(40, ".");
		System.out.println("Add users");
		Helper.line(40, ".");

		int userID = Helper.readInt("Enter the User ID> ");
		String name = Helper.readString("Enter the user name> ");
		String role = Helper.readString("Enter the role > ");
		String email = Helper.readString("Enter email > ");
		String pass = Helper.readString("Enter password > ");

		User_Account newUser = new User_Account(userID, name, role, email, pass);
		userList.add(newUser);

	}

	public void viewUser() {
		Helper.line(40, ".");
		System.out.println("All users");
		Helper.line(40, ".");

		System.out.println(
				String.format("%-10s %-20s %-20s %-20s %-20s", "USER ID", "NAME", "ROLE", "EMAIL", "PASSWORD"));
		for (int i = 0; i < userList.size(); i++) {
			User_Account ez = userList.get(i);
			System.out.println(String.format("%-10d %-20s %-20s %-20s %-20s", ez.getUser_id(), ez.getName(),
					ez.getRole(), ez.getEmail(), ez.getPassword()));
		}

	}

	public void deleteUser() {
		Helper.line(40, ".");
		System.out.println("Delete users");
		Helper.line(40, ".");

		int userID = Helper.readInt("Enter UserID of the user to be removed >");
		for (int i = 0; i < userList.size(); i++) {
			User_Account ez = userList.get(i);
			if (ez.getUser_id() == userID) {
				System.out.println(
						String.format("%-10s %-20s %-20s %-20s %-20s", "USER ID", "NAME", "ROLE", "EMAIL", "PASSWORD"));
				System.out.println(String.format("%-10d %-20s %-20s %-20s %-20s", ez.getUser_id(), ez.getName(),
						ez.getRole(), ez.getEmail(), ez.getPassword()));
				char confirmation = Helper.readChar("Do you want to remove this user(y/n)> ");
				if (confirmation == 'y') {
					userList.remove(i);
					System.out.println("User is removed from the List!");
				} else {
					System.out.println("User is not removed!");
				}
			} else {
				System.out.println("User not found please try again!");
			}
		}

	}

	// -----------------------------------
	// Sub menu for the management of the academic cluster
	public static void SubMenuCluster() {
		Helper.line(30, "-");
		System.out.println("Manage Academic Cluster");
		Helper.line(30, "-");
		System.out.println("1) Add Academic Cluster");
		System.out.println("2) View All Academic Cluster");
		System.out.println("3) Delete Academic Cluster");
		System.out.println("4) Exit");
	}
	// Add the methods for the option in the sub menu below

	// ----------------------------------
	// Sub menu for the management for Career Information
	public static void SubMenuCareer() {
		Helper.line(30, "-");
		System.out.println("Manage Career Information");
		Helper.line(30, "-");
		System.out.println("1) Add Career Information");
		System.out.println("2) View All Career Information");
		System.out.println("3) Delete Career Information");
		System.out.println("4) Exit");
	}
	// Add the methods for the options in the sub menu below

	// -----------------------------------
	// Sub menu for the management of Subjects
	public static void SubMenuSubject() {
		Helper.line(30, "-");
		System.out.println("Manage Subject");
		Helper.line(30, "-");
		System.out.println("1) Add Subject");
		System.out.println("2) View All Subjects");
		System.out.println("3) Delete Subject");
		System.out.println("4) Exit");
	}

	public void Addsubject() {
		System.out.println("Add Subjects");
		int id = Helper.readInt("Enter new SubjectID: ");
		String desc = Helper.readString("Enter new Subject description");
		Subject new_Subject = new Subject(id, desc);

		subjectList.add(new_Subject);
	}

	public void Viewsubject() {
		System.out.println("View Subjects");
		String output = String.format("%-5s %s\n", "Subject ID", "Subject Description");
		for (Subject i : subjectList) {
			output += String.format("%-5d %s", i.getSubjectID(), i.getDesc());
		}
		System.out.println(output);
	}

	public void Deletesubject() {
		System.out.println("Delete Subjects");
		int DeleteID = Helper.readInt("Enter Subject ID to remove: ");
		String output = "";
		int count = 0;
		for (Subject i : subjectList) {
			if (DeleteID == i.getSubjectID()) {
				count++;
				if (count == 1) {
					output += String.format("%-5s %s\n", "Subject ID", "Subject Description");
					output += String.format("%-5d %s", i.getSubjectID(), i.getDesc());
					System.out.println(output);
					char Confirmation = Helper.readChar("Are you sure you wish to remove Subject with ID: " + DeleteID + "?");
					if (Confirmation == 'Y' || Confirmation == 'y') {
						subjectList.remove(i);
						System.out.println("Subject Removed!");
					}
				}
			}
		}
		if (count == 0) {
			System.out.println("No subject matches the specified Subject ID!");
		}
	}

}

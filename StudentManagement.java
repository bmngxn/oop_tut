/**
 * Student Management class.
 * @author bmngxn
 */
public class StudentManagement {
    Student[] students = new Student[100];
    int numOfStudents = 0;

    /**
     * Checks if two students belong to the same group.
     *
     * @param s1 the first student
     * @param s2 the second student
     * @return true if both students are in the same group,
     *         false otherwise
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Adds a new student to the list of students.
     *
     * @param s the student to be added
     */
    public void addStudent(Student s) {
        students[numOfStudents] = s;
        numOfStudents++;
    }

    /**
     * Returns a string listing all students grouped by their class group.
     * For each distinct group, the group name is printed first,
     * followed by all students in that group (in the order they were added).
     *
     * @return a string containing students grouped by their class group
     */
    public String studentsByGroup() {
        boolean[] check = new boolean[numOfStudents];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numOfStudents; i++) {
            if (!check[i]) {
                sb.append(students[i].getGroup()).append("\n");
                for (int j = i; j < numOfStudents; j++) {
                    if (sameGroup(students[i], students[j])) {
                        sb.append(students[j].getInfo()).append("\n");
                        check[j] = true;
                    }
                }
            }
        }
        return sb.toString();
    }

    /**
     * Removes a student with the specified ID from the list.
     * After removal, the remaining students are shifted left so that
     * there are no gaps in the array.
     *
     * @param id the ID of the student to be removed
     */
    public void removeStudent(String id) {
        for (int i = 0; i < numOfStudents; i++) {
            if (students[i] != null && students[i].getId().equals(id)) {
                for (int j = i; j < numOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numOfStudents - 1] = null;
                numOfStudents--;
                break;
            }
        }
    }
}

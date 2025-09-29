/**
 * Student class.
 * @author bmngxn
 */
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Gets the student's name.
     *
     * @return the student's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student's name.
     *
     * @param name the student's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the student's ID.
     *
     * @return the student's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the student's ID.
     *
     * @param id the student's ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the student's group.
     *
     * @return the student's group
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the student's group.
     *
     * @param group the student's group
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Gets the student's email.
     *
     * @return the student's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the student's email.
     *
     * @param email the student's email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns a string containing the student's full information:
     * name, ID, group, and email.
     *
     * @return a string with the student's information
     */
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    /**
     * Default constructor.
     * Initializes the student with:
     * - name: "Student"
     * - id: "000"
     * - group: "K62CB"
     * - email: "uet@vnu.edu.vn"
     */
    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructs a student with the given name, ID, and email.
     * The group is set to "K62CB" by default.
     *
     * @param name  the student's name
     * @param id    the student's ID
     * @param email the student's email
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * Copy constructor.
     * Creates a new student by copying the information
     * from another student.
     *
     * @param s the student to copy
     */
    public Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }
}

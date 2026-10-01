public class Student extends Person {
    private int semester;

    /**
     * Konstruktor
     * @param id
     * @param semester
     */
    public Student(int id, int semester) {
        super(id);
        this.semester = semester;
    }

    /**
     * getSemester
     * @return semester
     */
    public int getSemester() {
        return this.semester;
    }
}

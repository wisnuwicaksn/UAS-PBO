public class Course {
    private String name;
    private int credit;
    private Mahasiswa student;

    public Course(String name, int credit){
        this.name = name;
        this.credit = credit;
    }

    public void setStudent(Mahasiswa student){
        this.student = student;
    }
    public String getName(){
        return name;
    }

    public int getCredit(){
        return credit;
    }

    public Mahasiswa getStudent(){
        return student;
    }
}
package JavaSort;
import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code

class StudentC implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        double c1 = o1.getCgpa();
        double c2 = o2.getCgpa();

        if (Math.abs(c1 - c2) < 1e-7) {
            int nameC = o1.getFname().compareTo(o2.getFname());
            if (nameC == 0) return o1.getId() - o2.getId();
            return nameC;
        }
        return (c1 < c2) ? 1 : (c1 > c2) ? -1 : 0;
    }
}

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        StudentC comp = new StudentC();

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, comp);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}




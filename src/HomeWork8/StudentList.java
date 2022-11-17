package HomeWork8;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student>studentsList= new ArrayList<>();
    public void addStudent(Student a){
        studentsList.add(a);
    }
    public void facultyPrint(String faculty){
        System.out.println("List of students that studying at the faculty "+faculty);
        for(Student st:studentsList)
            if(st.getFaculty().equals(faculty))
                System.out.println(st.toString());
    }

    public void facultyAndGradePrint(String faculty,String course){
        System.out.println("List of students that studying at the faculty "+faculty+" и "+course+" course");
        for(Student st:studentsList)
            if(st.getFaculty().equals(faculty) && st.getCourse().equals(course))
                System.out.println(st.toString());
    }

    public void BornedEarly(String year){
        System.out.println("List of students who borned early than"+year);
        for(Student st:studentsList)
            if(parseYear(st.getDateOfBirth().substring(6))>parseYear(year))
                System.out.println(st.toString());
    }

    public void ListOfGroup(String group){
        System.out.println("List of "+ group+" group");
        for(Student st:studentsList)  if(st.getGroup().equals(group))
            System.out.println(st.toString());
    }
    public void AllStudents(){
        System.out.println("List of all students");
        for(Student st:studentsList) System.out.println(st.toString());
    }


    public int parseYear(String years){
        return Integer.parseInt(years);
    }

}
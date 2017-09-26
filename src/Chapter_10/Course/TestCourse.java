package Chapter_10.Course;

/** designs a class for modeling courses
 * Created by lmsj0 on 9/27/2017.
 */
public class TestCourse {
    public static void main(String [] args){
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database System");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());

        String[]students = course1.getStudents();
        for(int i = 0; i< course1.getNumberOfStudents(); i++){
            System.out.print(students[i] + ", ");

        }

        System.out.println();
        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());

        double a = 12.4;

        System.out.println(new Double(a).intValue());
        Integer i = new Integer("23");
    }
}

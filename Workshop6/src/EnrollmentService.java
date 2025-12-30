import java.util.Map;

public class EnrollmentService {

    Map <String, String> students;

    public boolean enrollStudent(String studentUsername, String courseName) {
        if (!students.containsKey(studentUsername)) {
            students.put(studentUsername, courseName);
            return true;
        } else {
            return false;
        }
   }
}



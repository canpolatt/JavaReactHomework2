public class CourseManager {
    public void registrationCourse(Course course, User user){
        System.out.println("Tebrikler "+user.userName+" "+course.courseName+" kursuna kayıt oldunuz.");
    }
    public void deleteCourse(Course course, User user){
        System.out.println(course.courseName+" kursuna olan kaydınızı sildiniz.");
    }
}

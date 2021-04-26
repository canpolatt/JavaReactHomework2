public class Main {

    public static void main(String[] args) {
	// write your code here
        Course course1=new Course(1,"Yazılım Geliştirici Yetiştirme Kampı(C# + ANGULAR)","2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.","Engin Demiroğ");
        Course course2=new Course(2,"Yazılım Geliştirici Yetiştirme Kampı(JAVA + REACT)","2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.","Engin Demiroğ");
        Course course3=new Course(3,"Programlamaya Giriş için Temel Kurs","PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.","Engin Demiroğ");
        User user1=new User(1,"Can POLAT","1234","canpolat@example.com");

        Course[] courses={course1,course2,course3};

        for(Course course:courses){
            System.out.println(course.courseName);
        }
        CourseManager courseManager=new CourseManager();
        courseManager.registrationCourse(course1,user1);
        courseManager.registrationCourse(course2,user1);
        courseManager.deleteCourse(course1,user1);
        courseManager.deleteCourse(course2,user1);
    }
}

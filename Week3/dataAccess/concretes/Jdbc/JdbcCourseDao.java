package Week3.dataAccess.concretes.Jdbc;

import Week3.dataAccess.abstracts.CourseDao;
import Week3.entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Course added with JDBC: " + course.getCourseName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Course deleted with JDBC: " + course.getCourseName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Course updated with JDBC: " + course.getCourseName());
    }
}
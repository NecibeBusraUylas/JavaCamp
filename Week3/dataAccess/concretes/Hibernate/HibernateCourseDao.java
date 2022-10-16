package Week3.dataAccess.concretes.Hibernate;

import Week3.dataAccess.abstracts.CourseDao;
import Week3.entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Course added with Hibernate: " + course.getCourseName());
    }

    @Override
    public void delete(Course course) {
        System.out.println("Course deleted with Hibernate: " + course.getCourseName());
    }

    @Override
    public void update(Course course) {
        System.out.println("Course updated with Hibernate: " + course.getCourseName());
    }
}
package Week3.business.concrete;

import Week3.business.abstracts.CourseService;
import Week3.core.Logger;
import Week3.dataAccess.abstracts.CourseDao;
import Week3.entities.Course;

public class CourseManager  implements CourseService {

    private CourseDao courseDao;
    private Logger[] loggers;
    private Course[] courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, Course[] courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    @Override
    public void add(Course course) throws Exception {
        for (Course courses : courses) {
            if (courses.getCourseName() == course.getCourseName() && courses != course) {
                throw new Exception(course.getCourseName() + " Course name used before. Enter a new course name.");
            }
        }
        if (course.getCoursePrice() <= 0) {
            throw new Exception("Course price must be greater than 0.");
        }
        courseDao.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }
    }
}
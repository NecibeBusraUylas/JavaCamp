package Week3;

import Week3.business.concrete.CategoryManager;
import Week3.business.concrete.CourseManager;
import Week3.business.concrete.InstructorManager;
import Week3.core.DatabaseLogger;
import Week3.core.EmailLogger;
import Week3.core.FileLogger;
import Week3.core.Logger;
import Week3.dataAccess.concretes.Hibernate.HibernateCourseDao;
import Week3.dataAccess.concretes.Hibernate.HibernateInstructorDao;
import Week3.dataAccess.concretes.Jdbc.JdbcCategoryDao;
import Week3.entities.Category;
import Week3.entities.Course;
import Week3.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception{
        Logger[] loggers = {new DatabaseLogger(),new EmailLogger(), new FileLogger()};
        //Course[] courses1 ={new Course(1,"Java","engin",0),new Course(2,"Java","",1)};
        Course[] courses ={new Course(1,"Java","Engin",2000),new Course(2,"C#","Büşra",1000)};
        Category[] categories ={new Category(1,"Game Development"),new Category(2,"Web Development")};
        Instructor instructor = new Instructor( 1,"Engin Demiroğ","engin@gmail.com");

        //CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers1,courses1);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers,courses);
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers,categories);
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);

        for(Course course:courses) {
            courseManager.add(course);
            System.out.println("--------------------------");
        }
        System.out.println("**************************");
        for(Category category:categories) {
            categoryManager.add(category);
            System.out.println("--------------------------");
        }
        System.out.println("**************************");
        instructorManager.add(instructor);
    }
}
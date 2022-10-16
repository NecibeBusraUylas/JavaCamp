package Week3.dataAccess.concretes.Hibernate;

import Week3.dataAccess.abstracts.InstructorDao;
import Week3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor added with Hibernate: " + instructor.getInstructorName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Instructor deleted with Hibernate: " + instructor.getInstructorName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Instructor updated with Hibernate: " + instructor.getInstructorName());
    }
}
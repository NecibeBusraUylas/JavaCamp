package Week3.dataAccess.concretes.Jdbc;

import Week3.dataAccess.abstracts.InstructorDao;
import Week3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor added with JDBC: " + instructor.getInstructorName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Instructor deleted with JDBC: " + instructor.getInstructorName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Instructor updated with JDBC: " + instructor.getInstructorName());
    }
}
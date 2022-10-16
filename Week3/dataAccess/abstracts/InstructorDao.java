package Week3.dataAccess.abstracts;

import Week3.entities.Instructor;

public interface InstructorDao {
    void add(Instructor instructor);

    void delete(Instructor instructor);

    void update(Instructor instructor);

}
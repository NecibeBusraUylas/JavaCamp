package Week3.business.concrete;

import Week3.business.abstracts.InstructorService;
import Week3.core.Logger;
import Week3.dataAccess.abstracts.InstructorDao;
import Week3.entities.Instructor;

public class InstructorManager implements InstructorService {

    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    @Override
    public void add(Instructor instructor) throws Exception {
        instructorDao.add(instructor);
        for (Logger logger : loggers) {
            logger.log(instructor.getInstructorName());

        }
    }
}
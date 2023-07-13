package Controller;

import java.util.List;

import Model.Student;

/**
 * public interface for the models
 */
public interface iGetModel {
    public List<Student> getAll();

    public boolean deleteStudent(long id);
}

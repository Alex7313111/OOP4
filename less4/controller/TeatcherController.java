package less4.controller;

import less4.model.Student;
import less4.model.Teatcher;
import less4.model.User;
import less4.service.TeatcherService;
import less4.view.StudentView;
import less4.view.TeacherView;
import less4.view.UserView;

import java.util.List;

public class TeatcherController implements UserController {
    private TeacherView view = new TeacherView();

    private TeatcherService serviseTeatcher = new TeatcherService();
    public void sendOnConsole(List<Teatcher> teacher) {
        view.sendOnConsole(teacher);

    }

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

}

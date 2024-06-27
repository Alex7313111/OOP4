package less4.service;
import less4.model.Teatcher;
import less4.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeatcherService {
    public Map<String, User> userGroup  = new HashMap<>();

    public Teatcher createTeatcher(int id, String name, String last) {
        new Teatcher (id, name, last);
            addTeatcher(last,new Teatcher (id, name, last));
        return new Teatcher(id, name, last);

    }
    public void addTeatcher(String lastname, Teatcher teatcher){
        userGroup.put(lastname, teatcher);
    }
    public void removeTeatcher(String lastname){
        userGroup.remove(lastname);
    }

    public void rename(Teatcher teatcher){
        removeTeatcher(teatcher.getLastName());
        teatcher.setId(99);
        teatcher.setName("Pavel");
        teatcher.setLastName("Sidorov");
        addTeatcher(teatcher.getLastName(),teatcher);
    }
    public void printTeacher(){
        System.out.println(userGroup.values());
    }



}

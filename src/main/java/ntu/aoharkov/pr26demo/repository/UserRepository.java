package ntu.aoharkov.pr26demo.repository;

import ntu.aoharkov.pr26demo.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    public User getDefaultUser() {
        return new User("Artem", "Oharkov");
    }
}

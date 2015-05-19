package hu.pte.ttk.tams.service;

import hu.pte.ttk.tams.model.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    User getUser(String lastName, String firstName);

    Page<User> findUsers(User user, Pageable pageable);
}

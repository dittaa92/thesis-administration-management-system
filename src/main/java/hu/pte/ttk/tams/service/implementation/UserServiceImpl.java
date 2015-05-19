package hu.pte.ttk.tams.service.implementation;

import hu.pte.ttk.tams.model.domain.User;
import hu.pte.ttk.tams.repository.UserRepository;
import hu.pte.ttk.tams.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

@Component("UserService")
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //@Override
    public User getUser(String lastName, String firstName) {
        Assert.notNull(lastName, "The last name must not be null!");
        Assert.notNull(firstName, "The first name must not be null!");

        return this.userRepository.findByLastNameAndFirstNameAllIgnoringCase(lastName, firstName);
    }

    @Override
    public Page<User> findUsers(User user, Pageable pageable) {
        Assert.notNull(user, "The search criteria must not be null!");

        String firstName = user.getFirstName();
        String lastName = user.getLastName();

        if(!StringUtils.hasLength(firstName) && !StringUtils.hasLength(lastName)) {
            return this.userRepository.findAll(null);
        }

        return this.userRepository.findByLastNameContainingAndFirstNameContainingAllIgnoringCase(lastName, firstName, pageable);
    }
}

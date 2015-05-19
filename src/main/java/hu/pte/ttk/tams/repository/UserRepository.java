package hu.pte.ttk.tams.repository;

import hu.pte.ttk.tams.model.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User, Long>{
    Page<User> findAll(Pageable pageable);

    User findByLastNameAndFirstNameAllIgnoringCase(String lastName, String firstName);

    Page<User> findByLastNameContainingAndFirstNameContainingAllIgnoringCase(String lastName, String firstName, Pageable pageable);
}

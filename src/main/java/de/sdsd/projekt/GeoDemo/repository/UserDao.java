package de.sdsd.projekt.GeoDemo.repository;

import de.sdsd.projekt.GeoDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);

}

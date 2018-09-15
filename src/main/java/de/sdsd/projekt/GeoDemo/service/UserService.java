package de.sdsd.projekt.GeoDemo.service;

import de.sdsd.projekt.GeoDemo.model.User;
import de.sdsd.projekt.GeoDemo.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User userDetails(Long id) {
        Optional<User> byId = userDao.findById(id);
        if (byId.isPresent())
            return byId.get();
        else
            throw new RuntimeException("User Not found");
    }
}

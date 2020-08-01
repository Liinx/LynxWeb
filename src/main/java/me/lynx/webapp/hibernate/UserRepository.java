package me.lynx.webapp.hibernate;

import me.lynx.webapp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {


}

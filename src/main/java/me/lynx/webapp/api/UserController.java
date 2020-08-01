package me.lynx.webapp.api;

import me.lynx.webapp.model.User;
import me.lynx.webapp.hibernate.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    String addNewUser (@RequestParam String name, @RequestParam String email) {
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

}
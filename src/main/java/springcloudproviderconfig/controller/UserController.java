package springcloudproviderconfig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springcloudproviderconfig.entity.User;
import springcloudproviderconfig.service.UserService;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    public String getString() {
        return "调用了服务提供者";
    }
    /**
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public User getuser(@PathVariable String id) {
        User user = null;
        try {
            user = userService.find(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    /**
     * @return
     */
    @GetMapping("list")
    public List<User> users() {
        try {
            List<User> user = userService.findAll();
            if (user != null && user.size() != 0) {
                return user;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


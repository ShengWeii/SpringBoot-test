package com.springboot.test.User.Controller;


import com.springboot.test.User.Enity.User;
import com.springboot.test.User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    UserService userService;
    @GetMapping("/User")
    public String get(){

        return "Register";
    }
    @GetMapping("/Welcome")
    public  String welcome(){
        return "Welcome";
    }

    @PostMapping("/User/add")
    public String add(@RequestParam String account,
                      @RequestParam String password){
       User user=new User();
       user.setAccount(account);
       user.setPassword(password);
       userService.add(user);

       return "redirect:/Welcome";
   }
}

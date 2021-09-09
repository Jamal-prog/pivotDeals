package com.pivot.pivotDeals;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/Users")
public class userController {

    @GetMapping
    public List<User> getUser(@RequestParam(name="name", required=false) String name, Model model) {
        User user = new User();
        return List.of(user);
    }
    @PostMapping
    public void addUser(){

    }


}

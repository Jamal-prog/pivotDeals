package com.pivot.pivotDeals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    @GetMapping("/test")
    public String test(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        User user = new User(1,"john",new Location(150,150));
        Restaurant restaurant = new Restaurant(1,"Maggianos", new Location(100,100));
        Double distance = Location.haversine(user.location.getY(), user.location.getX(),
                restaurant.location.getY(), restaurant.location.getX());
        return "test";
    }
}
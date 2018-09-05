package com.example.demo;

import com.example.demo.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    public ModelAndView Index()
    {
        return new ModelAndView("Index");
    }
}

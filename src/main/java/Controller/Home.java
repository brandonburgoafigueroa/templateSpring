package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
    @RequestMapping("/")
    public ModelAndView Index()
    {
        return new ModelAndView("Index");
    }
}

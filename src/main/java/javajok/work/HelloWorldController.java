package javajok.work;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kenho on 11/15/15.
 */
@Controller
public class HelloWorldController {

        @RequestMapping("/hello")
        public String hello(Model model) {
            model.addAttribute("name", "ケン");
            return "hello";
        }
}

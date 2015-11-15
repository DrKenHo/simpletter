package javajok.work;

import com.sun.javafx.sg.prism.NGShape;
import javajok.sample.Timeline;
import javajok.sample.Tweet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

/**
 * Created by kenho on 11/15/15.
 */
@Controller
public class TimeLineController {

    @RequestMapping("/timeline")

    public String timeline(Model model){
        Timeline timeline = new RestTemplate().getForObject("http://simpletter.heroku.com/timeline", Timeline.class) ;

        model.addAttribute("timeline", timeline.tweets);

        return("timeline");
    }

}

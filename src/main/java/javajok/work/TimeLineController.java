package javajok.work;

import com.sun.javafx.sg.prism.NGShape;
import javajok.sample.Tweet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * Created by kenho on 11/15/15.
 */
@Controller
public class TimeLineController {

    @RequestMapping("/timeline")

    public String timeline(Model model){
        Tweet tweet = new Tweet();
        tweet.userId = "ken";
        tweet.text = "こにちわ";

        Tweet tweet2 = new Tweet();
        tweet2.userId = "ken1";
        tweet2.text = "こにちわ1";

        ArrayList<Tweet> timeline = new ArrayList<>();
        timeline.add(tweet);
        timeline.add(tweet2);
        model.addAttribute("timeline", timeline);
        return("timeline");
    }

}

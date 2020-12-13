package Upgrad.FirstMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {
    @RequestMapping("posts")
    public String getUserPosts(){
        return "posts";
    }
}

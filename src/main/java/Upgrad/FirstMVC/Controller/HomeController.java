package Upgrad.FirstMVC.Controller;

import Upgrad.FirstMVC.model.Post;
import Upgrad.FirstMVC.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Date;

@Controller
public class HomeController {

    public HomeController() {
        System.out.println("*** HomeController ***");
    }

    @Autowired
    private PostService postService;
    @RequestMapping("/")
    public String getAllPosts(Model model) {

        List<Post> posts=postService.getAllPosts();
        model.addAttribute("posts", posts);

        return "index";
    }
}

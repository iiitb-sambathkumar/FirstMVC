package Upgrad.FirstMVC.service;

import Upgrad.FirstMVC.model.Post;
import Upgrad.FirstMVC.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    @PersistenceUnit(unitName = "FirstMVC")
    private EntityManagerFactory emf;
    public PostService() {
        System.out.println("*** PostService ***");
    }


    @Autowired
    private PostRepository postRepository;
    public List<Post> getAllPosts() {
        List<Post> posts = new ArrayList<>();
        return postRepository.getAllPosts();
    }

    public Post getOnePost() {

        return postRepository.getLatestPost();
    }

    public void createPost (Post newPost){
    }
}
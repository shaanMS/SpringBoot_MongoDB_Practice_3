package com.jobproject.shaanProject.controller;


import com.jobproject.shaanProject.repository.PostRepo;
import com.jobproject.shaanProject.models.Post;
import com.jobproject.shaanProject.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class PostController
{
    @Autowired
    PostRepo postRepo;// ye spring data se text lega

    @Autowired
    SearchRepository searchrepo;
    @GetMapping("/getPost")
    public  List<Post> getAllPosts()
    {
        return postRepo.findAll();
    }



    @GetMapping("/getPost/{text}")
    public List<Post> search(@PathVariable String text)
    {
        return searchrepo.findByText(text);
    }




    @PostMapping("/savePost")
    public void Post(@RequestBody Post post)
    {
        postRepo.save(post);
    }


}

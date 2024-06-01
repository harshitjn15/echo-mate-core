package com.capstoneproject.echomate.controller;

import com.capstoneproject.echomate.model.Post;
import com.capstoneproject.echomate.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/user/{userId}")
    public List<Post> getPostsByUser(@PathVariable String userId) {
        return postService.findByUserId(userId);
    }

    @PostMapping("/create")
    public Post createPost(@RequestBody Post post) {
        return postService.savePost(post);
    }
}

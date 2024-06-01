package com.capstoneproject.echomate.service;

import com.capstoneproject.echomate.dao.PostRepository;
import com.capstoneproject.echomate.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public List<Post> findByUserId(String userId) {
        return postRepository.findByUserId(userId);
    }

    public Post savePost(Post post) {
        return postRepository.save(post);
    }
}

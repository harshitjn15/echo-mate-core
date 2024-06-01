package com.capstoneproject.echomate.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import java.util.Date;

@Document(collection = "posts")
@Data
public class Post {
    @Id
    private String id;
    private String userId;
    private String content;
    private Date timestamp;
    private String mediaUrl;
}

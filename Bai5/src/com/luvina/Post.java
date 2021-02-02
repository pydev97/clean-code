package com.luvina;

import java.util.ArrayList;

public class Post {
    private long id;
    private String title;
    private String content;
    private User author; //Tác giả của bài viết
    private ArrayList<Comment> comments; //Một post chứa nhiều Comment
}

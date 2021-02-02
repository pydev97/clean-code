package com.luvina;

import java.util.ArrayList;

public class User {
    private long id;
    private String fullName;
    private ArrayList<Post> posts;  //Một người có thể viết nhiều Post
    private ArrayList<Comment> comments; //Một người có thể bình luận nhiều Comment
    //---- Bổ xung method vào đây. Nhiệm vụ của các bạn đó !

    void writePost(Post post) { //ví dụ mẫu một phương thức nhé
        //Bổ xung logic vào đây
    }

    void deletePost(Post post) throws PostException {  //Nếu tác động lên dữ liệu nếu có lỗi thì hãy throw ra Exception

    }
}

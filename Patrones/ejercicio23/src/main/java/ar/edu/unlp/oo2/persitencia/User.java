package ar.edu.unlp.oo2.persitencia;

import java.util.ArrayList;
import java.util.List;

public class User implements PersistableUser {
    private String username;
    private String email;
    private List<Post> posts = null; // inicialmente null
    private PostRepository postRepo;

    public User(String username, String email, PostRepository postRepo) {
        this.username = username;
        this.email = email;
        this.postRepo = postRepo;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public List<Post> getPosts() {
        if (this.posts == null) {
            this.posts = postRepo.findPostsByUsername(this.username);
        }
        return posts;
    }
}



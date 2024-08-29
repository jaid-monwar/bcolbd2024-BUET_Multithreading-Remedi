package therap.medix.circlebackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;
    private String location;
    private String birthDate;
    private String email;
    private String password;
    private String mobile;
    private String image;
    private String backgroundImage;
    private String bio;
    private String website;
    private boolean req_user;
    private boolean login_with_google;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> post = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Like> likes = new ArrayList<>();

    @Embedded
    private Varification verification;

    @JsonIgnore
    @ManyToMany
    private List<User> followers = new ArrayList<>();

    @JsonIgnore
    @ManyToMany
    private List<User> followings = new ArrayList<>();


}

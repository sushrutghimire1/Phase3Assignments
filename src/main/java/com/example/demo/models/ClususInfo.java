package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity(name = "clusus_info")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class ClususInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String username;
    private String password;
    @ManyToMany
    @JoinTable(
            name="clususinfo_colleague",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="id"))
    private List<Colleague> colleagueList;

    public List<Colleague> getColleagueList() {
        return colleagueList;
    }

    public void setColleagueList(List<Colleague> colleagueList) {
        this.colleagueList = colleagueList;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

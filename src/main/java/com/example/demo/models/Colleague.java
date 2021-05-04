package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity(name = "colleague")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Colleague {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String first_name;
    private String last_name;

    @ManyToMany(mappedBy = "colleagueList")
    @JsonIgnore
    private List<ClususInfo> clususInfos;

    public List<ClususInfo> getClususInfos() {
        return clususInfos;
    }

    public void setClususInfos(List<ClususInfo> clususInfos) {
        this.clususInfos = clususInfos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}

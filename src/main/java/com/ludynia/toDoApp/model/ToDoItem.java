package com.ludynia.toDoApp.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;


@Entity
public class ToDoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private boolean complete;

    @Getter
    @Setter
    private Instant dateCreated;

    @Getter
    @Setter
    private Instant dateModified;


    public ToDoItem(){

    }

    public ToDoItem(String description){
        this.description = description;
        this.complete = false;
        this.dateCreated = Instant.now();
        this.dateModified = Instant.now();
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", complete=" + complete +
                ", dateCreated=" + dateCreated +
                ", dateModified=" + dateModified +
                '}';
    }
}

package com.ludynia.toDoApp.repository;

import com.ludynia.toDoApp.model.ToDoItem;
import org.springframework.data.repository.CrudRepository;

public interface ToDoItemRepository extends CrudRepository<ToDoItem,Long> {
}


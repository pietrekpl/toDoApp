package com.ludynia.toDoApp.config;


import com.ludynia.toDoApp.model.ToDoItem;
import com.ludynia.toDoApp.repository.ToDoItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ToDoItemDataLoader  implements CommandLineRunner {


    private final Logger logger = LoggerFactory.getLogger(ToDoItemDataLoader.class);

    private ToDoItemRepository toDoItemRepository;

    public ToDoItemDataLoader(ToDoItemRepository toDoItemRepository) {
        this.toDoItemRepository = toDoItemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData() {
        if (toDoItemRepository.count() == 0){
            ToDoItem toDoItem1 = new ToDoItem("Take dog for a walk");
            ToDoItem toDoItem2 = new ToDoItem("Do shopping");

            toDoItemRepository.save(toDoItem1);
            toDoItemRepository.save(toDoItem2);
        }
        logger.info("Number of items in repository : "+ toDoItemRepository.count());
    }
}

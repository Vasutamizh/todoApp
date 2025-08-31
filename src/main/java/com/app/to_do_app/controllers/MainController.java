package com.app.to_do_app.controllers;

import com.app.to_do_app.models.Tasks;
import com.app.to_do_app.services.TaskService;
import com.app.to_do_app.utilities.CustomApiResponse;
import com.app.to_do_app.utilities.CustomResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins = "*")
public class MainController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ResponseEntity<CustomApiResponse<List<Tasks>>> getAllTasks(){
        return new ResponseEntity<>(new CustomApiResponse<List<Tasks>>(CustomResponseStatus.SUCCESS, "Task details", taskService.getAllTasks()), HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<CustomApiResponse<Tasks>> createTask(@RequestBody Tasks task){
        Tasks createdTask = taskService.createNewTask(task);
        if(createdTask != null){
            return new ResponseEntity<>(new CustomApiResponse<Tasks>(CustomResponseStatus.SUCCESS, "Task Created.", createdTask), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(new CustomApiResponse<Tasks>(CustomResponseStatus.ERROR, "Error while creating task.", createdTask), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PutMapping
    public ResponseEntity<CustomApiResponse<Tasks>> maskTaskAsComplete(@RequestBody Tasks task){
    	Tasks temp = taskService.markAsComplete(task);
    	if(temp!=null) {
    		return new ResponseEntity<>(new CustomApiResponse<Tasks>(CustomResponseStatus.SUCCESS, "Task marked as completed.", temp), HttpStatus.OK); 
    	}
    	else {
    		return new ResponseEntity<>(new CustomApiResponse<Tasks>(CustomResponseStatus.ERROR, "Task not found", temp), HttpStatus.NOT_FOUND);
    	}
    }

}


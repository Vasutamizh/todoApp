package com.app.to_do_app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.to_do_app.models.Tasks;
import com.app.to_do_app.services.TaskService;
import com.app.to_do_app.utilities.CustomApiResponse;
import com.app.to_do_app.utilities.CustomResponseStatus;

@RestController
@RequestMapping("/api/history")
@CrossOrigin(origins = "*")
public class HistoryController {
	
	@Autowired TaskService taskService;

	@GetMapping
	public ResponseEntity<CustomApiResponse<List<Tasks>>> getAllTasks(){
        return new ResponseEntity<>(new CustomApiResponse<List<Tasks>>(CustomResponseStatus.SUCCESS, "Completed task details", taskService.getAllCompletedTasks()), HttpStatus.OK);
    }
	
}

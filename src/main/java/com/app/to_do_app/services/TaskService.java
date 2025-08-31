package com.app.to_do_app.services;

import com.app.to_do_app.models.Tasks;
import com.app.to_do_app.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Tasks> getAllTasks(){
        return taskRepository.findAll();
    }
    
    public List<Tasks> getAllCompletedTasks(){
    	return taskRepository.findCompletedTasks(false);
    }

    public Tasks createNewTask(Tasks task){
        if(task.getTaskName() != null && task.getDueTime() != null && task.getPriority() != null){
            return taskRepository.save(task);
        }
        else{
            return null;
        }
    }
    
    public Tasks markAsComplete(Tasks task) {
    	long id = task.getId();
    	if(id>0) {
    		Tasks temp = taskRepository.findTaskById(id);
    		if(temp!=null) {
    			temp.setStatus("completed");
    			temp.setIsActive(false);
    			return taskRepository.save(temp);
    		}
    		else {
    			return null;
    		}
    	}
    	else {
    		return null;
    	}
    }

}

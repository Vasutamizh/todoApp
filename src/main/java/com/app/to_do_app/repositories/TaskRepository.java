package com.app.to_do_app.repositories;

import com.app.to_do_app.models.Tasks;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TaskRepository extends JpaRepository<Tasks, Long> {
	
	@Query(value="SELECT * FROM tasks WHERE id=?1;", nativeQuery=true)
	public Tasks findTaskById(long id);
	
	@Query(value="SELECT * FROM tasks WHERE is_active=?1;", nativeQuery=true)
	public List<Tasks> findCompletedTasks(boolean isActive);
}

package int221.sit.taskboard.repositories;

import int221.sit.taskboard.entities.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskListRepository extends JpaRepository<TaskList, Integer> {

}

import com.example.demo.service.TaskService;
import com.example.demo.domain.entity.Task;
import com.example.demo.dto.request.CreateTaskRequest;

import java.time.Instant;

import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpimpl implements TaskService {
    private final TaskRepository TaskRepository;

    public TaskServiceImpl(TaskRepository TaskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();

        Task task = new Task(
                null,
                request.title(),
                request.description(),
                request.due_date(),
                TaskStatus.OPEN,
                request.priority().now,
                now);
        return taskRepository.save(task);
    }

}
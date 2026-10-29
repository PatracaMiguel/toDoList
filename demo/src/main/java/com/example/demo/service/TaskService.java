import com.example.demo.domain.CreateTaskRequest;
import comexample.demo.domain.entity.Task;

public interface TaskService {
    Task createTask(CreateTaskRequest request);

}
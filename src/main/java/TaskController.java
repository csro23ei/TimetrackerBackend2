import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {
  @Autowired
  private TaskService taskService;

  @GetMapping
  public List<Task> getAllTasks() {
    // Hämta och returnera alla uppgifter från service
  }

  @PostMapping
  public Task addTask(@RequestBody Task task) {
    // Lägg till uppgift och returnera den nya uppgiften från service
  }

  // Implementera övriga CRUD-operationer
}
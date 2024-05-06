import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
  @Autowired
  private TaskRepository taskRepository;

  public List<Task> getAllTasks() {
    // Hämta och returnera alla uppgifter från repository
  }

  public Task addTask(Task task) {
    // Lägg till uppgift och returnera den nya uppgiften från repository
  }

  // Implementera övriga affärslogik
}
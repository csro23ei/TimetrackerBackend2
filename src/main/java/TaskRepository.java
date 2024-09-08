import org.springframework.data.mongodb.repository.MongoRepository;

public interface taskRepository extends MongoRepository<Task, String> {
}
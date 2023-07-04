package solid.d;

// After DIP added UserRepository, abstraction on saving user.
public interface UserRepository {
    void save(User user);
}

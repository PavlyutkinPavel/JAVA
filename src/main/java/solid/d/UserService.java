package solid.d;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(String username, String password) {
        //logic for creation
        userRepository.save(new User().setName(username).setPassword(password));
    }
}


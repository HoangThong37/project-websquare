package demo.websquare.api;


import demo.websquare.domain.user.entity.User;
import demo.websquare.domain.user.exception.ResourceNotFoundException;
import demo.websquare.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
@Slf4j
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // API update user
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody User userRequest) {
        // Kiểm tra user tồn tại bằng ID
        Optional<User> optionalUser = userRepository.findById(id);
        if (!optionalUser.isPresent()) {
            // Trả về 404 nếu không tìm thấy user
            //return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with ID " + id + " not found.");
            throw new ResourceNotFoundException("User with ID " + id + " not found.");
        }

        if (userRequest.getName().length() > 30) {
            //return ResponseEntity.badRequest().body("Name cannot exceed 30 characters.");
            throw new ResourceNotFoundException("Name cannot exceed 30 characters.");
        }

//        if (userRequest.getAge() < 18) {
//            return ResponseEntity.badRequest().body("Age must be at least 18.");
//        }

        // Tiến hành cập nhật user

        User userToUpdate = optionalUser.get();

        userToUpdate.setName(userRequest.getName());
        userToUpdate.setEmail(userRequest.getEmail());
        userToUpdate.setAge(userRequest.getAge());
        userToUpdate.setUpdatedAt(LocalDateTime.now());
        userRepository.save(userToUpdate);

        return ResponseEntity.ok(userToUpdate);
    }


    // api create
    // API create new user
    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody User userRequest) {
        // Kiểm tra email đã tồn tại chưa
        Optional<User> existingUser = userRepository.findByEmail(userRequest.getEmail());
        if (existingUser.isPresent()) {
            //return ResponseEntity.status(HttpStatus.CONFLICT).body("Email already in use.");
            throw new ResourceNotFoundException("Email already in use.");
        }

        if (userRequest.getName().length() > 30) {
            //return ResponseEntity.badRequest().body("Name cannot exceed 30 characters.");
            throw new ResourceNotFoundException("Name cannot exceed 30 characters.");
        }
        if (userRequest.getAge() < 18) {
            //return ResponseEntity.badRequest().body("Age must be at least 18.");
            throw new ResourceNotFoundException("Age must be at least 18.");
        }

        userRequest.setCreatedAt(LocalDateTime.now());
        userRepository.save(userRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(userRequest);
    }

    // API get user by id
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        // Kiểm tra user có tồn tại không
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User with ID " + id + " not found"));

        return ResponseEntity.ok(user);
    }


}

package demo.websquare.domain.user.repository;

import demo.websquare.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Các phương thức tùy chỉnh nếu cần (ví dụ tìm kiếm user theo email)
    Optional<User> findByEmail(String email);
}

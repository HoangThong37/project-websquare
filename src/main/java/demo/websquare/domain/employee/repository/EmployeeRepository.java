package demo.websquare.domain.employee.repository;

import demo.websquare.domain.employee.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

    @Query(value = "SELECT e FROM Employee e " +
            "WHERE true " +
            "AND (:name IS NULL OR :name = '' OR e.name LIKE %:name%) " +
            "AND (:team IS NULL OR :team = '' OR e.team LIKE %:team%) " +
            "AND (:phone IS NULL OR :phone = '' OR e.phone LIKE %:phone%) " +
            "AND (:gender IS NULL OR :gender = '' OR e.gender LIKE %:gender%) " +
            "AND (:birthDateFrom IS NULL OR e.birthDate >= :birthDateFrom) " +
            "AND (:birthDateTo IS NULL OR e.birthDate <= :birthDateTo) " +
            " ORDER BY e.createdDate DESC ")

    Page<Employee> searchCondition(
            @Param("name") String name,
            @Param("team") String team,
            @Param("phone") String phone,
            @Param("gender") String gender,
            @Param("birthDateFrom") Date birthDateFrom,
            @Param("birthDateTo") Date birthDateTo,
            Pageable pageable
    );

    @Query(value = "SELECT e FROM Employee e " +
            "WHERE true " +
            "AND (:name IS NULL OR :name = '' OR  lower(e.name) LIKE %:name%) " +
            "AND (:team IS NULL OR :team = '' OR  lower(e.team) LIKE %:team%) " +
            "AND (:phone IS NULL OR :phone = '' OR  lower(e.phone) LIKE %:phone%) " +
            "AND (:gender IS NULL OR :gender = '' OR   e.gender = lower(:gender)) " +
            "AND (:fromDate IS NULL OR e.birthDate >= :fromDate) " +
            "AND (:toDate IS NULL OR e.birthDate <= :toDate)")
    List<Employee> downloadsExcel(
            @Param("name") String name,
            @Param("team") String team,
            @Param("phone") String phone,
            @Param("gender") String gender,
            @Param("fromDate") Date fromDate,
            @Param("toDate") Date toDate
    );
}

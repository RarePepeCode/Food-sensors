package ProjektoModelis.Repositories;

import ProjektoModelis.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Transactional
    @Modifying
    @Query(value = "update User u set u.fk_course_id = :courseId where u.id = :id", nativeQuery = true)
    void addCourse(@Param("id") Integer id, @Param("courseId") Integer courseId);

    @Transactional
    @Modifying
    @Query(value = "update User u set u.fk_course_id = null where u.id = :id", nativeQuery = true)
    void removeCourse(@Param("id") Integer id);

    @Query(value = "select u.fk_course_id from User u where u.id = :id", nativeQuery = true)
    Integer getCourseId(@Param("id") Integer id);

    @Query(value = "select u.fk_dish_id from User u where u.id = :id", nativeQuery = true)
    Integer getDishId(@Param("id") Integer id);
}
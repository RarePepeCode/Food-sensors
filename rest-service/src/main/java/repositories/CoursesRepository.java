package repositories;

import ProjektoModelis.courses.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CoursesRepository extends JpaRepository<Course, Long> {

    @Query(value = "SELECT * FROM public.courses", nativeQuery = true)
    List<Course> findAllCourses();
}
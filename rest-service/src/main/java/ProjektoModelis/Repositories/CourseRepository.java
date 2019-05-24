package ProjektoModelis.Repositories;

import ProjektoModelis.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> { }
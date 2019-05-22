package ProjektoModelis.courses;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.CoursesRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoursesController {

    static final String restServicePrefix = "/courses";

    public CoursesRepository coursesRepository;

    @RequestMapping(restServicePrefix + "/allCourses")
    public List<Course> getAllCourses(){
        //List<Course> courses = coursesRepository.findAllCourses();
        //return courses;
        return restTest();
    }

    @RequestMapping(restServicePrefix + "/allAdminCourses")
    public List<Course> getAllCoursesNeedForAproval(){
        List<Course> courses = new ArrayList();
        return courses;
    }

    private List<Course> restTest(){
        List<Course> list = new ArrayList();
        list.add(new Course(1L, "title1", "description1", true));
        list.add(new Course(1L, "title2", "description3", true));
        list.add(new Course(1L, "title2", "description3", true));
        return list;
    }

}

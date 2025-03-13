package service;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import model.Course;
import model.person.Faculty;
import model.person.Student;

public class CourseService extends Course {

    public CourseService(String title, String description, int courseCode, int credits, int CRN, char passingGrade,
            ArrayList<Course> prerequisites, ArrayList<Student> students, Faculty teacher) {
        super(title, description, courseCode, credits, CRN, passingGrade, prerequisites, students, teacher);

    }
    private List<Course> courses = new ArrayList<>();

    // public void addStudent(Course course, Student student) {
    //     course.getStudents().add(student);
    // }

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course getCourseByCRN(int CRN) {
        for (Course course : courses) {
            if (course.getCRN() == CRN) {
                return course;
            }
        }
        System.out.println("Course with CRN " + CRN + " not found.");
        return null;
    }



    
    public void addStudentToCourse(int CRN, Student student) {
        Course course = getCourseByCRN(CRN);
        if (course != null) {
            course.getStudents().add(student);
            System.out.println("Student added to course: " + course.getTitle());
        }
        else{
            throw new RuntimeException("COURSE cannot be NULL");
        }
    }
    public void deleteCourse(int CRN) {
        Course course = getCourseByCRN(CRN);
        if (course != null) {
            courses.remove(course);
            System.out.println("Course with CRN " + CRN + " deleted.");
        }
        else{
            throw new RuntimeException("COURSE cannot be NULL");
        }
    }



    // public void removeStudent(Course course, Student student) {
    //     course.getStudents().remove(student);
    // }
}

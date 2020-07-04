/*
 * 
 * 
 * 
 * 
 * 
 * &copy;Asu
 * 
 */
package tw.com.hyberx.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * [課程]
 * <p>
 * 
 * @author  Asu
 * @since   2020-06-17 23:29
 * @version
 */
<<<<<<< HEAD
//@Entity
//@Table(name = "course")
=======
@Entity
@Table(name = "course")
>>>>>>> 9110d1d3f27cfde3bb720c39fd67ef7fa9b46be4
public class Course implements Serializable {

    private static final long serialVersionUID = 7410098243973715791L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    private List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + 
                ", name=" + name +
                "]";
    }
}

package ru.bmstu.schedule.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

@Entity
public class Faculty {
    private int id;
    private String cipher;
    private String title;
    private Collection<Department> departments;

    public Faculty(String cipher, String title) {
        this.cipher = cipher;
        this.title = title;
    }

    public Faculty() {

    }

    @Id
    @Column(name = "faculty_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("setId: " + id);
        this.id = id;
    }

    @Basic
    @Column(name = "faculty_cipher", columnDefinition = "bpchar", length = 8, unique = true)
    public String getCipher() {
        return cipher.trim();
    }

    public void setCipher(String cipher) {
        System.out.println("setCipher: " + cipher);
        this.cipher = cipher;
    }

    @Basic
    @Column(name = "title", nullable = false, length = -1)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title)
    {
        System.out.println("setTitle: " + title);
        this.title = title;
    }

    @OneToMany(mappedBy = "faculty", cascade = CascadeType.ALL)
    public Collection<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Collection<Department> departments) {
        System.out.println("setDepartments: " + departments.stream().map(Department::getTitle).collect(Collectors.toList()));
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return id == faculty.id &&
                Objects.equals(cipher, faculty.cipher) &&
                Objects.equals(title, faculty.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, cipher, title);
    }

    public void addDepartment(Department department) {
        department.setFaculty(this);
        departments.add(department);
    }
}
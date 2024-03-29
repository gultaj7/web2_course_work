package az.edu.ada.wm2.firstspringapp.student;

public class Student {
    private Long id;
    private String name;
    private String surname;
    private Integer age;

    public Student() {

    }

    public Student(Long id,
                   String name,
                   String surname,
                   Integer age){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Student(String name,
                   String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}


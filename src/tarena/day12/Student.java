package tarena.day12;

import java.util.Date;

public class Student implements Comparable {

    private int id;
    private String name;
    private int age;
    private Date birthday;
    private int height;
    private int handsome;

    public Student() {
        super();
    }

    public Student(int id, String name, int age, Date birthday, int height,
                   int handsome) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.height = height;
        this.handsome = handsome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHandsome() {
        return handsome;
    }

    public void setHandsome(int handsome) {
        this.handsome = handsome;
    }


    /*
     * 自己 > obj，返回正数
     * 自己 < obj，返回负数
     * 自己 = obj，返回0
     */
    public int compareTo(Object obj) {
        Student s = (Student) obj;
        return name.compareTo(s.name);
    }

    public String toString() {
        return name;
    }

}





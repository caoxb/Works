package tarena.day17;

import java.io.Serializable;
import java.util.Date;

// Serializable： 标识接口
public class Student implements Serializable {
    /*
     * 序列化和反序列化时，
     * 用来控制类的版本号。
     * 序列化时会保存此版本号，
     * 反序列化时会检查版本是否匹配
     */
    private static final long serialVersionUID = 2L;

    private int id;
    private String name;
    private String gender;

    // 不属于实例，不被序列化
    private static Date birthday;
    // 只在实例中临时存在，不会被序列化持久保存
    private transient int height;

    public Student() {
        super();
    }

    public Student(int id, String name, String gender, Date birthday, int height) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.height = height;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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


}

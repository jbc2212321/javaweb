package servlet;

public class User {
    private String id ;
    private String name ;
    private String type ;
    private String semester ;
    private String desc ;

    public User() {
    }

    public User( String id, String name, String type, String semester, String desc) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.semester = semester;
        this.desc = desc;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "User{" +
                "  id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", semester='" + semester + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

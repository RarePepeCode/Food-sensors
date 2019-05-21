package hello.courses;

public class Course {

    private Long id;
    private String name;
    private String description;
    private Boolean aprroved;

    public Course(Long id, String name, String description, Boolean aprroved) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.aprroved = aprroved;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAprroved() {
        return aprroved;
    }

    public void setAprroved(Boolean aprroved) {
        this.aprroved = aprroved;
    }
}

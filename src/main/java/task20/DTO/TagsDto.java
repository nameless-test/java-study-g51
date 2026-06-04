package task20.DTO;

public class TagsDto {

    private int id;
    private String name;

    public TagsDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public TagsDto() {
    }

    @Override
    public String toString() {
        return "TagsDto [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
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

}

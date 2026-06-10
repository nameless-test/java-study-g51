package task20.DTO;

import java.util.List;

public class PetDto {

    private int id;
    private CategoryDto category;
    private String name;
    private List<String> photoUrls;
    private List<TagsDto> tags;
    private String status;

    public PetDto(int id, CategoryDto category, String name, List<String> photoUrls, List<TagsDto> tags,
            String status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    public PetDto() {
    }

    @Override
    public String toString() {
        return "PetDto [id=" + id + ", name=" + name + ", photoUrls=" + photoUrls + ", tags=" + tags + ", status="
                + status + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
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

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<TagsDto> getTags() {
        return tags;
    }

    public void setTags(List<TagsDto> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

}

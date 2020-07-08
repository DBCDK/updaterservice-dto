package dk.dbc.opencatbusiness.dto;

public class CheckTemplateRequestDTO {
    String name;
    String groupId;
    String libraryType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getLibraryType() {
        return libraryType;
    }

    public void setLibraryType(String libraryType) {
        this.libraryType = libraryType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CheckTemplateRequestDTO that = (CheckTemplateRequestDTO) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        return libraryType != null ? libraryType.equals(that.libraryType) : that.libraryType == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (libraryType != null ? libraryType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CheckTemplateRequestDTO{" +
                "name='" + name + '\'' +
                ", groupId='" + groupId + '\'' +
                ", libraryType='" + libraryType + '\'' +
                '}';
    }
}

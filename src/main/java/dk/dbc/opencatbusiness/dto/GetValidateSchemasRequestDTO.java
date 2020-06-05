package dk.dbc.opencatbusiness.dto;

public class GetValidateSchemasRequestDTO {
    String groupId;
    String templateGroup;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getTemplateGroup() {
        return templateGroup;
    }

    public void setTemplateGroup(String templateGroup) {
        this.templateGroup = templateGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetValidateSchemasRequestDTO that = (GetValidateSchemasRequestDTO) o;

        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        return templateGroup != null ? templateGroup.equals(that.templateGroup) : that.templateGroup == null;
    }

    @Override
    public int hashCode() {
        int result = groupId != null ? groupId.hashCode() : 0;
        result = 31 * result + (templateGroup != null ? templateGroup.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GetValidateSchemasRequestDTO{" +
                "groupId='" + groupId + '\'' +
                ", templateGroup='" + templateGroup + '\'' +
                '}';
    }
}

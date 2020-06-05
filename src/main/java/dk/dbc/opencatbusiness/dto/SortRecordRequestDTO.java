package dk.dbc.opencatbusiness.dto;

public class SortRecordRequestDTO {
    String templateProvider;
    String record;

    public String getTemplateProvider() {
        return templateProvider;
    }

    public void setTemplateProvider(String templateProvider) {
        this.templateProvider = templateProvider;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SortRecordRequestDTO that = (SortRecordRequestDTO) o;

        if (templateProvider != null ? !templateProvider.equals(that.templateProvider) : that.templateProvider != null)
            return false;
        return record != null ? record.equals(that.record) : that.record == null;
    }

    @Override
    public int hashCode() {
        int result = templateProvider != null ? templateProvider.hashCode() : 0;
        result = 31 * result + (record != null ? record.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SortRecordRequestDTO{" +
                "templateProvider='" + templateProvider + '\'' +
                ", record='" + record + '\'' +
                '}';
    }
}

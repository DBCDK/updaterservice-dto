package dk.dbc.opencatbusiness.dto;

public class checkDoubleRecordFrontendRequestDTO {
    private String recordContent;

    public String getRecordContent() {
        return recordContent;
    }

    public void setRecordContent(String recordContent) {
        this.recordContent = recordContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        checkDoubleRecordFrontendRequestDTO that = (checkDoubleRecordFrontendRequestDTO) o;

        return recordContent != null ? recordContent.equals(that.recordContent) : that.recordContent == null;
    }

    @Override
    public int hashCode() {
        return recordContent != null ? recordContent.hashCode() : 0;
    }
}

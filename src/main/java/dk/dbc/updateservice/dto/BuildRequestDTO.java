package dk.dbc.updateservice.dto;

public class BuildRequestDTO {
    private String schemaName;
    private BibliographicRecordDTO bibliographicRecordDTO;
    private String trackingId;

    public BibliographicRecordDTO getBibliographicRecordDTO() {
        return bibliographicRecordDTO;
    }

    public void setBibliographicRecordDTO(BibliographicRecordDTO bibliographicRecordDTO) {
        this.bibliographicRecordDTO = bibliographicRecordDTO;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildRequestDTO that = (BuildRequestDTO) o;

        if (schemaName != null ? !schemaName.equals(that.schemaName) : that.schemaName != null) return false;
        if (bibliographicRecordDTO != null ? !bibliographicRecordDTO.equals(that.bibliographicRecordDTO) : that.bibliographicRecordDTO != null) return false;
        return trackingId != null ? trackingId.equals(that.trackingId) : that.trackingId == null;

    }
    @Override
    public int hashCode() {
        int result = schemaName != null ? schemaName.hashCode() : 0;
        result = 31 * result + (bibliographicRecordDTO != null ? bibliographicRecordDTO.hashCode() : 0);
        result = 31 * result + (trackingId != null ? trackingId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BuildRequestDTO{" +
                "schemaName='" + schemaName +'\''+
                ", bibliographicRecordDTO=" + bibliographicRecordDTO +
                ",trackingId='" + trackingId +'\''+
                '}';
    }

}

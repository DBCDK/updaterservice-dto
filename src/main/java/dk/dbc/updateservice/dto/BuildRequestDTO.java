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

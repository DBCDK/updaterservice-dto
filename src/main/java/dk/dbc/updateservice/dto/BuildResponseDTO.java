package dk.dbc.updateservice.dto;

public class BuildResponseDTO {
    private BuildStatusEnumDTO buildStatusEnumDTO;
    private BibliographicRecordDTO bibliographicRecordDTO;

    public BibliographicRecordDTO getBibliographicRecordDTO() {
        return bibliographicRecordDTO;
    }

    public void setBibliographicRecordDTO(BibliographicRecordDTO bibliographicRecordDTO) {
        this.bibliographicRecordDTO = bibliographicRecordDTO;
    }

    public BuildStatusEnumDTO getBuildStatusEnumDTO() {
        return buildStatusEnumDTO;
    }

    public void setBuildStatusEnumDTO(BuildStatusEnumDTO buildStatusEnumDTO) {
        this.buildStatusEnumDTO = buildStatusEnumDTO;
    }


    @Override
    public int hashCode() {
        int result = buildStatusEnumDTO != null ? buildStatusEnumDTO.hashCode() : 0;
        result = 31 * result + (bibliographicRecordDTO != null ? bibliographicRecordDTO.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BuildResponseDTO{" +
                "buildStatusEnumDTO='" + buildStatusEnumDTO +'\''+
                ", bibliographicRecordDTO=" + bibliographicRecordDTO +
                '}';
    }
}

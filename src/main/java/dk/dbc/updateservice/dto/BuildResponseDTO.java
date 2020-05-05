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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildResponseDTO that = (BuildResponseDTO) o;

        if (buildStatusEnumDTO != null ? !buildStatusEnumDTO.equals(that.buildStatusEnumDTO) : that.buildStatusEnumDTO != null) return false;
        return bibliographicRecordDTO != null ? bibliographicRecordDTO.equals(that.bibliographicRecordDTO) : that.bibliographicRecordDTO == null;

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

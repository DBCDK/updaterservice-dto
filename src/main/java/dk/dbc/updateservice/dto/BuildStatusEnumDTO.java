package dk.dbc.updateservice.dto;

import javax.xml.bind.annotation.XmlEnumValue;

public enum BuildStatusEnumDTO {
    OK("ok"),
    FAILED_INVALID_SCHEMA("failed_invalid_schema"),
    FAILED_INVALID_RECORD_SCHEMA("failed_invalid_record_schema"),
    FAILED_INVALID_RECORD_PACKING("failed_invalid_record_packing"),
    FAILED_UPDATE_INTERNAL_ERROR("failed_update_internal_error"),
    FAILED_INTERNAL_ERROR("failed_internal_error");
    private final String value;

    BuildStatusEnumDTO(String v) {this.value = v;}

    public static BuildStatusEnumDTO fromValue(String value) {
        for (BuildStatusEnumDTO buildStatusEnumDTO: BuildStatusEnumDTO.values()) {
            if (buildStatusEnumDTO.value.equals(value.toLowerCase())) {
                return buildStatusEnumDTO;
            }
        }
        throw new IllegalArgumentException(value);
    }

    @Override
    public String toString() {
        return "BuildStatusEnumDTO{" +
                "value='" + value + '\'' +
                "} " + super.toString();
    }
}

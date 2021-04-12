/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.opencatbusiness.dto;

import java.util.Objects;

public class CheckTemplateRequestDTO {
    private String name;
    private String groupId;
    private String libraryType;
    private String trackingId;

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

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckTemplateRequestDTO that = (CheckTemplateRequestDTO) o;
        return name.equals(that.name) && groupId.equals(that.groupId) && libraryType.equals(that.libraryType) && Objects.equals(trackingId, that.trackingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, groupId, libraryType, trackingId);
    }

    @Override
    public String toString() {
        return "CheckTemplateRequestDTO{" +
                "name='" + name + '\'' +
                ", groupId='" + groupId + '\'' +
                ", libraryType='" + libraryType + '\'' +
                ", trackingId='" + trackingId + '\'' +
                '}';
    }
}

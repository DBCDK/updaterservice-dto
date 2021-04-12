/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.opencatbusiness.dto;

import java.util.Objects;

public class CheckTemplateBuildRequestDTO {
    private String name;
    private String trackingId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        CheckTemplateBuildRequestDTO that = (CheckTemplateBuildRequestDTO) o;
        return name.equals(that.name) && Objects.equals(trackingId, that.trackingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, trackingId);
    }

    @Override
    public String toString() {
        return "CheckTemplateBuildRequestDTO{" +
                "name='" + name + '\'' +
                ", trackingId='" + trackingId + '\'' +
                '}';
    }
}

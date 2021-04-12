/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.opencatbusiness.dto;

import java.util.Objects;
import java.util.Set;

public class GetValidateSchemasRequestDTO {
    private String templateGroup;
    private Set<String> allowedLibraryRules;
    private String trackingId;

    public String getTemplateGroup() {
        return templateGroup;
    }

    public void setTemplateGroup(String templateGroup) {
        this.templateGroup = templateGroup;
    }

    public Set<String> getAllowedLibraryRules() {
        return allowedLibraryRules;
    }

    public void setAllowedLibraryRules(Set<String> allowedLibraryRules) {
        this.allowedLibraryRules = allowedLibraryRules;
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
        GetValidateSchemasRequestDTO that = (GetValidateSchemasRequestDTO) o;
        return templateGroup.equals(that.templateGroup) && allowedLibraryRules.equals(that.allowedLibraryRules) && Objects.equals(trackingId, that.trackingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateGroup, allowedLibraryRules, trackingId);
    }

    @Override
    public String toString() {
        return "GetValidateSchemasRequestDTO{" +
                "templateGroup='" + templateGroup + '\'' +
                ", allowedLibraryRules=" + allowedLibraryRules +
                ", trackingId='" + trackingId + '\'' +
                '}';
    }
}

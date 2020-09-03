/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.opencatbusiness.dto;

import java.util.Set;

public class GetValidateSchemasRequestDTO {
    String templateGroup;
    Set<String> allowedLibraryRules;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GetValidateSchemasRequestDTO that = (GetValidateSchemasRequestDTO) o;

        if (templateGroup != null ? !templateGroup.equals(that.templateGroup) : that.templateGroup != null)
            return false;
        return allowedLibraryRules != null ? allowedLibraryRules.equals(that.allowedLibraryRules) : that.allowedLibraryRules == null;
    }

    @Override
    public int hashCode() {
        int result = templateGroup != null ? templateGroup.hashCode() : 0;
        result = 31 * result + (allowedLibraryRules != null ? allowedLibraryRules.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GetValidateSchemasRequestDTO{" +
                "templateGroup='" + templateGroup + '\'' +
                ", allowedLibraryRules=" + allowedLibraryRules +
                '}';
    }
}

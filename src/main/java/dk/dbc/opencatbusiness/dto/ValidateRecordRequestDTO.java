/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.opencatbusiness.dto;

public class ValidateRecordRequestDTO {
    String templateName;
    String record;

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ValidateRecordRequestDTO that = (ValidateRecordRequestDTO) o;

        if (templateName != null ? !templateName.equals(that.templateName) : that.templateName != null) return false;
        return record != null ? record.equals(that.record) : that.record == null;
    }

    @Override
    public int hashCode() {
        int result = templateName != null ? templateName.hashCode() : 0;
        result = 31 * result + (record != null ? record.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ValidateRecordRequestDTO{" +
                "templateName='" + templateName + '\'' +
                ", record='" + record + '\'' +
                '}';
    }
}

/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.opencatbusiness.dto;

import java.util.Objects;

public class SortRecordRequestDTO {
    private String templateProvider;
    private String record;
    private String trackingId;

    public String getTemplateProvider() {
        return templateProvider;
    }

    public void setTemplateProvider(String templateProvider) {
        this.templateProvider = templateProvider;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
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
        SortRecordRequestDTO that = (SortRecordRequestDTO) o;
        return templateProvider.equals(that.templateProvider) && record.equals(that.record) && Objects.equals(trackingId, that.trackingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateProvider, record, trackingId);
    }

    @Override
    public String toString() {
        return "SortRecordRequestDTO{" +
                "templateProvider='" + templateProvider + '\'' +
                ", record='" + record + '\'' +
                ", trackingId='" + trackingId + '\'' +
                '}';
    }
}

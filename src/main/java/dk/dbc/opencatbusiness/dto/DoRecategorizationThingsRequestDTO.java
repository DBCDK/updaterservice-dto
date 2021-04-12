/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.opencatbusiness.dto;

import java.util.Objects;

public class DoRecategorizationThingsRequestDTO {
    private String currentRecord;
    private String updateRecord;
    private String newRecord;
    private String trackingId;

    public String getCurrentRecord() {
        return currentRecord;
    }

    public void setCurrentRecord(String currentRecord) {
        this.currentRecord = currentRecord;
    }

    public String getUpdateRecord() {
        return updateRecord;
    }

    public void setUpdateRecord(String updateRecord) {
        this.updateRecord = updateRecord;
    }

    public String getNewRecord() {
        return newRecord;
    }

    public void setNewRecord(String newRecord) {
        this.newRecord = newRecord;
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
        DoRecategorizationThingsRequestDTO that = (DoRecategorizationThingsRequestDTO) o;
        return currentRecord.equals(that.currentRecord) && updateRecord.equals(that.updateRecord) && newRecord.equals(that.newRecord) && Objects.equals(trackingId, that.trackingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentRecord, updateRecord, newRecord, trackingId);
    }

    @Override
    public String toString() {
        return "DoRecategorizationThingsRequestDTO{" +
                "currentRecord='" + currentRecord + '\'' +
                ", updateRecord='" + updateRecord + '\'' +
                ", newRecord='" + newRecord + '\'' +
                ", trackingId='" + trackingId + '\'' +
                '}';
    }
}

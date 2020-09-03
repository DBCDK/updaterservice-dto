/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.opencatbusiness.dto;

public class DoRecategorizationThingsRequestDTO {
    String currentRecord;
    String updateRecord;
    String newRecord;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DoRecategorizationThingsRequestDTO that = (DoRecategorizationThingsRequestDTO) o;

        if (currentRecord != null ? !currentRecord.equals(that.currentRecord) : that.currentRecord != null)
            return false;
        if (updateRecord != null ? !updateRecord.equals(that.updateRecord) : that.updateRecord != null) return false;
        return newRecord != null ? newRecord.equals(that.newRecord) : that.newRecord == null;
    }

    @Override
    public int hashCode() {
        int result = currentRecord != null ? currentRecord.hashCode() : 0;
        result = 31 * result + (updateRecord != null ? updateRecord.hashCode() : 0);
        result = 31 * result + (newRecord != null ? newRecord.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DoRecategorizationThingsRequestDTO{" +
                "currentRecord='" + currentRecord + '\'' +
                ", updateRecord='" + updateRecord + '\'' +
                ", newRecord='" + newRecord + '\'' +
                '}';
    }
}

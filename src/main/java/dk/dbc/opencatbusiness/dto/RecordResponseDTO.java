/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.opencatbusiness.dto;

public class RecordResponseDTO {
    String record;

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

        RecordResponseDTO that = (RecordResponseDTO) o;

        return record != null ? record.equals(that.record) : that.record == null;
    }

    @Override
    public int hashCode() {
        return record != null ? record.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "RecordResponseDTO{" +
                "record='" + record + '\'' +
                '}';
    }
}

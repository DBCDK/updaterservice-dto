/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GNU GPL v3
 *  See license text at https://opensource.dbc.dk/licenses/gpl-3.0
 */

package dk.dbc.opencatbusiness.dto;

import java.util.Objects;

public class RecordRequestDTO {
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
        RecordRequestDTO that = (RecordRequestDTO) o;
        return Objects.equals(record, that.record);
    }

    @Override
    public int hashCode() {
        return Objects.hash(record);
    }

    @Override
    public String toString() {
        return "RecordRequestDTO{" +
                "record='" + record + '\'' +
                '}';
    }
}

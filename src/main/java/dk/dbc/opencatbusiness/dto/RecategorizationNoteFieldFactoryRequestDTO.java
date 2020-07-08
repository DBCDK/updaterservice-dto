package dk.dbc.opencatbusiness.dto;

public class RecategorizationNoteFieldFactoryRequestDTO {
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

        RecategorizationNoteFieldFactoryRequestDTO that = (RecategorizationNoteFieldFactoryRequestDTO) o;

        return record != null ? record.equals(that.record) : that.record == null;
    }

    @Override
    public int hashCode() {
        return record != null ? record.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "RecategorizationNoteFieldFactoryRequestDTO{" +
                "record='" + record + '\'' +
                '}';
    }
}
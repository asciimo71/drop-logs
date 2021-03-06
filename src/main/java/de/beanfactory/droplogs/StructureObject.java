package de.beanfactory.droplogs;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
class StructureObject {
    private String aString;
    private int aInt;
    private Timestamp aTimestamp;
}

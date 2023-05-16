package samplewijimo.domain;

import java.util.*;
import lombok.*;
import samplewijimo.domain.*;
import samplewijimo.infra.AbstractEvent;

@Data
@ToString
public class DepartmentAdd extends AbstractEvent {

    private Long id;
    private String name;

    public DepartmentAdd(Department aggregate) {
        super(aggregate);
    }

    public DepartmentAdd() {
        super();
    }
}

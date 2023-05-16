package samplewijimo.domain;

import java.util.*;
import lombok.*;
import samplewijimo.domain.*;
import samplewijimo.infra.AbstractEvent;

@Data
@ToString
public class RankAdd extends AbstractEvent {

    private Long id;
    private String name;

    public RankAdd(Rank aggregate) {
        super(aggregate);
    }

    public RankAdd() {
        super();
    }
}

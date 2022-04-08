package net.common.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Team")
public class Team {
    @Id
    private Integer Id;

    private Integer Number;
    private Integer Name;
}

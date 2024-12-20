package com.semih.model;

import com.semih.enums.VolunteerRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "event_volunteer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventVolunteer extends BaseEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "volunteer_id")
    private Volunteer volunteer;

    @Enumerated(EnumType.STRING)
    private VolunteerRole role;

    @Column
    private LocalDate participationDateVolunteer;
}


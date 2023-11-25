package com.bookanyshow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.ZonedDateTime;

@Data
@Builder
@Table
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MovieShow implements Event{
    @GeneratedValue
    @Id
    Long id;
    Long movieId;
    Long showTime;
    Long screenId;
    ShowStatus showStatus;

    @CreatedDate
    ZonedDateTime createdAt;

    @UpdateTimestamp
    ZonedDateTime updatedAt;
    ZonedDateTime startTime;

    public enum ShowStatus{
        RUNNING,
        CANCELLED,
        SCHEDULED,
        COMPLETED
    }
}

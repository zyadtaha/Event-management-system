package com.eventsystem.dto;

import com.eventsystem.dto.resourcebooking.ResourceBookingDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class EventDto {
    private String name;
    private LocalDateTime dateTime;
    private List<ResourceBookingDto> resourceBookingDtos;
    private Integer retailPrice;
    private LocalDateTime creationTime;
    private boolean canCancelWithoutPenalty;
    private Double cancellationPenalty;
}

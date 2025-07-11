package com.eventsystem.repository;

import com.eventsystem.model.ResourceBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceBookingRepository extends JpaRepository<ResourceBooking, Long> {
    List<ResourceBooking> findByOrganizerId(String organizerId);
    List<ResourceBooking> findByProviderId(String providerId);
}
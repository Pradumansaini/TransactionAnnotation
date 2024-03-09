package com.annotation.SpringTransactionDemo.repo;

import com.annotation.SpringTransactionDemo.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

}

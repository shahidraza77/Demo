package com.revature.project03.model;
import java.time.LocalTime;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Embeddable

 

public class DoctorAvailability {

private String toDay;
private String fromDay;
private LocalTime fromTime;
private LocalTime toTime;
private boolean availabilityStatus;
 

 

}
package main;

import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
	private final List<Appointment> appointments;

	
	/* Default constructor for AppointmentService that starts a new list of appointments.
	 */
	 
	public AppointmentService() {
		this.appointments = new ArrayList<Appointment>();
	}

	
	 /* Getter for appointments.
	  * 
	  */
	 
	public List<Appointment> getAppointments() {
		return appointments;
	}
	
	
	/*  Method to add a new appointment to the list of appointments.
	 * 
	 */
	 
	public boolean addAppointment(final Appointment newAppt) {
		boolean apptExists = false;
		for(Appointment appt : appointments) {
			if (newAppt.getAppointmentId() == appt.getAppointmentId()) {
				apptExists = true;
			}
		}
		
		// If appointment doesn't exist, add it to the appointments list.
		if (!apptExists) {
			this.appointments.add(newAppt);
			// Return true for adding appointment to list.
			return true;
		} else {
			// Appointment already exists, return false for adding the appointment.
			return false;
		}
	} 
	
	
	 /*  Method to delete an appointment from the list with the matching id.
	  * 
	  */
	 
	public boolean deleteAppointment(final String id) {
		return this.appointments.removeIf(appt -> (appt.getAppointmentId() == id));
	}
}

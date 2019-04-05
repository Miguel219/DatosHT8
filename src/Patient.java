/**
 * Lab8
 * Silvio Orozco 18282
 * Jose Castaneda 18161
 */
public class Patient implements Comparable<Patient>{

	private String name;
	private String symptom;
	private String emergencyCode;
	
	public Patient() {
		// TODO Auto-generated constructor stub
		name = "";
		symptom = "";
		emergencyCode = "";
	}

	/**
	 * @param name = nombre del paciente
	 * @param symptom = sintoma del paciente
	 * @param emergencyCode = prioridad
	 */
	public Patient(String name, String symptom, String emergencyCode) {
		super();
		this.name = name;
		this.symptom = symptom;
		this.emergencyCode = emergencyCode;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the symptom
	 */
	public String getSymptom() {
		return symptom;
	}

	/**
	 * @param symptom the symptom to set
	 */
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	/**
	 * @return the emergencyCode
	 */
	public String getEmergencyCode() {
		return emergencyCode;
	}

	/**
	 * @param emergencyCode the emergencyCode to set
	 */
	public void setEmergencyCode(String emergencyCode) {
		this.emergencyCode = emergencyCode;
	}

	public String getPatientPriority() {
		
		
		return this.getEmergencyCode();
	}
	
	@Override
	public int compareTo(Patient o) {
		// TODO Auto-generated method stub
		int result = this.getEmergencyCode().compareTo(o.getEmergencyCode());
		
		return result;
	}

	

	
}

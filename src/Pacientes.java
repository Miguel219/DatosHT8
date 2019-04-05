
public class Pacientes implements Comparable<Pacientes>{

	private String name;
	private String symptom;
	private String emergencyCode;
	
	public Pacientes() {
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
	public Pacientes(String name, String symptom, String emergencyCode) {
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

	public int getPatientPriority() {
		String currentEmergencyCode = this.getEmergencyCode();
		int priority = 0;
		if(currentEmergencyCode.equals("A"))
			priority = 1;
		else if(currentEmergencyCode.equals("B"))
			priority = 2;
		else if(currentEmergencyCode.equals("C"))
			priority = 3;
		else if(currentEmergencyCode.equals("D"))
			priority = 4;
		else if(currentEmergencyCode.equals("E"))
			priority = 5;
		return priority;
	}
	
	@Override
	public int compareTo(Pacientes o) {
		// TODO Auto-generated method stub
		int result = 0;
		if(this.getPatientPriority()<o.getPatientPriority())
			result = 1;
		else if(this.getPatientPriority()>o.getPatientPriority())
			result = -1;
		else
			result = 0;
		
		return result;
	}

	
}

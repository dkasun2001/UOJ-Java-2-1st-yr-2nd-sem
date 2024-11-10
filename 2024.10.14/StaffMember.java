public abstract class StaffMember{
	protected String name;
	protected String phone;
	
	public StaffMember(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	
	public abstract double pay();
}
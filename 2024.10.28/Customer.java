class Customer{
	private String name;
	private boolean member=false;
	private String memberType;
	
	public Customer(String name,boolean member,String memberType){
		this.name=name;
		this.member=member;
		this.memberType=memberType;
	}
	
	public Customer(String name,boolean member){
		this.name=name;
		this.memberType="no";
		}
	
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public boolean isMember(){
		return this.member;
	}
	
	public void setMember(boolean member){
		this.member=member;
	}
	
	public String getMemberType(){
		return this.memberType;
	}
	
	public void setMemberType(String memberType){
		if(member==true){
			this.memberType=memberType;
		}else{
			this.memberType="no";
		}
	}
	
	public String toString(){
		return ("Customer name: "+this.name+"\nIs Member: "+this.member+"\nMemberShip Type: "+this.memberType);
	}
}

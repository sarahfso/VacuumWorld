class Environment {
	private boolean isDirtyA;
	private boolean isDirtyB;
	private boolean agentLocation;
	
	Environment(boolean isDirtyA, boolean isDirtyB, boolean agentLocation){
        this.isDirtyA = isDirtyA;
        this.isDirtyB = isDirtyB;
        this.agentLocation = agentLocation;
	}
	
	public boolean isDirtyA(){
        return this.isDirtyA;
    } 

    public boolean isDirtyB(){
        return this.isDirtyB;
    } 

    public boolean agentLocation(){
        return this.agentLocation;
    }
    
    public void setIsDirtyA(boolean isDirtyA){
        this.isDirtyA = isDirtyA;
    } 

    public void setIsDirtyB(boolean isDirtyB){
        this.isDirtyB = isDirtyB;
    } 

    public void setAgentLocation(boolean agentLocation){
        this.agentLocation = agentLocation;
    } 
}
class Agent {
    private Perception perception;

    Agent() {
    }

    public void setPerception(Perception perception){
        this.perception = perception;
    }

	public Perception perceives(Environment environment) {
        boolean location = environment.agentLocation();
        boolean isDirty;

        if(location==true)
            isDirty = environment.isDirtyA();
        else
            isDirty = environment.isDirtyB();

        Perception perception = new Perception(location, isDirty);
        setPerception(perception);

        return perception;
	}
	
	public Action act(){
        Action action = new Action();

        if(this.perception.isDirty()){
            action.setName("aspirar");
        }else{ 
            if(this.perception.location()==true){
                action.setName("ir para a Sala B");
            }else{
                action.setName("ir para a Sala A");
            }
        }
        return action;
    }

    public void execute(Action action, Environment environment){
        if(action.getName()=="aspirar" && environment.agentLocation()==true)
            environment.setIsDirtyA(false);
        else if(action.getName()=="aspirar" && environment.agentLocation()==false)
            environment.setIsDirtyB(false);
        else if(action.getName()=="ir para a Sala B")
            environment.setAgentLocation(false);
        else
            environment.setAgentLocation(true);
    }
}

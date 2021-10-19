class Perception {
	private boolean location;
	private boolean isDirty;

	Perception (boolean location, boolean isDirty){
        this.location = location;
        this.isDirty = isDirty;
	}

    public boolean location(){
        return this.location;
    }

    public boolean isDirty(){
        return this.isDirty;
    }
}
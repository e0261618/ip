class Event extends Task {
    protected boolean isDone;
    protected String at;
    //constructor
    public Event(String description, String at){
        super(description);
        this.at = at;
    }
    //constructor
    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }
    //constructor
    public void markAsDone(){
        this.isDone = true;
    }
    public boolean getIsDone(){
        return this.isDone;
    }
    public String getAt(){
        return this.at;
    }
    @Override
    public String toString(){
        return "[E]" + super.toString() + " (at: " + at + ")";
    }
}

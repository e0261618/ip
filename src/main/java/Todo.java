class Todo extends Task {
    protected boolean isDone;

    //constructor
    public Todo(String description){
        super(description);
        this.isDone = false;
    }
    //constructor
    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }
    //constructor
    public void markAsDone(){
        this.isDone = true;
    }
    //constructor
    public boolean getIsDone(){
        return this.isDone;
    }
    @Override
    public String toString(){
        return "[T]" + super.toString();
    }
}


public abstract class Task {
    protected String name;
    protected int priority;
    protected int duration;

    public Task(String name, int priority, int duration) {
        this.name = name;
        this.priority = priority;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public int getDuration() {
        return duration;
    }

    public String getInfo() {
        return "Task: " + name + " (P" + priority + ", " + duration + " min)";
    }

    public abstract String run();
}

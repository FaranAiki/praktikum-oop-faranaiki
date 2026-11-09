public class BackupTask extends Task {
    private int sizeMB;

    public BackupTask(String name, int priority, int duration, int sizeMB) {
        super(name, priority, duration);
        this.sizeMB = sizeMB;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Size: " + sizeMB + " MB";
    }

    @Override
    public String run() {
        if (sizeMB > 1000) {
            return "Backing up " + sizeMB + " MB... (compressing first)";
        }
        return "Backing up " + sizeMB + " MB...";
    }
}

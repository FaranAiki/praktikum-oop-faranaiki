public class AlarmCommand implements ICommand {
    private Alarm alarm;

    public AlarmCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.activate();
    }

    @Override
    public void undo() {
        // TODO
        alarm.deactivate();
    }
}

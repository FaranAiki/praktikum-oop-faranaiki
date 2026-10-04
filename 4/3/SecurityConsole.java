public class SecurityConsole {
    private ICommand currentCommand;
    private ICommand lastExecuted;

    public SecurityConsole(ICommand command) {
        this.currentCommand = command;
        this.lastExecuted = null;
    }

    public void setCommand(ICommand command) {
        this.currentCommand = command;
    }

    public void pressButton() {
        this.lastExecuted = this.currentCommand;
        this.currentCommand.execute();
    }

    public void pressUndo() {
        // TODO
        if (this.lastExecuted != null)
          this.lastExecuted.undo();
        this.lastExecuted = null;
    }
}

package aratog.task.command.args;


public class IncCommandArgs extends CommandArgs {
    private int counterId;
    public IncCommandArgs(byte commandCode) {
        super(commandCode);
    }

    public IncCommandArgs(byte commandCode, int counterId) {
        super(commandCode);
        this.counterId = counterId;
    }

    public int getCounterId() {
        return counterId;
    }

    public void setCounterId(int counterId) {
        this.counterId = counterId;
    }

    @Override
    public String toString() {
        return "IncCommandArgs{" +
                "counterId=" + counterId +
                '}';
    }
}

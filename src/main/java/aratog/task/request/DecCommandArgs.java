package aratog.task.request;


public class DecCommandArgs extends CommandArgs {
    private int counterId;
    public DecCommandArgs(byte commandCode) {
        super(commandCode);
    }

    public DecCommandArgs(byte commandCode, int counterId) {
        super(commandCode);
        this.counterId = counterId;
    }

    public int getCounterId() {
        return counterId;
    }

    void setCounterId(int counterId) {
        this.counterId = counterId;
    }
}

package task7.task;

public enum Status {
    TODO(1),
    IN_PROGRESS(2),
    DONE(3),
    CANCELLED(4);

    private final int a;

    Status(int a){
        this.a=a;
    }

    public static Status getEnumWithValue(int a){
        for (Status status:Status.values()){
            if (status.a==a){
                return status;
            }
        }
        return null;
    }
}

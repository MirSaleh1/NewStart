package task7.task;

public enum Priority {
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    URGENT(4);

    private final int a;

    Priority(int a){
        this.a=a;
    }
    public static Priority getEnumWithValue(int a){
        for (Priority priority:Priority.values()){
            if (priority.a==a){
                return priority;
            }
        }
        return null;
    }
}

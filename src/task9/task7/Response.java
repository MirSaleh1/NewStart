package task9.task7;

public class Response <T>{
    private T data;
    private String message;
    private int code;

    public Response(T data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }
}

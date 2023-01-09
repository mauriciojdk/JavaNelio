package s15.tratamentodeexcecoes.entities;

public class DomainException extends Exception{
    private String msg;

    public DomainException() {
    }

    public DomainException(String msg) {
        super(msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

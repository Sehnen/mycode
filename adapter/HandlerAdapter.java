package tk.sehnen.adapter;

public interface HandlerAdapter {
    boolean supports(Object handler);
    void handler(Object handler);

}


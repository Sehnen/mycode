package tk.sehnen.adapter;

import org.springframework.http.server.reactive.HttpHandler;
import tk.sehnen.adapter.Controller.HttpController;

public class HttpControllerAdapter implements  HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
            return  (handler instanceof HttpController);
    }

    @Override
    public void handler(Object handler) {

        ((HttpController)handler).doHttpController();

    }
}

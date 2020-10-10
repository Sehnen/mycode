package tk.sehnen.adapter;

import tk.sehnen.adapter.Controller.SimpleController;

public class SimpleControllerAdapter implements HandlerAdapter{
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handler(Object handler) {
        ((SimpleController)handler).doSimple();

    }
}

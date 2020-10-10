package tk.sehnen.adapter;

import tk.sehnen.adapter.Controller.AnnotationController;

public class AnnotationControllerAdapter implements HandlerAdapter{
    @Override
    public boolean supports(Object handler) {

        return (handler instanceof AnnotationController);
    }

    @Override
    public void handler(Object handler) {

    ((AnnotationController)handler).doAnotationHandler();
    }
}

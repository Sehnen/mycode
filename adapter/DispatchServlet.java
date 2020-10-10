package tk.sehnen.adapter;

import tk.sehnen.adapter.Controller.AnnotationController;
import tk.sehnen.adapter.Controller.Controller;
import tk.sehnen.adapter.Controller.HttpController;
import tk.sehnen.adapter.Controller.SimpleController;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {


    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }
    public List<HandlerAdapter> handlerAdapters=new ArrayList<>();
    public DispatchServlet() {
        handlerAdapters.add(new AnnotationControllerAdapter());
        handlerAdapters.add(new HttpControllerAdapter());
        handlerAdapters.add(new SimpleControllerAdapter());
    }
    public void  doDispatch(){
        Controller controller1=new HttpController();
        Controller controller2=new AnnotationController();
        Controller controller3=new SimpleController();
        Controller handler=controller1;
        HandlerAdapter handlerAdapter=getHandler(handler);
        handlerAdapter.handler(handler);

    }

    public  HandlerAdapter getHandler(Controller handler){
        for (HandlerAdapter adapter: handlerAdapters
             ) {
            if (adapter.supports(handler)){
                return adapter;
            }

        }

        return null;
    }


}

package DesignPatterns.Template;

public abstract class BaseTemplate {
    public final void execute(){
        filter();
        postTransaction();
        postProcessing();
    }
    public void filter(){
        System.out.println("filter in template class");
    }
    abstract public void postTransaction();
    public void postProcessing(){
        System.out.println("post processing in template class");
    }
}

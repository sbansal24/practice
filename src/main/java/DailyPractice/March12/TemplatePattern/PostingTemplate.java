package DailyPractice.March12.TemplatePattern;

public abstract  class  PostingTemplate {
    public final void postTransaction(){
        preprocess();
        process();
        postProcess();
    }
    public void preprocess(){
        System.out.println("abstract class proprocess method");
    }
    public abstract void process();

    public void postProcess(){
        System.out.println("abstract class post process method");
    }
}

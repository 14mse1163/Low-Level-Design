package States;

import Context.Document;

public abstract class State {

    public abstract void publish(Document document) ;

    public abstract void render() ;
}

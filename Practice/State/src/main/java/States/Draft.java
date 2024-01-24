package States;

import Context.Document;

public class Draft extends State{
    @Override
    public void publish(Document document) {
        document.changeState(new Moderation());
    }

    @Override
    public void render() {
        System.out.println("Document in Draft state");
    }
}

package States;

import Context.Document;

public class Moderation extends  State{
    @Override
    public void publish(Document document) {
        if(document.getCurrentUser().getName() == "admin") {
            document.changeState(new Publish());
        }
    }

    @Override
    public void render() {
        System.out.println("Document in Moderation state");
    }
}

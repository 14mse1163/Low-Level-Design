package States;

import Context.Document;

public class Publish extends State
{
    @Override
    public void publish(Document document) {
            System.out.println("end transition");
    }

    @Override
    public void render() {
        System.out.println("Document in Publish state");
    }
}

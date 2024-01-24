package Context;

import States.State;

import javax.print.Doc;

public class Document {
    public State state;
    User user;

    public User getCurrentUser() {
        return user;
    }

    public Document(State state , User user) {
        this.state = state;
        this.user = user;
    }

    public void changeState(State newState) {
        this.state = newState;
        render();
    }

    public void publish() {
        state.publish(this);
    }

    private void render() {
        state.render();
        state.publish(this);
    }
}

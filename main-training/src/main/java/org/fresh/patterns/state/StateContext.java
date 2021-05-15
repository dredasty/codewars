package org.fresh.patterns.state;

public class StateContext {
    private State state;

    public StateContext() {
        this.state = new LowerCaseState();
    }

    void setState(State newState) {
        this.state = newState;
    }

    public void writeName(String name) {
        this.state.writeName(this, name);
    }

}

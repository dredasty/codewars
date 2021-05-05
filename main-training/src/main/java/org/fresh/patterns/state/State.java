package org.fresh.patterns.state;

public interface State {
    void writeName(StateContext context, String name);
}

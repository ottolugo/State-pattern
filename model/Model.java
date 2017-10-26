package model;

import state.State;
import state.StateConcrete1;

public class Model {

    private String name;
    private State state;

    public Model(String name) {
	this.name = name;
	this.state = new StateConcrete1();
    }

    public String getName() {
	return name;
    }

    public void changeState(State state) {
	this.state = state;
    }

    public void action1() {
	state.action1(this);
    }

    public void action2() {
	state.action2(this);
    }
}

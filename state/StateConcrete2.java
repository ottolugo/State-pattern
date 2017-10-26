package state;

import model.Model;

public class StateConcrete2 extends State {

    @Override
    public void action1(Model model) {
	System.out.println("Cant do this!");
    }

    @Override
    public void action2(Model model) {
	System.out.println("Accion 2 in progress");
	model.changeState(new StateConcrete1());
    }

}

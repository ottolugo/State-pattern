package state;

import model.Model;

public class StateConcrete1 extends State {

    @Override
    public void action1(Model model) {
	System.out.println("Accion 1 in progress");
	model.changeState(new StateConcrete2());
    }

    @Override
    public void action2(Model model) {
	System.out.println("Cant do this!");
    }

}

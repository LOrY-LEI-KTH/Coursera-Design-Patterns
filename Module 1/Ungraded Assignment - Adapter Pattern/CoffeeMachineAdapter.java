// CoffeeMachineInterface.java

public interface CoffeeMachineInterface {

    public void chooseFirstSelection();
    public void chooseSecondSelection();
}


// OldCoffeeMachine.java

public class OldCoffeeMachine {

    public void selectA() {
        System.out.println("select A");
    }
    public void selectB(){
        System.out.println("select B");
    }

}



// CoffeeTouchscreenAdapter.java

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    private OldCoffeeMachine oldVendingMachine;

    public void connect(OldCoffeeMachine m)  {
        this.oldVendingMachine = m;
    }
    public void chooseFirstSelection(){
        this.oldVendingMachine.selectA();
    }
    public void chooseSecondSelection(){
        this.oldVendingMachine.selectB();
    }

}

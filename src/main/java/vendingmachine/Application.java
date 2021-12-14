package vendingmachine;

import vendingmachine.Item.ItemController;
import vendingmachine.Machine.MachineController;
import vendingmachine.coin.CoinController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        MachineController machineController = new MachineController();
        machineController.initMachine();
    }
}

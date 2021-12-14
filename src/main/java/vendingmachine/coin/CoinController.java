package vendingmachine.coin;

import java.util.ArrayList;
import java.util.List;

public class CoinController {

    private CoinModel coinModel;

    public CoinController() {
        this.coinModel = new CoinModel(initTotalCoin());
    }


    // 숫자를 글자로 입력
    public int initTotalCoin() {

        // 일단 입력을 받았어
        String stringAmount = CoinView.inputAmount();


        // 예외 처리를 해줘야지(일단 좀있다가가)
        // 음수일 때, 숫자만포함된 것이 아닐 때, 10으로 나눠떨어지지 않을 때

        int numAmount = Integer.parseInt(stringAmount);

        return numAmount;

    }

    public void result() {
        coinModel.randomCoinStore();
        CoinView.ouputAmout();
    }



    public void showLeftMoney(int price) {
        CoinView.ouputRepay(coinModel.repayCoin(price));
    }




}

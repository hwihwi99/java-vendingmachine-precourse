package vendingmachine.Item;

import java.util.ArrayList;

public class ItemController {

    Items itemList;
    private ArrayList<Item> items;

    public ItemController() {
        itemList = new Items();
        items = new ArrayList<>();
    }

    public ArrayList<Item> initItems() {
        // 입력 받은 문자열을 가지고
        String inputItems = ItemView.inputItems();
        // 배열로 만들어!
        itemsArray(inputItems);

        // 그리고 리스트에 넣어
        itemList.setItems(items);
        return itemList.getItems();
    }

    // 입력받은 문자열들을 item배열로 만들기
    public void itemsArray(String inputItems) {
        String[] itemsStringArray = inputItems.split(";");
        for(String itemDetail : itemsStringArray) {
            // 여기서 각 문자열의 양 끝이 [,] 인지 파악하기
            int length = itemDetail.length();
            //itemDetail = itemDetail.substring(1,itemDetail.length()); // [,] 떼주기
            // Item 객체를 만들어서 리스트에 저장하기
            items.add(storageItem(itemDetail.substring(1,length-1)));
        }
    }

    public Item storageItem(String itemDetail) {
        String[] itemInfo = itemDetail.split(",");

        // 여기서 itemInfo[0]이 공백은 아닌지, 오직 한글, 영어로만 이루어져있는지 확인
        // 여기서 itemInfo[1]이 공백은 아닌지, 100원 이상이고 10으로 나눠떨어지는지 확인
        // 여기서 itemInfo[2]이 공백은 아닌지, 음수 값인지 확인

        Item item = new Item(itemInfo[0], Integer.parseInt(itemInfo[1]), Integer.parseInt(itemInfo[2]));
        return item;
    }


}

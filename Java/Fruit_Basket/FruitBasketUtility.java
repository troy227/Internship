package Fruit_Basket;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitBasketUtility {
	private List<FruitBasket> fruitBasketList=new ArrayList<FruitBasket>();

	public List<FruitBasket> getFruitBasketList() {
		return fruitBasketList;
	}

	public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
		this.fruitBasketList = fruitBasketList;
	}

	public void addToBasket(FruitBasket fbObj) {
		getFruitBasketList().add(fbObj);



	}

	public int calculateBill(Stream<FruitBasket> fruitBasketStream) {
		
		
        List<Integer> ls=fruitBasketStream.flatMap(a->Stream.of(a.getPricePerKg()*a.getWeightInKgs())).collect(Collectors.toList());
        int totalBill=0;;
        for(int i:ls){
            totalBill+=i;
        }
        return totalBill;



	
	}

}

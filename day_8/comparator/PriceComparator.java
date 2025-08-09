package day_8.comparator;

import java.util.Comparator;

public class PriceComparator implements Comparator<CricketBall>{

    @Override
    public int compare(CricketBall obj1, CricketBall obj2) {
        if(obj1.getPrice() == obj2.getPrice()) return 0;
        else if(obj1.getPrice() > obj2.getPrice()) return 1;
        else return -1;
    }
    
}

class PriceComparatorReverse implements Comparator<CricketBall>{

    @Override
    public int compare(CricketBall obj1, CricketBall obj2) {
        if(obj1.getPrice() == obj2.getPrice()) return 0;
        else if(obj1.getPrice() < obj2.getPrice()) return 1;
        else return -1;
    }
    
}

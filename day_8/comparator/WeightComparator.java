package day_8.comparator;

import java.util.Comparator;

public class WeightComparator implements Comparator<CricketBall>{

    @Override
    public int compare(CricketBall obj1, CricketBall obj2) {
        if(obj1.getWeight() == obj2.getWeight()) return 0;
        else if(obj1.getWeight() > obj2.getWeight()) return 1;
        else return -1;
    }
    
}

class WeightComparatorReverse implements Comparator<CricketBall>{

    @Override
    public int compare(CricketBall obj1, CricketBall obj2) {
        if(obj1.getWeight() == obj2.getWeight()) return 0;
        else if(obj1.getWeight() < obj2.getWeight()) return 1;
        else return -1;
    }
    
}

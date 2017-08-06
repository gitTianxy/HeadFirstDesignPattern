package chap01_strategypattern.context;

import chap01_strategypattern.owner.DuckA;
import chap01_strategypattern.owner.DuckB;

/**
 * @author XinyuTian
 * @date 2016年9月25日
**/
public class DuckStore {
    public static void main(String[] args) {
        // set duckA behavior
        DuckA duckA = new DuckA("DuckA");
        duckA.performActions();
        // set duckB behavior
        DuckB duckB = new DuckB("DuckB");
        duckB.performActions();
    }
}

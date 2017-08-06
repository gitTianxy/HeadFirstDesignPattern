package z_appendix.bridge_pattern.primary_hierarchical_form;
/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月15日
**/
public class Tester {
    public static void main(String[] args) {
        BusOnHighWay bohw = new BusOnHighWay();
        bohw.run();
        System.out.print("\n--------------------------\n");
        BusOnStreet bos = new BusOnStreet();
        bos.run();
    }
}

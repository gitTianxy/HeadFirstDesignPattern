package chap09_iterator_pattern.client;

import java.lang.management.MemoryType;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import chap09_iterator_pattern.aggregate.BreakfastMenu;
import chap09_iterator_pattern.aggregate.DinnerMenu;
import chap09_iterator_pattern.aggregate.LunchMenu;
import chap09_iterator_pattern.aggregate.Menu;
import chap09_iterator_pattern.aggregate.Menu.MenuType;
import chap09_iterator_pattern.component.BreakfastMenuItem;
import chap09_iterator_pattern.component.DinnerMenuItem;
import chap09_iterator_pattern.component.LunchMenuItem;
import chap09_iterator_pattern.component.MenuItem;

/**
 * TODO
 * 
 * @author XinyuTian
 * @date 2017年3月11日
 **/
public class Waitress {
    String name;
    String gender;
    BreakfastMenu breakfastMenu;
    LunchMenu lunchMenu;
    DinnerMenu dinnerMenu;

    public Waitress(String name, String gender, BreakfastMenu breakfastMenu, LunchMenu lunchMenu, DinnerMenu dinnerMenu) {
        super();
        this.name = name;
        this.gender = gender;
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
        this.dinnerMenu = dinnerMenu;
    }
    
    public void presentMenu(Menu.MenuType type) {
        if (Menu.MenuType.BREAKFASTMENU.equals(type)) {
            System.out.println("**** Here is " + selfIntro() + " presents the BREAKFAST_MENU ****");
            printMenu(breakfastMenu.getIterator());
        } else if (Menu.MenuType.LUNCHMENU.equals(type)) {
            System.out.println("**** Here is " + selfIntro() + " presents the LUNCH_MENU ****");
            printMenu(lunchMenu.getIterator());
        } else if (Menu.MenuType.DINNERMENU.equals(type)) {
            System.out.println("**** Here is " + selfIntro() + " presents the DINNER_MENU ****");
            printMenu(dinnerMenu.getIterator());
        }
    }
    
    public String selfIntro() {
        return name + "/" + gender;
    }
    
    private void printMenu(Iterator<?> itr) {
        while (itr.hasNext()) {
            MenuItem item = (MenuItem) itr.next();
            System.out.println(item.getDescription());
        }
    }
    
    private void removeItem(Iterator<?> itr, Double basePrice) {
        while (itr.hasNext()) {
            MenuItem item = (MenuItem) itr.next();
            if (item.getPrice() < basePrice) {
                itr.remove();
            }
        }
    }
    
    public static void main(String[] args) {
        // set menus
        BreakfastMenuItem[] breakfastMenuItems = {new BreakfastMenuItem("breakfastItem1", 1.00), new BreakfastMenuItem("breakfastItem2", 2.00), new BreakfastMenuItem("breakfastItem3", 3.00)};
        BreakfastMenu breakfastMenu = new BreakfastMenu(breakfastMenuItems);
        Hashtable<String, MenuItem> lunchMenuItems = new Hashtable<>();
        lunchMenuItems.put("lunchItem1", new LunchMenuItem("lunchItem1", 5.00));
        lunchMenuItems.put("lunchItem2", new LunchMenuItem("lunchItem2", 15.00));
        lunchMenuItems.put("lunchItem3", new LunchMenuItem("lunchItem3", 25.00));
        LunchMenu lunchMenu = new LunchMenu(lunchMenuItems);
        ArrayList<DinnerMenuItem> dinnerMenuItems = new ArrayList<DinnerMenuItem>();
        dinnerMenuItems.add(new DinnerMenuItem("dinnerItem1", 10.00));
        dinnerMenuItems.add(new DinnerMenuItem("dinnerItem2", 20.00));
        dinnerMenuItems.add(new DinnerMenuItem("dinnerItem3", 30.00));
        DinnerMenu dinnerMenu = new DinnerMenu(dinnerMenuItems);
        // set waitress
        Waitress waitress = new Waitress("Lisa", "female", breakfastMenu, lunchMenu, dinnerMenu);
        // present menu
        waitress.presentMenu(MenuType.BREAKFASTMENU);
        waitress.presentMenu(MenuType.LUNCHMENU);
        waitress.presentMenu(MenuType.DINNERMENU);
        // remove item price lower than 15.00
        waitress.removeItem(breakfastMenu.getIterator(), 1.50);
        waitress.removeItem(lunchMenu.getIterator(), 10.00);
        waitress.removeItem(dinnerMenu.getIterator(), 15.00);
        System.out.println("---------- re-presents menu after remove action ------------");
        waitress.presentMenu(MenuType.BREAKFASTMENU);
        waitress.presentMenu(MenuType.LUNCHMENU);
        waitress.presentMenu(MenuType.DINNERMENU);
    }
}

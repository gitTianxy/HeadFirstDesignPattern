package chap09_composite_pattern.client;

import java.util.ArrayList;

import chap09_composite_pattern.node.Component;
import chap09_composite_pattern.node.Composite;
import chap09_composite_pattern.node.Leaf;

/**
 * TODO
 * @author XinyuTian
 * @date 2017年3月12日
**/
public class Master {
    Component rootNode;

    public Master(Component rootNode) {
        super();
        this.rootNode = rootNode;
    }
    
    public void print() {
        rootNode.getDescription();
    }
    
    public static void main(String[] args) {
        // create the tree structure--a bottom up method
        int idx = 0;
        Component leaf1 = new Leaf(idx++, "leaf1");
        Component leaf2 = new Leaf(idx++, "leaf2");
        Component leaf3 = new Leaf(idx++, "leaf3");
        ArrayList<Component> children1 = new ArrayList<>();
        children1.add(leaf1);
        Component composite1 = new Composite(idx++, "composite1", children1);
        ArrayList<Component> children2 = new ArrayList<>();
        children2.add(leaf2);
        children2.add(leaf3);
        Component composite2 = new Composite(idx++, "composite2", children2);
        ArrayList<Component> children3 = new ArrayList<>();
        children3.add(composite1);
        children3.add(composite2);
        Component composite3 = new Composite(idx++, "root", children3);
        // print the tree
        new Master(composite3).print();
    }
}

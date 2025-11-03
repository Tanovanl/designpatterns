package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();


    public static TreeType getTree(String type){
        TreeType tree = treeTypes.get(type);
        if (tree == null) {
            if (type.equalsIgnoreCase("Pine")) {
                tree = new PineTree();
            } else if (type.equalsIgnoreCase("Oak")) {
                tree = new OakTree();
            }
            treeTypes.put(type, tree);
        }
        return tree;
    }
}

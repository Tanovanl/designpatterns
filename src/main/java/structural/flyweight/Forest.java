package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    public static void main(String[] args) {
        List<Tree> trees = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            TreeType type = TreeFactory.getTree("Pine");
            trees.add(new Tree(i * 10, i * 20, type));
            type = TreeFactory.getTree("Oak");
            trees.add(new Tree(i * 100                                                                                                                                                                                                                                                                                                                                                                                                                                              , i * 200, type));
        }

        for (Tree tree : trees) {
            tree.draw();
        }
    }
}

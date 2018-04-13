package tree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List temp_list = new ArrayList();
        for (char a = 'a'; a != 'z' ; a++) {
            temp_list.add(String.valueOf(a));
        }
        Merkle_tree tree = new Merkle_tree(temp_list);
        tree.merkle_tree();
        System.out.println("root \n"+ tree.getRoot());
    }
}

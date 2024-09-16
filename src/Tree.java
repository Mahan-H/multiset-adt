import java.util.ArrayList;
import java.util.Objects;

public class Tree {
    private int root = 0;
    private ArrayList<Tree> subtrees;

    public Tree(int root, ArrayList<Tree> subtrees) {
        this.root = root;
        this.subtrees = Objects.requireNonNullElseGet(subtrees, ArrayList::new);
    }

    public Boolean isEmpty() {
        return this.root == 0;
    }
    public int length() {
        if (this.isEmpty()) {
            return 0;
        }
        int sum = 1;
        for (Tree t : this.subtrees) {
            sum += t.length();
        }
        return sum;
    }
    public int count(int item) {
        if (this.isEmpty()) {
            return 0;
        }
        int sum = 0;
        if (this.root == item) {
            sum++;
        }
        for (Tree t : this.subtrees) {
            sum += t.count(item);
        }
        return sum;
    }

    }

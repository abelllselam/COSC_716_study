package OOP_concepts;

public class Main {
    public static void main(String[] args) {
        Tree myFavOakTree = new Tree(120, 12, TreeType.OAK);

        myFavOakTree.announceTalltree();

        Tree myFavMapleTree = new Tree(90,30,TreeType.MAPLE);

        myFavMapleTree.announceTalltree();

        System.out.println(Tree.trunk_color);
        Tree.announceTree();
        
    }
}

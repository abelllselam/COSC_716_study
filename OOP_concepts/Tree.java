package OOP_concepts;

import java.awt.*;

public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;
    static Color trunk_color = new Color(102,51,0);

    Tree(double heightFt, double trunkDiameterInches, TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }
    void grow(){
        this.heightFt = this.heightFt +10;
        this.trunkDiameterInches = this.trunkDiameterInches +1;
    }

    static void announceTree(){
        System.out.println("Look out for that tree." + trunk_color + " tree.");
    }

    void announceTalltree() {
        if(this.heightFt > 100) {
            System.out.println("That is a tall "+ this.treeType + " tree");
        }
    }
}
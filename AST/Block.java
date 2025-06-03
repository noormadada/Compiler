package AST;

public class Block {
BlockExpr1 blockExpr1;
BlockExpr2 blockExpr2;
BlockExpr3 blockExpr3;

    public BlockExpr1 getBlockExpr1() {
        return blockExpr1;
    }

    public void setBlockExpr1(BlockExpr1 blockExpr1) {
        this.blockExpr1 = blockExpr1;
    }

    public BlockExpr2 getBlockExpr2() {
        return blockExpr2;
    }

    public void setBlockExpr2(BlockExpr2 blockExpr2) {
        this.blockExpr2 = blockExpr2;
    }

    public BlockExpr3 getBlockExpr3() {
        return blockExpr3;
    }

    public void setBlockExpr3(BlockExpr3 blockExpr3) {
        this.blockExpr3 = blockExpr3;
    }

    @Override
    public String toString() {
        if(blockExpr1!=null){
            return "Block{" +
                    "blockExpr1=" + blockExpr1 +
                    '}';
        } else if (blockExpr2!=null) {
            return "Block{" +
                    "blockExpr2=" + blockExpr2 +
                    '}';
        }else {
            return "Block{" +
                    "blockExpr3=" + blockExpr3 +
                    '}';
        }
    }
}

// Autogenerated AST node
package pers.xia.jpython.ast;
import java.io.DataOutputStream;
import java.io.IOException;

public class BinOp extends exprType {
    public exprType left;
    public OperatorType op;
    public exprType right;

    public BinOp(exprType left, OperatorType op, exprType right, int lineno,
                 int col_offset) {
        this.left = left;
        this.op = op;
        this.right = right;
        this.lineno = lineno;
        this.col_offset = col_offset;
    }

    public String toString() {
        return "BinOp";
    }

    public void pickle(DataOutputStream ostream) throws IOException {
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitBinOp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}

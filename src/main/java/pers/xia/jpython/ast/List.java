// Autogenerated AST node
package pers.xia.jpython.ast;
import pers.xia.jpython.object.PyObject;
import java.io.DataOutputStream;
import java.io.IOException;

public class List extends exprType {
    public java.util.List<exprType> elts;
    public expr_contextType ctx;

    public List(java.util.List<exprType> elts, expr_contextType ctx,int
    lineno, int col_offset) {
        this.elts = elts;
        this.ctx = ctx;
        this.lineno = lineno;
        this.col_offset = col_offset;
    }

    public String toString() {
        return "List";
    }

    public void pickle(DataOutputStream ostream) throws IOException {
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitList(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}

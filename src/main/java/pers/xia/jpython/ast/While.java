// Autogenerated AST node
package pers.xia.jpython.ast;
import pers.xia.jpython.object.PyObject;
import java.io.DataOutputStream;
import java.io.IOException;

public class While extends stmtType {
    public exprType test;
    public java.util.List<stmtType> body;
    public java.util.List<stmtType> orelse;

    public While(exprType test, java.util.List<stmtType> body,
    java.util.List<stmtType> orelse,int lineno, int col_offset) {
        this.test = test;
        this.body = body;
        this.orelse = orelse;
        this.lineno = lineno;
        this.col_offset = col_offset;
    }

    public String toString() {
        return "While";
    }

    public void pickle(DataOutputStream ostream) throws IOException {
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitWhile(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}

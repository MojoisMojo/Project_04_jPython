// Autogenerated AST node
package pers.xia.jpython.ast;
import pers.xia.jpython.object.PyObject;
import java.io.DataOutputStream;
import java.io.IOException;

public class Assert extends stmtType {
    public exprType test;
    public exprType msg;

    public Assert(exprType test, exprType msg,int lineno, int col_offset) {
        this.test = test;
        this.msg = msg;
        this.lineno = lineno;
        this.col_offset = col_offset;
    }

    public String toString() {
        return "Assert";
    }

    public void pickle(DataOutputStream ostream) throws IOException {
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitAssert(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}

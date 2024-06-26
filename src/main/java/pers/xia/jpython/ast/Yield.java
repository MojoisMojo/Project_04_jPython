// Autogenerated AST node
package pers.xia.jpython.ast;
import pers.xia.jpython.object.PyObject;
import java.io.DataOutputStream;
import java.io.IOException;

public class Yield extends exprType {
    public exprType value;

    public Yield(exprType value,int lineno, int col_offset) {
        this.value = value;
        this.lineno = lineno;
        this.col_offset = col_offset;
    }

    public String toString() {
        return "Yield";
    }

    public void pickle(DataOutputStream ostream) throws IOException {
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitYield(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}

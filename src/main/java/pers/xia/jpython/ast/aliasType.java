// Autogenerated AST node
package pers.xia.jpython.ast;
import pers.xia.jpython.object.PyObject;
import java.io.DataOutputStream;
import java.io.IOException;

public class aliasType{
    public String name;
    public String asname;

    public aliasType(String name, String asname) {
        this.name = name;
        this.asname = asname;
    }

    public String toString() {
        return "aliasType";
    }

    public void pickle(DataOutputStream ostream) throws IOException {
    }

    public Object accept(VisitorIF visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}

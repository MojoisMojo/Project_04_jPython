package pers.xia.jpython.interpreter.statement;
import pers.xia.jpython.interpreter.ProgramState;
import pers.xia.jpython.interpreter.expression.Expression;
import pers.xia.jpython.object.PyLong;
import pers.xia.jpython.object.PyObject;

import java.util.List;

public class ForStatement extends BlockStatement {
    private String loopVariable;
    private Expression rangeStart;
    private Expression rangeEnd;
    private Expression rangeStep;

    public ForStatement(String loopVariable, Expression rangeStart, Expression rangeEnd,Expression rangeStep, List<Statement> body) {
        super(null, body);
        this.loopVariable = loopVariable;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
        this.rangeStep = rangeStep;
    }

    @Override
    public void run(ProgramState programState) {
        programState.setVariable(loopVariable, rangeStart.eval(programState));
        if(((PyLong)programState.getVariable(loopVariable)).asLong()<=((PyLong)rangeEnd.eval(programState)).asLong()) {
            for (long i = ((PyLong) programState.getVariable(loopVariable)).asLong(); i < ((PyLong) rangeEnd.eval(programState)).asLong(); i += ((PyLong) rangeStep.eval(programState)).asLong()) {
                boolean ifBreak = bodyBlock(programState);
                if (ifBreak) {
                    return;
                }
                programState.setVariable(loopVariable, new PyLong(i + ((PyLong) rangeStep.eval(programState)).asLong()));
            }
        }
        else{
            for (long i = ((PyLong) programState.getVariable(loopVariable)).asLong(); i > ((PyLong) rangeEnd.eval(programState)).asLong(); i += ((PyLong) rangeStep.eval(programState)).asLong()) {
                boolean ifBreak = bodyBlock(programState);
                if (ifBreak) {
                    return;
                }
                programState.setVariable(loopVariable, new PyLong(i + ((PyLong) rangeStep.eval(programState)).asLong()));
            }
        }
        elseBlock(programState);
    }
}

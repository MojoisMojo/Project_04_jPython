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
    // TODO Task3 by mojo
    private Expression rangeStep;


    public ForStatement(String loopVariable, Expression rangeStart, Expression rangeEnd, Expression rangeStep, List<Statement> body) {
        super(null, body);
        this.loopVariable = loopVariable;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
        this.rangeStep = rangeStep;
    }
    // public ForStatement(String loopVariable, Expression rangeStart, Expression rangeEnd, List<Statement> body) {
    //     super(null, body);
    //     this.loopVariable = loopVariable;
    //     this.rangeStart = rangeStart;
    //     this.rangeEnd = rangeEnd;
    // }

    @Override
    public void run(ProgramState programState) {
        programState.setVariable(loopVariable, rangeStart.eval(programState));
        long forStart = ((PyLong)programState.getVariable(loopVariable)).asLong();
        long forEnd = ((PyLong)rangeEnd.eval(programState)).asLong();
        long forStep = ((PyLong)rangeStep.eval(programState)).asLong();
        // for(long i = ((PyLong)programState.getVariable(loopVariable)).asLong(); i < ((PyLong)rangeEnd.eval(programState)).asLong(); i+=forStep) {
        //     boolean ifBreak = bodyBlock(programState);
        //     if(ifBreak){
        //         return;
        //     }
        //     programState.setVariable(loopVariable, new PyLong(i+forStep));
        // }
        for(long i = forStart; i < forEnd; i+=forStep) {
            boolean ifBreak = bodyBlock(programState);
            if(ifBreak){
                return;
            }
            programState.setVariable(loopVariable, new PyLong(i+forStep));
        }
        elseBlock(programState);
    }
}

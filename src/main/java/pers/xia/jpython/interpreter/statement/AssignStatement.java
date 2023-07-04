package pers.xia.jpython.interpreter.statement;

import pers.xia.jpython.interpreter.ProgramState;
import pers.xia.jpython.interpreter.expression.Expression;
import pers.xia.jpython.object.PyObject;

import java.util.List;

public class AssignStatement implements Statement {
    private List<String> variableNames;
    private Expression expression;

    public AssignStatement(List<String> variableNames, Expression expression) {
        this.variableNames = variableNames;
        this.expression = expression;
    }


    @Override
    public void run(ProgramState programState) {
        PyObject expressionValue = expression.eval(programState);
        for (String variableName : variableNames) {
            programState.setVariable(variableName, expressionValue);
        }
    }
}

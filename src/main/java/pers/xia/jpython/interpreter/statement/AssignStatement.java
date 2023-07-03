package pers.xia.jpython.interpreter.statement;

import java.util.ArrayList;

import pers.xia.jpython.interpreter.ProgramState;
import pers.xia.jpython.interpreter.expression.Expression;
import pers.xia.jpython.object.PyObject;

public class AssignStatement implements Statement {
    private ArrayList<String> variableNames;
    private Expression expression;

    public AssignStatement(ArrayList<String> variableNames, Expression expression) {
        this.variableNames = variableNames;
        this.expression = expression;
    }
    public AssignStatement(String variableName, Expression expression) {
        this.variableNames.add(variableName);
        this.expression = expression;
    }


    @Override
    public void run(ProgramState programState) {
        PyObject expressionValue = expression.eval(programState);
        for(String variableName:variableNames){
            programState.setVariable(variableName, expressionValue);
        }
    }
}

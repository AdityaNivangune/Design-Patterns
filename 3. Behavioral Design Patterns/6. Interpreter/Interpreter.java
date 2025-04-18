class Interpreter {
    private Context context;
    
    public Interpreter(Context context) {
        this.context = context;
    }

    public int interpret(String expression) {
        Expression expressionTree = buildExpressionTree(expression);
    
        return expressionTree.interpret(context);
    }

    private Expression buildExpressionTree(String expression) {
        return new AdditionExpression(new NumberExpression(2),
                                    new MultiplicationExpression(
                                        new NumberExpression(3), 
                                        new NumberExpression(4)
                                    )
                                );
    }
}

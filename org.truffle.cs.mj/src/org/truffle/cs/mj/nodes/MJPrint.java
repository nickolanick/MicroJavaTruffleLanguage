package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MJPrint extends MJStatement {

    @Child MJExpr expr;

    public MJPrint(MJExpr expr) {
        // TODO Auto-generated constructor stub
        this.expr = expr;

    }

    @Override
    public Object execute(VirtualFrame frame) {
        System.out.println(expr.execute(frame));
        return null;
    }

}

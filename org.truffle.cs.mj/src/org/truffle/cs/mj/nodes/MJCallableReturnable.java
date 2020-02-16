package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MJCallableReturnable extends MJExpr {
    @Child MJCallable callable;

    public MJCallableReturnable(MJCallable callable) {
        super();
        this.callable = callable;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        try {
            callable.execute(frame);
        } catch (MJReturnException ex) {
            return ex.getResult();
        }
        return null;
    }

}

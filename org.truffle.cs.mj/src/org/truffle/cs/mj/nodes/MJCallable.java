package org.truffle.cs.mj.nodes;

import java.util.ArrayList;
import java.util.List;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.VirtualFrame;

public class MJCallable extends MJStatement {
    @Children MJExpr arguments[];
    private RootCallTarget target;

    public MJCallable(MJMethod method, List<MJExpr> arguments) {
        super();
        this.target = Truffle.getRuntime().createCallTarget(method);
        this.arguments = arguments.toArray(new MJExpr[arguments.size()]);
    }

    @Override
    public Object execute(VirtualFrame frame) {
        List<Object> result = new ArrayList<>();
        for (MJExpr arg : arguments) {
            result.add(arg.execute(frame));
        }
        return target.call(result.toArray());
    }

}

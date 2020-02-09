package org.truffle.cs.mj.nodes;

import java.util.List;
import java.util.stream.Collectors;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.VirtualFrame;

public class MJCallable extends MJStatement {
    @Child MJMethod method;
    List<MJExpr> arguments;

    public MJCallable(MJMethod method, List<MJExpr> arguments) {
        super();
        this.method = method;
        this.arguments = arguments;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return Truffle.getRuntime().createCallTarget(method).call(arguments.stream().map(n -> n.execute(frame)).collect(Collectors.toList()).toArray());
    }

}

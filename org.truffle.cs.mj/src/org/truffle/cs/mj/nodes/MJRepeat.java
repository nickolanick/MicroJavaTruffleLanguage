package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.LoopNode;

public class MJRepeat extends MJStatement {
    @Child LoopNode loopNode;

    public MJRepeat(MJExpr condition, MJStatement body) {
        super();
        this.loopNode = Truffle.getRuntime().createLoopNode(new MJWhile(condition, body));
    }

    @Override
    public Object execute(VirtualFrame frame) {
        return this.loopNode.execute(frame);
    }

}

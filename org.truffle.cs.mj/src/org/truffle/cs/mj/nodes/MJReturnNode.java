package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node.Child;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "return", description = "The node implementing a return statement")
public final class MJReturnNode extends MJStatement {

    @Child MJExpr valueNode;

    public MJReturnNode(MJExpr valueNode) {
        this.valueNode = valueNode;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        Object result;
        if (valueNode != null) {
            result = valueNode.execute(frame);
        } else {
            return null;
        }
        throw new MJReturnException(result);
    }
}
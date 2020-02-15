package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(shortName = "break", description = "The node implementing a break statement")
public final class MJBreak extends MJStatement {

    @Override
    public Object execute(VirtualFrame frame) {
        throw MJBreakException.SINGLETON;
    }
}
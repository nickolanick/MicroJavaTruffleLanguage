package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;

public final class MJContinue extends MJStatement {

    @Override
    public Object execute(VirtualFrame frame) {
        throw MJContinueException.SINGLETON;
    }
}
package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.nodes.ControlFlowException;

public final class MJContinueException extends ControlFlowException {

    public static final MJContinueException SINGLETON = new MJContinueException();

    private static final long serialVersionUID = -91013326379258890L;

    /* Prevent instantiation from outside. */
    private MJContinueException() {
    }
}
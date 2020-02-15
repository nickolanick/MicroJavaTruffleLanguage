package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.nodes.ControlFlowException;

public final class MJBreakException extends ControlFlowException {

    public static final MJBreakException SINGLETON = new MJBreakException();

    private static final long serialVersionUID = -91013036379258890L;

    /* Prevent instantiation from outside. */
    private MJBreakException() {
    }
}
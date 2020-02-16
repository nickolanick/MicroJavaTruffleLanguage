package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.nodes.ControlFlowException;

public final class MJReturnException extends ControlFlowException {

    private static final long serialVersionUID = 407319134628136911L;

    private final Object result;

    public MJReturnException(Object result) {
        this.result = result;
    }

    public Object getResult() {
        return result;
    }
}
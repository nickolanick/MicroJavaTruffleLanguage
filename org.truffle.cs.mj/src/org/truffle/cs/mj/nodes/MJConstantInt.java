package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.Specialization;

public abstract class MJConstantInt extends MJExpr {
    private final int constant;

    public MJConstantInt(int constant) {
        this.constant = constant;
    }

    @Specialization
    public int doInt() {
        return constant;
    }
}
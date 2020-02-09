// CheckStyle: start generated
package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.GeneratedBy;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeCost;
import org.truffle.cs.mj.nodes.MJExpr;
import org.truffle.cs.mj.nodes.MJExprWriteVar;

@GeneratedBy(MJExprWriteVar.class)
public final class MJExprWriteVarNodeGen extends MJExprWriteVar {

    private final FrameSlot slot;
    @Child private MJExpr value_;

    private MJExprWriteVarNodeGen(MJExpr value, FrameSlot slot) {
        this.slot = slot;
        this.value_ = value;
    }

    @Override
    protected FrameSlot getSlot() {
        return this.slot;
    }

    @Override
    public Object execute(VirtualFrame frameValue) {
        Object valueValue_ = this.value_.execute(frameValue);
        return execute(frameValue, valueValue_);
    }

    @Override
    public NodeCost getCost() {
        return NodeCost.MONOMORPHIC;
    }

    public static MJExprWriteVar create(MJExpr value, FrameSlot slot) {
        return new MJExprWriteVarNodeGen(value, slot);
    }

}

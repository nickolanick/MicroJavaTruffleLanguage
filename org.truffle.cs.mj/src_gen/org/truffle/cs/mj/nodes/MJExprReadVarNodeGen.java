// CheckStyle: start generated
package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.GeneratedBy;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeCost;
import org.truffle.cs.mj.nodes.MJExprReadVar;

@GeneratedBy(MJExprReadVar.class)
public final class MJExprReadVarNodeGen extends MJExprReadVar {

    private final FrameSlot slot;

    private MJExprReadVarNodeGen(FrameSlot slot) {
        this.slot = slot;
    }

    @Override
    protected FrameSlot getSlot() {
        return this.slot;
    }

    @Override
    public Object execute(VirtualFrame frameValue) {
        return readVariable(frameValue);
    }

    @Override
    public NodeCost getCost() {
        return NodeCost.MONOMORPHIC;
    }

    public static MJExprReadVar create(FrameSlot slot) {
        return new MJExprReadVarNodeGen(slot);
    }

}

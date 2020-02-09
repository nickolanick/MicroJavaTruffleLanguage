
package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;

public class MJWriteVar extends MJStatement {
    FrameSlot slot;
    @Child MJExpr val;

    public MJWriteVar(FrameSlot slot, MJExpr val) {
        super();
        this.slot = slot;
        this.val = val;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        frame.setObject(slot, val.execute(frame));
        return null;
    }
}

// @NodeChild(value = "value", type = MJExpr.class)
// @NodeField(name = "slot", type = FrameSlot.class)
// public abstract class MJExprWriteVar extends MJStatement {
// protected abstract FrameSlot getSlot();
//
// @Specialization
// public Object execute(VirtualFrame frame, Object value) {
// // TODO: Optimize for different types
// frame.setObject(getSlot(), value);
// return null;
// }
// }

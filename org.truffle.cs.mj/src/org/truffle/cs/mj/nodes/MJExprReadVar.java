package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;

@NodeField(name = "slot", type = FrameSlot.class)
public abstract class MJExprReadVar extends MJExpr {
    protected abstract FrameSlot getSlot();

    @Specialization
    public Object readVariable(VirtualFrame frame) {
        try {
// return frame.getObject(slot);

            Object ob = frame.getObject(getSlot());

            return ob;
        } catch (FrameSlotTypeException e) {
            CompilerDirectives.transferToInterpreterAndInvalidate();
            e.printStackTrace();
            throw new Error(e);
        }
    }
}
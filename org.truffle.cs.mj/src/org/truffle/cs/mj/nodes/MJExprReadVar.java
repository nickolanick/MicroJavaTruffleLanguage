package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;

public class MJExprReadVar extends MJExpr {
    FrameSlot slot;

    public MJExprReadVar(FrameSlot slot) {
        super();
        this.slot = slot;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        try {

            Object ob = frame.getObject(slot);

            return ob;
        } catch (FrameSlotTypeException e) {
            CompilerDirectives.transferToInterpreterAndInvalidate();
            e.printStackTrace();
            throw new Error(e);
        }
    }
}
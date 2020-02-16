package org.truffle.cs.mj.nodes;

import java.util.List;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RootNode;

@NodeInfo
public class MJMethod extends RootNode {

    final String name;

    @Child MJBlock block;
// FrameDescriptor frameDescriptor;

    public MJMethod(String name, MJBlock block, FrameDescriptor frameDescriptor) {
        super(null, frameDescriptor);
        this.name = name;
        this.block = block;

    }

    public void SetBlock(MJBlock addBlock) {
        this.block = addBlock;
    }

    @Override

    public Object execute(VirtualFrame frame) {
        setArgs(frame);
        block.execute(frame);

        return null;
    }

    @ExplodeLoop
    public void setArgs(VirtualFrame frame) {
        Object[] args = frame.getArguments();
        for (int i = 0; i < args.length; i++) {
            frame.setObject(this.getFrameDescriptor().getSlots().get(i), args[i]);
        }

    }

    @Override
    public String getName() {
        return name;
    }
}

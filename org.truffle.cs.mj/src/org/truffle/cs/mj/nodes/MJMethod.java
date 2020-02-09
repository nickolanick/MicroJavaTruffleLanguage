package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExecutableNode;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RootNode;

@NodeInfo
public class MJMethod extends RootNode {

    final String name;

    @Child MJBlock block;

    public MJMethod(String name, MJBlock block, FrameDescriptor frameDescriptor) {
        super(null, frameDescriptor);
        this.name = name;
        this.block = block;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        block.execute(frame);
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}

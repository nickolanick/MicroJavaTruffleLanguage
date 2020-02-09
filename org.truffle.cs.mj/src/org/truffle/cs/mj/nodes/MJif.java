package org.truffle.cs.mj.nodes;

import java.util.Optional;

import com.oracle.truffle.api.frame.VirtualFrame;

public class MJif extends MJStatement {

    @Child MJExpr condition;
    @Child MJStatement truePath;
    @Child MJStatement falsePath;

    public MJif(MJExpr condition, MJStatement truePath, MJStatement falsePath) {
        super();
        this.condition = condition;
        this.truePath = truePath;
        this.falsePath = falsePath;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        if ((boolean) condition.execute(frame)) {
            truePath.execute(frame);
        } else {
            if (falsePath != null) {
                falsePath.execute(frame);
            }
        }

        return null;
    }

}

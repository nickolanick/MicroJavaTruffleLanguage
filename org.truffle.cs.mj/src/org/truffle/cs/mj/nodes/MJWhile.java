package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.RepeatingNode;

public class MJWhile extends Node implements RepeatingNode {

    @Child MJExpr condition;
    @Child MJStatement body;

    public MJWhile(MJExpr condition, MJStatement body) {
        super();
        this.condition = condition;
        this.body = body;
    }

    public boolean executeRepeating(VirtualFrame frame) {
        if (!(boolean) this.condition.execute(frame)) {
            return false;
        }
        try {
            /* Execute the loop body. */
            this.body.execute(frame);
            /* Continue with next loop iteration. */
        } catch (MJContinueException ex) {

            return true;

        } catch (MJBreakException ex) {
            /* Break out of the loop. */
            return false;
        }
        return true;
    }

}

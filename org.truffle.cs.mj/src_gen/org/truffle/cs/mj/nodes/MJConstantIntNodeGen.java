// CheckStyle: start generated
package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.GeneratedBy;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeCost;
import org.truffle.cs.mj.nodes.MJConstantInt;

@GeneratedBy(MJConstantInt.class)
public final class MJConstantIntNodeGen extends MJConstantInt {

    private MJConstantIntNodeGen(int constant) {
        super(constant);
    }

    @Override
    public Object execute(VirtualFrame frameValue) {
        return doInt();
    }

    @Override
    public NodeCost getCost() {
        return NodeCost.MONOMORPHIC;
    }

    public static MJConstantInt create(int constant) {
        return new MJConstantIntNodeGen(constant);
    }

}

// CheckStyle: start generated
package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.dsl.GeneratedBy;
import com.oracle.truffle.api.dsl.UnsupportedSpecializationException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeCost;
import org.truffle.cs.mj.nodes.MJBinary;
import org.truffle.cs.mj.nodes.MJExpr;
import org.truffle.cs.mj.nodes.MJBinary.AddOp;
import org.truffle.cs.mj.nodes.MJBinary.AndOp;
import org.truffle.cs.mj.nodes.MJBinary.DiffOp;
import org.truffle.cs.mj.nodes.MJBinary.DivOp;
import org.truffle.cs.mj.nodes.MJBinary.EqOp;
import org.truffle.cs.mj.nodes.MJBinary.GOp;
import org.truffle.cs.mj.nodes.MJBinary.GeOp;
import org.truffle.cs.mj.nodes.MJBinary.LOp;
import org.truffle.cs.mj.nodes.MJBinary.LeOp;
import org.truffle.cs.mj.nodes.MJBinary.MulOp;
import org.truffle.cs.mj.nodes.MJBinary.NeOp;
import org.truffle.cs.mj.nodes.MJBinary.OrOp;
import org.truffle.cs.mj.nodes.MJBinary.RemOp;

@GeneratedBy(MJBinary.class)
public final class MJBinaryFactory {

    @GeneratedBy(AddOp.class)
    public static final class AddOpNodeGen extends AddOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private AddOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active add(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return add(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active add(int, int) */;
                    return add(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static AddOp create(MJExpr x, MJExpr y) {
            return new AddOpNodeGen(x, y);
        }

    }
    @GeneratedBy(DiffOp.class)
    public static final class DiffOpNodeGen extends DiffOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private DiffOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active diff(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return diff(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active diff(int, int) */;
                    return diff(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static DiffOp create(MJExpr x, MJExpr y) {
            return new DiffOpNodeGen(x, y);
        }

    }
    @GeneratedBy(DivOp.class)
    public static final class DivOpNodeGen extends DivOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private DivOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active div(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return div(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active div(int, int) */;
                    return div(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static DivOp create(MJExpr x, MJExpr y) {
            return new DivOpNodeGen(x, y);
        }

    }
    @GeneratedBy(MulOp.class)
    public static final class MulOpNodeGen extends MulOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private MulOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active mul(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return mul(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active mul(int, int) */;
                    return mul(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static MulOp create(MJExpr x, MJExpr y) {
            return new MulOpNodeGen(x, y);
        }

    }
    @GeneratedBy(RemOp.class)
    public static final class RemOpNodeGen extends RemOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private RemOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active rem(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return rem(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private int executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active rem(int, int) */;
                    return rem(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static RemOp create(MJExpr x, MJExpr y) {
            return new RemOpNodeGen(x, y);
        }

    }
    @GeneratedBy(LeOp.class)
    public static final class LeOpNodeGen extends LeOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private LeOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active le(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return le(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private Boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active le(int, int) */;
                    return le(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static LeOp create(MJExpr x, MJExpr y) {
            return new LeOpNodeGen(x, y);
        }

    }
    @GeneratedBy(GeOp.class)
    public static final class GeOpNodeGen extends GeOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private GeOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active ge(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return ge(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private Boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active ge(int, int) */;
                    return ge(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static GeOp create(MJExpr x, MJExpr y) {
            return new GeOpNodeGen(x, y);
        }

    }
    @GeneratedBy(LOp.class)
    public static final class LOpNodeGen extends LOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private LOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active l(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return l(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private Boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active l(int, int) */;
                    return l(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static LOp create(MJExpr x, MJExpr y) {
            return new LOpNodeGen(x, y);
        }

    }
    @GeneratedBy(GOp.class)
    public static final class GOpNodeGen extends GOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private GOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active g(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return g(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private Boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active g(int, int) */;
                    return g(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static GOp create(MJExpr x, MJExpr y) {
            return new GOpNodeGen(x, y);
        }

    }
    @GeneratedBy(EqOp.class)
    public static final class EqOpNodeGen extends EqOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private EqOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active eq(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return eq(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private Boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active eq(int, int) */;
                    return eq(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static EqOp create(MJExpr x, MJExpr y) {
            return new EqOpNodeGen(x, y);
        }

    }
    @GeneratedBy(NeOp.class)
    public static final class NeOpNodeGen extends NeOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private NeOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active ne(int, int) */ && xValue_ instanceof Integer) {
                int xValue__ = (int) xValue_;
                if (yValue_ instanceof Integer) {
                    int yValue__ = (int) yValue_;
                    return ne(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private Boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Integer) {
                int xValue_ = (int) xValue;
                if (yValue instanceof Integer) {
                    int yValue_ = (int) yValue;
                    this.state_ = state = state | 0b1 /* add-active ne(int, int) */;
                    return ne(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static NeOp create(MJExpr x, MJExpr y) {
            return new NeOpNodeGen(x, y);
        }

    }
    @GeneratedBy(OrOp.class)
    public static final class OrOpNodeGen extends OrOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private OrOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active or(Boolean, Boolean) */ && xValue_ instanceof Boolean) {
                Boolean xValue__ = (Boolean) xValue_;
                if (yValue_ instanceof Boolean) {
                    Boolean yValue__ = (Boolean) yValue_;
                    return or(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private Boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Boolean) {
                Boolean xValue_ = (Boolean) xValue;
                if (yValue instanceof Boolean) {
                    Boolean yValue_ = (Boolean) yValue;
                    this.state_ = state = state | 0b1 /* add-active or(Boolean, Boolean) */;
                    return or(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static OrOp create(MJExpr x, MJExpr y) {
            return new OrOpNodeGen(x, y);
        }

    }
    @GeneratedBy(AndOp.class)
    public static final class AndOpNodeGen extends AndOp {

        @Child private MJExpr x_;
        @Child private MJExpr y_;
        @CompilationFinal private int state_;

        private AndOpNodeGen(MJExpr x, MJExpr y) {
            this.x_ = x;
            this.y_ = y;
        }

        @Override
        public Object execute(VirtualFrame frameValue) {
            int state = state_;
            Object xValue_ = this.x_.execute(frameValue);
            Object yValue_ = this.y_.execute(frameValue);
            if (state != 0 /* is-active and(Boolean, Boolean) */ && xValue_ instanceof Boolean) {
                Boolean xValue__ = (Boolean) xValue_;
                if (yValue_ instanceof Boolean) {
                    Boolean yValue__ = (Boolean) yValue_;
                    return and(xValue__, yValue__);
                }
            }
            CompilerDirectives.transferToInterpreterAndInvalidate();
            return executeAndSpecialize(xValue_, yValue_);
        }

        private Boolean executeAndSpecialize(Object xValue, Object yValue) {
            int state = state_;
            if (xValue instanceof Boolean) {
                Boolean xValue_ = (Boolean) xValue;
                if (yValue instanceof Boolean) {
                    Boolean yValue_ = (Boolean) yValue;
                    this.state_ = state = state | 0b1 /* add-active and(Boolean, Boolean) */;
                    return and(xValue_, yValue_);
                }
            }
            throw new UnsupportedSpecializationException(this, new Node[] {this.x_, this.y_}, xValue, yValue);
        }

        @Override
        public NodeCost getCost() {
            int state = state_;
            if (state == 0b0) {
                return NodeCost.UNINITIALIZED;
            } else {
                return NodeCost.MONOMORPHIC;
            }
        }

        public static AndOp create(MJExpr x, MJExpr y) {
            return new AndOpNodeGen(x, y);
        }

    }
}

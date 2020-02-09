package org.truffle.cs.mj.nodes;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild(value = "x", type = MJExpr.class)
@NodeChild(value = "y", type = MJExpr.class)
public abstract class MJBinary extends MJExpr {
    public static abstract class AddOp extends MJBinary {
        @Specialization
        public int add(int x, int y) {
            return x + y;
        }
    }

    public static abstract class DiffOp extends MJBinary {
        @Specialization
        public int diff(int x, int y) {
            return x - y;
        }
    }

    public static abstract class DivOp extends MJBinary {
        @Specialization
        public int div(int x, int y) {
            return x / y;
        }
    }

    public static abstract class MulOp extends MJBinary {
        @Specialization
        public int mul(int x, int y) {
            return x * y;

        }
    }

    public static abstract class RemOp extends MJBinary {
        @Specialization
        public int rem(int x, int y) {
            return x % y;
        }
    }

    public static abstract class LeOp extends MJBinary {
        @Specialization
        public Boolean le(int x, int y) {
            return x <= y;
        }
    }

    public static abstract class GeOp extends MJBinary {
        @Specialization
        public Boolean ge(int x, int y) {
            return x >= y;
        }
    }

    public static abstract class LOp extends MJBinary {
        @Specialization
        public Boolean l(int x, int y) {
            return x < y;
        }
    }

    public static abstract class GOp extends MJBinary {
        @Specialization
        public Boolean g(int x, int y) {
            return x > y;
        }
    }

    public static abstract class EqOp extends MJBinary {
        @Specialization
        public Boolean eq(int x, int y) {
            return x == y;
        }
    }

    public static abstract class NeOp extends MJBinary {
        @Specialization
        public Boolean ne(int x, int y) {
            return x != y;
        }
    }

    public static abstract class OrOp extends MJBinary {
        @Specialization
        public Boolean or(Boolean x, Boolean y) {
            return x || y;
        }
    }

    public static abstract class AndOp extends MJBinary {
        @Specialization
        public Boolean and(Boolean x, Boolean y) {
            return x && y;
        }
    }
}
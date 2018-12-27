package com.chen.chapter6;

/**
 * Created by: ccong
 * Date: 18/12/27 下午11:09
 */
public class EnumOperation {
    public enum Operation {
        PLUS("+") {
            int apply(int a, int b) {
                return a+b;
            }
        },
        MINUS("-") {
            int apply(int a, int b) {
                return a-b;
            }
        },
        TIMES("*") {
            int apply(int a, int b) {
                return a*b;
            }
        },
        DIVIDE("/") {
            int apply(int a, int b) {
                return a/b;
            }
        };

        private final String sympol;

        Operation(String sympol) {
            this.sympol = sympol;
        }
        public String toString() {
            return sympol;
        }

        abstract int apply(int a, int b);

        public static Operation inverseOperation(Operation operation) {
            switch (operation) {
                case PLUS:
                    return MINUS;
                case MINUS:
                    return PLUS;
                case TIMES:
                    return DIVIDE;
                case DIVIDE:
                    return TIMES;
                default:
                    return null;
            }
        }

        int applyInverse(int a, int b) {
            switch (this) {
                case DIVIDE:
                    return Operation.TIMES.apply(a,b);
                case TIMES:
                    return Operation.DIVIDE.apply(a,b);
                case MINUS:
                    return Operation.MINUS.apply(a,b);
                case PLUS:
                    return Operation.PLUS.apply(a,b);
                default:
                    return -1;
            }
        }
    }

    public static void main(String args[]) {
        Operation o = Operation.DIVIDE;
        int a=3;
        int b=2;
        System.out.printf("%d %s %d = %d%n",a,o.sympol,b,o.apply(a,b));
        System.out.printf("%d %s %d = %d%n",a,o.sympol,b,o.applyInverse(a,b));
        System.out.printf("%s inverse : %s%n",o.sympol,Operation.inverseOperation(o).sympol);
    }

}

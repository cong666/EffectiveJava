package com.chen.chapter6;

/**
 * Created by: ccong
 * Date: 18/12/28 下午9:13
 */
public class EnumUseInterface {
    public enum BasicOperation implements Operation {
        MINUS("-"){
            public int apply(int a, int b) {
                return a-b;
            }
        },
        PLUS("+"){
            public int apply(int a, int b) {
                return a+b;
            }
        },
        TIMES("*"){
            public int apply(int a, int b) {
                return a*b;
            }
        },
        DIVIDE("/"){
            public int apply(int a, int b) {
                return a/b;
            }
        };
        private final String sympol;

        BasicOperation(String sympol) {
            this.sympol = sympol;
        }
        public String toString() {
            return sympol;
        }
    }

    //extend operation

    public enum ExtendOperation implements Operation {
        REMAINDER("%") {
            public int apply(int a, int b) {
                return a%b;
            }
        };
        private final String sympol;

        ExtendOperation(String sympol) {
            this.sympol = sympol;
        }
        public String toString() {
            return sympol;
        }
    }

    public int test(Operation op) {
        return op.apply(3,2);
    }

    public static void main(String args[]) {
        EnumUseInterface e = new EnumUseInterface();
        System.out.println(e.test(ExtendOperation.REMAINDER));
    }
}

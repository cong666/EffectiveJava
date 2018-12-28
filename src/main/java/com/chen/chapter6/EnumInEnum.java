package com.chen.chapter6;

/**
 * Created by: ccong
 * Date: 18/12/28 下午8:42
 */
public class EnumInEnum {
    public enum LifeOfWeek {
        MONDAY(LifeOfDay.WORK),THESDAY(LifeOfDay.WORK), WEDNESDAY(LifeOfDay.WORK),
        THURSDAY(LifeOfDay.WORK),FRIDAY(LifeOfDay.WORK),
        SATURDAY(LifeOfDay.BREAK),SUNDAY(LifeOfDay.BREAK);

        private LifeOfDay lifeOfDay;

        LifeOfWeek(LifeOfDay lifeOfDay) {
            this.lifeOfDay = lifeOfDay;
        }

        private void go() {
            this.lifeOfDay.action();
        }

        private enum LifeOfDay {
            WORK {
                void action() {
                    System.out.println("work");
                }
            },
            BREAK {
                void action() {
                    System.out.println("break");
                }
            };

            abstract void action();
        }
    }

    public static void main(String args[]) {
        LifeOfWeek lifeOfWeek = LifeOfWeek.MONDAY;
        lifeOfWeek.go();//work
        lifeOfWeek = LifeOfWeek.SATURDAY;
        lifeOfWeek.go();
    }
}

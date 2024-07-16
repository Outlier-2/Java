package cn.l13z.singletonPattern;

public class SingletonPattern {

    class LazySigleton {

        private SingletonPattern instance;

        private LazySigleton() {
            // 私有化构造函数，防止实例化
        }

        public SingletonPattern getInstance() {
            if (instance == null) {
                instance = new SingletonPattern();
            }
            return instance;
        }

    }

    class HungySingletonPattern {
        private HungySingletonPattern instance1 = new HungySingletonPattern();

        private HungySingletonPattern() {
        }

        public HungySingletonPattern getInstance() {
            return instance1;

        }
    }

    class DoubleCheckSingletonPattern {
        private DoubleCheckSingletonPattern instance2;

        private DoubleCheckSingletonPattern() {

        }

        public DoubleCheckSingletonPattern getInstance() {
            if (instance2 == null) {
                synchronized (DoubleCheckSingletonPattern.class) {
                    if (instance2 == null) {
                        instance2 = new DoubleCheckSingletonPattern();
                    }
                }
            }
            return instance2;
        }
    }

    public static void main(String[] args) {

    }
}
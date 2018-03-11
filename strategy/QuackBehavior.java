package QuackBehavior;

interface QuackBehavior {
    public void quack();
}

class Quack implements QuackBehavior {
    public void quack() {
        // 实现鸭子呱呱叫
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        // 橡皮鸭子吱吱叫        
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        // 不会叫
    }
}
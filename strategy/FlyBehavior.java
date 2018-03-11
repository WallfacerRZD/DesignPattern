interface FlyBehavior {
    void fly();
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        // 实现鸭子飞行
    }
}

class FlyNoWay implements FlyBehavior {
    public void fly() {
        // 不会飞
    }
}
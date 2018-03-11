class Duck {
    public Duck() {

    }
    
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flybeBavior) {
        this.flyBehavior = flybeBavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
}

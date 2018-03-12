## 观测者模式

> 定义了对象之间的一对多依赖, 这样一来, 当一个对象改变状态时, 它的所有依赖者都会受到通知并自动更新  

[Subject.java](Subject.java) 主题类使用共同的接口来注册, 移出, 提醒观察者  

[Observer.java](Observer.java) 观察者类实现接口更新自身


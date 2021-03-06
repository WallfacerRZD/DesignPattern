## 单件模式

> 确保一个类只有一个实例, 并提供一个全局访问点  

## 要点
- 单件模式确保程序中一个类最多只有一个实例
- 单件模式也提供访问这个实例的全局点
- 在Java中实现单件模式需要私有的构造器, 一个静态方法和一个静态变量
- 确定在性能和资源上的限制, 然后小心地选择适合的方案来实现单件, 以解决多线程的问题
- 小心, 你如果使用多个类加载器, 双重检查加锁实现会失效
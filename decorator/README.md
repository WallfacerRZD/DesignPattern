## 装饰者模式
> 动态地将责任附加到对象上, 若要扩展功能, 装饰者提供了比继承更有弹性的替代方案  

### 要点
- 继承属于扩展形式之一, 但见得是达到弹性设计的最佳方式
- 在我们的设计中, 应该允许行为可以被扩展, 而无须修改现有的代码
- 组合和委托可用于在运行时动态地加上新的行为
- 装者器模式意味着一群装饰者类, 这些类用来包装具体组件
- 装饰者类反映出装饰的组件类型(事实上, 它们具有相同的类型, 都经过接口或继承实现)
- 装饰者可以在被装饰者的行为前面与/或后面加上自己的行为
- 装饰者会导致设计中出现许多小对象, 如果过度使用, 会让程序变得很复杂

### OO原则
- 对扩展开发, 对修改关闭
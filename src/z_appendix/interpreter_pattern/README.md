### 背景
当需要将一种语言表达式转换成另外一种语言表达式时, 需要用到解释器模式

### 例子
算术运算(+, -, *, /, mod)表达式转换器--将输入的加减乘除表达式转换成算式并得出计算结果
组成:
Calculator
Node(interface)
    1. SymbolNode
        - MulNode
        - ModNode
        - DivNode
        - AddNode
        - MinNode
    2. ValueNode
Client
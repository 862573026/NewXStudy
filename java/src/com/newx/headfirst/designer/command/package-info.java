/**
 * Created by xuzhijian on 2018/2/12 0012.
 * 命令模式
 * 就是方法只有execute,然后写很多的command(以及其涉及的类)，然后invoker调用
 *
 * NoCommand对象是空对象例子 -> 应用:不想返回一个有意义的对象时。
 * 拓展：1.多层次撤销操作 -> 可以用栈存储起来
 *       2.执行多个命令 -> 使用宏命令(MacroCommand)，可用数组等来实现
 *       3.日志请求 -> 持久化，使用store/load，在死机的时候store，恢复的时候load
 */
package com.newx.headfirst.designer.command;
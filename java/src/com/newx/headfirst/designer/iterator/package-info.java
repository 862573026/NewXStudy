/**
 * Created by xuzhijian on 2018/2/22 0022.
 * 迭代器模式
 *  -> 通过一个接口，至少有hasNext和next方法(remove)，对数据类型进行操作，使得外部不必关心内部实现。(外部迭代器)
 *     内部迭代器：遍历等操作写在迭代器内，客户无法控制遍历过程，局限性大。
 *
 *  迭代器对数据的有序无序是否重复没有要求，散列表之类也能用迭代器。
 *
 *    解耦：因为Waitress只需要使用next，不需要知道菜单的内部实现。
 *
 *    高内聚低耦合单一职责等设计原则是写好框架代码的关键，比如Java的API用的时候根本无需知道内部实现
 *    学习Java和android代码无非就是学习设计模式和思路。
 *
 *    for/in ：Java5以后支持在一个集合或者数组中遍历，不需要显示创建迭代器。< for (Object obj:collection)>
 *
 *
 */
package com.newx.headfirst.designer.iterator;
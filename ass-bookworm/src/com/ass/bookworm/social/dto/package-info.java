/**
 * Created by fangyf18371 on 2017/5/4.
 * Data Transfer Object数据传输对象,用于远程调用等需要大量传输对象的地方.
 * 举例：一张表有100个字段，对应po对象的100个属性，但是页面只需用其中个，此时我们无需将整个po对象传递
 * 给页面，只需将需要用到的这10个作为DTO对象传递给前端
 */
package com.ass.bookworm.social.dto;
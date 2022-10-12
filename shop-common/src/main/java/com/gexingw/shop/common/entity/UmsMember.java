package com.gexingw.shop.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: GeXingW
 * @date: 2022/10/11
 * @time: 18:00
 */
@Data
public class UmsMember implements Serializable {

    public Long id;

    public String username;

    public String password;
}

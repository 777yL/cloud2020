package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/7 19:35
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment  implements Serializable {

    private  Long id;
    private  String serial;

}

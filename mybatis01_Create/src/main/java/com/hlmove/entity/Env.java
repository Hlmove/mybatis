package com.hlmove.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 环境存储实体类,包括环境种类(温度,湿度,二氧化碳,光照强度)
 *
 * @author Hlmove
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Env implements Serializable, Cloneable {

    private static final long serialVersionUID = -3945367081306491145L;
    /**
     * 环境种类名称
     */
    private String name;

    /**
     * 发送端id
     */
    private String srcId;

    /**
     * 树莓派系统id
     */
    private String desId;

    /**
     * 实验箱区域模块id(1-8)
     */
    private String devId;

    /**
     * 模块上传感器地址
     */
    private String sensorAddress;

    /**
     * 传感器个数
     */
    private int count;

    /**
     * 发送指令标号 3表示接收数据 16表示发送命令
     */
    private String cmd;

    /**
     * 状态 默认1表示成功
     */
    private int status;

    /**
     * 环境值
     */
    private float data;

    /**
     * 采集时间
     */
    private Timestamp gatherDate;
    @Override
    public String toString() {
        return name+"|"+ srcId + "|"+desId + "|"+devId +
                "|"+sensorAddress + "|"+count + "|"+ cmd + "|"+status + "|"+data + "|"+gatherDate;
    }

    @Override
    public Env clone() {
        try {
            return (Env) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}






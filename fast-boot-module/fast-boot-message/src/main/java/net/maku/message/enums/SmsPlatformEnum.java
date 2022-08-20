package net.maku.message.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 短信平台枚举
 *
 * @author 阿沐 babamu@126.com
 */
@Getter
@AllArgsConstructor
public enum SmsPlatformEnum {
    /**
     * 阿里云
     */
    ALIYUN(0),
    /**
     * 腾讯云
     */
    QCLOUD(1),
    /**
     * 七牛云
     */
    QINIU(2),
    /**
     * 华为云
     */
    HUAWEI(3);

    private final int value;

}

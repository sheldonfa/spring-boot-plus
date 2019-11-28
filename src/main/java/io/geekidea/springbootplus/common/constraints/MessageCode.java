package io.geekidea.springbootplus.common.constraints;

/*
 * 新版错误码，用数字
 */
public enum MessageCode {
    // 状态码
    SUCCESS(200, 200, "成功"),

    //通用异常状态码
    PARAM_REQUIRED(400, 22010001, "缺少必要参数"),
    INVALID_PARAM(400, 22010002, "无效参数"),
    INVALID_SIGNATURE(401, 22010003, "无效签名"),
    VERIFY_FAILED(401, 22010004, "验证失败"),
    OBJECT_NOT_FOUND(404, 22010005, "目标资源不存在"),
    SESSION_EXPIRED(401, 22010006, "会话已失效"),

    //扩展通用异常状态码
    USER_NOT_LOGIN(401, 22010101, "用户未登录"),
    BAD_REQUEST(401, 22010102, "请求不正确"),
    REQUEST_NOT_FOUND(404, 22010103, "请求不存在"),
    OBJECT_DELETE_ERROR(404, 22010104, "目标资源已被删除"),
    INVALID_APPID_ERROR(401, 22010105, "无效的appId"),
    REQUEST_FORBIDDEN_ERROR(403, 22010106, "请求被限制"),
    OBJECT_FORBIDDEN_ERROR(403, 22010107, "目标资源禁止访问"),
    TOO_MUCH_REQUEST(429, 22010108, "请求过于频繁"),
    REQUEST_ENTITY_TOO_LARGE(413, 22010109, "请求体过大"),
    OPERATION_REPEAT_ERROR(409, 22010110, "重复操作"),
    METHOD_NOT_ALLOW(405, 22010111, "不支持的HTTP方法"),
    CONFIG_NOT_FOUND_ERROR(500, 22010112, "缺失配置信息"),
    INVALID_CONFIG_ERROR(500, 22010113, "无效的配置信息"),
    HTTP_CALL_ERROR(503, 22010114, "HTTP请求错误"),
    BODY_REQUIRED(400, 22010115, "缺少Body数据"),
    CONTENT_TYPE_NOT_SUPPORT(406, 22010116, "不支持的Content-Type类型"),
    MISSING_NECESSARY_INFO(500, 22010117, "缺失必要信息"),
    DATA_VALIDATE_FAIL(500, 22010118, "数据校验不通过"),

    //业务自定义异常状态码
    INTERNAL_SERVER_ERROR(500, 22019999, "服务器开小差，请稍后重试"),
    DB_SERVER_ERROR(500, 22011001, "数据库服务异常"),
    REDIS_SERVER_ERROR(500, 22011002, "Redis服务异常"),
    DECRYPT_ERROR(500, 22011002, "爱迪德异常"),
    DECRYPT_DATA_ERROR(500, 22011003, "爱迪德解密数据异常"),
    PAY_SERVICE_ERROR(502, 22011004, "支付中心服务异常"),
    USER_SERVICE_ERROR(502, 22011005, "用户中心服务异常"),
    DATA_SERVICE_ERROR(502, 22011007, "DATA服务异常"),
    BOOT_SERVICE_ERROR(502, 22011008, "BOOT服务异常"),
    NOTIFY_SERVICE_ERROR(502, 22011009, "Notify服务异常"),
    WECHAT_SERVICE_ERROR(502, 22011010, "微信服务异常"),
    CS_SERVICE_ERROR(502, 22011013, "官网cs_event服务异常"),
    SMART_SERVICE_ERROR(502, 22011014, "车联平台服务异常"),
    MSG_CENTER_SERVICE_ERROR(502, 22011015, "消息中心服务异常"),
    // ORS异常状态码
    ORS_SERVICE_ERROR(502, 22011012, "ORS服务异常"),
    ORS_DATA_VALIDATE_FAIL(500, 22011011, "ORS重要数据校验不通过"),

    // ORS自定义正常状态码
    ORS_STATE_2000(200, 2000, "data参数不允许为空"),
    ORS_STATE_2100(200, 2100, "用户编码【uid】不允许为空"),
    ORS_STATE_2101(200, 2101, "订单来源编码【src_mapping_code】不允许为空"),
    ORS_STATE_2102(200, 2102, "预定方式编码【reserve_way_code】不允许为空"),
    ORS_STATE_2103(200, 2103, "联系人姓名【contact_name】不允许为空"),
    ORS_STATE_2104(200, 2104, "联系人电话【contact_phone】不允许为空"),
    ORS_STATE_2105(200, 2105, "门店【门店编码】不存在"),
    ORS_STATE_2106(200, 2106, "省份【省份编码】不存在"),
    ORS_STATE_2107(200, 2107, "城市【城市编码】不存在"),
    ORS_STATE_2108(200, 2108, "预定方式【预定方式编码】不存在"),
    ORS_STATE_2110(200, 2110, "订单来源编码不存在，无法创建订单"),
    ORS_STATE_2120(200, 2120, "配置单ID【configuration_id】不允许为空"),
    ORS_STATE_2121(200, 2121, "配置单【配置单ID】不存在"),
    ORS_STATE_2122(200, 2122, "配置单已被其它订单引用"),
    ORS_STATE_2123(200, 2123, "无效的配置单，配置单的整车编码为空"),
    ORS_STATE_2124(200, 2124, "不允许跨车系修改配置单"),
    ORS_STATE_2125(200, 2125, "不允许重复修改配置单"),
    ORS_STATE_2130(200, 2130, "整车信息【整车编码】不存在"),
    ORS_STATE_2131(200, 2131, "整车【整车编码】库存不足"),
    ORS_STATE_2132(200, 2132, "备件【备件编码】库存不足"),
    ORS_STATE_2201(200, 2201, "整车编码【car_info_codes】不允许为空"),
    ORS_STATE_3000(200, 3000, "data参数不允许为空"),
    ORS_STATE_3001(200, 3001, "参数值有问题"),
    ORS_STATE_3002(200, 3002, "重复提交相同数据提醒"),
    ORS_STATE_3003(200, 3003, "订单创建失败"),
    ORS_STATE_3101(200, 3101, "配置单编码【configuration_id】不允许为空"),
    ORS_STATE_3102(200, 3102, "UID不允许为空"),
    ORS_STATE_3201(200, 3201, "UID不允许为空"),
    ORS_STATE_3202(200, 3202, "整车编码【car_codes】不允许为空"),
    ORS_STATE_3203(200, 3203, "整车【整车编码】不存在"),
    ORS_STATE_3301(200, 3301, "订单不存在"),
    ORS_STATE_3302(200, 3302, "当前订单状态的订单不允许修改配置单"),
    ORS_STATE_3310(200, 3310, "订单号不允许为空"),
    // admin
    LOGIN_REDIRECT(200, 302, "登录重定向"),
    ACCESS_DENIED(200, 4001006, "无权访问"),
    PLATFORM_ACCESS_DENIED(200, 4001009, "没有平台权限"),
    ;

    /**
     * Http响应状态码
     */
    private Integer httpStatusCode;
    /**
     * 返回信息描述
     */
    private String msg;
    /**
     * 返回码
     */
    private Integer code;


    MessageCode(Integer httpStatusCode, Integer code, String msg) {
        this.httpStatusCode = httpStatusCode;
        this.msg = msg;
        this.code = code;
    }

    public String msg() {
        return msg;
    }

    public Integer code() {
        return code;
    }

    public Integer httpStatusCode() {
        return httpStatusCode;
    }
}

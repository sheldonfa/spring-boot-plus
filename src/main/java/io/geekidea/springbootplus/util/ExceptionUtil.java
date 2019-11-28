package io.geekidea.springbootplus.util;

import io.geekidea.springbootplus.common.constraints.MessageCode;

/**
 * @author muyan.hwh
 * @date 2019-09-04
 */
public class ExceptionUtil {
    /**
     * 缺失必要参数异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException paramRequired(String msg) {
        return new BusinessException(MessageCode.PARAM_REQUIRED, msg);
    }

    /**
     * 无效的参数异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException invalidParam(String msg) {
        return new BusinessException(MessageCode.INVALID_PARAM, msg);
    }

    /**
     * 无效的签名异常
     *
     * @param
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException invalidSignature(String msg) {
        return new BusinessException(MessageCode.INVALID_SIGNATURE, msg);
    }

    /**
     * 验证失败异常
     *
     * @param
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException verifyFailed() {
        return new BusinessException(MessageCode.VERIFY_FAILED);
    }

    /**
     * 请求未找到异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException requestNotFound(String msg) {
        return new BusinessException(MessageCode.REQUEST_NOT_FOUND, msg);
    }

    /**
     * 目标对象未找到异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException objectNotFound(String msg) {
        return new BusinessException(MessageCode.OBJECT_NOT_FOUND, msg);
    }

    /**
     * 目标对象已删除异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException objectDelete(String msg) {
        return new BusinessException(MessageCode.OBJECT_DELETE_ERROR, msg);
    }

    /**
     * 会话超时异常
     *
     * @param
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException sessionExpired() {
        return new BusinessException(MessageCode.SESSION_EXPIRED);
    }

    /**
     * 用户未登录异常
     *
     * @param
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException userNotLogin() {
        return new BusinessException(MessageCode.USER_NOT_LOGIN);
    }

    /**
     * 不正确的请求异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException badRequest(String msg) {
        return new BusinessException(MessageCode.BAD_REQUEST, msg);
    }

    /**
     * appid无效异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException invalidAppId(String msg) {
        return new BusinessException(MessageCode.INVALID_APPID_ERROR, msg);
    }

    /**
     * 请求被禁止异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException requestForbidden(String msg) {
        return new BusinessException(MessageCode.REQUEST_FORBIDDEN_ERROR, msg);
    }

    /**
     * 目标对象禁止访问异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException objectForbidden(String msg) {
        return new BusinessException(MessageCode.OBJECT_FORBIDDEN_ERROR, msg);
    }

    /**
     * 请求过于频繁异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException tooMuchRequest(String msg) {
        return new BusinessException(MessageCode.TOO_MUCH_REQUEST, msg);
    }

    /**
     * 请求体过大异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException requestEntityTooLarge(String msg) {
        return new BusinessException(MessageCode.REQUEST_ENTITY_TOO_LARGE, msg);
    }

    /**
     * 重复操作异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException operationRepeatError(String msg) {
        return new BusinessException(MessageCode.OPERATION_REPEAT_ERROR, msg);
    }

    /**
     * 不支持的HTTP方法异常
     *
     * @param
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException methodNotAllow() {
        return new BusinessException(MessageCode.METHOD_NOT_ALLOW);
    }

    /**
     * 配置信息缺失异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException configNotFound(String msg) {
        return new BusinessException(MessageCode.CONFIG_NOT_FOUND_ERROR, msg);
    }

    /**
     * 配置信息无效异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException invalidConfig(String msg) {
        return new BusinessException(MessageCode.INVALID_CONFIG_ERROR, msg);
    }

    /**
     * HTTP调用异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException httpCallError(String msg) {
        return new BusinessException(MessageCode.HTTP_CALL_ERROR, msg);
    }

    /**
     * 服务器未知错误
     *
     * @param
     * @return void
     * @author muyan.hwh
     * @date 2019-09-04
     */
    public static BusinessException internalError() {
        return new BusinessException(MessageCode.INTERNAL_SERVER_ERROR);
    }

    /**
     * 数据库异常
     *
     * @param
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException dbError() {
        return new BusinessException(MessageCode.DB_SERVER_ERROR);
    }

    /**
     * 数据库异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException dbError(String msg) {
        return new BusinessException(MessageCode.DB_SERVER_ERROR, msg);
    }

    /**
     * Redis服务异常
     *
     * @param
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException redisError() {
        return new BusinessException(MessageCode.REDIS_SERVER_ERROR);
    }

    /**
     * Redis服务异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException redisError(String msg) {
        return new BusinessException(MessageCode.REDIS_SERVER_ERROR, msg);
    }

    /**
     * 支付中心服务异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-04
     */
    public static BusinessException payServiceError(String msg) {
        return new BusinessException(MessageCode.PAY_SERVICE_ERROR, msg);
    }

    /**
     * Seagull Data服务异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-23
     */
    public static BusinessException dataServiceError(String msg) {
        return new BusinessException(MessageCode.DATA_SERVICE_ERROR, msg);
    }

    /**
     * xp_cs_event 服务异常
     *
     * @param msg
     * @return void
     * @author fangx
     * @date 2019-11-08
     */
    public static BusinessException csServiceError(String msg) {
        return new BusinessException(MessageCode.CS_SERVICE_ERROR, msg);
    }

    /**
     * 用户中心服务异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException userServiceError(String msg) {
        return new BusinessException(MessageCode.USER_SERVICE_ERROR, msg);
    }

    /**
     * ORS服务异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException orsServiceError(String msg) {
        return new BusinessException(MessageCode.ORS_SERVICE_ERROR, msg);
    }

    /**
     * BOOT服务异常
     *
     * @param msg
     * @return void
     * @author fangx
     * @date 2019-09-10
     */
    public static BusinessException bootServiceError(String msg) {
        return new BusinessException(MessageCode.BOOT_SERVICE_ERROR, msg);
    }


    /**
     * 加解密服务异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException decryptError(String msg) {
        return new BusinessException(MessageCode.DECRYPT_ERROR, msg);
    }

    /**
     * 数据解密异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-10
     */
    public static BusinessException decryptDataError(String msg) {
        return new BusinessException(MessageCode.DECRYPT_DATA_ERROR, msg);
    }

    /**
     * 缺失必要信息异常
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-18
     */
    public static BusinessException missingNecessaryInfo(String msg) {
        return new BusinessException(MessageCode.MISSING_NECESSARY_INFO, msg);
    }

    /***
     * 通知服务异常
     *
     * @author muyan.hwh
     * @date 2019-09-27
     * @param msg
     * @return void
     */
    public static BusinessException notifyServiceError(String msg) {
        return new BusinessException(MessageCode.NOTIFY_SERVICE_ERROR, msg);
    }

    /**
     * 数据校验不通过
     *
     * @param msg
     * @return void
     * @author muyan.hwh
     * @date 2019-09-18
     */
    public static BusinessException dataValidateFail(String msg) {
        return new BusinessException(MessageCode.DATA_VALIDATE_FAIL, msg);
    }

    /**
     * ORS数据校验不通过
     *
     * @param msg
     * @return void
     * @author fangx
     * @date 2019-09-18
     */
    public static BusinessException orsDataValidateFail(String msg) {
        return new BusinessException(MessageCode.ORS_DATA_VALIDATE_FAIL, msg);
    }

    /***
     * 微信服务异常
     *
     * @author muyan.hwh
     * @date 2019-10-12
     * @param msg 异常信息
     * @return void
     */
    public static BusinessException wechatServiceError(String msg) {
        return new BusinessException(MessageCode.WECHAT_SERVICE_ERROR, msg);
    }

    /**
     * 库存不足
     */
    public static BusinessException businessException(MessageCode code) {
        return new BusinessException(code);
    }

    /**
     * 车联平台
     */
    public static BusinessException smartException(String msg) {
        return new BusinessException(MessageCode.SMART_SERVICE_ERROR, msg);
    }

    /**
     * 消息中心服务异常
     *
     * @param msg 异常信息
     * @return com.xiaopeng.xpseagull.boot.exception.BusinessException
     * @author muyan.hwh
     * @date 2019-11-19
     */
    public static BusinessException msgCenterServiceError(String msg) {
        return new BusinessException(MessageCode.MSG_CENTER_SERVICE_ERROR, msg);
    }
}

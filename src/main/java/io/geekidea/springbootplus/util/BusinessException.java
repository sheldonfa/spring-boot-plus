package io.geekidea.springbootplus.util;

import io.geekidea.springbootplus.common.constraints.MessageCode;
import org.apache.commons.lang3.StringUtils;

@SuppressWarnings("serial")
public class BusinessException extends RuntimeException {
    /*
     * 错误信息
     */
    private String message;
    /*
     * 错误码
     */
    private MessageCode msgCode;
    /*
     * 详细错误信息
     */
    private String detailMessage;

    public BusinessException(MessageCode msgCode) {
        this.msgCode = msgCode;
        this.message = msgCode.msg();
        this.detailMessage = this.message;
    }

    public BusinessException(MessageCode msgCode, String msg) {
        this.msgCode = msgCode;
        this.message = msgCode.msg();
        this.detailMessage = this.message;
        if (!StringUtils.isBlank(msg)) {
            this.message = String.format("%s[%s]", this.message, msg);
            this.detailMessage = this.message;
        }
    }

    public BusinessException(MessageCode msgCode, String msg, boolean replaceMsgEnum) {
        if (replaceMsgEnum) {
            this.msgCode = msgCode;
            this.message = msgCode.msg();
            this.detailMessage = this.message;
            if (!StringUtils.isBlank(msg)) {
                this.message = String.format("%s", msg);
                this.detailMessage = this.message;
            }
        } else {
            this.msgCode = msgCode;
            this.message = msgCode.msg();
            this.detailMessage = this.message;
            if (!StringUtils.isBlank(msg)) {
                this.message = String.format("%s[%s]", this.message, msg);
                this.detailMessage = this.message;
            }
        }
    }

    public BusinessException(MessageCode msgCode, String msg, String detailMsg) {
        this.msgCode = msgCode;
        this.message = msgCode.msg();
        this.detailMessage = this.message;
        if (!StringUtils.isBlank(msg)) {
            this.message = String.format("%s[%s]", this.message, msg);
            this.detailMessage = this.message;
        }
        if (!StringUtils.isBlank(detailMsg)) {
            this.detailMessage = String.format("%s[%s]", this.detailMessage, detailMsg);
        }
    }

    public BusinessException(MessageCode msgCode, Throwable cause) {
        super(cause);
        this.msgCode = msgCode;
        this.message = msgCode.msg();
        this.detailMessage = this.message;
    }

    public BusinessException(MessageCode msgCode, String msg, Throwable cause) {
        super(cause);
        this.msgCode = msgCode;
        this.message = msgCode.msg();
        this.detailMessage = this.message;
        if (!StringUtils.isBlank(msg)) {
            this.message = String.format("%s[%s]", this.message, msg);
            this.detailMessage = this.message;
        }
    }

    public BusinessException(MessageCode msgCode, String msg, String detailMsg, Throwable cause) {
        super(cause);
        this.msgCode = msgCode;
        this.message = msgCode.msg();
        this.detailMessage = this.message;
        if (!StringUtils.isBlank(msg)) {
            this.message = String.format("%s[%s]", this.message, msg);
            this.detailMessage = this.message;
        }
        if (!StringUtils.isBlank(detailMsg)) {
            this.detailMessage = String.format("%s[%s]", this.detailMessage, detailMsg);
        }
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public MessageCode getMessageCode() {
        return this.msgCode;
    }

    public String getDetailMessage() {
        return this.detailMessage;
    }
}

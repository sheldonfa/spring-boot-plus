package io.geekidea.springbootplus.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 基类 Base
 */
public class CommonUtils {

    /**
     * URL编码
     *
     * @param url
     * @return
     */
    public static String urlEncode(String url) {
        try {
            return URLEncoder.encode(url, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw ExceptionUtil.invalidParam("url 编码不正确");
        }
    }

    /**
     * URL解码
     *
     * @param url
     * @return
     */
    public static String urlDecode(String url) {
        try {
            return URLDecoder.decode(url, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw ExceptionUtil.invalidParam("url 编码不正确");
        }
    }

    /**
     * @return 当前日期
     */
    public static Date getDate() {
        return new Date();
    }

    /**
     * @return 精确到分钟的当前日期
     */
    public static Date getMinuteDate() {
        return DateUtils.addMinutes(DateUtils.setSeconds(DateUtils.setMilliseconds(getDate(), 0), 0), 1);
    }

    public static Date parseDate(String dateStr, String patterns) {
        Date date = null;
        try {
            date = DateUtils.parseDate(dateStr, patterns);
        } catch (ParseException e) {
        }
        return date;
    }

    /**
     * @param var
     * @return 是否为非空
     */
    public static boolean notEmpty(String var) {
        return StringUtils.isNotBlank(var);
    }

    /**
     * @param var
     * @return 是否为空
     */
    public static boolean empty(String var) {
        return StringUtils.isBlank(var);
    }

    /**
     * @param var
     * @return 是否非空
     */
    public static boolean notEmpty(Number var) {
        return null != var;
    }

    /**
     * @param var
     * @return 是否为空
     */
    public static boolean empty(Number var) {
        return null == var;
    }

    /**
     * @param var
     * @return 是否非空
     */
    public static boolean notEmpty(List<?> var) {
        return null != var && !var.isEmpty();
    }

    /**
     * @param var
     * @return 是否非空
     */
    public static boolean notEmpty(Set<?> var) {
        return null != var && !var.isEmpty();
    }

    /**
     * @param var
     * @return 是否为空
     */
    public static boolean empty(List<?> var) {
        return null == var || var.isEmpty();
    }

    /**
     * @param var
     * @return 是否非空
     */
    public static boolean empty(Set<?> var) {
        return null == var || var.isEmpty();
    }

    /**
     * @param var
     * @return 是否非空
     */
    public static boolean notEmpty(Map<?, ?> var) {
        return null != var && !var.isEmpty();
    }

    /**
     * @param var
     * @return 是否为空
     */
    public static boolean empty(Map<?, ?> var) {
        return null == var || var.isEmpty();
    }

    /**
     * @param file
     * @return 是否非空
     */
    public static boolean notEmpty(File file) {
        return null != file && file.exists();
    }

    /**
     * @param file
     * @return 是否为空
     */
    public static boolean empty(File file) {
        return null == file || !file.exists();
    }

    /**
     * @param var
     * @return 是否非空
     */
    public static boolean notEmpty(Object[] var) {
        return null != var && 0 < var.length;
    }

    /**
     * @param var
     * @return 是否为空
     */
    public static boolean empty(Object[] var) {
        return null == var || 0 == var.length;
    }

    /**
     * 金额分转换为元，四舍五入保留两位小数
     *
     * @param amount
     * @return
     */
    public static String fen2YuanStr(Integer amount) {
        String yuan = null;
        try {
            BigDecimal yuanBd = BigDecimal.valueOf(amount).divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP);
            yuan = yuanBd.toString();
        } catch (Exception e) {
            throw ExceptionUtil.invalidParam("金额转换失败");
        }
        return yuan;
    }

    /**
     * 金额元转换为分，四舍五入取整
     *
     * @param amount
     * @return
     */
    public static Integer yuan2FenInt(String amount) {
        Integer fen = null;
        try {
            BigDecimal fenBd = new BigDecimal(amount).multiply(new BigDecimal(100));
            fenBd = fenBd.setScale(0, BigDecimal.ROUND_HALF_UP);
            fen = fenBd.intValue();
        } catch (Exception e) {
            throw ExceptionUtil.invalidParam("金额转换失败");
        }
        return fen;
    }

}

package io.geekidea.springbootplus.common.param;

import lombok.Data;

import java.util.List;

/**
 * @author fangx
 * @date 2019-10-08
 */
@Data
public class Page<T> {
    private Long current;
    private Long total;
    private List<T> records;
}

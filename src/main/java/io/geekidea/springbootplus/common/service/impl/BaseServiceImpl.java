/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.geekidea.springbootplus.common.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.geekidea.springbootplus.common.param.OrderQueryParam;
import io.geekidea.springbootplus.common.param.QueryParam;
import io.geekidea.springbootplus.common.service.BaseService;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author geekidea
 * @date 2018-11-08
 */
public abstract class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {

    protected Page<T> setPageParam(QueryParam queryParam) {
        return setPageParam(queryParam, null);
    }

    protected Page<T> setPageParam(QueryParam queryParam, OrderItem defaultOrder) {
        Page<T> page = new Page<>();
        // 设置当前页码
        page.setCurrent(queryParam.getCurrent());
        // 设置页大小
        page.setSize(queryParam.getSize());
        /**
         * 如果是queryParam是OrderQueryParam，并且不为空，则使用前端排序
         * 否则使用默认排序
         */
        if (queryParam instanceof OrderQueryParam) {
            OrderQueryParam orderQueryParam = (OrderQueryParam) queryParam;
            List<OrderItem> orderItems = orderQueryParam.getOrders();
            if (CollectionUtils.isEmpty(orderItems) && Objects.nonNull(defaultOrder)) {
                page.setOrders(Collections.singletonList(defaultOrder));
            } else {
                page.setOrders(orderItems);
            }
        } else {
            page.setOrders(Collections.singletonList(defaultOrder));
        }

        return page;
    }

}

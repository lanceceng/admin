package com.cat.admin.core.api;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 *  <p> 基类 </p>
 *
 * @description:
 * @author: cat
 * @date: 2020/06/06
 */
@RestController
@Slf4j
public class BaseController {

    public Logger LOG = LoggerFactory.getLogger(getClass());

}

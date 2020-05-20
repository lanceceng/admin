package com.cat.admin.core.annotation;

import com.cat.admin.core.enums.DataSourceEnum;
import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

    DataSourceEnum value() default DataSourceEnum.DB1;
}

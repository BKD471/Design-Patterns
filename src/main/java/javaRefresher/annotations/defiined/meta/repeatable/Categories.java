package javaRefresher.annotations.defiined.meta.repeatable;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//container of category
@Retention(RetentionPolicy.RUNTIME)
public @interface Categories {
    Category[] value();
}

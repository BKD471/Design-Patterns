package javaRefresher.annotations.defiined.meta.repeatable;

import java.lang.annotation.*;


@Repeatable(Categories.class)
public @interface Category {
    String name() default "animal";
}

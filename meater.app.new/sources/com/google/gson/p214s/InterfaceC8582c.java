package com.google.gson.p214s;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: SerializedName.java */
@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.google.gson.s.c */
/* loaded from: classes.dex */
public @interface InterfaceC8582c {
    String[] alternate() default {};

    String value();
}

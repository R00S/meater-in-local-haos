package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JsonTypeInfo {

    /* renamed from: com.fasterxml.jackson.annotation.JsonTypeInfo$As */
    public enum EnumC5961As {
        PROPERTY,
        WRAPPER_OBJECT,
        WRAPPER_ARRAY,
        EXTERNAL_PROPERTY,
        EXISTING_PROPERTY
    }

    /* renamed from: com.fasterxml.jackson.annotation.JsonTypeInfo$Id */
    public enum EnumC5962Id {
        NONE(null),
        CLASS("@class"),
        MINIMAL_CLASS("@c"),
        NAME("@type"),
        CUSTOM(null);

        private final String _defaultPropertyName;

        EnumC5962Id(String str) {
            this._defaultPropertyName = str;
        }

        public String getDefaultPropertyName() {
            return this._defaultPropertyName;
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public static abstract class None {
    }

    Class<?> defaultImpl() default JsonTypeInfo.class;

    EnumC5961As include() default EnumC5961As.PROPERTY;

    String property() default "";

    EnumC5962Id use();

    boolean visible() default false;
}

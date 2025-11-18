package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JsonAutoDetect {

    /* renamed from: com.fasterxml.jackson.annotation.JsonAutoDetect$1 */
    static /* synthetic */ class C59601 {

        /* renamed from: $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility */
        static final /* synthetic */ int[] f15605x23d16a11;

        static {
            int[] iArr = new int[Visibility.values().length];
            f15605x23d16a11 = iArr;
            try {
                iArr[Visibility.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15605x23d16a11[Visibility.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15605x23d16a11[Visibility.NON_PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15605x23d16a11[Visibility.PROTECTED_AND_PUBLIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15605x23d16a11[Visibility.PUBLIC_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum Visibility {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        public boolean isVisible(Member member) {
            int i2 = C59601.f15605x23d16a11[ordinal()];
            if (i2 == 1) {
                return true;
            }
            if (i2 == 3) {
                return !Modifier.isPrivate(member.getModifiers());
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    return false;
                }
            } else if (Modifier.isProtected(member.getModifiers())) {
                return true;
            }
            return Modifier.isPublic(member.getModifiers());
        }
    }

    Visibility creatorVisibility() default Visibility.DEFAULT;

    Visibility fieldVisibility() default Visibility.DEFAULT;

    Visibility getterVisibility() default Visibility.DEFAULT;

    Visibility isGetterVisibility() default Visibility.DEFAULT;

    Visibility setterVisibility() default Visibility.DEFAULT;
}

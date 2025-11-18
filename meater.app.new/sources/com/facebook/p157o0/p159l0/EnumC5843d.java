package com.facebook.p157o0.p159l0;

import java.util.Arrays;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: AppEventsConversionsAPITransformer.kt */
/* renamed from: com.facebook.o0.l0.d */
/* loaded from: classes.dex */
public enum EnumC5843d {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;


    /* renamed from: f */
    public static final a f14998f = new a(null);

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    /* renamed from: com.facebook.o0.l0.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final EnumC5843d m12304a(String str) {
            C9801m.m32346f(str, "rawValue");
            return C9801m.m32341a(str, "MOBILE_APP_INSTALL") ? EnumC5843d.MOBILE_APP_INSTALL : C9801m.m32341a(str, "CUSTOM_APP_EVENTS") ? EnumC5843d.CUSTOM : EnumC5843d.OTHER;
        }
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5843d[] valuesCustom() {
        EnumC5843d[] enumC5843dArrValuesCustom = values();
        return (EnumC5843d[]) Arrays.copyOf(enumC5843dArrValuesCustom, enumC5843dArrValuesCustom.length);
    }
}

package com.facebook.login;

import java.util.Arrays;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: LoginTargetApp.kt */
/* renamed from: com.facebook.login.z */
/* loaded from: classes2.dex */
public enum EnumC5806z {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");


    /* renamed from: f */
    public static final a f14878f = new a(null);

    /* renamed from: j */
    private final String f14882j;

    /* compiled from: LoginTargetApp.kt */
    /* renamed from: com.facebook.login.z$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final EnumC5806z m12132a(String str) {
            EnumC5806z[] enumC5806zArrValuesCustom = EnumC5806z.valuesCustom();
            int length = enumC5806zArrValuesCustom.length;
            int i2 = 0;
            while (i2 < length) {
                EnumC5806z enumC5806z = enumC5806zArrValuesCustom[i2];
                i2++;
                if (C9801m.m32341a(enumC5806z.toString(), str)) {
                    return enumC5806z;
                }
            }
            return EnumC5806z.FACEBOOK;
        }
    }

    EnumC5806z(String str) {
        this.f14882j = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5806z[] valuesCustom() {
        EnumC5806z[] enumC5806zArrValuesCustom = values();
        return (EnumC5806z[]) Arrays.copyOf(enumC5806zArrValuesCustom, enumC5806zArrValuesCustom.length);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f14882j;
    }
}

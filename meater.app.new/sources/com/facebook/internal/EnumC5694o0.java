package com.facebook.internal;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: SmartLoginOption.kt */
/* renamed from: com.facebook.internal.o0 */
/* loaded from: classes2.dex */
public enum EnumC5694o0 {
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* renamed from: f */
    public static final a f14470f = new a(null);

    /* renamed from: g */
    private static final EnumSet<EnumC5694o0> f14471g;

    /* renamed from: l */
    private final long f14476l;

    /* compiled from: SmartLoginOption.kt */
    /* renamed from: com.facebook.internal.o0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final EnumSet<EnumC5694o0> m11524a(long j2) {
            EnumSet<EnumC5694o0> enumSetNoneOf = EnumSet.noneOf(EnumC5694o0.class);
            Iterator it = EnumC5694o0.f14471g.iterator();
            while (it.hasNext()) {
                EnumC5694o0 enumC5694o0 = (EnumC5694o0) it.next();
                if ((enumC5694o0.m11523q() & j2) != 0) {
                    enumSetNoneOf.add(enumC5694o0);
                }
            }
            C9801m.m32345e(enumSetNoneOf, "result");
            return enumSetNoneOf;
        }
    }

    static {
        EnumSet<EnumC5694o0> enumSetAllOf = EnumSet.allOf(EnumC5694o0.class);
        C9801m.m32345e(enumSetAllOf, "allOf(SmartLoginOption::class.java)");
        f14471g = enumSetAllOf;
    }

    EnumC5694o0(long j2) {
        this.f14476l = j2;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC5694o0[] valuesCustom() {
        EnumC5694o0[] enumC5694o0ArrValuesCustom = values();
        return (EnumC5694o0[]) Arrays.copyOf(enumC5694o0ArrValuesCustom, enumC5694o0ArrValuesCustom.length);
    }

    /* renamed from: q */
    public final long m11523q() {
        return this.f14476l;
    }
}

package com.facebook.p157o0.p163o0;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
/* renamed from: com.facebook.o0.o0.l */
/* loaded from: classes2.dex */
public final class C5889l {

    /* renamed from: b */
    private static C5889l f15326b;

    /* renamed from: d */
    private final Class<?> f15328d;

    /* renamed from: e */
    private final Class<?> f15329e;

    /* renamed from: f */
    private final Method f15330f;

    /* renamed from: g */
    private final Method f15331g;

    /* renamed from: h */
    private final Method f15332h;

    /* renamed from: i */
    private final Method f15333i;

    /* renamed from: a */
    public static final a f15325a = new a(null);

    /* renamed from: c */
    private static final AtomicBoolean f15327c = new AtomicBoolean(false);

    /* compiled from: InAppPurchaseSkuDetailsWrapper.kt */
    /* renamed from: com.facebook.o0.o0.l$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        private final void m12572a() {
            C5890m c5890m = C5890m.f15334a;
            Class<?> clsM12574a = C5890m.m12574a("com.android.billingclient.api.SkuDetailsParams");
            Class<?> clsM12574a2 = C5890m.m12574a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (clsM12574a == null || clsM12574a2 == null) {
                return;
            }
            Method methodM12577d = C5890m.m12577d(clsM12574a, "newBuilder", new Class[0]);
            Method methodM12577d2 = C5890m.m12577d(clsM12574a2, "setType", String.class);
            Method methodM12577d3 = C5890m.m12577d(clsM12574a2, "setSkusList", List.class);
            Method methodM12577d4 = C5890m.m12577d(clsM12574a2, "build", new Class[0]);
            if (methodM12577d == null || methodM12577d2 == null || methodM12577d3 == null || methodM12577d4 == null) {
                return;
            }
            C5889l.f15326b = new C5889l(clsM12574a, clsM12574a2, methodM12577d, methodM12577d2, methodM12577d3, methodM12577d4);
        }

        /* renamed from: b */
        public final C5889l m12573b() {
            if (C5889l.f15327c.get()) {
                return C5889l.f15326b;
            }
            m12572a();
            C5889l.f15327c.set(true);
            return C5889l.f15326b;
        }
    }

    public C5889l(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        C9801m.m32346f(cls, "skuDetailsParamsClazz");
        C9801m.m32346f(cls2, "builderClazz");
        C9801m.m32346f(method, "newBuilderMethod");
        C9801m.m32346f(method2, "setTypeMethod");
        C9801m.m32346f(method3, "setSkusListMethod");
        C9801m.m32346f(method4, "buildMethod");
        this.f15328d = cls;
        this.f15329e = cls2;
        this.f15330f = method;
        this.f15331g = method2;
        this.f15332h = method3;
        this.f15333i = method4;
    }

    /* renamed from: d */
    public final Object m12570d(String str, List<String> list) {
        Object objM12578e;
        Object objM12578e2;
        C5890m c5890m = C5890m.f15334a;
        Object objM12578e3 = C5890m.m12578e(this.f15328d, this.f15330f, null, new Object[0]);
        if (objM12578e3 == null || (objM12578e = C5890m.m12578e(this.f15329e, this.f15331g, objM12578e3, str)) == null || (objM12578e2 = C5890m.m12578e(this.f15329e, this.f15332h, objM12578e, list)) == null) {
            return null;
        }
        return C5890m.m12578e(this.f15329e, this.f15333i, objM12578e2, new Object[0]);
    }

    /* renamed from: e */
    public final Class<?> m12571e() {
        return this.f15328d;
    }
}

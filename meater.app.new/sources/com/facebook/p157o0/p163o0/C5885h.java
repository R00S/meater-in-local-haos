package com.facebook.p157o0.p163o0;

import android.content.Context;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InAppPurchaseBillingClientWrapper.kt */
/* renamed from: com.facebook.o0.o0.h */
/* loaded from: classes2.dex */
public final class C5885h {

    /* renamed from: c */
    private static C5885h f15287c;

    /* renamed from: g */
    private final Context f15291g;

    /* renamed from: h */
    private final Object f15292h;

    /* renamed from: i */
    private final Class<?> f15293i;

    /* renamed from: j */
    private final Class<?> f15294j;

    /* renamed from: k */
    private final Class<?> f15295k;

    /* renamed from: l */
    private final Class<?> f15296l;

    /* renamed from: m */
    private final Class<?> f15297m;

    /* renamed from: n */
    private final Class<?> f15298n;

    /* renamed from: o */
    private final Class<?> f15299o;

    /* renamed from: p */
    private final Method f15300p;

    /* renamed from: q */
    private final Method f15301q;

    /* renamed from: r */
    private final Method f15302r;

    /* renamed from: s */
    private final Method f15303s;

    /* renamed from: t */
    private final Method f15304t;

    /* renamed from: u */
    private final Method f15305u;

    /* renamed from: v */
    private final Method f15306v;

    /* renamed from: w */
    private final C5889l f15307w;

    /* renamed from: x */
    private final Set<String> f15308x;

    /* renamed from: a */
    public static final b f15285a = new b(null);

    /* renamed from: b */
    private static final AtomicBoolean f15286b = new AtomicBoolean(false);

    /* renamed from: d */
    private static final AtomicBoolean f15288d = new AtomicBoolean(false);

    /* renamed from: e */
    private static final Map<String, JSONObject> f15289e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final Map<String, JSONObject> f15290f = new ConcurrentHashMap();

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* renamed from: com.facebook.o0.o0.h$a */
    public static final class a implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            C9801m.m32346f(obj, "proxy");
            C9801m.m32346f(method, "m");
            if (C9801m.m32341a(method.getName(), "onBillingSetupFinished")) {
                C5885h.f15285a.m12537f().set(true);
            } else {
                String name = method.getName();
                C9801m.m32345e(name, "m.name");
                if (C10546u.m37514p(name, "onBillingServiceDisconnected", false, 2, null)) {
                    C5885h.f15285a.m12537f().set(false);
                }
            }
            return null;
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* renamed from: com.facebook.o0.o0.h$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        private final Object m12532a(Context context, Class<?> cls) {
            Object objM12578e;
            Object objM12578e2;
            Object objM12578e3;
            C5890m c5890m = C5890m.f15334a;
            Class<?> clsM12574a = C5890m.m12574a("com.android.billingclient.api.BillingClient$Builder");
            Class<?> clsM12574a2 = C5890m.m12574a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (clsM12574a == null || clsM12574a2 == null) {
                return null;
            }
            Method methodM12577d = C5890m.m12577d(cls, "newBuilder", Context.class);
            Method methodM12577d2 = C5890m.m12577d(clsM12574a, "enablePendingPurchases", new Class[0]);
            Method methodM12577d3 = C5890m.m12577d(clsM12574a, "setListener", clsM12574a2);
            Method methodM12577d4 = C5890m.m12577d(clsM12574a, "build", new Class[0]);
            if (methodM12577d == null || methodM12577d2 == null || methodM12577d3 == null || methodM12577d4 == null || (objM12578e = C5890m.m12578e(cls, methodM12577d, null, context)) == null || (objM12578e2 = C5890m.m12578e(clsM12574a, methodM12577d3, objM12578e, Proxy.newProxyInstance(clsM12574a2.getClassLoader(), new Class[]{clsM12574a2}, new d()))) == null || (objM12578e3 = C5890m.m12578e(clsM12574a, methodM12577d2, objM12578e2, new Object[0])) == null) {
                return null;
            }
            return C5890m.m12578e(clsM12574a, methodM12577d4, objM12578e3, new Object[0]);
        }

        /* renamed from: b */
        private final void m12533b(Context context) {
            C5889l c5889lM12573b = C5889l.f15325a.m12573b();
            if (c5889lM12573b == null) {
                return;
            }
            C5890m c5890m = C5890m.f15334a;
            Class<?> clsM12574a = C5890m.m12574a("com.android.billingclient.api.BillingClient");
            Class<?> clsM12574a2 = C5890m.m12574a("com.android.billingclient.api.Purchase");
            Class<?> clsM12574a3 = C5890m.m12574a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class<?> clsM12574a4 = C5890m.m12574a("com.android.billingclient.api.SkuDetails");
            Class<?> clsM12574a5 = C5890m.m12574a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class<?> clsM12574a6 = C5890m.m12574a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class<?> clsM12574a7 = C5890m.m12574a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsM12574a == null || clsM12574a3 == null || clsM12574a2 == null || clsM12574a4 == null || clsM12574a6 == null || clsM12574a5 == null || clsM12574a7 == null) {
                return;
            }
            Method methodM12577d = C5890m.m12577d(clsM12574a, "queryPurchases", String.class);
            Method methodM12577d2 = C5890m.m12577d(clsM12574a3, "getPurchasesList", new Class[0]);
            Method methodM12577d3 = C5890m.m12577d(clsM12574a2, "getOriginalJson", new Class[0]);
            Method methodM12577d4 = C5890m.m12577d(clsM12574a4, "getOriginalJson", new Class[0]);
            Method methodM12577d5 = C5890m.m12577d(clsM12574a5, "getOriginalJson", new Class[0]);
            Method methodM12577d6 = C5890m.m12577d(clsM12574a, "querySkuDetailsAsync", c5889lM12573b.m12571e(), clsM12574a6);
            Method methodM12577d7 = C5890m.m12577d(clsM12574a, "queryPurchaseHistoryAsync", String.class, clsM12574a7);
            if (methodM12577d == null || methodM12577d2 == null || methodM12577d3 == null || methodM12577d4 == null || methodM12577d5 == null || methodM12577d6 == null || methodM12577d7 == null) {
                return;
            }
            Object objM12532a = m12532a(context, clsM12574a);
            if (objM12532a == null) {
                return;
            }
            C5885h.f15287c = new C5885h(context, objM12532a, clsM12574a, clsM12574a3, clsM12574a2, clsM12574a4, clsM12574a5, clsM12574a6, clsM12574a7, methodM12577d, methodM12577d2, methodM12577d3, methodM12577d4, methodM12577d5, methodM12577d6, methodM12577d7, c5889lM12573b, null);
            C5885h c5885h = C5885h.f15287c;
            if (c5885h == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.iap.InAppPurchaseBillingClientWrapper");
            }
            c5885h.m12529t();
        }

        /* renamed from: c */
        public final synchronized C5885h m12534c(Context context) {
            C9801m.m32346f(context, "context");
            if (C5885h.f15286b.get()) {
                return C5885h.f15287c;
            }
            m12533b(context);
            C5885h.f15286b.set(true);
            return C5885h.f15287c;
        }

        /* renamed from: d */
        public final Map<String, JSONObject> m12535d() {
            return C5885h.f15289e;
        }

        /* renamed from: e */
        public final Map<String, JSONObject> m12536e() {
            return C5885h.f15290f;
        }

        /* renamed from: f */
        public final AtomicBoolean m12537f() {
            return C5885h.f15288d;
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* renamed from: com.facebook.o0.o0.h$c */
    public final class c implements InvocationHandler {

        /* renamed from: a */
        private Runnable f15309a;

        /* renamed from: b */
        final /* synthetic */ C5885h f15310b;

        public c(C5885h c5885h, Runnable runnable) {
            C9801m.m32346f(c5885h, "this$0");
            C9801m.m32346f(runnable, "runnable");
            this.f15310b = c5885h;
            this.f15309a = runnable;
        }

        /* renamed from: a */
        private final void m12538a(List<?> list) throws JSONException {
            for (Object obj : list) {
                try {
                    C5890m c5890m = C5890m.f15334a;
                    Object objM12578e = C5890m.m12578e(this.f15310b.f15297m, this.f15310b.f15304t, obj, new Object[0]);
                    String str = objM12578e instanceof String ? (String) objM12578e : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("packageName", this.f15310b.f15291g.getPackageName());
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            this.f15310b.f15308x.add(string);
                            Map<String, JSONObject> mapM12535d = C5885h.f15285a.m12535d();
                            C9801m.m32345e(string, "skuID");
                            mapM12535d.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.f15309a.run();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws JSONException {
            C9801m.m32346f(obj, "proxy");
            C9801m.m32346f(method, "method");
            if (C9801m.m32341a(method.getName(), "onPurchaseHistoryResponse")) {
                Object obj2 = objArr == null ? null : objArr[1];
                if (obj2 != null && (obj2 instanceof List)) {
                    m12538a((List) obj2);
                }
            }
            return null;
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* renamed from: com.facebook.o0.o0.h$d */
    public static final class d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            C9801m.m32346f(obj, "proxy");
            C9801m.m32346f(method, "m");
            return null;
        }
    }

    /* compiled from: InAppPurchaseBillingClientWrapper.kt */
    /* renamed from: com.facebook.o0.o0.h$e */
    public final class e implements InvocationHandler {

        /* renamed from: a */
        private Runnable f15311a;

        /* renamed from: b */
        final /* synthetic */ C5885h f15312b;

        public e(C5885h c5885h, Runnable runnable) {
            C9801m.m32346f(c5885h, "this$0");
            C9801m.m32346f(runnable, "runnable");
            this.f15312b = c5885h;
            this.f15311a = runnable;
        }

        /* renamed from: a */
        public final void m12539a(List<?> list) throws JSONException {
            C9801m.m32346f(list, "skuDetailsObjectList");
            for (Object obj : list) {
                try {
                    C5890m c5890m = C5890m.f15334a;
                    Object objM12578e = C5890m.m12578e(this.f15312b.f15296l, this.f15312b.f15303s, obj, new Object[0]);
                    String str = objM12578e instanceof String ? (String) objM12578e : null;
                    if (str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            Map<String, JSONObject> mapM12536e = C5885h.f15285a.m12536e();
                            C9801m.m32345e(string, "skuID");
                            mapM12536e.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            this.f15311a.run();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws JSONException {
            C9801m.m32346f(obj, "proxy");
            C9801m.m32346f(method, "m");
            if (C9801m.m32341a(method.getName(), "onSkuDetailsResponse")) {
                Object obj2 = objArr == null ? null : objArr[1];
                if (obj2 != null && (obj2 instanceof List)) {
                    m12539a((List) obj2);
                }
            }
            return null;
        }
    }

    private C5885h(Context context, Object obj, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C5889l c5889l) {
        this.f15291g = context;
        this.f15292h = obj;
        this.f15293i = cls;
        this.f15294j = cls2;
        this.f15295k = cls3;
        this.f15296l = cls4;
        this.f15297m = cls5;
        this.f15298n = cls6;
        this.f15299o = cls7;
        this.f15300p = method;
        this.f15301q = method2;
        this.f15302r = method3;
        this.f15303s = method4;
        this.f15304t = method5;
        this.f15305u = method6;
        this.f15306v = method7;
        this.f15307w = c5889l;
        this.f15308x = new CopyOnWriteArraySet();
    }

    public /* synthetic */ C5885h(Context context, Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, C5889l c5889l, C9789g c9789g) {
        this(context, obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, c5889l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m12526q(C5885h c5885h, Runnable runnable) throws IllegalArgumentException {
        C9801m.m32346f(c5885h, "this$0");
        C9801m.m32346f(runnable, "$queryPurchaseHistoryRunnable");
        c5885h.m12528s("inapp", new ArrayList(c5885h.f15308x), runnable);
    }

    /* renamed from: r */
    private final void m12527r(String str, Runnable runnable) throws IllegalArgumentException {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.f15299o.getClassLoader(), new Class[]{this.f15299o}, new c(this, runnable));
        C5890m c5890m = C5890m.f15334a;
        C5890m.m12578e(this.f15293i, this.f15306v, this.f15292h, str, objNewProxyInstance);
    }

    /* renamed from: s */
    private final void m12528s(String str, List<String> list, Runnable runnable) throws IllegalArgumentException {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.f15298n.getClassLoader(), new Class[]{this.f15298n}, new e(this, runnable));
        Object objM12570d = this.f15307w.m12570d(str, list);
        C5890m c5890m = C5890m.f15334a;
        C5890m.m12578e(this.f15293i, this.f15305u, this.f15292h, objM12570d, objNewProxyInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final void m12529t() {
        Method methodM12577d;
        C5890m c5890m = C5890m.f15334a;
        Class<?> clsM12574a = C5890m.m12574a("com.android.billingclient.api.BillingClientStateListener");
        if (clsM12574a == null || (methodM12577d = C5890m.m12577d(this.f15293i, "startConnection", clsM12574a)) == null) {
            return;
        }
        C5890m.m12578e(this.f15293i, methodM12577d, this.f15292h, Proxy.newProxyInstance(clsM12574a.getClassLoader(), new Class[]{clsM12574a}, new a()));
    }

    /* renamed from: o */
    public final void m12530o(String str, Runnable runnable) throws JSONException, IllegalArgumentException {
        C9801m.m32346f(str, "skuType");
        C9801m.m32346f(runnable, "querySkuRunnable");
        C5890m c5890m = C5890m.f15334a;
        Object objM12578e = C5890m.m12578e(this.f15294j, this.f15301q, C5890m.m12578e(this.f15293i, this.f15300p, this.f15292h, "inapp"), new Object[0]);
        List list = objM12578e instanceof List ? (List) objM12578e : null;
        if (list == null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C5890m c5890m2 = C5890m.f15334a;
                Object objM12578e2 = C5890m.m12578e(this.f15295k, this.f15302r, obj, new Object[0]);
                String str2 = objM12578e2 instanceof String ? (String) objM12578e2 : null;
                if (str2 != null) {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.has("productId")) {
                        String string = jSONObject.getString("productId");
                        arrayList.add(string);
                        Map<String, JSONObject> map = f15289e;
                        C9801m.m32345e(string, "skuID");
                        map.put(string, jSONObject);
                    }
                }
            }
            m12528s(str, arrayList, runnable);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: p */
    public final void m12531p(String str, final Runnable runnable) throws IllegalArgumentException {
        C9801m.m32346f(str, "skuType");
        C9801m.m32346f(runnable, "queryPurchaseHistoryRunnable");
        m12527r(str, new Runnable() { // from class: com.facebook.o0.o0.e
            @Override // java.lang.Runnable
            public final void run() throws IllegalArgumentException {
                C5885h.m12526q(this.f15273f, runnable);
            }
        });
    }
}

package p241e.p252d.p253a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.flurry.sdk.C5992a;
import com.flurry.sdk.C5992a.a;
import com.flurry.sdk.C5992a.b;
import com.flurry.sdk.C5992a.c;
import com.flurry.sdk.C5992a.d;
import com.flurry.sdk.C5992a.e;
import com.flurry.sdk.C5992a.g;
import com.flurry.sdk.C5992a.h;
import com.flurry.sdk.C5992a.j;
import com.flurry.sdk.C6002b0;
import com.flurry.sdk.C6013c2;
import com.flurry.sdk.C6021d1;
import com.flurry.sdk.C6037e7;
import com.flurry.sdk.C6084k0;
import com.flurry.sdk.C6104m2;
import com.flurry.sdk.C6191w4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: e.d.a.b */
/* loaded from: classes2.dex */
public final class C8776b {

    /* renamed from: e.d.a.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: j */
        private AbstractC8775a f33377j;

        /* renamed from: a */
        private InterfaceC8777c f33368a = null;

        /* renamed from: b */
        private boolean f33369b = false;

        /* renamed from: c */
        private int f33370c = 5;

        /* renamed from: d */
        private long f33371d = 10000;

        /* renamed from: e */
        private boolean f33372e = true;

        /* renamed from: f */
        private boolean f33373f = true;

        /* renamed from: g */
        private boolean f33374g = false;

        /* renamed from: h */
        private int f33375h = C8780f.f33389a;

        /* renamed from: i */
        private List<InterfaceC8779e> f33376i = new ArrayList();

        /* renamed from: k */
        private boolean f33378k = false;

        /* renamed from: l */
        private boolean f33379l = false;

        /* renamed from: a */
        public void m27933a(Context context, String str) {
            boolean z;
            if (C8776b.m27927b()) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("API key not specified");
                }
                C6002b0.m12965b(context);
                C6084k0.m13141a().f16042c = str;
                C5992a c5992aM12944v = C5992a.m12944v();
                InterfaceC8777c interfaceC8777c = this.f33368a;
                boolean z2 = this.f33369b;
                int i2 = this.f33370c;
                long j2 = this.f33371d;
                boolean z3 = this.f33372e;
                boolean z4 = this.f33373f;
                boolean z5 = this.f33374g;
                int i3 = this.f33375h;
                List<InterfaceC8779e> list = this.f33376i;
                AbstractC8775a abstractC8775a = this.f33377j;
                boolean z6 = this.f33378k;
                boolean z7 = this.f33379l;
                if (C5992a.f15620o.get()) {
                    C6021d1.m13041n("FlurryAgentImpl", "Invalid call to Init. Flurry is already initialized");
                    return;
                }
                C6021d1.m13041n("FlurryAgentImpl", "Initializing Flurry SDK");
                if (C5992a.f15620o.get()) {
                    C6021d1.m13041n("FlurryAgentImpl", "Invalid call to register. Flurry is already initialized");
                } else {
                    c5992aM12944v.f15622q = list;
                }
                C6104m2.m13180a();
                c5992aM12944v.mo13007m(c5992aM12944v.new b(context, list));
                C6191w4 c6191w4M13369a = C6191w4.m13369a();
                C6037e7 c6037e7M13055a = C6037e7.m13055a();
                if (c6037e7M13055a != null) {
                    z = z6;
                    c6037e7M13055a.f15822b.mo13050v(c6191w4M13369a.f16491h);
                    c6037e7M13055a.f15823c.mo13050v(c6191w4M13369a.f16492i);
                    c6037e7M13055a.f15824d.mo13050v(c6191w4M13369a.f16489f);
                    c6037e7M13055a.f15825e.mo13050v(c6191w4M13369a.f16490g);
                    c6037e7M13055a.f15826f.mo13050v(c6191w4M13369a.f16495l);
                    c6037e7M13055a.f15827g.mo13050v(c6191w4M13369a.f16487d);
                    c6037e7M13055a.f15828h.mo13050v(c6191w4M13369a.f16488e);
                    c6037e7M13055a.f15829i.mo13050v(c6191w4M13369a.f16494k);
                    c6037e7M13055a.f15830j.mo13050v(c6191w4M13369a.f16485b);
                    c6037e7M13055a.f15831k.mo13050v(c6191w4M13369a.f16493j);
                    c6037e7M13055a.f15832l.mo13050v(c6191w4M13369a.f16486c);
                    c6037e7M13055a.f15833m.mo13050v(c6191w4M13369a.f16496m);
                    c6037e7M13055a.f15835o.mo13050v(c6191w4M13369a.f16497n);
                    c6037e7M13055a.f15836p.mo13050v(c6191w4M13369a.f16498o);
                    c6037e7M13055a.f15837q.mo13050v(c6191w4M13369a.f16499p);
                } else {
                    z = z6;
                }
                C6084k0.m13141a().m13144c();
                C6037e7.m13055a().f15830j.m13093a();
                C6037e7.m13055a().f15827g.f15702q = z3;
                if (abstractC8775a != null) {
                    C6037e7.m13055a().f15833m.m13178x(abstractC8775a);
                }
                if (z2) {
                    C6021d1.m13034g();
                } else {
                    C6021d1.m13028a();
                }
                C6021d1.m13029b(i2);
                c5992aM12944v.mo13007m(c5992aM12944v.new a(j2, interfaceC8777c));
                c5992aM12944v.mo13007m(c5992aM12944v.new g(z4, z5));
                c5992aM12944v.mo13007m(c5992aM12944v.new d(i3, context));
                c5992aM12944v.mo13007m(c5992aM12944v.new e(z));
                C5992a.f15620o.set(true);
                if (z7) {
                    C6021d1.m13041n("FlurryAgentImpl", "Force start session");
                    c5992aM12944v.m12949w(context.getApplicationContext());
                }
            }
        }

        /* renamed from: b */
        public a m27934b(boolean z) {
            this.f33372e = z;
            return this;
        }

        /* renamed from: c */
        public a m27935c(boolean z) {
            this.f33373f = z;
            return this;
        }

        /* renamed from: d */
        public a m27936d(boolean z) {
            this.f33369b = z;
            return this;
        }

        /* renamed from: e */
        public a m27937e(int i2) {
            this.f33375h = i2;
            return this;
        }
    }

    /* renamed from: e.d.a.b$b */
    public static class b {
        /* renamed from: a */
        public static void m27938a(String str, String str2) {
            if (C8776b.m27927b()) {
                C5992a c5992aM12944v = C5992a.m12944v();
                if (C5992a.f15620o.get()) {
                    c5992aM12944v.mo13007m(c5992aM12944v.new c(str, str2));
                } else {
                    C6021d1.m13041n("FlurryAgentImpl", "Invalid call to UserProperties.add. Flurry is not initialized");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m27927b() {
        if (C6013c2.m12991g(16)) {
            return true;
        }
        C6021d1.m13037j("FlurryAgent", String.format(Locale.getDefault(), "Device SDK Version older than %d", 16));
        return false;
    }

    /* renamed from: c */
    public static EnumC8778d m27928c(String str) {
        return !m27927b() ? EnumC8778d.kFlurryEventFailed : C5992a.m12944v().m12948u(str, Collections.emptyMap(), false, false);
    }

    /* renamed from: d */
    public static EnumC8778d m27929d(String str, Map<String, String> map) {
        EnumC8778d enumC8778d = EnumC8778d.kFlurryEventFailed;
        if (!m27927b()) {
            return enumC8778d;
        }
        if (str == null) {
            C6021d1.m13037j("FlurryAgent", "String eventId passed to logEvent was null.");
            return enumC8778d;
        }
        if (map == null) {
            C6021d1.m13039l("FlurryAgent", "String parameters passed to logEvent was null.");
        }
        return C5992a.m12944v().m12948u(str, map, false, false);
    }

    /* renamed from: e */
    public static void m27930e(Context context) {
        if (m27927b()) {
            C5992a c5992aM12944v = C5992a.m12944v();
            if (context instanceof Activity) {
                C6021d1.m13032e("FlurryAgentImpl", "Activity's session is controlled by Flurry SDK");
            } else if (C5992a.f15620o.get()) {
                c5992aM12944v.mo13007m(c5992aM12944v.new h());
            } else {
                C6021d1.m13041n("FlurryAgentImpl", "Invalid call to onStartSession. Flurry is not initialized");
            }
        }
    }

    /* renamed from: f */
    public static void m27931f(String str, String str2, Throwable th, Map<String, String> map) {
        if (m27927b()) {
            C5992a c5992aM12944v = C5992a.m12944v();
            if (!C5992a.f15620o.get()) {
                C6021d1.m13041n("FlurryAgentImpl", "Invalid call to onError. Flurry is not initialized");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map2 = new HashMap();
            if (map != null) {
                map2.putAll(map);
            }
            c5992aM12944v.mo13007m(c5992aM12944v.new j(str, jCurrentTimeMillis, str2, th, map2));
        }
    }

    /* renamed from: g */
    public static void m27932g(Context context) {
        if (m27927b()) {
            C5992a.m12944v().m12949w(context);
        }
    }
}

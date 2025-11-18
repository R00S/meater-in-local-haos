package com.facebook.internal.p148t0.p150m;

import android.util.Log;
import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.facebook.C5641a0;
import com.facebook.C5653d0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5696p0;
import com.facebook.internal.p148t0.C5712h;
import com.facebook.internal.p148t0.C5713i;
import com.facebook.internal.p148t0.C5715k;
import com.facebook.internal.p148t0.p150m.C5723c;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CrashHandler.kt */
/* renamed from: com.facebook.internal.t0.m.c */
/* loaded from: classes2.dex */
public final class C5723c implements Thread.UncaughtExceptionHandler {

    /* renamed from: f */
    public static final a f14603f = new a(null);

    /* renamed from: g */
    private static final String f14604g = C5723c.class.getCanonicalName();

    /* renamed from: h */
    private static C5723c f14605h;

    /* renamed from: i */
    private final Thread.UncaughtExceptionHandler f14606i;

    /* compiled from: CrashHandler.kt */
    /* renamed from: com.facebook.internal.t0.m.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: d */
        private final void m11777d() {
            C5696p0 c5696p0 = C5696p0.f14478a;
            if (C5696p0.m11553X()) {
                return;
            }
            C5715k c5715k = C5715k.f14590a;
            File[] fileArrM11757p = C5715k.m11757p();
            ArrayList arrayList = new ArrayList(fileArrM11757p.length);
            for (File file : fileArrM11757p) {
                C5713i.a aVar = C5713i.a.f14579a;
                arrayList.add(C5713i.a.m11730d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C5713i) obj).m11725f()) {
                    arrayList2.add(obj);
                }
            }
            final List listM38618x0 = C10782c0.m38618x0(arrayList2, new Comparator() { // from class: com.facebook.internal.t0.m.b
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return C5723c.a.m11778e((C5713i) obj2, (C5713i) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = C9848l.m32428k(0, Math.min(listM38618x0.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listM38618x0.get(((IntIterator) it).mo32397b()));
            }
            C5715k c5715k2 = C5715k.f14590a;
            C5715k.m11760s("crash_reports", jSONArray, new GraphRequest.InterfaceC5631b() { // from class: com.facebook.internal.t0.m.a
                @Override // com.facebook.GraphRequest.InterfaceC5631b
                /* renamed from: b */
                public final void mo11196b(C5653d0 c5653d0) {
                    C5723c.a.m11779f(listM38618x0, c5653d0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final int m11778e(C5713i c5713i, C5713i c5713i2) {
            C9801m.m32345e(c5713i2, "o2");
            return c5713i.m11724b(c5713i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m11779f(List list, C5653d0 c5653d0) {
            C9801m.m32346f(list, "$validReports");
            C9801m.m32346f(c5653d0, "response");
            try {
                if (c5653d0.m11338b() == null) {
                    JSONObject jSONObjectM11340d = c5653d0.m11340d();
                    if (C9801m.m32341a(jSONObjectM11340d == null ? null : Boolean.valueOf(jSONObjectM11340d.getBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)), Boolean.TRUE)) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((C5713i) it.next()).m11723a();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }

        /* renamed from: a */
        public final synchronized void m11780a() {
            C5641a0 c5641a0 = C5641a0.f14199a;
            if (C5641a0.m11288g()) {
                m11777d();
            }
            if (C5723c.f14605h != null) {
                Log.w(C5723c.f14604g, "Already enabled!");
            } else {
                C5723c.f14605h = new C5723c(Thread.getDefaultUncaughtExceptionHandler(), null);
                Thread.setDefaultUncaughtExceptionHandler(C5723c.f14605h);
            }
        }
    }

    private C5723c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f14606i = uncaughtExceptionHandler;
    }

    public /* synthetic */ C5723c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C9789g c9789g) {
        this(uncaughtExceptionHandler);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) throws IOException {
        C9801m.m32346f(thread, "t");
        C9801m.m32346f(th, "e");
        C5715k c5715k = C5715k.f14590a;
        if (C5715k.m11748g(th)) {
            C5712h c5712h = C5712h.f14569a;
            C5712h.m11715b(th);
            C5713i.a aVar = C5713i.a.f14579a;
            C5713i.a.m11728b(th, C5713i.c.CrashReport).m11726g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f14606i;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}

package com.facebook.internal.p148t0.p149l;

import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import com.facebook.C5641a0;
import com.facebook.C5653d0;
import com.facebook.GraphRequest;
import com.facebook.internal.C5696p0;
import com.facebook.internal.p148t0.C5713i;
import com.facebook.internal.p148t0.C5715k;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C10782c0;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ANRHandler.kt */
/* renamed from: com.facebook.internal.t0.l.e */
/* loaded from: classes2.dex */
public final class C5720e {

    /* renamed from: a */
    public static final C5720e f14599a = new C5720e();

    /* renamed from: b */
    private static final AtomicBoolean f14600b = new AtomicBoolean(false);

    private C5720e() {
    }

    /* renamed from: a */
    public static final synchronized void m11766a() {
        if (f14600b.getAndSet(true)) {
            return;
        }
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11288g()) {
            m11769d();
        }
        C5719d c5719d = C5719d.f14594a;
        C5719d.m11765d();
    }

    /* renamed from: d */
    public static final void m11769d() {
        C5696p0 c5696p0 = C5696p0.f14478a;
        if (C5696p0.m11553X()) {
            return;
        }
        C5715k c5715k = C5715k.f14590a;
        File[] fileArrM11753l = C5715k.m11753l();
        ArrayList arrayList = new ArrayList(fileArrM11753l.length);
        for (File file : fileArrM11753l) {
            C5713i.a aVar = C5713i.a.f14579a;
            arrayList.add(C5713i.a.m11730d(file));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C5713i) obj).m11725f()) {
                arrayList2.add(obj);
            }
        }
        final List listM38618x0 = C10782c0.m38618x0(arrayList2, new Comparator() { // from class: com.facebook.internal.t0.l.c
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return C5720e.m11770e((C5713i) obj2, (C5713i) obj3);
            }
        });
        JSONArray jSONArray = new JSONArray();
        Iterator<Integer> it = C9848l.m32428k(0, Math.min(listM38618x0.size(), 5)).iterator();
        while (it.hasNext()) {
            jSONArray.put(listM38618x0.get(((IntIterator) it).mo32397b()));
        }
        C5715k c5715k2 = C5715k.f14590a;
        C5715k.m11760s("anr_reports", jSONArray, new GraphRequest.InterfaceC5631b() { // from class: com.facebook.internal.t0.l.b
            @Override // com.facebook.GraphRequest.InterfaceC5631b
            /* renamed from: b */
            public final void mo11196b(C5653d0 c5653d0) {
                C5720e.m11771f(listM38618x0, c5653d0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final int m11770e(C5713i c5713i, C5713i c5713i2) {
        C9801m.m32345e(c5713i2, "o2");
        return c5713i.m11724b(c5713i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m11771f(List list, C5653d0 c5653d0) {
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
}

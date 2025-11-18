package com.google.firebase.crashlytics.internal.p189s;

import android.content.Context;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import com.google.android.datatransport.cct.C6239c;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.p183n.AbstractC8195b0;
import com.google.firebase.crashlytics.internal.p183n.C8219n0;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import com.google.firebase.crashlytics.internal.p185p.p186h0.C8271j;
import com.google.firebase.crashlytics.internal.p190t.InterfaceC8312i;
import java.nio.charset.Charset;
import p241e.p254e.p256b.p257a.C8785b;
import p241e.p254e.p256b.p257a.InterfaceC8788e;
import p241e.p254e.p256b.p257a.InterfaceC8790g;
import p241e.p254e.p256b.p257a.p258i.C8878u;

/* compiled from: DataTransportCrashlyticsReportSender.java */
/* renamed from: com.google.firebase.crashlytics.h.s.d */
/* loaded from: classes2.dex */
public class C8302d {

    /* renamed from: a */
    private static final C8271j f31570a = new C8271j();

    /* renamed from: b */
    private static final String f31571b = m26013d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: c */
    private static final String f31572c = m26013d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: d */
    private static final InterfaceC8788e<AbstractC8258f0, byte[]> f31573d = new InterfaceC8788e() { // from class: com.google.firebase.crashlytics.h.s.a
        @Override // p241e.p254e.p256b.p257a.InterfaceC8788e
        /* renamed from: a */
        public final Object mo26009a(Object obj) {
            return C8302d.f31570a.m25945M((AbstractC8258f0) obj).getBytes(Charset.forName("UTF-8"));
        }
    };

    /* renamed from: e */
    private final C8303e f31574e;

    /* renamed from: f */
    private final InterfaceC8788e<AbstractC8258f0, byte[]> f31575f;

    C8302d(C8303e c8303e, InterfaceC8788e<AbstractC8258f0, byte[]> interfaceC8788e) {
        this.f31574e = c8303e;
        this.f31575f = interfaceC8788e;
    }

    /* renamed from: a */
    public static C8302d m26011a(Context context, InterfaceC8312i interfaceC8312i, C8219n0 c8219n0) {
        C8878u.m28178f(context);
        InterfaceC8790g interfaceC8790gM28180g = C8878u.m28176c().m28180g(new C6239c(f31571b, f31572c));
        C8785b c8785bM27945b = C8785b.m27945b(BodyInterceptorV3.RESPONSE_MODE_JSON);
        InterfaceC8788e<AbstractC8258f0, byte[]> interfaceC8788e = f31573d;
        return new C8302d(new C8303e(interfaceC8790gM28180g.mo26454a("FIREBASE_CRASHLYTICS_REPORT", AbstractC8258f0.class, c8785bM27945b, interfaceC8788e), interfaceC8312i.mo26060b(), c8219n0), interfaceC8788e);
    }

    /* renamed from: d */
    private static String m26013d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public Task<AbstractC8195b0> m26014b(AbstractC8195b0 abstractC8195b0, boolean z) {
        return this.f31574e.m26028g(abstractC8195b0, z).m23654a();
    }
}

package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.p179a.InterfaceC8095a;
import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p181l.C8185c;
import com.google.firebase.crashlytics.internal.p181l.C8186d;
import com.google.firebase.crashlytics.internal.p181l.C8187e;
import com.google.firebase.crashlytics.internal.p181l.C8188f;
import com.google.firebase.crashlytics.internal.p181l.InterfaceC8183a;
import com.google.firebase.crashlytics.internal.p182m.C8191c;
import com.google.firebase.crashlytics.internal.p182m.InterfaceC8189a;
import com.google.firebase.crashlytics.internal.p182m.InterfaceC8190b;
import com.google.firebase.p205s.InterfaceC8495a;
import com.google.firebase.p205s.InterfaceC8496b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: AnalyticsDeferredProxy.java */
/* renamed from: com.google.firebase.crashlytics.e */
/* loaded from: classes2.dex */
public class C8169e {

    /* renamed from: a */
    private final InterfaceC8495a<InterfaceC8095a> f30835a;

    /* renamed from: b */
    private volatile InterfaceC8183a f30836b;

    /* renamed from: c */
    private volatile InterfaceC8190b f30837c;

    /* renamed from: d */
    private final List<InterfaceC8189a> f30838d;

    public C8169e(InterfaceC8495a<InterfaceC8095a> interfaceC8495a) {
        this(interfaceC8495a, new C8191c(), new C8188f());
    }

    /* renamed from: c */
    private void m25137c() {
        this.f30835a.mo25084a(new InterfaceC8495a.a() { // from class: com.google.firebase.crashlytics.a
            @Override // com.google.firebase.p205s.InterfaceC8495a.a
            /* renamed from: a */
            public final void mo24982a(InterfaceC8496b interfaceC8496b) {
                this.f30831a.m25146i(interfaceC8496b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m25144e(String str, Bundle bundle) {
        this.f30836b.mo25135a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m25145g(InterfaceC8189a interfaceC8189a) {
        synchronized (this) {
            if (this.f30837c instanceof C8191c) {
                this.f30838d.add(interfaceC8189a);
            }
            this.f30837c.mo25136a(interfaceC8189a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m25146i(InterfaceC8496b interfaceC8496b) {
        C8179h.m25176f().m25177b("AnalyticsConnector now available.");
        InterfaceC8095a interfaceC8095a = (InterfaceC8095a) interfaceC8496b.get();
        C8187e c8187e = new C8187e(interfaceC8095a);
        C8170f c8170f = new C8170f();
        if (m25141j(interfaceC8095a, c8170f) == null) {
            C8179h.m25176f().m25185k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        C8179h.m25176f().m25177b("Registered Firebase Analytics listener.");
        C8186d c8186d = new C8186d();
        C8185c c8185c = new C8185c(c8187e, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            Iterator<InterfaceC8189a> it = this.f30838d.iterator();
            while (it.hasNext()) {
                c8186d.mo25136a(it.next());
            }
            c8170f.m25149d(c8186d);
            c8170f.m25150e(c8185c);
            this.f30837c = c8186d;
            this.f30836b = c8185c;
        }
    }

    /* renamed from: j */
    private static InterfaceC8095a.a m25141j(InterfaceC8095a interfaceC8095a, C8170f c8170f) {
        InterfaceC8095a.a aVarMo24951b = interfaceC8095a.mo24951b("clx", c8170f);
        if (aVarMo24951b == null) {
            C8179h.m25176f().m25177b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            aVarMo24951b = interfaceC8095a.mo24951b("crash", c8170f);
            if (aVarMo24951b != null) {
                C8179h.m25176f().m25185k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return aVarMo24951b;
    }

    /* renamed from: a */
    public InterfaceC8183a m25142a() {
        return new InterfaceC8183a() { // from class: com.google.firebase.crashlytics.b
            @Override // com.google.firebase.crashlytics.internal.p181l.InterfaceC8183a
            /* renamed from: a */
            public final void mo25135a(String str, Bundle bundle) {
                this.f30832a.m25144e(str, bundle);
            }
        };
    }

    /* renamed from: b */
    public InterfaceC8190b m25143b() {
        return new InterfaceC8190b() { // from class: com.google.firebase.crashlytics.c
            @Override // com.google.firebase.crashlytics.internal.p182m.InterfaceC8190b
            /* renamed from: a */
            public final void mo25136a(InterfaceC8189a interfaceC8189a) {
                this.f30833a.m25145g(interfaceC8189a);
            }
        };
    }

    public C8169e(InterfaceC8495a<InterfaceC8095a> interfaceC8495a, InterfaceC8190b interfaceC8190b, InterfaceC8183a interfaceC8183a) {
        this.f30835a = interfaceC8495a;
        this.f30837c = interfaceC8190b;
        this.f30838d = new ArrayList();
        this.f30836b = interfaceC8183a;
        m25137c();
    }
}

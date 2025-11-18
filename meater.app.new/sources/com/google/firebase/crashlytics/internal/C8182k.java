package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.p184o.C8246l;
import com.google.firebase.p205s.InterfaceC8495a;
import com.google.firebase.p205s.InterfaceC8496b;
import com.google.firebase.p210v.p211a.InterfaceC8557a;

/* compiled from: RemoteConfigDeferredProxy.java */
/* renamed from: com.google.firebase.crashlytics.h.k */
/* loaded from: classes2.dex */
public class C8182k {

    /* renamed from: a */
    private final InterfaceC8495a<InterfaceC8557a> f30864a;

    public C8182k(InterfaceC8495a<InterfaceC8557a> interfaceC8495a) {
        this.f30864a = interfaceC8495a;
    }

    /* renamed from: a */
    static /* synthetic */ void m25193a(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, InterfaceC8496b interfaceC8496b) {
        ((InterfaceC8557a) interfaceC8496b.get()).m26906a("firebase", crashlyticsRemoteConfigListener);
        C8179h.m25176f().m25177b("Registering RemoteConfig Rollouts subscriber");
    }

    /* renamed from: b */
    public void m25194b(C8246l c8246l) {
        if (c8246l == null) {
            C8179h.m25176f().m25185k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener = new CrashlyticsRemoteConfigListener(c8246l);
            this.f30864a.mo25084a(new InterfaceC8495a.a() { // from class: com.google.firebase.crashlytics.h.c
                @Override // com.google.firebase.p205s.InterfaceC8495a.a
                /* renamed from: a */
                public final void mo24982a(InterfaceC8496b interfaceC8496b) {
                    C8182k.m25193a(crashlyticsRemoteConfigListener, interfaceC8496b);
                }
            });
        }
    }
}

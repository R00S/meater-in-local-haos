package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8260g0;
import com.google.firebase.p205s.InterfaceC8495a;
import com.google.firebase.p205s.InterfaceC8496b;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* renamed from: com.google.firebase.crashlytics.h.e */
/* loaded from: classes2.dex */
public final class C8176e implements InterfaceC8175d {

    /* renamed from: a */
    private static final InterfaceC8180i f30851a = new b();

    /* renamed from: b */
    private final InterfaceC8495a<InterfaceC8175d> f30852b;

    /* renamed from: c */
    private final AtomicReference<InterfaceC8175d> f30853c = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    /* renamed from: com.google.firebase.crashlytics.h.e$b */
    private static final class b implements InterfaceC8180i {
        private b() {
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8180i
        /* renamed from: a */
        public File mo25160a() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8180i
        /* renamed from: b */
        public File mo25161b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8180i
        /* renamed from: c */
        public File mo25162c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8180i
        /* renamed from: d */
        public AbstractC8258f0.a mo25163d() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8180i
        /* renamed from: e */
        public File mo25164e() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8180i
        /* renamed from: f */
        public File mo25165f() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.InterfaceC8180i
        /* renamed from: g */
        public File mo25166g() {
            return null;
        }
    }

    public C8176e(InterfaceC8495a<InterfaceC8175d> interfaceC8495a) {
        this.f30852b = interfaceC8495a;
        interfaceC8495a.mo25084a(new InterfaceC8495a.a() { // from class: com.google.firebase.crashlytics.h.a
            @Override // com.google.firebase.p205s.InterfaceC8495a.a
            /* renamed from: a */
            public final void mo24982a(InterfaceC8496b interfaceC8496b) {
                this.f30845a.m25159f(interfaceC8496b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m25159f(InterfaceC8496b interfaceC8496b) {
        C8179h.m25176f().m25177b("Crashlytics native component now available.");
        this.f30853c.set((InterfaceC8175d) interfaceC8496b.get());
    }

    @Override // com.google.firebase.crashlytics.internal.InterfaceC8175d
    /* renamed from: a */
    public InterfaceC8180i mo25153a(String str) {
        InterfaceC8175d interfaceC8175d = this.f30853c.get();
        return interfaceC8175d == null ? f30851a : interfaceC8175d.mo25153a(str);
    }

    @Override // com.google.firebase.crashlytics.internal.InterfaceC8175d
    /* renamed from: b */
    public boolean mo25154b() {
        InterfaceC8175d interfaceC8175d = this.f30853c.get();
        return interfaceC8175d != null && interfaceC8175d.mo25154b();
    }

    @Override // com.google.firebase.crashlytics.internal.InterfaceC8175d
    /* renamed from: c */
    public void mo25155c(final String str, final String str2, final long j2, final AbstractC8260g0 abstractC8260g0) {
        C8179h.m25176f().m25183i("Deferring native open session: " + str);
        this.f30852b.mo25084a(new InterfaceC8495a.a() { // from class: com.google.firebase.crashlytics.h.b
            @Override // com.google.firebase.p205s.InterfaceC8495a.a
            /* renamed from: a */
            public final void mo24982a(InterfaceC8496b interfaceC8496b) {
                ((InterfaceC8175d) interfaceC8496b.get()).mo25155c(str, str2, j2, abstractC8260g0);
            }
        });
    }

    @Override // com.google.firebase.crashlytics.internal.InterfaceC8175d
    /* renamed from: d */
    public boolean mo25156d(String str) {
        InterfaceC8175d interfaceC8175d = this.f30853c.get();
        return interfaceC8175d != null && interfaceC8175d.mo25156d(str);
    }
}

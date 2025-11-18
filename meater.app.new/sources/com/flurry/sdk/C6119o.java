package com.flurry.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.flurry.sdk.C6128p;
import com.google.android.instantapps.InstantApps;

/* renamed from: com.flurry.sdk.o */
/* loaded from: classes2.dex */
public final class C6119o extends C6027d7<C6110n> {

    /* renamed from: p */
    private ComponentCallbacks2C6137q f16192p;

    /* renamed from: q */
    private boolean f16193q;

    /* renamed from: r */
    private String f16194r;

    /* renamed from: s */
    public String f16195s;

    /* renamed from: t */
    private InterfaceC6046f7<C6128p> f16196t;

    /* renamed from: com.flurry.sdk.o$a */
    final class a implements InterfaceC6046f7<C6128p> {

        /* renamed from: com.flurry.sdk.o$a$a, reason: collision with other inner class name */
        final class C11471a extends AbstractRunnableC6041f2 {

            /* renamed from: h */
            final /* synthetic */ C6128p f16198h;

            C11471a(C6128p c6128p) {
                this.f16198h = c6128p;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6041f2
            /* renamed from: a */
            public final void mo12950a() throws Exception {
                if (C6119o.this.f16194r == null && this.f16198h.f16208a.equals(C6128p.a.CREATED)) {
                    C6119o.this.f16194r = this.f16198h.f16209b.getString("activity_name");
                    C6119o.this.m13220d();
                    C6119o.this.f16192p.m13051w(C6119o.this.f16196t);
                }
            }
        }

        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6046f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6128p c6128p) {
            C6119o.this.mo13007m(new C11471a(c6128p));
        }
    }

    /* renamed from: com.flurry.sdk.o$b */
    final class b extends AbstractRunnableC6041f2 {
        b() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            Context contextM12964a = C6002b0.m12964a();
            if (contextM12964a == null) {
                C6021d1.m13030c(6, "InstantAppProvider", "Context is null");
                return;
            }
            try {
                Class.forName("com.google.android.instantapps.InstantApps");
                C6119o.this.f16193q = InstantApps.isInstantApp(contextM12964a);
                C6021d1.m13030c(3, "InstantAppProvider", "isInstantApp: " + String.valueOf(C6119o.this.f16193q));
            } catch (ClassNotFoundException unused) {
                C6021d1.m13030c(3, "InstantAppProvider", "isInstantApps dependency is not added");
            }
            C6119o.this.m13220d();
        }
    }

    public C6119o(ComponentCallbacks2C6137q componentCallbacks2C6137q) {
        super("InstantAppProvider");
        a aVar = new a();
        this.f16196t = aVar;
        this.f16192p = componentCallbacks2C6137q;
        componentCallbacks2C6137q.mo13050v(aVar);
    }

    /* renamed from: d */
    public final void m13220d() {
        if (this.f16193q && m13221x() == null) {
            C6021d1.m13030c(3, "InstantAppProvider", "Fetching instant app name");
        } else {
            boolean z = this.f16193q;
            m13048t(new C6110n(z, z ? m13221x() : null));
        }
    }

    @Override // com.flurry.sdk.C6027d7
    /* renamed from: u */
    public final void mo13049u() {
        mo13007m(new b());
    }

    /* renamed from: x */
    public final String m13221x() {
        if (this.f16193q) {
            return !TextUtils.isEmpty(this.f16195s) ? this.f16195s : this.f16194r;
        }
        return null;
    }
}

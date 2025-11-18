package com.flurry.sdk;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;

/* renamed from: com.flurry.sdk.u */
/* loaded from: classes2.dex */
public final class C6170u extends C6027d7<C6162t> {

    /* renamed from: p */
    public boolean f16392p;

    /* renamed from: q */
    private boolean f16393q;

    /* renamed from: r */
    private boolean f16394r;

    /* renamed from: s */
    private Location f16395s;

    /* renamed from: t */
    private C6064h7 f16396t;

    /* renamed from: u */
    protected InterfaceC6046f7<C6073i7> f16397u;

    /* renamed from: com.flurry.sdk.u$a */
    final class a implements InterfaceC6046f7<C6073i7> {
        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6046f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6073i7 c6073i7) {
            C6170u.this.f16394r = c6073i7.f16000b == EnumC6055g7.FOREGROUND;
            if (C6170u.this.f16394r) {
                C6170u.this.m13317F();
            }
        }
    }

    /* renamed from: com.flurry.sdk.u$b */
    final class b extends AbstractRunnableC6041f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6046f7 f16399h;

        b(InterfaceC6046f7 interfaceC6046f7) {
            this.f16399h = interfaceC6046f7;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() {
            Location locationM13314x = C6170u.this.m13314x();
            if (locationM13314x != null) {
                C6170u.this.f16395s = locationM13314x;
            }
            this.f16399h.mo12962a(new C6162t(C6170u.this.f16392p, C6170u.this.f16393q, C6170u.this.f16395s));
        }
    }

    public C6170u(C6064h7 c6064h7) {
        super("LocationProvider");
        this.f16392p = true;
        this.f16393q = false;
        this.f16394r = false;
        a aVar = new a();
        this.f16397u = aVar;
        this.f16396t = c6064h7;
        c6064h7.mo13050v(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: x */
    public Location m13314x() {
        if (this.f16392p && this.f16394r) {
            if (!C6122o2.m13225a("android.permission.ACCESS_FINE_LOCATION") && !C6122o2.m13225a("android.permission.ACCESS_COARSE_LOCATION")) {
                this.f16393q = false;
                return null;
            }
            String str = C6122o2.m13225a("android.permission.ACCESS_FINE_LOCATION") ? "passive" : "network";
            this.f16393q = true;
            LocationManager locationManager = (LocationManager) C6002b0.m12964a().getSystemService("location");
            if (locationManager != null) {
                return locationManager.getLastKnownLocation(str);
            }
        }
        return null;
    }

    /* renamed from: F */
    public final void m13317F() {
        Location locationM13314x = m13314x();
        if (locationM13314x != null) {
            this.f16395s = locationM13314x;
        }
        m13048t(new C6162t(this.f16392p, this.f16393q, this.f16395s));
    }

    @Override // com.flurry.sdk.C6027d7
    /* renamed from: v */
    public final void mo13050v(InterfaceC6046f7<C6162t> interfaceC6046f7) {
        super.mo13050v(interfaceC6046f7);
        mo13007m(new b(interfaceC6046f7));
    }
}

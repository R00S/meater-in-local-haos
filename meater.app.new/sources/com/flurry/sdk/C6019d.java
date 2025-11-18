package com.flurry.sdk;

import android.text.TextUtils;
import com.flurry.sdk.C6020d0.c;
import com.google.android.gms.common.GoogleApiAvailability;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.d */
/* loaded from: classes2.dex */
public final class C6019d extends C6027d7<C6029e> {

    /* renamed from: p */
    public String f15742p;

    /* renamed from: q */
    public boolean f15743q;

    /* renamed from: r */
    public boolean f15744r;

    /* renamed from: s */
    private C6110n f15745s;

    /* renamed from: t */
    private InterfaceC6046f7<C6110n> f15746t;

    /* renamed from: u */
    private C6119o f15747u;

    /* renamed from: v */
    private C6064h7 f15748v;

    /* renamed from: w */
    private InterfaceC6046f7<C6073i7> f15749w;

    /* renamed from: com.flurry.sdk.d$a */
    final class a implements InterfaceC6046f7<C6110n> {

        /* renamed from: com.flurry.sdk.d$a$a, reason: collision with other inner class name */
        final class C11467a extends AbstractRunnableC6041f2 {

            /* renamed from: h */
            final /* synthetic */ C6110n f15751h;

            C11467a(C6110n c6110n) {
                this.f15751h = c6110n;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6041f2
            /* renamed from: a */
            public final void mo12950a() throws Exception {
                C6021d1.m13030c(3, "FlurryProvider", "isInstantApp: " + this.f15751h.f16150a);
                C6019d.this.f15745s = this.f15751h;
                C6019d.m13014A(C6019d.this);
                C6019d.this.f15747u.m13051w(C6019d.this.f15746t);
            }
        }

        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6046f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6110n c6110n) {
            C6019d.this.mo13007m(new C11467a(c6110n));
        }
    }

    /* renamed from: com.flurry.sdk.d$b */
    final class b implements InterfaceC6046f7<C6073i7> {
        b() {
        }

        @Override // com.flurry.sdk.InterfaceC6046f7
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo12962a(C6073i7 c6073i7) {
            C6019d.m13014A(C6019d.this);
        }
    }

    /* renamed from: com.flurry.sdk.d$c */
    public class c extends AbstractRunnableC6041f2 {
        public c() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6019d.m13017D(C6019d.this);
            C6019d.m13014A(C6019d.this);
        }
    }

    /* renamed from: com.flurry.sdk.d$d */
    public enum d {
        UNAVAILABLE(-2),
        UNKNOWN(-1),
        SUCCESS(0),
        SERVICE_MISSING(1),
        SERVICE_UPDATING(2),
        SERVICE_VERSION_UPDATE_REQUIRED(3),
        SERVICE_DISABLED(4),
        SERVICE_INVALID(5);


        /* renamed from: o */
        public int f15764o;

        d(int i2) {
            this.f15764o = i2;
        }
    }

    public C6019d(C6119o c6119o, C6064h7 c6064h7) {
        super("FlurryProvider");
        this.f15743q = false;
        this.f15744r = false;
        this.f15746t = new a();
        this.f15749w = new b();
        this.f15747u = c6119o;
        c6119o.mo13050v(this.f15746t);
        this.f15748v = c6064h7;
        c6064h7.mo13050v(this.f15749w);
    }

    /* renamed from: A */
    static /* synthetic */ void m13014A(C6019d c6019d) {
        if (TextUtils.isEmpty(c6019d.f15742p) || c6019d.f15745s == null) {
            return;
        }
        c6019d.m13048t(new C6029e(C6084k0.m13141a().m13143b(), c6019d.f15743q, m13018x(), c6019d.f15745s));
    }

    /* renamed from: D */
    static /* synthetic */ void m13017D(C6019d c6019d) {
        if (TextUtils.isEmpty(c6019d.f15742p)) {
            C6021d1.m13030c(6, "FlurryProvider", "Streaming API Key is invalid");
            return;
        }
        int iM13256e = C6131p2.m13256e("prev_streaming_api_key", 0);
        int iHashCode = C6131p2.m13258g("api_key", HttpUrl.FRAGMENT_ENCODE_SET).hashCode();
        int iHashCode2 = c6019d.f15742p.hashCode();
        if (iM13256e == iHashCode2 || iHashCode == iHashCode2) {
            return;
        }
        C6021d1.m13030c(3, "FlurryProvider", "Streaming API key is refreshed");
        C6131p2.m13253b("prev_streaming_api_key", iHashCode2);
        C6020d0 c6020d0 = C6037e7.m13055a().f15832l;
        C6021d1.m13030c(3, "ReportingProvider", "Reset initial timestamp.");
        c6020d0.mo13007m(c6020d0.new c());
    }

    /* renamed from: x */
    private static d m13018x() {
        try {
            int iMo13812i = GoogleApiAvailability.m13803q().mo13812i(C6002b0.m12964a());
            return iMo13812i != 0 ? iMo13812i != 1 ? iMo13812i != 2 ? iMo13812i != 3 ? iMo13812i != 9 ? iMo13812i != 18 ? d.UNAVAILABLE : d.SERVICE_UPDATING : d.SERVICE_INVALID : d.SERVICE_DISABLED : d.SERVICE_VERSION_UPDATE_REQUIRED : d.SERVICE_MISSING : d.SUCCESS;
        } catch (Exception | NoClassDefFoundError unused) {
            C6021d1.m13030c(3, "FlurryProvider", "Error retrieving Google Play Services Availability. This probably means google play services is unavailable.");
            return d.UNAVAILABLE;
        }
    }
}

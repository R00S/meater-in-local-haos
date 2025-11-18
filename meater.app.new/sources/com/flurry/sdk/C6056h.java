package com.flurry.sdk;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.flurry.sdk.h */
/* loaded from: classes2.dex */
public final class C6056h extends C6027d7<C6092l> {

    /* renamed from: p */
    protected C6092l f15932p;

    /* renamed from: q */
    protected C6064h7 f15933q;

    /* renamed from: r */
    protected C6074j f15934r;

    /* renamed from: s */
    protected C6047g f15935s;

    /* renamed from: t */
    protected C6038f f15936t;

    /* renamed from: u */
    protected AtomicBoolean f15937u;

    /* renamed from: v */
    protected InterfaceC6046f7<C6073i7> f15938v;

    /* renamed from: com.flurry.sdk.h$a */
    final class a extends AbstractRunnableC6041f2 {
        a() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6056h.this.f15934r.m13118a();
        }
    }

    /* renamed from: com.flurry.sdk.h$b */
    final class b extends AbstractRunnableC6041f2 {
        b() {
        }

        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6048g0.m13065a();
            C6048g0.m13068f("IdProvider: Provider start", Collections.emptyMap());
            C6056h.this.m13086d();
        }
    }

    /* renamed from: com.flurry.sdk.h$c */
    final class c extends AbstractRunnableC6041f2 {

        /* renamed from: com.flurry.sdk.h$c$a */
        final class a extends AbstractRunnableC6041f2 {

            /* renamed from: h */
            final /* synthetic */ boolean f15942h;

            /* renamed from: i */
            final /* synthetic */ String f15943i;

            a(boolean z, String str) {
                this.f15942h = z;
                this.f15943i = str;
            }

            @Override // com.flurry.sdk.AbstractRunnableC6041f2
            /* renamed from: a */
            public final void mo12950a() throws Exception {
                C6056h.this.f15936t.m13057a();
                boolean z = this.f15942h;
                C6038f c6038f = C6056h.this.f15936t;
                if (z == c6038f.f15839p && this.f15943i.equals(c6038f.f15838o)) {
                    return;
                }
                C6048g0.m13065a();
                C6048g0.m13068f("IdProvider: Advertising Info update", Collections.emptyMap());
                C6056h.this.m13086d();
            }
        }

        c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0127 A[Catch: Exception -> 0x0131, TRY_LEAVE, TryCatch #2 {Exception -> 0x0131, blocks: (B:16:0x009a, B:18:0x00a6, B:22:0x00ca, B:34:0x0127, B:25:0x00d1, B:27:0x00db, B:29:0x00e5, B:30:0x011e, B:31:0x0121, B:21:0x00c4, B:32:0x0123), top: B:69:0x009a }] */
        @Override // com.flurry.sdk.AbstractRunnableC6041f2
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo12950a() {
            /*
                Method dump skipped, instructions count: 503
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6056h.c.mo12950a():void");
        }
    }

    /* renamed from: com.flurry.sdk.h$d */
    final class d implements InterfaceC6046f7<C6073i7> {
        d() {
        }

        @Override // com.flurry.sdk.InterfaceC6046f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6073i7 c6073i7) {
            C6056h.this.m13086d();
            C6056h.m13084z(c6073i7);
        }
    }

    public C6056h(C6064h7 c6064h7) {
        super("IdProvider");
        this.f15932p = null;
        this.f15937u = new AtomicBoolean(false);
        this.f15938v = new d();
        this.f15933q = c6064h7;
        this.f15934r = new C6074j();
        this.f15935s = new C6047g();
        this.f15936t = new C6038f();
        this.f15932p = new C6092l();
        this.f15933q.mo13050v(this.f15938v);
    }

    /* renamed from: z */
    static /* synthetic */ void m13084z(C6073i7 c6073i7) {
        HashMap map = new HashMap();
        map.put("previous_state", c6073i7.f15999a.name());
        map.put("current_state", c6073i7.f16000b.name());
        C6048g0.m13065a();
        C6048g0.m13068f("IdProvider: App State Change", map);
    }

    /* renamed from: c */
    public final boolean m13085c() {
        boolean z = this.f15937u.get();
        C6092l c6092l = this.f15932p;
        return z && (c6092l != null && c6092l.m13171a() != null && this.f15932p.m13171a().size() > 0);
    }

    /* renamed from: d */
    protected final void m13086d() {
        mo13007m(new c());
    }

    @Override // com.flurry.sdk.C6027d7
    /* renamed from: u */
    public final void mo13049u() {
        mo13007m(new a());
        mo13007m(new b());
    }

    @Override // com.flurry.sdk.C6027d7
    /* renamed from: v */
    public final void mo13050v(InterfaceC6046f7<C6092l> interfaceC6046f7) {
        super.mo13050v(interfaceC6046f7);
    }
}

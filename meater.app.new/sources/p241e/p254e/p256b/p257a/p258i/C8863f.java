package p241e.p254e.p256b.p257a.p258i;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C6267j;
import com.google.android.datatransport.runtime.backends.C6269l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6290t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6291u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6292v;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6293w;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6294x;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6295y;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.AbstractC8879v;
import p241e.p254e.p256b.p257a.p258i.p260b0.C8799c;
import p241e.p254e.p256b.p257a.p258i.p260b0.C8800d;
import p241e.p254e.p256b.p257a.p258i.p260b0.C8803g;
import p241e.p254e.p256b.p257a.p258i.p260b0.C8805i;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8831m0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8833n0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8835o0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8837p0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8841r0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8843s0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8847u0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8825j0;
import p241e.p254e.p256b.p257a.p258i.p262c0.C8856c;
import p241e.p254e.p256b.p257a.p258i.p262c0.C8857d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8881a;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8883c;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8884d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8882b;

/* compiled from: DaggerTransportRuntimeComponent.java */
/* renamed from: e.e.b.a.i.f */
/* loaded from: classes2.dex */
final class C8863f extends AbstractC8879v {

    /* renamed from: f */
    private Provider<Executor> f33589f;

    /* renamed from: g */
    private Provider<Context> f33590g;

    /* renamed from: h */
    private Provider f33591h;

    /* renamed from: i */
    private Provider f33592i;

    /* renamed from: j */
    private Provider f33593j;

    /* renamed from: k */
    private Provider<String> f33594k;

    /* renamed from: l */
    private Provider<C8841r0> f33595l;

    /* renamed from: m */
    private Provider<AbstractC6290t> f33596m;

    /* renamed from: n */
    private Provider<InterfaceC6295y> f33597n;

    /* renamed from: o */
    private Provider<C8799c> f33598o;

    /* renamed from: p */
    private Provider<C6291u> f33599p;

    /* renamed from: q */
    private Provider<C6293w> f33600q;

    /* renamed from: r */
    private Provider<C8878u> f33601r;

    /* compiled from: DaggerTransportRuntimeComponent.java */
    /* renamed from: e.e.b.a.i.f$b */
    private static final class b implements AbstractC8879v.a {

        /* renamed from: a */
        private Context f33602a;

        private b() {
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8879v.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo28145a(Context context) {
            this.f33602a = (Context) C8884d.m28188b(context);
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8879v.a
        /* renamed from: c */
        public AbstractC8879v mo28147c() {
            C8884d.m28187a(this.f33602a, Context.class);
            return new C8863f(this.f33602a);
        }
    }

    /* renamed from: c */
    public static AbstractC8879v.a m28141c() {
        return new b();
    }

    /* renamed from: d */
    private void m28142d(Context context) {
        this.f33589f = C8881a.m28184a(C8869l.m28160a());
        InterfaceC8882b interfaceC8882bM28186a = C8883c.m28186a(context);
        this.f33590g = interfaceC8882bM28186a;
        C6267j c6267jM13527a = C6267j.m13527a(interfaceC8882bM28186a, C8856c.m28113a(), C8857d.m28117a());
        this.f33591h = c6267jM13527a;
        this.f33592i = C8881a.m28184a(C6269l.m13534a(this.f33590g, c6267jM13527a));
        this.f33593j = C8847u0.m28093a(this.f33590g, C8831m0.m28008a(), C8835o0.m28015a());
        this.f33594k = C8881a.m28184a(C8833n0.m28012a(this.f33590g));
        this.f33595l = C8881a.m28184a(C8843s0.m28082a(C8856c.m28113a(), C8857d.m28117a(), C8837p0.m28019a(), this.f33593j, this.f33594k));
        C8803g c8803gM27968b = C8803g.m27968b(C8856c.m28113a());
        this.f33596m = c8803gM27968b;
        C8805i c8805iM27971a = C8805i.m27971a(this.f33590g, this.f33595l, c8803gM27968b, C8857d.m28117a());
        this.f33597n = c8805iM27971a;
        Provider<Executor> provider = this.f33589f;
        Provider provider2 = this.f33592i;
        Provider<C8841r0> provider3 = this.f33595l;
        this.f33598o = C8800d.m27963a(provider, provider2, c8805iM27971a, provider3, provider3);
        Provider<Context> provider4 = this.f33590g;
        Provider provider5 = this.f33592i;
        Provider<C8841r0> provider6 = this.f33595l;
        this.f33599p = C6292v.m13588a(provider4, provider5, provider6, this.f33597n, this.f33589f, provider6, C8856c.m28113a(), C8857d.m28117a(), this.f33595l);
        Provider<Executor> provider7 = this.f33589f;
        Provider<C8841r0> provider8 = this.f33595l;
        this.f33600q = C6294x.m13596a(provider7, provider8, this.f33597n, provider8);
        this.f33601r = C8881a.m28184a(C8880w.m28181a(C8856c.m28113a(), C8857d.m28117a(), this.f33598o, this.f33599p, this.f33600q));
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8879v
    /* renamed from: a */
    InterfaceC8825j0 mo28143a() {
        return this.f33595l.get();
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8879v
    /* renamed from: b */
    C8878u mo28144b() {
        return this.f33601r.get();
    }

    private C8863f(Context context) {
        m28142d(context);
    }
}

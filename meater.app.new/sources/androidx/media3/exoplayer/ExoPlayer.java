package androidx.media3.exoplayer;

import U1.C1727c;
import X1.C1804a;
import X1.InterfaceC1807d;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.C2124f;
import androidx.media3.exoplayer.C2125g;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.C2145i;
import androidx.media3.exoplayer.source.r;
import com.apptionlabs.meater_app.data.Config;
import d2.C3028F;
import d2.C3032d;
import d2.InterfaceC3026D;
import e2.C3160p0;
import e2.InterfaceC3129a;
import l8.InterfaceC3914g;
import q2.AbstractC4270C;
import v2.C4806l;

/* loaded from: classes.dex */
public interface ExoPlayer extends U1.B {

    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        long f26322A;

        /* renamed from: B, reason: collision with root package name */
        long f26323B;

        /* renamed from: C, reason: collision with root package name */
        boolean f26324C;

        /* renamed from: D, reason: collision with root package name */
        boolean f26325D;

        /* renamed from: E, reason: collision with root package name */
        C3028F f26326E;

        /* renamed from: F, reason: collision with root package name */
        boolean f26327F;

        /* renamed from: G, reason: collision with root package name */
        boolean f26328G;

        /* renamed from: H, reason: collision with root package name */
        String f26329H;

        /* renamed from: I, reason: collision with root package name */
        boolean f26330I;

        /* renamed from: J, reason: collision with root package name */
        x0 f26331J;

        /* renamed from: a, reason: collision with root package name */
        final Context f26332a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC1807d f26333b;

        /* renamed from: c, reason: collision with root package name */
        long f26334c;

        /* renamed from: d, reason: collision with root package name */
        l8.s<d2.H> f26335d;

        /* renamed from: e, reason: collision with root package name */
        l8.s<r.a> f26336e;

        /* renamed from: f, reason: collision with root package name */
        l8.s<AbstractC4270C> f26337f;

        /* renamed from: g, reason: collision with root package name */
        l8.s<V> f26338g;

        /* renamed from: h, reason: collision with root package name */
        l8.s<r2.d> f26339h;

        /* renamed from: i, reason: collision with root package name */
        InterfaceC3914g<InterfaceC1807d, InterfaceC3129a> f26340i;

        /* renamed from: j, reason: collision with root package name */
        Looper f26341j;

        /* renamed from: k, reason: collision with root package name */
        int f26342k;

        /* renamed from: l, reason: collision with root package name */
        PriorityTaskManager f26343l;

        /* renamed from: m, reason: collision with root package name */
        C1727c f26344m;

        /* renamed from: n, reason: collision with root package name */
        boolean f26345n;

        /* renamed from: o, reason: collision with root package name */
        int f26346o;

        /* renamed from: p, reason: collision with root package name */
        boolean f26347p;

        /* renamed from: q, reason: collision with root package name */
        boolean f26348q;

        /* renamed from: r, reason: collision with root package name */
        boolean f26349r;

        /* renamed from: s, reason: collision with root package name */
        int f26350s;

        /* renamed from: t, reason: collision with root package name */
        int f26351t;

        /* renamed from: u, reason: collision with root package name */
        boolean f26352u;

        /* renamed from: v, reason: collision with root package name */
        d2.I f26353v;

        /* renamed from: w, reason: collision with root package name */
        long f26354w;

        /* renamed from: x, reason: collision with root package name */
        long f26355x;

        /* renamed from: y, reason: collision with root package name */
        long f26356y;

        /* renamed from: z, reason: collision with root package name */
        InterfaceC3026D f26357z;

        public b(final Context context) {
            this(context, new l8.s() { // from class: d2.t
                @Override // l8.s
                public final Object get() {
                    return ExoPlayer.b.g(context);
                }
            }, new l8.s() { // from class: d2.u
                @Override // l8.s
                public final Object get() {
                    return ExoPlayer.b.h(context);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ d2.H g(Context context) {
            return new C3032d(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ r.a h(Context context) {
            return new C2145i(context, new C4806l());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ AbstractC4270C i(Context context) {
            return new q2.n(context);
        }

        public ExoPlayer f() {
            C1804a.g(!this.f26327F);
            this.f26327F = true;
            if (this.f26331J == null && X1.L.f18626a >= 35 && this.f26328G) {
                this.f26331J = new C2127i(this.f26332a, new Handler(this.f26341j));
            }
            return new H(this, null);
        }

        public b l(final d2.H h10) {
            C1804a.g(!this.f26327F);
            C1804a.e(h10);
            this.f26335d = new l8.s() { // from class: d2.v
                @Override // l8.s
                public final Object get() {
                    return ExoPlayer.b.k(h10);
                }
            };
            return this;
        }

        private b(final Context context, l8.s<d2.H> sVar, l8.s<r.a> sVar2) {
            this(context, sVar, sVar2, new l8.s() { // from class: d2.w
                @Override // l8.s
                public final Object get() {
                    return ExoPlayer.b.i(context);
                }
            }, new l8.s() { // from class: d2.x
                @Override // l8.s
                public final Object get() {
                    return new C2125g();
                }
            }, new l8.s() { // from class: d2.y
                @Override // l8.s
                public final Object get() {
                    return r2.i.n(context);
                }
            }, new InterfaceC3914g() { // from class: d2.z
                @Override // l8.InterfaceC3914g
                public final Object apply(Object obj) {
                    return new C3160p0((InterfaceC1807d) obj);
                }
            });
        }

        private b(Context context, l8.s<d2.H> sVar, l8.s<r.a> sVar2, l8.s<AbstractC4270C> sVar3, l8.s<V> sVar4, l8.s<r2.d> sVar5, InterfaceC3914g<InterfaceC1807d, InterfaceC3129a> interfaceC3914g) {
            this.f26332a = (Context) C1804a.e(context);
            this.f26335d = sVar;
            this.f26336e = sVar2;
            this.f26337f = sVar3;
            this.f26338g = sVar4;
            this.f26339h = sVar5;
            this.f26340i = interfaceC3914g;
            this.f26341j = X1.L.V();
            this.f26344m = C1727c.f17026g;
            this.f26346o = 0;
            this.f26350s = 1;
            this.f26351t = 0;
            this.f26352u = true;
            this.f26353v = d2.I.f39680g;
            this.f26354w = Config.MC_BROADCAST_INTERVAL_WIFI;
            this.f26355x = 15000L;
            this.f26356y = 3000L;
            this.f26357z = new C2124f.b().a();
            this.f26333b = InterfaceC1807d.f18647a;
            this.f26322A = 500L;
            this.f26323B = 2000L;
            this.f26325D = true;
            this.f26329H = "";
            this.f26342k = -1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ d2.H k(d2.H h10) {
            return h10;
        }
    }

    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f26358b = new c(-9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f26359a;

        public c(long j10) {
            this.f26359a = j10;
        }
    }

    void a(androidx.media3.exoplayer.source.r rVar, boolean z10);

    @Override // U1.B
    void c();

    void d(androidx.media3.exoplayer.source.r rVar);

    void setImageOutput(ImageOutput imageOutput);

    public interface a {
        default void D(boolean z10) {
        }

        default void G(boolean z10) {
        }
    }
}

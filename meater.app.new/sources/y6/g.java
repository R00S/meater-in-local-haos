package y6;

import H6.l;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import l6.InterfaceC3902a;
import m6.InterfaceC3970e;
import m6.InterfaceC3976k;
import o6.AbstractC4137a;
import p6.InterfaceC4239d;

/* compiled from: GifFrameLoader.java */
/* loaded from: classes2.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3902a f53165a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f53166b;

    /* renamed from: c, reason: collision with root package name */
    private final List<b> f53167c;

    /* renamed from: d, reason: collision with root package name */
    final k f53168d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4239d f53169e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f53170f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f53171g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f53172h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.j<Bitmap> f53173i;

    /* renamed from: j, reason: collision with root package name */
    private a f53174j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f53175k;

    /* renamed from: l, reason: collision with root package name */
    private a f53176l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f53177m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC3976k<Bitmap> f53178n;

    /* renamed from: o, reason: collision with root package name */
    private a f53179o;

    /* renamed from: p, reason: collision with root package name */
    private int f53180p;

    /* renamed from: q, reason: collision with root package name */
    private int f53181q;

    /* renamed from: r, reason: collision with root package name */
    private int f53182r;

    /* compiled from: GifFrameLoader.java */
    static class a extends E6.c<Bitmap> {

        /* renamed from: E, reason: collision with root package name */
        private final Handler f53183E;

        /* renamed from: F, reason: collision with root package name */
        final int f53184F;

        /* renamed from: G, reason: collision with root package name */
        private final long f53185G;

        /* renamed from: H, reason: collision with root package name */
        private Bitmap f53186H;

        a(Handler handler, int i10, long j10) {
            this.f53183E = handler;
            this.f53184F = i10;
            this.f53185G = j10;
        }

        @Override // E6.i
        public void k(Drawable drawable) {
            this.f53186H = null;
        }

        Bitmap l() {
            return this.f53186H;
        }

        @Override // E6.i
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(Bitmap bitmap, F6.b<? super Bitmap> bVar) {
            this.f53186H = bitmap;
            this.f53183E.sendMessageAtTime(this.f53183E.obtainMessage(1, this), this.f53185G);
        }
    }

    /* compiled from: GifFrameLoader.java */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            g.this.f53168d.o((a) message.obj);
            return false;
        }
    }

    g(com.bumptech.glide.b bVar, InterfaceC3902a interfaceC3902a, int i10, int i11, InterfaceC3976k<Bitmap> interfaceC3976k, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.t(bVar.h()), interfaceC3902a, null, i(com.bumptech.glide.b.t(bVar.h()), i10, i11), interfaceC3976k, bitmap);
    }

    private static InterfaceC3970e g() {
        return new G6.d(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.j<Bitmap> i(k kVar, int i10, int i11) {
        return kVar.m().b(D6.g.w0(AbstractC4137a.f46569b).s0(true).l0(true).Y(i10, i11));
    }

    private void l() {
        if (!this.f53170f || this.f53171g) {
            return;
        }
        if (this.f53172h) {
            H6.k.a(this.f53179o == null, "Pending target must be null when starting from the first frame");
            this.f53165a.g();
            this.f53172h = false;
        }
        a aVar = this.f53179o;
        if (aVar != null) {
            this.f53179o = null;
            m(aVar);
            return;
        }
        this.f53171g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.f53165a.d();
        this.f53165a.b();
        this.f53176l = new a(this.f53166b, this.f53165a.h(), jUptimeMillis);
        this.f53173i.b(D6.g.x0(g())).M0(this.f53165a).D0(this.f53176l);
    }

    private void n() {
        Bitmap bitmap = this.f53177m;
        if (bitmap != null) {
            this.f53169e.c(bitmap);
            this.f53177m = null;
        }
    }

    private void p() {
        if (this.f53170f) {
            return;
        }
        this.f53170f = true;
        this.f53175k = false;
        l();
    }

    private void q() {
        this.f53170f = false;
    }

    void a() {
        this.f53167c.clear();
        n();
        q();
        a aVar = this.f53174j;
        if (aVar != null) {
            this.f53168d.o(aVar);
            this.f53174j = null;
        }
        a aVar2 = this.f53176l;
        if (aVar2 != null) {
            this.f53168d.o(aVar2);
            this.f53176l = null;
        }
        a aVar3 = this.f53179o;
        if (aVar3 != null) {
            this.f53168d.o(aVar3);
            this.f53179o = null;
        }
        this.f53165a.clear();
        this.f53175k = true;
    }

    ByteBuffer b() {
        return this.f53165a.f().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f53174j;
        return aVar != null ? aVar.l() : this.f53177m;
    }

    int d() {
        a aVar = this.f53174j;
        if (aVar != null) {
            return aVar.f53184F;
        }
        return -1;
    }

    Bitmap e() {
        return this.f53177m;
    }

    int f() {
        return this.f53165a.c();
    }

    int h() {
        return this.f53182r;
    }

    int j() {
        return this.f53165a.i() + this.f53180p;
    }

    int k() {
        return this.f53181q;
    }

    void m(a aVar) {
        this.f53171g = false;
        if (this.f53175k) {
            this.f53166b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f53170f) {
            if (this.f53172h) {
                this.f53166b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f53179o = aVar;
                return;
            }
        }
        if (aVar.l() != null) {
            n();
            a aVar2 = this.f53174j;
            this.f53174j = aVar;
            for (int size = this.f53167c.size() - 1; size >= 0; size--) {
                this.f53167c.get(size).a();
            }
            if (aVar2 != null) {
                this.f53166b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(InterfaceC3976k<Bitmap> interfaceC3976k, Bitmap bitmap) {
        this.f53178n = (InterfaceC3976k) H6.k.d(interfaceC3976k);
        this.f53177m = (Bitmap) H6.k.d(bitmap);
        this.f53173i = this.f53173i.b(new D6.g().p0(interfaceC3976k));
        this.f53180p = l.h(bitmap);
        this.f53181q = bitmap.getWidth();
        this.f53182r = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.f53175k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f53167c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f53167c.isEmpty();
        this.f53167c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f53167c.remove(bVar);
        if (this.f53167c.isEmpty()) {
            q();
        }
    }

    g(InterfaceC4239d interfaceC4239d, k kVar, InterfaceC3902a interfaceC3902a, Handler handler, com.bumptech.glide.j<Bitmap> jVar, InterfaceC3976k<Bitmap> interfaceC3976k, Bitmap bitmap) {
        this.f53167c = new ArrayList();
        this.f53168d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f53169e = interfaceC4239d;
        this.f53166b = handler;
        this.f53173i = jVar;
        this.f53165a = interfaceC3902a;
        o(interfaceC3976k, bitmap);
    }
}

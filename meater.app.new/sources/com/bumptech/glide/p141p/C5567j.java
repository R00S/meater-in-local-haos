package com.bumptech.glide.p141p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C5351e;
import com.bumptech.glide.EnumC5353g;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.engine.C5394k;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.p131o.p134e.C5507a;
import com.bumptech.glide.p141p.p142l.InterfaceC5576h;
import com.bumptech.glide.p141p.p142l.InterfaceC5577i;
import com.bumptech.glide.p141p.p143m.InterfaceC5583e;
import com.bumptech.glide.p145r.C5592f;
import com.bumptech.glide.p145r.C5597k;
import com.bumptech.glide.p145r.p146l.AbstractC5600c;
import com.bumptech.glide.p145r.p146l.C5598a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.HttpUrl;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: SingleRequest.java */
/* renamed from: com.bumptech.glide.p.j */
/* loaded from: classes.dex */
public final class C5567j<R> implements InterfaceC5561d, InterfaceC5576h, InterfaceC5566i, C5598a.f {

    /* renamed from: f */
    private static final InterfaceC0956f<C5567j<?>> f13949f = C5598a.m11068d(150, new a());

    /* renamed from: g */
    private static final boolean f13950g = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private C5394k.d f13951A;

    /* renamed from: B */
    private long f13952B;

    /* renamed from: C */
    private b f13953C;

    /* renamed from: D */
    private Drawable f13954D;

    /* renamed from: E */
    private Drawable f13955E;

    /* renamed from: F */
    private Drawable f13956F;

    /* renamed from: G */
    private int f13957G;

    /* renamed from: H */
    private int f13958H;

    /* renamed from: I */
    private RuntimeException f13959I;

    /* renamed from: h */
    private boolean f13960h;

    /* renamed from: i */
    private final String f13961i;

    /* renamed from: j */
    private final AbstractC5600c f13962j;

    /* renamed from: k */
    private InterfaceC5564g<R> f13963k;

    /* renamed from: l */
    private InterfaceC5562e f13964l;

    /* renamed from: m */
    private Context f13965m;

    /* renamed from: n */
    private C5351e f13966n;

    /* renamed from: o */
    private Object f13967o;

    /* renamed from: p */
    private Class<R> f13968p;

    /* renamed from: q */
    private AbstractC5558a<?> f13969q;

    /* renamed from: r */
    private int f13970r;

    /* renamed from: s */
    private int f13971s;

    /* renamed from: t */
    private EnumC5353g f13972t;

    /* renamed from: u */
    private InterfaceC5577i<R> f13973u;

    /* renamed from: v */
    private List<InterfaceC5564g<R>> f13974v;

    /* renamed from: w */
    private C5394k f13975w;

    /* renamed from: x */
    private InterfaceC5583e<? super R> f13976x;

    /* renamed from: y */
    private Executor f13977y;

    /* renamed from: z */
    private InterfaceC5404u<R> f13978z;

    /* compiled from: SingleRequest.java */
    /* renamed from: com.bumptech.glide.p.j$a */
    class a implements C5598a.d<C5567j<?>> {
        a() {
        }

        @Override // com.bumptech.glide.p145r.p146l.C5598a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5567j<?> mo10211a() {
            return new C5567j<>();
        }
    }

    /* compiled from: SingleRequest.java */
    /* renamed from: com.bumptech.glide.p.j$b */
    private enum b {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    C5567j() {
        this.f13961i = f13950g ? String.valueOf(super.hashCode()) : null;
        this.f13962j = AbstractC5600c.m11078a();
    }

    /* renamed from: A */
    private void m10949A() {
        InterfaceC5562e interfaceC5562e = this.f13964l;
        if (interfaceC5562e != null) {
            interfaceC5562e.mo10936k(this);
        }
    }

    /* renamed from: B */
    public static <R> C5567j<R> m10950B(Context context, C5351e c5351e, Object obj, Class<R> cls, AbstractC5558a<?> abstractC5558a, int i2, int i3, EnumC5353g enumC5353g, InterfaceC5577i<R> interfaceC5577i, InterfaceC5564g<R> interfaceC5564g, List<InterfaceC5564g<R>> list, InterfaceC5562e interfaceC5562e, C5394k c5394k, InterfaceC5583e<? super R> interfaceC5583e, Executor executor) {
        C5567j<R> c5567j = (C5567j) f13949f.mo6061b();
        if (c5567j == null) {
            c5567j = new C5567j<>();
        }
        c5567j.m10963s(context, c5351e, obj, cls, abstractC5558a, i2, i3, enumC5353g, interfaceC5577i, interfaceC5564g, list, interfaceC5562e, c5394k, interfaceC5583e, executor);
        return c5567j;
    }

    /* renamed from: C */
    private synchronized void m10951C(GlideException glideException, int i2) {
        boolean zOnLoadFailed;
        this.f13962j.mo11080c();
        glideException.m10169k(this.f13959I);
        int iM10003g = this.f13966n.m10003g();
        if (iM10003g <= i2) {
            Log.w("Glide", "Load failed for " + this.f13967o + " with size [" + this.f13957G + "x" + this.f13958H + "]", glideException);
            if (iM10003g <= 4) {
                glideException.m10166g("Glide");
            }
        }
        this.f13951A = null;
        this.f13953C = b.FAILED;
        boolean z = true;
        this.f13960h = true;
        try {
            List<InterfaceC5564g<R>> list = this.f13974v;
            if (list != null) {
                Iterator<InterfaceC5564g<R>> it = list.iterator();
                zOnLoadFailed = false;
                while (it.hasNext()) {
                    zOnLoadFailed |= it.next().onLoadFailed(glideException, this.f13967o, this.f13973u, m10964t());
                }
            } else {
                zOnLoadFailed = false;
            }
            InterfaceC5564g<R> interfaceC5564g = this.f13963k;
            if (interfaceC5564g == null || !interfaceC5564g.onLoadFailed(glideException, this.f13967o, this.f13973u, m10964t())) {
                z = false;
            }
            if (!(zOnLoadFailed | z)) {
                m10954F();
            }
            this.f13960h = false;
            m10969z();
        } catch (Throwable th) {
            this.f13960h = false;
            throw th;
        }
    }

    /* renamed from: D */
    private synchronized void m10952D(InterfaceC5404u<R> interfaceC5404u, R r, EnumC5365a enumC5365a) {
        boolean zOnResourceReady;
        boolean zM10964t = m10964t();
        this.f13953C = b.COMPLETE;
        this.f13978z = interfaceC5404u;
        if (this.f13966n.m10003g() <= 3) {
            Log.d("Glide", "Finished loading " + r.getClass().getSimpleName() + " from " + enumC5365a + " for " + this.f13967o + " with size [" + this.f13957G + "x" + this.f13958H + "] in " + C5592f.m11027a(this.f13952B) + " ms");
        }
        boolean z = true;
        this.f13960h = true;
        try {
            List<InterfaceC5564g<R>> list = this.f13974v;
            if (list != null) {
                Iterator<InterfaceC5564g<R>> it = list.iterator();
                zOnResourceReady = false;
                while (it.hasNext()) {
                    zOnResourceReady |= it.next().onResourceReady(r, this.f13967o, this.f13973u, enumC5365a, zM10964t);
                }
            } else {
                zOnResourceReady = false;
            }
            InterfaceC5564g<R> interfaceC5564g = this.f13963k;
            if (interfaceC5564g == null || !interfaceC5564g.onResourceReady(r, this.f13967o, this.f13973u, enumC5365a, zM10964t)) {
                z = false;
            }
            if (!(z | zOnResourceReady)) {
                this.f13973u.onResourceReady(r, this.f13976x.mo11003a(enumC5365a, zM10964t));
            }
            this.f13960h = false;
            m10949A();
        } catch (Throwable th) {
            this.f13960h = false;
            throw th;
        }
    }

    /* renamed from: E */
    private void m10953E(InterfaceC5404u<?> interfaceC5404u) {
        this.f13975w.m10310j(interfaceC5404u);
        this.f13978z = null;
    }

    /* renamed from: F */
    private synchronized void m10954F() {
        if (m10957m()) {
            Drawable drawableM10961q = this.f13967o == null ? m10961q() : null;
            if (drawableM10961q == null) {
                drawableM10961q = m10960p();
            }
            if (drawableM10961q == null) {
                drawableM10961q = m10962r();
            }
            this.f13973u.onLoadFailed(drawableM10961q);
        }
    }

    /* renamed from: j */
    private void m10955j() {
        if (this.f13960h) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: k */
    private boolean m10956k() {
        InterfaceC5562e interfaceC5562e = this.f13964l;
        return interfaceC5562e == null || interfaceC5562e.mo10938m(this);
    }

    /* renamed from: m */
    private boolean m10957m() {
        InterfaceC5562e interfaceC5562e = this.f13964l;
        return interfaceC5562e == null || interfaceC5562e.mo10932g(this);
    }

    /* renamed from: n */
    private boolean m10958n() {
        InterfaceC5562e interfaceC5562e = this.f13964l;
        return interfaceC5562e == null || interfaceC5562e.mo10935j(this);
    }

    /* renamed from: o */
    private void m10959o() {
        m10955j();
        this.f13962j.mo11080c();
        this.f13973u.removeCallback(this);
        C5394k.d dVar = this.f13951A;
        if (dVar != null) {
            dVar.m10315a();
            this.f13951A = null;
        }
    }

    /* renamed from: p */
    private Drawable m10960p() {
        if (this.f13954D == null) {
            Drawable drawableM10907n = this.f13969q.m10907n();
            this.f13954D = drawableM10907n;
            if (drawableM10907n == null && this.f13969q.m10905m() > 0) {
                this.f13954D = m10966w(this.f13969q.m10905m());
            }
        }
        return this.f13954D;
    }

    /* renamed from: q */
    private Drawable m10961q() {
        if (this.f13956F == null) {
            Drawable drawableM10909o = this.f13969q.m10909o();
            this.f13956F = drawableM10909o;
            if (drawableM10909o == null && this.f13969q.m10911p() > 0) {
                this.f13956F = m10966w(this.f13969q.m10911p());
            }
        }
        return this.f13956F;
    }

    /* renamed from: r */
    private Drawable m10962r() {
        if (this.f13955E == null) {
            Drawable drawableM10918u = this.f13969q.m10918u();
            this.f13955E = drawableM10918u;
            if (drawableM10918u == null && this.f13969q.m10919v() > 0) {
                this.f13955E = m10966w(this.f13969q.m10919v());
            }
        }
        return this.f13955E;
    }

    /* renamed from: s */
    private synchronized void m10963s(Context context, C5351e c5351e, Object obj, Class<R> cls, AbstractC5558a<?> abstractC5558a, int i2, int i3, EnumC5353g enumC5353g, InterfaceC5577i<R> interfaceC5577i, InterfaceC5564g<R> interfaceC5564g, List<InterfaceC5564g<R>> list, InterfaceC5562e interfaceC5562e, C5394k c5394k, InterfaceC5583e<? super R> interfaceC5583e, Executor executor) {
        this.f13965m = context;
        this.f13966n = c5351e;
        this.f13967o = obj;
        this.f13968p = cls;
        this.f13969q = abstractC5558a;
        this.f13970r = i2;
        this.f13971s = i3;
        this.f13972t = enumC5353g;
        this.f13973u = interfaceC5577i;
        this.f13963k = interfaceC5564g;
        this.f13974v = list;
        this.f13964l = interfaceC5562e;
        this.f13975w = c5394k;
        this.f13976x = interfaceC5583e;
        this.f13977y = executor;
        this.f13953C = b.PENDING;
        if (this.f13959I == null && c5351e.m10005i()) {
            this.f13959I = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: t */
    private boolean m10964t() {
        InterfaceC5562e interfaceC5562e = this.f13964l;
        return interfaceC5562e == null || !interfaceC5562e.mo10927b();
    }

    /* renamed from: v */
    private synchronized boolean m10965v(C5567j<?> c5567j) {
        boolean z;
        synchronized (c5567j) {
            List<InterfaceC5564g<R>> list = this.f13974v;
            int size = list == null ? 0 : list.size();
            List<InterfaceC5564g<?>> list2 = c5567j.f13974v;
            z = size == (list2 == null ? 0 : list2.size());
        }
        return z;
    }

    /* renamed from: w */
    private Drawable m10966w(int i2) {
        return C5507a.m10704a(this.f13966n, i2, this.f13969q.m10872D() != null ? this.f13969q.m10872D() : this.f13965m.getTheme());
    }

    /* renamed from: x */
    private void m10967x(String str) {
        Log.v("Request", str + " this: " + this.f13961i);
    }

    /* renamed from: y */
    private static int m10968y(int i2, float f2) {
        return i2 == Integer.MIN_VALUE ? i2 : Math.round(f2 * i2);
    }

    /* renamed from: z */
    private void m10969z() {
        InterfaceC5562e interfaceC5562e = this.f13964l;
        if (interfaceC5562e != null) {
            interfaceC5562e.mo10926a(this);
        }
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5566i
    /* renamed from: a */
    public synchronized void mo10947a(GlideException glideException) {
        m10951C(glideException, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.p141p.InterfaceC5566i
    /* renamed from: b */
    public synchronized void mo10948b(InterfaceC5404u<?> interfaceC5404u, EnumC5365a enumC5365a) {
        this.f13962j.mo11080c();
        this.f13951A = null;
        if (interfaceC5404u == null) {
            mo10947a(new GlideException("Expected to receive a Resource<R> with an object of " + this.f13968p + " inside, but instead got null."));
            return;
        }
        Object obj = interfaceC5404u.get();
        if (obj != null && this.f13968p.isAssignableFrom(obj.getClass())) {
            if (m10958n()) {
                m10952D(interfaceC5404u, obj, enumC5365a);
                return;
            } else {
                m10953E(interfaceC5404u);
                this.f13953C = b.COMPLETE;
                return;
            }
        }
        m10953E(interfaceC5404u);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.f13968p);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append("{");
        sb.append(obj);
        sb.append("} inside Resource{");
        sb.append(interfaceC5404u);
        sb.append("}.");
        sb.append(obj != null ? HttpUrl.FRAGMENT_ENCODE_SET : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        mo10947a(new GlideException(sb.toString()));
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: c */
    public synchronized void mo10928c() {
        m10955j();
        this.f13965m = null;
        this.f13966n = null;
        this.f13967o = null;
        this.f13968p = null;
        this.f13969q = null;
        this.f13970r = -1;
        this.f13971s = -1;
        this.f13973u = null;
        this.f13974v = null;
        this.f13963k = null;
        this.f13964l = null;
        this.f13976x = null;
        this.f13951A = null;
        this.f13954D = null;
        this.f13955E = null;
        this.f13956F = null;
        this.f13957G = -1;
        this.f13958H = -1;
        this.f13959I = null;
        f13949f.mo6060a(this);
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    public synchronized void clear() {
        m10955j();
        this.f13962j.mo11080c();
        b bVar = this.f13953C;
        b bVar2 = b.CLEARED;
        if (bVar == bVar2) {
            return;
        }
        m10959o();
        InterfaceC5404u<R> interfaceC5404u = this.f13978z;
        if (interfaceC5404u != null) {
            m10953E(interfaceC5404u);
        }
        if (m10956k()) {
            this.f13973u.onLoadCleared(m10962r());
        }
        this.f13953C = bVar2;
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: d */
    public synchronized void mo10929d() {
        m10955j();
        this.f13962j.mo11080c();
        this.f13952B = C5592f.m11028b();
        if (this.f13967o == null) {
            if (C5597k.m11063t(this.f13970r, this.f13971s)) {
                this.f13957G = this.f13970r;
                this.f13958H = this.f13971s;
            }
            m10951C(new GlideException("Received null model"), m10961q() == null ? 5 : 3);
            return;
        }
        b bVar = this.f13953C;
        b bVar2 = b.RUNNING;
        if (bVar == bVar2) {
            throw new IllegalArgumentException("Cannot restart a running request");
        }
        if (bVar == b.COMPLETE) {
            mo10948b(this.f13978z, EnumC5365a.MEMORY_CACHE);
            return;
        }
        b bVar3 = b.WAITING_FOR_SIZE;
        this.f13953C = bVar3;
        if (C5597k.m11063t(this.f13970r, this.f13971s)) {
            mo10970g(this.f13970r, this.f13971s);
        } else {
            this.f13973u.getSize(this);
        }
        b bVar4 = this.f13953C;
        if ((bVar4 == bVar2 || bVar4 == bVar3) && m10957m()) {
            this.f13973u.onLoadStarted(m10962r());
        }
        if (f13950g) {
            m10967x("finished run method in " + C5592f.m11027a(this.f13952B));
        }
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: e */
    public synchronized boolean mo10930e(InterfaceC5561d interfaceC5561d) {
        boolean z = false;
        if (!(interfaceC5561d instanceof C5567j)) {
            return false;
        }
        C5567j<?> c5567j = (C5567j) interfaceC5561d;
        synchronized (c5567j) {
            if (this.f13970r == c5567j.f13970r && this.f13971s == c5567j.f13971s && C5597k.m11046c(this.f13967o, c5567j.f13967o) && this.f13968p.equals(c5567j.f13968p) && this.f13969q.equals(c5567j.f13969q) && this.f13972t == c5567j.f13972t && m10965v(c5567j)) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: f */
    public synchronized boolean mo10931f() {
        return mo10937l();
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5576h
    /* renamed from: g */
    public synchronized void mo10970g(int i2, int i3) throws Throwable {
        try {
            this.f13962j.mo11080c();
            boolean z = f13950g;
            if (z) {
                m10967x("Got onSizeReady in " + C5592f.m11027a(this.f13952B));
            }
            if (this.f13953C != b.WAITING_FOR_SIZE) {
                return;
            }
            b bVar = b.RUNNING;
            this.f13953C = bVar;
            float fM10871C = this.f13969q.m10871C();
            this.f13957G = m10968y(i2, fM10871C);
            this.f13958H = m10968y(i3, fM10871C);
            if (z) {
                m10967x("finished setup for calling load in " + C5592f.m11027a(this.f13952B));
            }
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f13951A = this.f13975w.m10309f(this.f13966n, this.f13967o, this.f13969q.m10870B(), this.f13957G, this.f13958H, this.f13969q.m10869A(), this.f13968p, this.f13972t, this.f13969q.m10903l(), this.f13969q.m10873E(), this.f13969q.m10880N(), this.f13969q.m10878J(), this.f13969q.m10914r(), this.f13969q.m10876H(), this.f13969q.m10875G(), this.f13969q.m10874F(), this.f13969q.m10912q(), this, this.f13977y);
                if (this.f13953C != bVar) {
                    this.f13951A = null;
                }
                if (z) {
                    m10967x("finished onSizeReady in " + C5592f.m11027a(this.f13952B));
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: h */
    public synchronized boolean mo10933h() {
        return this.f13953C == b.FAILED;
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: i */
    public synchronized boolean mo10934i() {
        return this.f13953C == b.CLEARED;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isRunning() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.bumptech.glide.p.j$b r0 = r2.f13953C     // Catch: java.lang.Throwable -> L11
            com.bumptech.glide.p.j$b r1 = com.bumptech.glide.p141p.C5567j.b.RUNNING     // Catch: java.lang.Throwable -> L11
            if (r0 == r1) goto Le
            com.bumptech.glide.p.j$b r1 = com.bumptech.glide.p141p.C5567j.b.WAITING_FOR_SIZE     // Catch: java.lang.Throwable -> L11
            if (r0 != r1) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            monitor-exit(r2)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p141p.C5567j.isRunning():boolean");
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5561d
    /* renamed from: l */
    public synchronized boolean mo10937l() {
        return this.f13953C == b.COMPLETE;
    }

    @Override // com.bumptech.glide.p145r.p146l.C5598a.f
    /* renamed from: u */
    public AbstractC5600c mo10213u() {
        return this.f13962j;
    }
}

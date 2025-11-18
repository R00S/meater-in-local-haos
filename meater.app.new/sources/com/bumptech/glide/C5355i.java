package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bumptech.glide.load.engine.AbstractC5393j;
import com.bumptech.glide.load.p131o.p136g.C5517c;
import com.bumptech.glide.p138m.C5545n;
import com.bumptech.glide.p138m.C5547p;
import com.bumptech.glide.p138m.InterfaceC5534c;
import com.bumptech.glide.p138m.InterfaceC5535d;
import com.bumptech.glide.p138m.InterfaceC5539h;
import com.bumptech.glide.p138m.InterfaceC5540i;
import com.bumptech.glide.p138m.InterfaceC5544m;
import com.bumptech.glide.p141p.C5565h;
import com.bumptech.glide.p141p.InterfaceC5561d;
import com.bumptech.glide.p141p.InterfaceC5564g;
import com.bumptech.glide.p141p.p142l.AbstractC5578j;
import com.bumptech.glide.p141p.p142l.InterfaceC5577i;
import com.bumptech.glide.p141p.p143m.InterfaceC5582d;
import com.bumptech.glide.p145r.C5597k;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RequestManager.java */
/* renamed from: com.bumptech.glide.i */
/* loaded from: classes.dex */
public class C5355i implements InterfaceC5540i {

    /* renamed from: f */
    private static final C5565h f13108f = C5565h.m10943s0(Bitmap.class).m10883Q();

    /* renamed from: g */
    private static final C5565h f13109g = C5565h.m10943s0(C5517c.class).m10883Q();

    /* renamed from: h */
    private static final C5565h f13110h = C5565h.m10944t0(AbstractC5393j.f13396c).m10891b0(EnumC5353g.LOW).m10902k0(true);

    /* renamed from: i */
    protected final ComponentCallbacks2C5349c f13111i;

    /* renamed from: j */
    protected final Context f13112j;

    /* renamed from: k */
    final InterfaceC5539h f13113k;

    /* renamed from: l */
    private final C5545n f13114l;

    /* renamed from: m */
    private final InterfaceC5544m f13115m;

    /* renamed from: n */
    private final C5547p f13116n;

    /* renamed from: o */
    private final Runnable f13117o;

    /* renamed from: p */
    private final Handler f13118p;

    /* renamed from: q */
    private final InterfaceC5534c f13119q;

    /* renamed from: r */
    private final CopyOnWriteArrayList<InterfaceC5564g<Object>> f13120r;

    /* renamed from: s */
    private C5565h f13121s;

    /* compiled from: RequestManager.java */
    /* renamed from: com.bumptech.glide.i$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5355i c5355i = C5355i.this;
            c5355i.f13113k.mo10783a(c5355i);
        }
    }

    /* compiled from: RequestManager.java */
    /* renamed from: com.bumptech.glide.i$b */
    private static class b extends AbstractC5578j<View, Object> {
        b(View view) {
            super(view);
        }

        @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
        public void onResourceReady(Object obj, InterfaceC5582d<? super Object> interfaceC5582d) {
        }
    }

    /* compiled from: RequestManager.java */
    /* renamed from: com.bumptech.glide.i$c */
    private class c implements InterfaceC5534c.a {

        /* renamed from: a */
        private final C5545n f13123a;

        c(C5545n c5545n) {
            this.f13123a = c5545n;
        }

        @Override // com.bumptech.glide.p138m.InterfaceC5534c.a
        /* renamed from: a */
        public void mo10048a(boolean z) {
            if (z) {
                synchronized (C5355i.this) {
                    this.f13123a.m10820e();
                }
            }
        }
    }

    public C5355i(ComponentCallbacks2C5349c componentCallbacks2C5349c, InterfaceC5539h interfaceC5539h, InterfaceC5544m interfaceC5544m, Context context) {
        this(componentCallbacks2C5349c, interfaceC5539h, interfaceC5544m, new C5545n(), componentCallbacks2C5349c.m9983g(), context);
    }

    /* renamed from: q */
    private void m10031q(InterfaceC5577i<?> interfaceC5577i) {
        if (m10047p(interfaceC5577i) || this.f13111i.m9989p(interfaceC5577i) || interfaceC5577i.getRequest() == null) {
            return;
        }
        InterfaceC5561d request = interfaceC5577i.getRequest();
        interfaceC5577i.setRequest(null);
        request.clear();
    }

    /* renamed from: a */
    public <ResourceType> C5354h<ResourceType> m10032a(Class<ResourceType> cls) {
        return new C5354h<>(this.f13111i, this, cls, this.f13112j);
    }

    /* renamed from: b */
    public C5354h<Bitmap> m10033b() {
        return m10032a(Bitmap.class).mo10026b(f13108f);
    }

    /* renamed from: c */
    public C5354h<Drawable> m10034c() {
        return m10032a(Drawable.class);
    }

    /* renamed from: d */
    public void m10035d(View view) {
        m10036e(new b(view));
    }

    /* renamed from: e */
    public synchronized void m10036e(InterfaceC5577i<?> interfaceC5577i) {
        if (interfaceC5577i == null) {
            return;
        }
        m10031q(interfaceC5577i);
    }

    /* renamed from: f */
    List<InterfaceC5564g<Object>> m10037f() {
        return this.f13120r;
    }

    /* renamed from: g */
    synchronized C5565h m10038g() {
        return this.f13121s;
    }

    /* renamed from: h */
    <T> AbstractC5356j<?, T> m10039h(Class<T> cls) {
        return this.f13111i.m9985i().m10001e(cls);
    }

    /* renamed from: i */
    public C5354h<Drawable> m10040i(Uri uri) {
        return m10034c().m10019G0(uri);
    }

    /* renamed from: j */
    public C5354h<Drawable> m10041j(Integer num) {
        return m10034c().m10020H0(num);
    }

    /* renamed from: k */
    public C5354h<Drawable> m10042k(String str) {
        return m10034c().m10022K0(str);
    }

    /* renamed from: l */
    public synchronized void m10043l() {
        this.f13114l.m10819d();
    }

    /* renamed from: m */
    public synchronized void m10044m() {
        this.f13114l.m10821f();
    }

    /* renamed from: n */
    protected synchronized void m10045n(C5565h c5565h) {
        this.f13121s = c5565h.clone().m10892d();
    }

    /* renamed from: o */
    synchronized void m10046o(InterfaceC5577i<?> interfaceC5577i, InterfaceC5561d interfaceC5561d) {
        this.f13116n.m10835c(interfaceC5577i);
        this.f13114l.m10822g(interfaceC5561d);
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public synchronized void onDestroy() {
        this.f13116n.onDestroy();
        Iterator<InterfaceC5577i<?>> it = this.f13116n.m10834b().iterator();
        while (it.hasNext()) {
            m10036e(it.next());
        }
        this.f13116n.m10833a();
        this.f13114l.m10818c();
        this.f13113k.mo10784b(this);
        this.f13113k.mo10784b(this.f13119q);
        this.f13118p.removeCallbacks(this.f13117o);
        this.f13111i.m9991s(this);
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public synchronized void onStart() {
        m10044m();
        this.f13116n.onStart();
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5540i
    public synchronized void onStop() {
        m10043l();
        this.f13116n.onStop();
    }

    /* renamed from: p */
    synchronized boolean m10047p(InterfaceC5577i<?> interfaceC5577i) {
        InterfaceC5561d request = interfaceC5577i.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f13114l.m10817b(request)) {
            return false;
        }
        this.f13116n.m10836d(interfaceC5577i);
        interfaceC5577i.setRequest(null);
        return true;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f13114l + ", treeNode=" + this.f13115m + "}";
    }

    C5355i(ComponentCallbacks2C5349c componentCallbacks2C5349c, InterfaceC5539h interfaceC5539h, InterfaceC5544m interfaceC5544m, C5545n c5545n, InterfaceC5535d interfaceC5535d, Context context) {
        this.f13116n = new C5547p();
        a aVar = new a();
        this.f13117o = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f13118p = handler;
        this.f13111i = componentCallbacks2C5349c;
        this.f13113k = interfaceC5539h;
        this.f13115m = interfaceC5544m;
        this.f13114l = c5545n;
        this.f13112j = context;
        InterfaceC5534c interfaceC5534cMo10788a = interfaceC5535d.mo10788a(context.getApplicationContext(), new c(c5545n));
        this.f13119q = interfaceC5534cMo10788a;
        if (C5597k.m11060q()) {
            handler.post(aVar);
        } else {
            interfaceC5539h.mo10783a(this);
        }
        interfaceC5539h.mo10783a(interfaceC5534cMo10788a);
        this.f13120r = new CopyOnWriteArrayList<>(componentCallbacks2C5349c.m9985i().m9999c());
        m10045n(componentCallbacks2C5349c.m9985i().m10000d());
        componentCallbacks2C5349c.m9988o(this);
    }
}

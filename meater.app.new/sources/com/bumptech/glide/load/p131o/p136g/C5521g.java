package com.bumptech.glide.load.p131o.p136g;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.C5354h;
import com.bumptech.glide.C5355i;
import com.bumptech.glide.ComponentCallbacks2C5349c;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.InterfaceC5429l;
import com.bumptech.glide.load.engine.AbstractC5393j;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.p122l.InterfaceC5360a;
import com.bumptech.glide.p141p.C5565h;
import com.bumptech.glide.p141p.p142l.AbstractC5575g;
import com.bumptech.glide.p141p.p143m.InterfaceC5582d;
import com.bumptech.glide.p144q.C5586c;
import com.bumptech.glide.p145r.C5596j;
import com.bumptech.glide.p145r.C5597k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GifFrameLoader.java */
/* renamed from: com.bumptech.glide.load.o.g.g */
/* loaded from: classes.dex */
class C5521g {

    /* renamed from: a */
    private final InterfaceC5360a f13817a;

    /* renamed from: b */
    private final Handler f13818b;

    /* renamed from: c */
    private final List<b> f13819c;

    /* renamed from: d */
    final C5355i f13820d;

    /* renamed from: e */
    private final InterfaceC5413e f13821e;

    /* renamed from: f */
    private boolean f13822f;

    /* renamed from: g */
    private boolean f13823g;

    /* renamed from: h */
    private boolean f13824h;

    /* renamed from: i */
    private C5354h<Bitmap> f13825i;

    /* renamed from: j */
    private a f13826j;

    /* renamed from: k */
    private boolean f13827k;

    /* renamed from: l */
    private a f13828l;

    /* renamed from: m */
    private Bitmap f13829m;

    /* renamed from: n */
    private InterfaceC5429l<Bitmap> f13830n;

    /* renamed from: o */
    private a f13831o;

    /* renamed from: p */
    private d f13832p;

    /* compiled from: GifFrameLoader.java */
    /* renamed from: com.bumptech.glide.load.o.g.g$a */
    static class a extends AbstractC5575g<Bitmap> {

        /* renamed from: f */
        private final Handler f13833f;

        /* renamed from: g */
        final int f13834g;

        /* renamed from: h */
        private final long f13835h;

        /* renamed from: i */
        private Bitmap f13836i;

        a(Handler handler, int i2, long j2) {
            this.f13833f = handler;
            this.f13834g = i2;
            this.f13835h = j2;
        }

        /* renamed from: c */
        Bitmap m10768c() {
            return this.f13836i;
        }

        @Override // com.bumptech.glide.p141p.p142l.InterfaceC5577i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Bitmap bitmap, InterfaceC5582d<? super Bitmap> interfaceC5582d) {
            this.f13836i = bitmap;
            this.f13833f.sendMessageAtTime(this.f13833f.obtainMessage(1, this), this.f13835h);
        }
    }

    /* compiled from: GifFrameLoader.java */
    /* renamed from: com.bumptech.glide.load.o.g.g$b */
    public interface b {
        /* renamed from: a */
        void mo10739a();
    }

    /* compiled from: GifFrameLoader.java */
    /* renamed from: com.bumptech.glide.load.o.g.g$c */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                C5521g.this.m10764n((a) message.obj);
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            C5521g.this.f13820d.m10036e((a) message.obj);
            return false;
        }
    }

    /* compiled from: GifFrameLoader.java */
    /* renamed from: com.bumptech.glide.load.o.g.g$d */
    interface d {
        /* renamed from: a */
        void m10770a();
    }

    C5521g(ComponentCallbacks2C5349c componentCallbacks2C5349c, InterfaceC5360a interfaceC5360a, int i2, int i3, InterfaceC5429l<Bitmap> interfaceC5429l, Bitmap bitmap) {
        this(componentCallbacks2C5349c.m9982f(), ComponentCallbacks2C5349c.m9978t(componentCallbacks2C5349c.m9984h()), interfaceC5360a, null, m10750j(ComponentCallbacks2C5349c.m9978t(componentCallbacks2C5349c.m9984h()), i2, i3), interfaceC5429l, bitmap);
    }

    /* renamed from: g */
    private static InterfaceC5423f m10748g() {
        return new C5586c(Double.valueOf(Math.random()));
    }

    /* renamed from: h */
    private int m10749h() {
        return C5597k.m11050g(m10757c().getWidth(), m10757c().getHeight(), m10757c().getConfig());
    }

    /* renamed from: j */
    private static C5354h<Bitmap> m10750j(C5355i c5355i, int i2, int i3) {
        return c5355i.m10033b().mo10026b(C5565h.m10944t0(AbstractC5393j.f13395b).m10915r0(true).m10902k0(true).m10888X(i2, i3));
    }

    /* renamed from: m */
    private void m10751m() {
        if (!this.f13822f || this.f13823g) {
            return;
        }
        if (this.f13824h) {
            C5596j.m11039a(this.f13831o == null, "Pending target must be null when starting from the first frame");
            this.f13817a.mo10111g();
            this.f13824h = false;
        }
        a aVar = this.f13831o;
        if (aVar != null) {
            this.f13831o = null;
            m10764n(aVar);
            return;
        }
        this.f13823g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + this.f13817a.mo10109e();
        this.f13817a.mo10107c();
        this.f13828l = new a(this.f13818b, this.f13817a.mo10112h(), jUptimeMillis);
        this.f13825i.mo10026b(C5565h.m10946v0(m10748g())).m10021I0(this.f13817a).m10015A0(this.f13828l);
    }

    /* renamed from: o */
    private void m10752o() {
        Bitmap bitmap = this.f13829m;
        if (bitmap != null) {
            this.f13821e.mo10387c(bitmap);
            this.f13829m = null;
        }
    }

    /* renamed from: q */
    private void m10753q() {
        if (this.f13822f) {
            return;
        }
        this.f13822f = true;
        this.f13827k = false;
        m10751m();
    }

    /* renamed from: r */
    private void m10754r() {
        this.f13822f = false;
    }

    /* renamed from: a */
    void m10755a() {
        this.f13819c.clear();
        m10752o();
        m10754r();
        a aVar = this.f13826j;
        if (aVar != null) {
            this.f13820d.m10036e(aVar);
            this.f13826j = null;
        }
        a aVar2 = this.f13828l;
        if (aVar2 != null) {
            this.f13820d.m10036e(aVar2);
            this.f13828l = null;
        }
        a aVar3 = this.f13831o;
        if (aVar3 != null) {
            this.f13820d.m10036e(aVar3);
            this.f13831o = null;
        }
        this.f13817a.clear();
        this.f13827k = true;
    }

    /* renamed from: b */
    ByteBuffer m10756b() {
        return this.f13817a.mo10106b().asReadOnlyBuffer();
    }

    /* renamed from: c */
    Bitmap m10757c() {
        a aVar = this.f13826j;
        return aVar != null ? aVar.m10768c() : this.f13829m;
    }

    /* renamed from: d */
    int m10758d() {
        a aVar = this.f13826j;
        if (aVar != null) {
            return aVar.f13834g;
        }
        return -1;
    }

    /* renamed from: e */
    Bitmap m10759e() {
        return this.f13829m;
    }

    /* renamed from: f */
    int m10760f() {
        return this.f13817a.mo10108d();
    }

    /* renamed from: i */
    int m10761i() {
        return m10757c().getHeight();
    }

    /* renamed from: k */
    int m10762k() {
        return this.f13817a.mo10113i() + m10749h();
    }

    /* renamed from: l */
    int m10763l() {
        return m10757c().getWidth();
    }

    /* renamed from: n */
    void m10764n(a aVar) {
        d dVar = this.f13832p;
        if (dVar != null) {
            dVar.m10770a();
        }
        this.f13823g = false;
        if (this.f13827k) {
            this.f13818b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f13822f) {
            this.f13831o = aVar;
            return;
        }
        if (aVar.m10768c() != null) {
            m10752o();
            a aVar2 = this.f13826j;
            this.f13826j = aVar;
            for (int size = this.f13819c.size() - 1; size >= 0; size--) {
                this.f13819c.get(size).mo10739a();
            }
            if (aVar2 != null) {
                this.f13818b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m10751m();
    }

    /* renamed from: p */
    void m10765p(InterfaceC5429l<Bitmap> interfaceC5429l, Bitmap bitmap) {
        this.f13830n = (InterfaceC5429l) C5596j.m11042d(interfaceC5429l);
        this.f13829m = (Bitmap) C5596j.m11042d(bitmap);
        this.f13825i = this.f13825i.mo10026b(new C5565h().m10904l0(interfaceC5429l));
    }

    /* renamed from: s */
    void m10766s(b bVar) {
        if (this.f13827k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f13819c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f13819c.isEmpty();
        this.f13819c.add(bVar);
        if (zIsEmpty) {
            m10753q();
        }
    }

    /* renamed from: t */
    void m10767t(b bVar) {
        this.f13819c.remove(bVar);
        if (this.f13819c.isEmpty()) {
            m10754r();
        }
    }

    C5521g(InterfaceC5413e interfaceC5413e, C5355i c5355i, InterfaceC5360a interfaceC5360a, Handler handler, C5354h<Bitmap> c5354h, InterfaceC5429l<Bitmap> interfaceC5429l, Bitmap bitmap) {
        this.f13819c = new ArrayList();
        this.f13820d = c5355i;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f13821e = interfaceC5413e;
        this.f13818b = handler;
        this.f13825i = c5354h;
        this.f13817a = interfaceC5360a;
        m10765p(interfaceC5429l, bitmap);
    }
}

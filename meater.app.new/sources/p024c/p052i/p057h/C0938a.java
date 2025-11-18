package p024c.p052i.p057h;

import android.graphics.Typeface;
import android.os.Handler;
import p024c.p052i.p057h.C0942e;
import p024c.p052i.p057h.C0943f;

/* compiled from: CallbackWithHandler.java */
/* renamed from: c.i.h.a */
/* loaded from: classes.dex */
class C0938a {

    /* renamed from: a */
    private final C0943f.c f6313a;

    /* renamed from: b */
    private final Handler f6314b;

    /* compiled from: CallbackWithHandler.java */
    /* renamed from: c.i.h.a$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0943f.c f6315f;

        /* renamed from: g */
        final /* synthetic */ Typeface f6316g;

        a(C0943f.c cVar, Typeface typeface) {
            this.f6315f = cVar;
            this.f6316g = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6315f.mo5917b(this.f6316g);
        }
    }

    /* compiled from: CallbackWithHandler.java */
    /* renamed from: c.i.h.a$b */
    class b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0943f.c f6318f;

        /* renamed from: g */
        final /* synthetic */ int f6319g;

        b(C0943f.c cVar, int i2) {
            this.f6318f = cVar;
            this.f6319g = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6318f.mo5916a(this.f6319g);
        }
    }

    C0938a(C0943f.c cVar, Handler handler) {
        this.f6313a = cVar;
        this.f6314b = handler;
    }

    /* renamed from: a */
    private void m5967a(int i2) {
        this.f6314b.post(new b(this.f6313a, i2));
    }

    /* renamed from: c */
    private void m5968c(Typeface typeface) {
        this.f6314b.post(new a(this.f6313a, typeface));
    }

    /* renamed from: b */
    void m5969b(C0942e.e eVar) {
        if (eVar.m5995a()) {
            m5968c(eVar.f6342a);
        } else {
            m5967a(eVar.f6343b);
        }
    }
}

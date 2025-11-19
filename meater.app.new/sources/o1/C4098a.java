package o1;

import android.graphics.Typeface;
import java.util.concurrent.Executor;
import o1.i;
import o1.k;

/* compiled from: CallbackWrapper.java */
/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C4098a {

    /* renamed from: a, reason: collision with root package name */
    private final k.c f46263a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f46264b;

    /* compiled from: CallbackWrapper.java */
    /* renamed from: o1.a$a, reason: collision with other inner class name */
    class RunnableC0633a implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ k.c f46265B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Typeface f46266C;

        RunnableC0633a(k.c cVar, Typeface typeface) {
            this.f46265B = cVar;
            this.f46266C = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f46265B.b(this.f46266C);
        }
    }

    /* compiled from: CallbackWrapper.java */
    /* renamed from: o1.a$b */
    class b implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ k.c f46268B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f46269C;

        b(k.c cVar, int i10) {
            this.f46268B = cVar;
            this.f46269C = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f46268B.a(this.f46269C);
        }
    }

    C4098a(k.c cVar, Executor executor) {
        this.f46263a = cVar;
        this.f46264b = executor;
    }

    private void a(int i10) {
        this.f46264b.execute(new b(this.f46263a, i10));
    }

    private void c(Typeface typeface) {
        this.f46264b.execute(new RunnableC0633a(this.f46263a, typeface));
    }

    void b(i.e eVar) {
        if (eVar.a()) {
            c(eVar.f46297a);
        } else {
            a(eVar.f46298b);
        }
    }
}

package p241e.p254e.p256b.p271c.p285x;

import android.graphics.Typeface;

/* compiled from: CancelableFontCallback.java */
/* renamed from: e.e.b.c.x.a */
/* loaded from: classes2.dex */
public final class C8945a extends AbstractC8950f {

    /* renamed from: a */
    private final Typeface f34423a;

    /* renamed from: b */
    private final a f34424b;

    /* renamed from: c */
    private boolean f34425c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: e.e.b.c.x.a$a */
    public interface a {
        /* renamed from: a */
        void mo24655a(Typeface typeface);
    }

    public C8945a(a aVar, Typeface typeface) {
        this.f34423a = typeface;
        this.f34424b = aVar;
    }

    /* renamed from: d */
    private void m28493d(Typeface typeface) {
        if (this.f34425c) {
            return;
        }
        this.f34424b.mo24655a(typeface);
    }

    @Override // p241e.p254e.p256b.p271c.p285x.AbstractC8950f
    /* renamed from: a */
    public void mo24151a(int i2) {
        m28493d(this.f34423a);
    }

    @Override // p241e.p254e.p256b.p271c.p285x.AbstractC8950f
    /* renamed from: b */
    public void mo24152b(Typeface typeface, boolean z) {
        m28493d(typeface);
    }

    /* renamed from: c */
    public void m28494c() {
        this.f34425c = true;
    }
}

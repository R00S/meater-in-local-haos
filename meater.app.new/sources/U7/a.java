package U7;

import android.graphics.Typeface;

/* compiled from: CancelableFontCallback.java */
/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f17642a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0260a f17643b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17644c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: U7.a$a, reason: collision with other inner class name */
    public interface InterfaceC0260a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0260a interfaceC0260a, Typeface typeface) {
        this.f17642a = typeface;
        this.f17643b = interfaceC0260a;
    }

    private void d(Typeface typeface) {
        if (this.f17644c) {
            return;
        }
        this.f17643b.a(typeface);
    }

    @Override // U7.f
    public void a(int i10) {
        d(this.f17642a);
    }

    @Override // U7.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f17644c = true;
    }
}

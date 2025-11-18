package E6;

import H6.l;
import android.graphics.drawable.Drawable;

/* compiled from: CustomTarget.java */
/* loaded from: classes2.dex */
public abstract class c<T> implements i<T> {

    /* renamed from: B, reason: collision with root package name */
    private final int f3992B;

    /* renamed from: C, reason: collision with root package name */
    private final int f3993C;

    /* renamed from: D, reason: collision with root package name */
    private D6.d f3994D;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // E6.i
    public final void c(h hVar) {
        hVar.c(this.f3992B, this.f3993C);
    }

    @Override // E6.i
    public final void d(D6.d dVar) {
        this.f3994D = dVar;
    }

    @Override // E6.i
    public final D6.d i() {
        return this.f3994D;
    }

    public c(int i10, int i11) {
        if (l.t(i10, i11)) {
            this.f3992B = i10;
            this.f3993C = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // A6.l
    public void a() {
    }

    @Override // A6.l
    public void b() {
    }

    @Override // A6.l
    public void e() {
    }

    @Override // E6.i
    public final void f(h hVar) {
    }

    @Override // E6.i
    public void g(Drawable drawable) {
    }

    @Override // E6.i
    public void h(Drawable drawable) {
    }
}

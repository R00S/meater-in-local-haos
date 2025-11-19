package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: TypefaceEmojiRasterizer.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<G1.a> f25282d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    private final int f25283a;

    /* renamed from: b, reason: collision with root package name */
    private final n f25284b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f25285c = 0;

    p(n nVar, int i10) {
        this.f25284b = nVar;
        this.f25283a = i10;
    }

    private G1.a g() {
        ThreadLocal<G1.a> threadLocal = f25282d;
        G1.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new G1.a();
            threadLocal.set(aVar);
        }
        this.f25284b.d().j(aVar, this.f25283a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface typefaceG = this.f25284b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f25284b.c(), this.f25283a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.f25285c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f25285c & 4) > 0;
    }

    public void l(boolean z10) {
        int iD = d();
        if (z10) {
            this.f25285c = iD | 4;
        } else {
            this.f25285c = iD;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void m(boolean z10) {
        int i10 = this.f25285c & 4;
        this.f25285c = z10 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}

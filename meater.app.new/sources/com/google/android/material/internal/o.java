package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
/* loaded from: classes2.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    private float f36786c;

    /* renamed from: d, reason: collision with root package name */
    private float f36787d;

    /* renamed from: g, reason: collision with root package name */
    private U7.d f36790g;

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f36784a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    private final U7.f f36785b = new a();

    /* renamed from: e, reason: collision with root package name */
    private boolean f36788e = true;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<b> f36789f = new WeakReference<>(null);

    /* compiled from: TextDrawableHelper.java */
    class a extends U7.f {
        a() {
        }

        @Override // U7.f
        public void a(int i10) {
            o.this.f36788e = true;
            b bVar = (b) o.this.f36789f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // U7.f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            o.this.f36788e = true;
            b bVar = (b) o.this.f36789f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public o(b bVar) {
        j(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f36784a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f36784a.measureText(charSequence, 0, charSequence.length());
    }

    private void i(String str) {
        this.f36786c = d(str);
        this.f36787d = c(str);
        this.f36788e = false;
    }

    public U7.d e() {
        return this.f36790g;
    }

    public float f(String str) {
        if (!this.f36788e) {
            return this.f36787d;
        }
        i(str);
        return this.f36787d;
    }

    public TextPaint g() {
        return this.f36784a;
    }

    public float h(String str) {
        if (!this.f36788e) {
            return this.f36786c;
        }
        i(str);
        return this.f36786c;
    }

    public void j(b bVar) {
        this.f36789f = new WeakReference<>(bVar);
    }

    public void k(U7.d dVar, Context context) {
        if (this.f36790g != dVar) {
            this.f36790g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f36784a, this.f36785b);
                b bVar = this.f36789f.get();
                if (bVar != null) {
                    this.f36784a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f36784a, this.f36785b);
                this.f36788e = true;
            }
            b bVar2 = this.f36789f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z10) {
        this.f36788e = z10;
    }

    public void m(boolean z10) {
        this.f36788e = z10;
    }

    public void n(Context context) {
        this.f36790g.n(context, this.f36784a, this.f36785b);
    }
}

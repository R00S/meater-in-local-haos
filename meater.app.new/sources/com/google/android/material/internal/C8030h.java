package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p241e.p254e.p256b.p271c.p285x.AbstractC8950f;
import p241e.p254e.p256b.p271c.p285x.C8948d;

/* compiled from: TextDrawableHelper.java */
/* renamed from: com.google.android.material.internal.h */
/* loaded from: classes2.dex */
public class C8030h {

    /* renamed from: c */
    private float f30414c;

    /* renamed from: f */
    private C8948d f30417f;

    /* renamed from: a */
    private final TextPaint f30412a = new TextPaint(1);

    /* renamed from: b */
    private final AbstractC8950f f30413b = new a();

    /* renamed from: d */
    private boolean f30415d = true;

    /* renamed from: e */
    private WeakReference<b> f30416e = new WeakReference<>(null);

    /* compiled from: TextDrawableHelper.java */
    /* renamed from: com.google.android.material.internal.h$a */
    class a extends AbstractC8950f {
        a() {
        }

        @Override // p241e.p254e.p256b.p271c.p285x.AbstractC8950f
        /* renamed from: a */
        public void mo24151a(int i2) {
            C8030h.this.f30415d = true;
            b bVar = (b) C8030h.this.f30416e.get();
            if (bVar != null) {
                bVar.mo23817a();
            }
        }

        @Override // p241e.p254e.p256b.p271c.p285x.AbstractC8950f
        /* renamed from: b */
        public void mo24152b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            C8030h.this.f30415d = true;
            b bVar = (b) C8030h.this.f30416e.get();
            if (bVar != null) {
                bVar.mo23817a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    /* renamed from: com.google.android.material.internal.h$b */
    public interface b {
        /* renamed from: a */
        void mo23817a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C8030h(b bVar) {
        m24682g(bVar);
    }

    /* renamed from: c */
    private float m24678c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f30412a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C8948d m24679d() {
        return this.f30417f;
    }

    /* renamed from: e */
    public TextPaint m24680e() {
        return this.f30412a;
    }

    /* renamed from: f */
    public float m24681f(String str) {
        if (!this.f30415d) {
            return this.f30414c;
        }
        float fM24678c = m24678c(str);
        this.f30414c = fM24678c;
        this.f30415d = false;
        return fM24678c;
    }

    /* renamed from: g */
    public void m24682g(b bVar) {
        this.f30416e = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public void m24683h(C8948d c8948d, Context context) {
        if (this.f30417f != c8948d) {
            this.f30417f = c8948d;
            if (c8948d != null) {
                c8948d.m28514j(context, this.f30412a, this.f30413b);
                b bVar = this.f30416e.get();
                if (bVar != null) {
                    this.f30412a.drawableState = bVar.getState();
                }
                c8948d.m28513i(context, this.f30412a, this.f30413b);
                this.f30415d = true;
            }
            b bVar2 = this.f30416e.get();
            if (bVar2 != null) {
                bVar2.mo23817a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void m24684i(boolean z) {
        this.f30415d = z;
    }

    /* renamed from: j */
    public void m24685j(Context context) {
        this.f30417f.m28513i(context, this.f30412a, this.f30413b);
    }
}

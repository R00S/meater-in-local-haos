package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.f;
import j1.C3720e;

/* compiled from: DefaultGlyphChecker.java */
/* loaded from: classes.dex */
class e implements f.e {

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f25197b = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    private final TextPaint f25198a;

    e() {
        TextPaint textPaint = new TextPaint();
        this.f25198a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    private static StringBuilder b() {
        ThreadLocal<StringBuilder> threadLocal = f25197b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.f.e
    public boolean a(CharSequence charSequence, int i10, int i11, int i12) {
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i10 < i11) {
            sbB.append(charSequence.charAt(i10));
            i10++;
        }
        return C3720e.a(this.f25198a, sbB.toString());
    }
}

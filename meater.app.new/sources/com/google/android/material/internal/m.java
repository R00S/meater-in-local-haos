package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: StaticLayoutBuilderCompat.java */
/* loaded from: classes2.dex */
final class m {

    /* renamed from: n, reason: collision with root package name */
    static final int f36770n = 1;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f36771a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f36772b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36773c;

    /* renamed from: e, reason: collision with root package name */
    private int f36775e;

    /* renamed from: l, reason: collision with root package name */
    private boolean f36782l;

    /* renamed from: d, reason: collision with root package name */
    private int f36774d = 0;

    /* renamed from: f, reason: collision with root package name */
    private Layout.Alignment f36776f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    private int f36777g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    private float f36778h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f36779i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f36780j = f36770n;

    /* renamed from: k, reason: collision with root package name */
    private boolean f36781k = true;

    /* renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f36783m = null;

    /* compiled from: StaticLayoutBuilderCompat.java */
    static class a extends Exception {
    }

    private m(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f36771a = charSequence;
        this.f36772b = textPaint;
        this.f36773c = i10;
        this.f36775e = charSequence.length();
    }

    public static m b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new m(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f36771a == null) {
            this.f36771a = "";
        }
        int iMax = Math.max(0, this.f36773c);
        CharSequence charSequenceEllipsize = this.f36771a;
        if (this.f36777g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f36772b, iMax, this.f36783m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f36775e);
        this.f36775e = iMin;
        if (this.f36782l && this.f36777g == 1) {
            this.f36776f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f36774d, iMin, this.f36772b, iMax);
        builderObtain.setAlignment(this.f36776f);
        builderObtain.setIncludePad(this.f36781k);
        builderObtain.setTextDirection(this.f36782l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f36783m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f36777g);
        float f10 = this.f36778h;
        if (f10 != 0.0f || this.f36779i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f36779i);
        }
        if (this.f36777g > 1) {
            builderObtain.setHyphenationFrequency(this.f36780j);
        }
        return builderObtain.build();
    }

    public m c(Layout.Alignment alignment) {
        this.f36776f = alignment;
        return this;
    }

    public m d(TextUtils.TruncateAt truncateAt) {
        this.f36783m = truncateAt;
        return this;
    }

    public m e(int i10) {
        this.f36780j = i10;
        return this;
    }

    public m f(boolean z10) {
        this.f36781k = z10;
        return this;
    }

    public m g(boolean z10) {
        this.f36782l = z10;
        return this;
    }

    public m h(float f10, float f11) {
        this.f36778h = f10;
        this.f36779i = f11;
        return this;
    }

    public m i(int i10) {
        this.f36777g = i10;
        return this;
    }

    public m j(n nVar) {
        return this;
    }
}

package q1;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import r1.C4337d;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public class q implements Spannable {

    /* renamed from: E, reason: collision with root package name */
    private static final Object f47778E = new Object();

    /* renamed from: B, reason: collision with root package name */
    private final Spannable f47779B;

    /* renamed from: C, reason: collision with root package name */
    private final a f47780C;

    /* renamed from: D, reason: collision with root package name */
    private final PrecomputedText f47781D;

    public a a() {
        return this.f47780C;
    }

    public PrecomputedText b() {
        if (C4262c.a(this.f47779B)) {
            return C4263d.a(this.f47779B);
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f47779B.charAt(i10);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f47779B.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f47779B.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f47779B.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f47781D.getSpans(i10, i11, cls) : (T[]) this.f47779B.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f47779B.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f47779B.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f47781D.removeSpan(obj);
        } else {
            this.f47779B.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f47781D.setSpan(obj, i10, i11, i12);
        } else {
            this.f47779B.setSpan(obj, i10, i11, i12);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f47779B.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f47779B.toString();
    }

    /* compiled from: PrecomputedTextCompat.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final TextPaint f47782a;

        /* renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f47783b;

        /* renamed from: c, reason: collision with root package name */
        private final int f47784c;

        /* renamed from: d, reason: collision with root package name */
        private final int f47785d;

        /* renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f47786e;

        /* compiled from: PrecomputedTextCompat.java */
        /* renamed from: q1.q$a$a, reason: collision with other inner class name */
        public static class C0665a {

            /* renamed from: a, reason: collision with root package name */
            private final TextPaint f47787a;

            /* renamed from: c, reason: collision with root package name */
            private int f47789c = 1;

            /* renamed from: d, reason: collision with root package name */
            private int f47790d = 1;

            /* renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f47788b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0665a(TextPaint textPaint) {
                this.f47787a = textPaint;
            }

            public a a() {
                return new a(this.f47787a, this.f47788b, this.f47789c, this.f47790d);
            }

            public C0665a b(int i10) {
                this.f47789c = i10;
                return this;
            }

            public C0665a c(int i10) {
                this.f47790d = i10;
                return this;
            }

            public C0665a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f47788b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f47786e = p.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f47786e = null;
            }
            this.f47782a = textPaint;
            this.f47783b = textDirectionHeuristic;
            this.f47784c = i10;
            this.f47785d = i11;
        }

        public boolean a(a aVar) {
            if (this.f47784c == aVar.b() && this.f47785d == aVar.c() && this.f47782a.getTextSize() == aVar.e().getTextSize() && this.f47782a.getTextScaleX() == aVar.e().getTextScaleX() && this.f47782a.getTextSkewX() == aVar.e().getTextSkewX() && this.f47782a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f47782a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f47782a.getFlags() == aVar.e().getFlags() && this.f47782a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f47782a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f47782a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f47784c;
        }

        public int c() {
            return this.f47785d;
        }

        public TextDirectionHeuristic d() {
            return this.f47783b;
        }

        public TextPaint e() {
            return this.f47782a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f47783b == aVar.d();
        }

        public int hashCode() {
            return C4337d.b(Float.valueOf(this.f47782a.getTextSize()), Float.valueOf(this.f47782a.getTextScaleX()), Float.valueOf(this.f47782a.getTextSkewX()), Float.valueOf(this.f47782a.getLetterSpacing()), Integer.valueOf(this.f47782a.getFlags()), this.f47782a.getTextLocales(), this.f47782a.getTypeface(), Boolean.valueOf(this.f47782a.isElegantTextHeight()), this.f47783b, Integer.valueOf(this.f47784c), Integer.valueOf(this.f47785d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f47782a.getTextSize());
            sb2.append(", textScaleX=" + this.f47782a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f47782a.getTextSkewX());
            sb2.append(", letterSpacing=" + this.f47782a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f47782a.isElegantTextHeight());
            sb2.append(", textLocale=" + this.f47782a.getTextLocales());
            sb2.append(", typeface=" + this.f47782a.getTypeface());
            sb2.append(", variationSettings=" + this.f47782a.getFontVariationSettings());
            sb2.append(", textDir=" + this.f47783b);
            sb2.append(", breakStrategy=" + this.f47784c);
            sb2.append(", hyphenationFrequency=" + this.f47785d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f47782a = params.getTextPaint();
            this.f47783b = params.getTextDirection();
            this.f47784c = params.getBreakStrategy();
            this.f47785d = params.getHyphenationFrequency();
            this.f47786e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}

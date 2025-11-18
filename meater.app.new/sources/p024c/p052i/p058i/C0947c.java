package p024c.p052i.p058i;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p024c.p052i.p059j.C0954d;

/* compiled from: PrecomputedTextCompat.java */
/* renamed from: c.i.i.c */
/* loaded from: classes.dex */
public class C0947c implements Spannable {

    /* renamed from: f */
    private static final Object f6379f = new Object();

    /* renamed from: g */
    private final Spannable f6380g;

    /* renamed from: h */
    private final a f6381h;

    /* renamed from: i */
    private final PrecomputedText f6382i;

    /* renamed from: a */
    public a m6035a() {
        return this.f6381h;
    }

    /* renamed from: b */
    public PrecomputedText m6036b() {
        Spannable spannable = this.f6380g;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f6380g.charAt(i2);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f6380g.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f6380g.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f6380g.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f6382i.getSpans(i2, i3, cls) : (T[]) this.f6380g.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f6380g.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f6380g.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f6382i.removeSpan(obj);
        } else {
            this.f6380g.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f6382i.setSpan(obj, i2, i3, i4);
        } else {
            this.f6380g.setSpan(obj, i2, i3, i4);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.f6380g.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f6380g.toString();
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* renamed from: c.i.i.c$a */
    public static final class a {

        /* renamed from: a */
        private final TextPaint f6383a;

        /* renamed from: b */
        private final TextDirectionHeuristic f6384b;

        /* renamed from: c */
        private final int f6385c;

        /* renamed from: d */
        private final int f6386d;

        /* renamed from: e */
        final PrecomputedText.Params f6387e;

        /* compiled from: PrecomputedTextCompat.java */
        /* renamed from: c.i.i.c$a$a, reason: collision with other inner class name */
        public static class C11447a {

            /* renamed from: a */
            private final TextPaint f6388a;

            /* renamed from: b */
            private TextDirectionHeuristic f6389b;

            /* renamed from: c */
            private int f6390c;

            /* renamed from: d */
            private int f6391d;

            public C11447a(TextPaint textPaint) {
                this.f6388a = textPaint;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    this.f6390c = 1;
                    this.f6391d = 1;
                } else {
                    this.f6391d = 0;
                    this.f6390c = 0;
                }
                if (i2 >= 18) {
                    this.f6389b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f6389b = null;
                }
            }

            /* renamed from: a */
            public a m6042a() {
                return new a(this.f6388a, this.f6389b, this.f6390c, this.f6391d);
            }

            /* renamed from: b */
            public C11447a m6043b(int i2) {
                this.f6390c = i2;
                return this;
            }

            /* renamed from: c */
            public C11447a m6044c(int i2) {
                this.f6391d = i2;
                return this;
            }

            /* renamed from: d */
            public C11447a m6045d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f6389b = textDirectionHeuristic;
                return this;
            }
        }

        @SuppressLint({"NewApi"})
        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f6387e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f6387e = null;
            }
            this.f6383a = textPaint;
            this.f6384b = textDirectionHeuristic;
            this.f6385c = i2;
            this.f6386d = i3;
        }

        /* renamed from: a */
        public boolean m6037a(a aVar) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 23 && (this.f6385c != aVar.m6038b() || this.f6386d != aVar.m6039c())) || this.f6383a.getTextSize() != aVar.m6041e().getTextSize() || this.f6383a.getTextScaleX() != aVar.m6041e().getTextScaleX() || this.f6383a.getTextSkewX() != aVar.m6041e().getTextSkewX()) {
                return false;
            }
            if ((i2 >= 21 && (this.f6383a.getLetterSpacing() != aVar.m6041e().getLetterSpacing() || !TextUtils.equals(this.f6383a.getFontFeatureSettings(), aVar.m6041e().getFontFeatureSettings()))) || this.f6383a.getFlags() != aVar.m6041e().getFlags()) {
                return false;
            }
            if (i2 >= 24) {
                if (!this.f6383a.getTextLocales().equals(aVar.m6041e().getTextLocales())) {
                    return false;
                }
            } else if (i2 >= 17 && !this.f6383a.getTextLocale().equals(aVar.m6041e().getTextLocale())) {
                return false;
            }
            return this.f6383a.getTypeface() == null ? aVar.m6041e().getTypeface() == null : this.f6383a.getTypeface().equals(aVar.m6041e().getTypeface());
        }

        /* renamed from: b */
        public int m6038b() {
            return this.f6385c;
        }

        /* renamed from: c */
        public int m6039c() {
            return this.f6386d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m6040d() {
            return this.f6384b;
        }

        /* renamed from: e */
        public TextPaint m6041e() {
            return this.f6383a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (m6037a(aVar)) {
                return Build.VERSION.SDK_INT < 18 || this.f6384b == aVar.m6040d();
            }
            return false;
        }

        public int hashCode() {
            int i2 = Build.VERSION.SDK_INT;
            return i2 >= 24 ? C0954d.m6057b(Float.valueOf(this.f6383a.getTextSize()), Float.valueOf(this.f6383a.getTextScaleX()), Float.valueOf(this.f6383a.getTextSkewX()), Float.valueOf(this.f6383a.getLetterSpacing()), Integer.valueOf(this.f6383a.getFlags()), this.f6383a.getTextLocales(), this.f6383a.getTypeface(), Boolean.valueOf(this.f6383a.isElegantTextHeight()), this.f6384b, Integer.valueOf(this.f6385c), Integer.valueOf(this.f6386d)) : i2 >= 21 ? C0954d.m6057b(Float.valueOf(this.f6383a.getTextSize()), Float.valueOf(this.f6383a.getTextScaleX()), Float.valueOf(this.f6383a.getTextSkewX()), Float.valueOf(this.f6383a.getLetterSpacing()), Integer.valueOf(this.f6383a.getFlags()), this.f6383a.getTextLocale(), this.f6383a.getTypeface(), Boolean.valueOf(this.f6383a.isElegantTextHeight()), this.f6384b, Integer.valueOf(this.f6385c), Integer.valueOf(this.f6386d)) : i2 >= 18 ? C0954d.m6057b(Float.valueOf(this.f6383a.getTextSize()), Float.valueOf(this.f6383a.getTextScaleX()), Float.valueOf(this.f6383a.getTextSkewX()), Integer.valueOf(this.f6383a.getFlags()), this.f6383a.getTextLocale(), this.f6383a.getTypeface(), this.f6384b, Integer.valueOf(this.f6385c), Integer.valueOf(this.f6386d)) : i2 >= 17 ? C0954d.m6057b(Float.valueOf(this.f6383a.getTextSize()), Float.valueOf(this.f6383a.getTextScaleX()), Float.valueOf(this.f6383a.getTextSkewX()), Integer.valueOf(this.f6383a.getFlags()), this.f6383a.getTextLocale(), this.f6383a.getTypeface(), this.f6384b, Integer.valueOf(this.f6385c), Integer.valueOf(this.f6386d)) : C0954d.m6057b(Float.valueOf(this.f6383a.getTextSize()), Float.valueOf(this.f6383a.getTextScaleX()), Float.valueOf(this.f6383a.getTextSkewX()), Integer.valueOf(this.f6383a.getFlags()), this.f6383a.getTypeface(), this.f6384b, Integer.valueOf(this.f6385c), Integer.valueOf(this.f6386d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f6383a.getTextSize());
            sb.append(", textScaleX=" + this.f6383a.getTextScaleX());
            sb.append(", textSkewX=" + this.f6383a.getTextSkewX());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                sb.append(", letterSpacing=" + this.f6383a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f6383a.isElegantTextHeight());
            }
            if (i2 >= 24) {
                sb.append(", textLocale=" + this.f6383a.getTextLocales());
            } else if (i2 >= 17) {
                sb.append(", textLocale=" + this.f6383a.getTextLocale());
            }
            sb.append(", typeface=" + this.f6383a.getTypeface());
            if (i2 >= 26) {
                sb.append(", variationSettings=" + this.f6383a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f6384b);
            sb.append(", breakStrategy=" + this.f6385c);
            sb.append(", hyphenationFrequency=" + this.f6386d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f6383a = params.getTextPaint();
            this.f6384b = params.getTextDirection();
            this.f6385c = params.getBreakStrategy();
            this.f6386d = params.getHyphenationFrequency();
            this.f6387e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}

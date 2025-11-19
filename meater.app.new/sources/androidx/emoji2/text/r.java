package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import q1.C4262c;

/* compiled from: UnprecomputeTextOnModificationSpannable.java */
/* loaded from: classes.dex */
class r implements Spannable {

    /* renamed from: B, reason: collision with root package name */
    private boolean f25288B = false;

    /* renamed from: C, reason: collision with root package name */
    private Spannable f25289C;

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof q1.q;
        }
    }

    /* compiled from: UnprecomputeTextOnModificationSpannable.java */
    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.r.b
        boolean a(CharSequence charSequence) {
            return C4262c.a(charSequence) || (charSequence instanceof q1.q);
        }
    }

    r(Spannable spannable) {
        this.f25289C = spannable;
    }

    private void a() {
        Spannable spannable = this.f25289C;
        if (!this.f25288B && c().a(spannable)) {
            this.f25289C = new SpannableString(spannable);
        }
        this.f25288B = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f25289C;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f25289C.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f25289C);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f25289C);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f25289C.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f25289C.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f25289C.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f25289C.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f25289C.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f25289C.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f25289C.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f25289C.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f25289C.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f25289C.toString();
    }

    r(CharSequence charSequence) {
        this.f25289C = new SpannableString(charSequence);
    }
}

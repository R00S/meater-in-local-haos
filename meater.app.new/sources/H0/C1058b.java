package H0;

import I0.Z;
import R0.d;
import R0.e;
import R0.i;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import kotlin.Metadata;

/* compiled from: AndroidParagraph.android.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0004\u001a\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004\u001a\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"LR0/i;", "align", "", "l", "(I)I", "LR0/d;", "hyphens", "n", "LR0/e$b;", "breakStrategy", "m", "LR0/e$c;", "lineBreakStrictness", "o", "LR0/e$d;", "lineBreakWordStyle", "p", "LI0/Z;", "maxHeight", "j", "(LI0/Z;I)I", "LH0/J;", "textStyle", "", "ellipsis", "k", "(LH0/J;Z)Z", "", "i", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        P0.c.u(spannableString, new J0.c(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(Z z10, int i10) {
        int lineCount = z10.getLineCount();
        for (int i11 = 0; i11 < lineCount; i11++) {
            if (z10.k(i11) > i10) {
                return i11;
            }
        }
        return z10.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(TextStyle textStyle, boolean z10) {
        if (!z10 || U0.v.e(textStyle.q(), U0.w.e(0)) || U0.v.e(textStyle.q(), U0.v.INSTANCE.a())) {
            return false;
        }
        int iZ = textStyle.z();
        i.Companion companion = R0.i.INSTANCE;
        return (R0.i.k(iZ, companion.g()) || R0.i.k(textStyle.z(), companion.f()) || R0.i.k(textStyle.z(), companion.c())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(int i10) {
        i.Companion companion = R0.i.INSTANCE;
        if (R0.i.k(i10, companion.d())) {
            return 3;
        }
        if (R0.i.k(i10, companion.e())) {
            return 4;
        }
        if (R0.i.k(i10, companion.a())) {
            return 2;
        }
        return (!R0.i.k(i10, companion.f()) && R0.i.k(i10, companion.b())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int m(int i10) {
        e.b.Companion companion = e.b.INSTANCE;
        if (e.b.e(i10, companion.c())) {
            return 0;
        }
        if (e.b.e(i10, companion.b())) {
            return 1;
        }
        return e.b.e(i10, companion.a()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(int i10) {
        d.Companion companion = R0.d.INSTANCE;
        if (R0.d.e(i10, companion.a())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        R0.d.e(i10, companion.b());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int o(int i10) {
        e.c.Companion companion = e.c.INSTANCE;
        if (e.c.f(i10, companion.a())) {
            return 0;
        }
        if (e.c.f(i10, companion.b())) {
            return 1;
        }
        if (e.c.f(i10, companion.c())) {
            return 2;
        }
        return e.c.f(i10, companion.d()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(int i10) {
        e.d.Companion companion = e.d.INSTANCE;
        return (!e.d.d(i10, companion.a()) && e.d.d(i10, companion.b())) ? 1 : 0;
    }
}

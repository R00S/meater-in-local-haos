package q1;

import android.annotation.SuppressLint;
import android.text.Html;
import android.text.Spanned;

/* compiled from: HtmlCompat.java */
@SuppressLint({"InlinedApi"})
/* renamed from: q1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4261b {

    /* compiled from: HtmlCompat.java */
    /* renamed from: q1.b$a */
    static class a {
        static Spanned a(String str, int i10) {
            return Html.fromHtml(str, i10);
        }
    }

    public static Spanned a(String str, int i10) {
        return a.a(str, i10);
    }
}

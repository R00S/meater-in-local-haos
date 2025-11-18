package kotlin;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import kotlin.Metadata;

/* compiled from: PlatformTypefaces.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\b\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LL0/J;", "a", "()LL0/J;", "Landroid/graphics/Typeface;", "LL0/A;", "variationSettings", "Landroid/content/Context;", "context", "c", "(Landroid/graphics/Typeface;LL0/A;Landroid/content/Context;)Landroid/graphics/Typeface;", "", "name", "LL0/B;", "fontWeight", "b", "(Ljava/lang/String;LL0/B;)Ljava/lang/String;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1321N {
    public static final InterfaceC1317J a() {
        return Build.VERSION.SDK_INT >= 28 ? new C1319L() : new C1320M();
    }

    public static final String b(String str, FontWeight fontWeight) {
        int iX = fontWeight.x() / 100;
        if (iX >= 0 && iX < 2) {
            return str + "-thin";
        }
        if (2 <= iX && iX < 4) {
            return str + "-light";
        }
        if (iX == 4) {
            return str;
        }
        if (iX == 5) {
            return str + "-medium";
        }
        if ((6 <= iX && iX < 8) || 8 > iX || iX >= 11) {
            return str;
        }
        return str + "-black";
    }

    public static final Typeface c(Typeface typeface, C1308A c1308a, Context context) {
        return C1325S.f8956a.a(typeface, c1308a, context);
    }
}

package H0;

import R0.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TextStyle.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"LH0/J;", "style", "LU0/t;", "direction", "c", "(LH0/J;LU0/t;)LH0/J;", "layoutDirection", "LR0/k;", "textDirection", "d", "(LU0/t;I)I", "LH0/z;", "platformSpanStyle", "LH0/y;", "platformParagraphStyle", "LH0/A;", "b", "(LH0/z;LH0/y;)LH0/A;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K {

    /* compiled from: TextStyle.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5349a;

        static {
            int[] iArr = new int[U0.t.values().length];
            try {
                iArr[U0.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[U0.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5349a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformTextStyle b(z zVar, PlatformParagraphStyle platformParagraphStyle) {
        if (platformParagraphStyle == null) {
            return null;
        }
        return C1059c.a(zVar, platformParagraphStyle);
    }

    public static final TextStyle c(TextStyle textStyle, U0.t tVar) {
        return new TextStyle(D.d(textStyle.y()), v.c(textStyle.v(), tVar), textStyle.getPlatformStyle());
    }

    public static final int d(U0.t tVar, int i10) {
        k.Companion companion = R0.k.INSTANCE;
        if (R0.k.j(i10, companion.a())) {
            int i11 = a.f5349a[tVar.ordinal()];
            if (i11 == 1) {
                return companion.b();
            }
            if (i11 == 2) {
                return companion.c();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!R0.k.j(i10, companion.f())) {
            return i10;
        }
        int i12 = a.f5349a[tVar.ordinal()];
        if (i12 == 1) {
            return companion.d();
        }
        if (i12 == 2) {
            return companion.e();
        }
        throw new NoWhenBranchMatchedException();
    }
}

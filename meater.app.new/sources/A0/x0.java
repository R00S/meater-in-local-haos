package A0;

import kotlin.Metadata;

/* compiled from: MyersDiff.kt */
@Aa.b
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0018\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\rR\u0014\u0010\u001c\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001f"}, d2 = {"LA0/x0;", "", "", "data", "b", "([I)[I", "LA0/x;", "diagonals", "Loa/F;", "a", "([ILA0/x;)V", "", "h", "([I)I", "startX", "i", "startY", "d", "endX", "e", "endY", "", "g", "([I)Z", "reverse", "c", "diagonalSize", "f", "hasAdditionOrRemoval", "j", "isAddition", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class x0 {
    public static final void a(int[] iArr, C0844x c0844x) {
        if (!f(iArr)) {
            c0844x.g(h(iArr), i(iArr), d(iArr) - h(iArr));
            return;
        }
        if (g(iArr)) {
            c0844x.g(h(iArr), i(iArr), c(iArr));
        } else if (j(iArr)) {
            c0844x.g(h(iArr), i(iArr) + 1, c(iArr));
        } else {
            c0844x.g(h(iArr) + 1, i(iArr), c(iArr));
        }
    }

    public static final int c(int[] iArr) {
        return Math.min(d(iArr) - h(iArr), e(iArr) - i(iArr));
    }

    public static final int d(int[] iArr) {
        return iArr[2];
    }

    public static final int e(int[] iArr) {
        return iArr[3];
    }

    private static final boolean f(int[] iArr) {
        return e(iArr) - i(iArr) != d(iArr) - h(iArr);
    }

    public static final boolean g(int[] iArr) {
        return iArr[4] != 0;
    }

    public static final int h(int[] iArr) {
        return iArr[0];
    }

    public static final int i(int[] iArr) {
        return iArr[1];
    }

    private static final boolean j(int[] iArr) {
        return e(iArr) - i(iArr) > d(iArr) - h(iArr);
    }

    public static int[] b(int[] iArr) {
        return iArr;
    }
}

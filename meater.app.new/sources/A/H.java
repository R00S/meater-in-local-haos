package A;

import java.util.List;
import kotlin.Metadata;
import y0.InterfaceC5112q;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ+\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"LA/H;", "", "<init>", "()V", "", "Ly0/q;", "measurables", "", "availableHeight", "mainAxisSpacing", "d", "(Ljava/util/List;II)I", "h", "availableWidth", "c", "g", "b", "f", "a", "e", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f19a = new H();

    private H() {
    }

    public final int a(List<? extends InterfaceC5112q> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        int size = measurables.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC5112q interfaceC5112q = measurables.get(i10);
            float fE = P.e(P.c(interfaceC5112q));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC5112q.S(Integer.MAX_VALUE), availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableWidth - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC5112q.q(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableWidth - iMin, 0) / f10);
        int size2 = measurables.size();
        for (int i11 = 0; i11 < size2; i11++) {
            InterfaceC5112q interfaceC5112q2 = measurables.get(i11);
            float fE2 = P.e(P.c(interfaceC5112q2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC5112q2.q(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int b(List<? extends InterfaceC5112q> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i10 = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC5112q interfaceC5112q = measurables.get(i11);
            float fE = P.e(P.c(interfaceC5112q));
            int iS = interfaceC5112q.S(availableHeight);
            if (fE == 0.0f) {
                i10 += iS;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iS / fE));
            }
        }
        return Math.round(iMax * f10) + i10 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int c(List<? extends InterfaceC5112q> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        int size = measurables.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC5112q interfaceC5112q = measurables.get(i10);
            float fE = P.e(P.c(interfaceC5112q));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC5112q.S(Integer.MAX_VALUE), availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableWidth - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC5112q.f0(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableWidth - iMin, 0) / f10);
        int size2 = measurables.size();
        for (int i11 = 0; i11 < size2; i11++) {
            InterfaceC5112q interfaceC5112q2 = measurables.get(i11);
            float fE2 = P.e(P.c(interfaceC5112q2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC5112q2.f0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int d(List<? extends InterfaceC5112q> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i10 = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC5112q interfaceC5112q = measurables.get(i11);
            float fE = P.e(P.c(interfaceC5112q));
            int iQ = interfaceC5112q.Q(availableHeight);
            if (fE == 0.0f) {
                i10 += iQ;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iQ / fE));
            }
        }
        return Math.round(iMax * f10) + i10 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int e(List<? extends InterfaceC5112q> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i10 = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC5112q interfaceC5112q = measurables.get(i11);
            float fE = P.e(P.c(interfaceC5112q));
            int iQ = interfaceC5112q.q(availableWidth);
            if (fE == 0.0f) {
                i10 += iQ;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iQ / fE));
            }
        }
        return Math.round(iMax * f10) + i10 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int f(List<? extends InterfaceC5112q> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        int size = measurables.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC5112q interfaceC5112q = measurables.get(i10);
            float fE = P.e(P.c(interfaceC5112q));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC5112q.q(Integer.MAX_VALUE), availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableHeight - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC5112q.S(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableHeight - iMin, 0) / f10);
        int size2 = measurables.size();
        for (int i11 = 0; i11 < size2; i11++) {
            InterfaceC5112q interfaceC5112q2 = measurables.get(i11);
            float fE2 = P.e(P.c(interfaceC5112q2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC5112q2.S(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int g(List<? extends InterfaceC5112q> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i10 = 0;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC5112q interfaceC5112q = measurables.get(i11);
            float fE = P.e(P.c(interfaceC5112q));
            int iF0 = interfaceC5112q.f0(availableWidth);
            if (fE == 0.0f) {
                i10 += iF0;
            } else if (fE > 0.0f) {
                f10 += fE;
                iMax = Math.max(iMax, Math.round(iF0 / fE));
            }
        }
        return Math.round(iMax * f10) + i10 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int h(List<? extends InterfaceC5112q> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        int size = measurables.size();
        int iMax = 0;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC5112q interfaceC5112q = measurables.get(i10);
            float fE = P.e(P.c(interfaceC5112q));
            if (fE == 0.0f) {
                int iMin2 = Math.min(interfaceC5112q.q(Integer.MAX_VALUE), availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableHeight - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC5112q.Q(iMin2));
            } else if (fE > 0.0f) {
                f10 += fE;
            }
        }
        int iRound = f10 == 0.0f ? 0 : availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableHeight - iMin, 0) / f10);
        int size2 = measurables.size();
        for (int i11 = 0; i11 < size2; i11++) {
            InterfaceC5112q interfaceC5112q2 = measurables.get(i11);
            float fE2 = P.e(P.c(interfaceC5112q2));
            if (fE2 > 0.0f) {
                iMax = Math.max(iMax, interfaceC5112q2.Q(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}

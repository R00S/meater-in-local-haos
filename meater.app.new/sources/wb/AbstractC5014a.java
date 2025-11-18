package wb;

import kotlin.jvm.internal.C3862t;

/* compiled from: DeprecationInfo.kt */
/* renamed from: wb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5014a implements Comparable<AbstractC5014a> {
    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC5014a other) {
        C3862t.g(other, "other");
        int iCompareTo = j().compareTo(other.j());
        if (iCompareTo == 0 && !n() && other.n()) {
            return 1;
        }
        return iCompareTo;
    }

    public abstract EnumC5015b j();

    public abstract boolean n();
}

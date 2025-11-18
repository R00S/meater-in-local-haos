package A;

import kotlin.Metadata;
import y0.InterfaceC5112q;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\b*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000f\u001a\u00020\f*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\u00020\f*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Ly0/q;", "LA/T;", "c", "(Ly0/q;)LA/T;", "rowColumnParentData", "Ly0/Z;", "d", "(Ly0/Z;)LA/T;", "", "e", "(LA/T;)F", "weight", "", "b", "(LA/T;)Z", "fill", "LA/m;", "a", "(LA/T;)LA/m;", "crossAxisAlignment", "f", "isRelative", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P {
    public static final AbstractC0805m a(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean b(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    public static final RowColumnParentData c(InterfaceC5112q interfaceC5112q) {
        Object objB = interfaceC5112q.b();
        if (objB instanceof RowColumnParentData) {
            return (RowColumnParentData) objB;
        }
        return null;
    }

    public static final RowColumnParentData d(y0.Z z10) {
        Object objB = z10.b();
        if (objB instanceof RowColumnParentData) {
            return (RowColumnParentData) objB;
        }
        return null;
    }

    public static final float e(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    public static final boolean f(RowColumnParentData rowColumnParentData) {
        AbstractC0805m abstractC0805mA = a(rowColumnParentData);
        if (abstractC0805mA != null) {
            return abstractC0805mA.c();
        }
        return false;
    }
}

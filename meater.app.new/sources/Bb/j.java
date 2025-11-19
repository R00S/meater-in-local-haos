package Bb;

import Hb.U;

/* compiled from: TransientReceiver.java */
/* loaded from: classes3.dex */
public class j extends a {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(U u10) {
        this(u10, null);
        if (u10 == null) {
            d(0);
        }
    }

    private static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i10 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private j(U u10, g gVar) {
        super(u10, gVar);
        if (u10 == null) {
            d(1);
        }
    }
}

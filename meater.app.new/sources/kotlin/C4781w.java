package kotlin;

import kotlin.Metadata;

/* compiled from: ComplexDouble.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "num", "Lv/v;", "a", "(D)Lv/v;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4781w {
    public static final ComplexDouble a(double d10) {
        return d10 < 0.0d ? new ComplexDouble(0.0d, Math.sqrt(Math.abs(d10))) : new ComplexDouble(Math.sqrt(d10), 0.0d);
    }
}

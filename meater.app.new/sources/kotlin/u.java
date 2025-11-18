package kotlin;

import U0.w;
import java.util.List;
import kotlin.Metadata;
import y0.K;
import y0.Z;

/* compiled from: LazyLayoutMeasureScope.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b*\u00020\nH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\r\u0082\u0001\u0001\u0010ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"LC/u;", "Ly0/K;", "", "index", "LU0/b;", "constraints", "", "Ly0/Z;", "F0", "(IJ)Ljava/util/List;", "", "LU0/v;", "x", "(F)J", "LU0/h;", "s", "LC/v;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface u extends K {
    List<Z> F0(int index, long constraints);

    @Override // U0.l
    default long s(float f10) {
        return w.d(f10 / getFontScale());
    }

    @Override // U0.d
    default long x(float f10) {
        return w.d(f10 / (getFontScale() * getDensity()));
    }
}

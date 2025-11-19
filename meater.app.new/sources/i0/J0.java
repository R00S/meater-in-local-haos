package i0;

import j0.AbstractC3703c;
import j0.C3707g;
import kotlin.Metadata;

/* compiled from: ImageBitmap.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"", "width", "height", "Li0/I0;", "config", "", "hasAlpha", "Lj0/c;", "colorSpace", "Li0/H0;", "a", "(IIIZLj0/c;)Li0/H0;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J0 {
    public static final H0 a(int i10, int i11, int i12, boolean z10, AbstractC3703c abstractC3703c) {
        return C3552O.a(i10, i11, i12, z10, abstractC3703c);
    }

    public static /* synthetic */ H0 b(int i10, int i11, int i12, boolean z10, AbstractC3703c abstractC3703c, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = I0.INSTANCE.b();
        }
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        if ((i13 & 16) != 0) {
            abstractC3703c = C3707g.f43324a.w();
        }
        return a(i10, i11, i12, z10, abstractC3703c);
    }
}

package kotlin;

import kotlin.Metadata;

/* compiled from: Font.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"", "resId", "LL0/B;", "weight", "LL0/w;", "style", "LL0/u;", "loadingStrategy", "LL0/k;", "a", "(ILL0/B;II)LL0/k;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1346q {
    public static final InterfaceC1340k a(int i10, FontWeight fontWeight, int i11, int i12) {
        return new ResourceFont(i10, fontWeight, i11, new C1308A(new InterfaceC1355z[0]), i12, null);
    }

    public static /* synthetic */ InterfaceC1340k b(int i10, FontWeight fontWeight, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.d();
        }
        if ((i13 & 4) != 0) {
            i11 = C1352w.INSTANCE.b();
        }
        if ((i13 & 8) != 0) {
            i12 = C1350u.INSTANCE.b();
        }
        return a(i10, fontWeight, i11, i12);
    }
}

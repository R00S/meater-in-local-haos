package s;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import t.C4532a;

/* compiled from: SparseArrayCompat.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"E", "Ls/Y;", "", "key", "c", "(Ls/Y;I)Ljava/lang/Object;", "Loa/F;", "d", "(Ls/Y;)V", "", "a", "Ljava/lang/Object;", "DELETED", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f48679a = new Object();

    public static final <E> E c(Y<E> y10, int i10) {
        E e10;
        C3862t.g(y10, "<this>");
        int iA = C4532a.a(y10.f48676C, y10.f48678E, i10);
        if (iA < 0 || (e10 = (E) y10.f48677D[iA]) == f48679a) {
            return null;
        }
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void d(Y<E> y10) {
        int i10 = y10.f48678E;
        int[] iArr = y10.f48676C;
        Object[] objArr = y10.f48677D;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f48679a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        y10.f48675B = false;
        y10.f48678E = i11;
    }
}

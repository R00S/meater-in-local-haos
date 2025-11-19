package g7;

import android.content.Context;
import android.util.SparseIntArray;
import c7.C2337f;
import com.google.android.gms.common.api.a;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f41950a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private C2337f f41951b;

    public H(C2337f c2337f) {
        C3445p.k(c2337f);
        this.f41951b = c2337f;
    }

    public final int a(Context context, int i10) {
        return this.f41950a.get(i10, -1);
    }

    @ResultIgnorabilityUnspecified
    public final int b(Context context, a.f fVar) {
        C3445p.k(context);
        C3445p.k(fVar);
        int i10 = 0;
        if (!fVar.i()) {
            return 0;
        }
        int iJ = fVar.j();
        int iA = a(context, iJ);
        if (iA == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f41950a.size()) {
                    i10 = -1;
                    break;
                }
                int iKeyAt = this.f41950a.keyAt(i11);
                if (iKeyAt > iJ && this.f41950a.get(iKeyAt) == 0) {
                    break;
                }
                i11++;
            }
            iA = i10 == -1 ? this.f41951b.h(context, iJ) : i10;
            this.f41950a.put(iJ, iA);
        }
        return iA;
    }

    public final void c() {
        this.f41950a.clear();
    }
}

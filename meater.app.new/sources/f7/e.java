package f7;

import com.google.android.gms.common.data.DataHolder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import g7.C3445p;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public abstract class e<T> extends AbstractC3344a<T> {

    /* renamed from: C, reason: collision with root package name */
    private boolean f41380C;

    /* renamed from: D, reason: collision with root package name */
    private ArrayList f41381D;

    protected e(DataHolder dataHolder) {
        super(dataHolder);
        this.f41380C = false;
    }

    private final void Q() {
        synchronized (this) {
            try {
                if (!this.f41380C) {
                    int count = ((DataHolder) C3445p.k(this.f41374B)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.f41381D = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String strK = K();
                        String strG0 = this.f41374B.G0(strK, 0, this.f41374B.O0(0));
                        for (int i10 = 1; i10 < count; i10++) {
                            int iO0 = this.f41374B.O0(i10);
                            String strG02 = this.f41374B.G0(strK, i10, iO0);
                            if (strG02 == null) {
                                throw new NullPointerException("Missing value for markerColumn: " + strK + ", at row: " + i10 + ", for window: " + iO0);
                            }
                            if (!strG02.equals(strG0)) {
                                this.f41381D.add(Integer.valueOf(i10));
                                strG0 = strG02;
                            }
                        }
                    }
                    this.f41380C = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract String K();

    final int L(int i10) {
        if (i10 >= 0 && i10 < this.f41381D.size()) {
            return ((Integer) this.f41381D.get(i10)).intValue();
        }
        throw new IllegalArgumentException("Position " + i10 + " is out of bounds for this buffer");
    }

    protected String f() {
        return null;
    }

    @Override // f7.InterfaceC3345b
    @ResultIgnorabilityUnspecified
    public final T get(int i10) {
        int iIntValue;
        int iIntValue2;
        Q();
        int iL = L(i10);
        int i11 = 0;
        if (i10 >= 0 && i10 != this.f41381D.size()) {
            if (i10 == this.f41381D.size() - 1) {
                iIntValue = ((DataHolder) C3445p.k(this.f41374B)).getCount();
                iIntValue2 = ((Integer) this.f41381D.get(i10)).intValue();
            } else {
                iIntValue = ((Integer) this.f41381D.get(i10 + 1)).intValue();
                iIntValue2 = ((Integer) this.f41381D.get(i10)).intValue();
            }
            int i12 = iIntValue - iIntValue2;
            if (i12 == 1) {
                int iL2 = L(i10);
                int iO0 = ((DataHolder) C3445p.k(this.f41374B)).O0(iL2);
                String strF = f();
                if (strF == null || this.f41374B.G0(strF, iL2, iO0) != null) {
                    i11 = 1;
                }
            } else {
                i11 = i12;
            }
        }
        return x(iL, i11);
    }

    @Override // f7.InterfaceC3345b
    public int getCount() {
        Q();
        return this.f41381D.size();
    }

    protected abstract T x(int i10, int i11);
}

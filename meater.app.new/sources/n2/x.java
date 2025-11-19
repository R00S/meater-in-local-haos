package n2;

import U1.H;
import X1.L;
import l8.InterfaceC3914g;
import m8.AbstractC4009y;

/* compiled from: TrackGroupArray.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final x f45675d = new x(new H[0]);

    /* renamed from: e, reason: collision with root package name */
    private static final String f45676e = L.B0(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f45677a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4009y<H> f45678b;

    /* renamed from: c, reason: collision with root package name */
    private int f45679c;

    public x(H... hArr) {
        this.f45678b = AbstractC4009y.D(hArr);
        this.f45677a = hArr.length;
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer e(H h10) {
        return Integer.valueOf(h10.f16864c);
    }

    private void f() {
        int i10 = 0;
        while (i10 < this.f45678b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f45678b.size(); i12++) {
                if (this.f45678b.get(i10).equals(this.f45678b.get(i12))) {
                    X1.n.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public H b(int i10) {
        return this.f45678b.get(i10);
    }

    public AbstractC4009y<Integer> c() {
        return AbstractC4009y.B(m8.H.l(this.f45678b, new InterfaceC3914g() { // from class: n2.w
            @Override // l8.InterfaceC3914g
            public final Object apply(Object obj) {
                return x.e((H) obj);
            }
        }));
    }

    public int d(H h10) {
        int iIndexOf = this.f45678b.indexOf(h10);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f45677a == xVar.f45677a && this.f45678b.equals(xVar.f45678b);
    }

    public int hashCode() {
        if (this.f45679c == 0) {
            this.f45679c = this.f45678b.hashCode();
        }
        return this.f45679c;
    }
}

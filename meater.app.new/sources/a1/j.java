package a1;

import b1.C2204i;
import b1.o;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: HelperWidget.java */
/* loaded from: classes.dex */
public class j extends e implements i {

    /* renamed from: L0, reason: collision with root package name */
    public e[] f19952L0 = new e[4];

    /* renamed from: M0, reason: collision with root package name */
    public int f19953M0 = 0;

    @Override // a1.i
    public void a() {
        this.f19953M0 = 0;
        Arrays.fill(this.f19952L0, (Object) null);
    }

    @Override // a1.i
    public void b(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i10 = this.f19953M0 + 1;
        e[] eVarArr = this.f19952L0;
        if (i10 > eVarArr.length) {
            this.f19952L0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f19952L0;
        int i11 = this.f19953M0;
        eVarArr2[i11] = eVar;
        this.f19953M0 = i11 + 1;
    }

    public void s1(ArrayList<o> arrayList, int i10, o oVar) {
        for (int i11 = 0; i11 < this.f19953M0; i11++) {
            oVar.a(this.f19952L0[i11]);
        }
        for (int i12 = 0; i12 < this.f19953M0; i12++) {
            C2204i.a(this.f19952L0[i12], i10, arrayList, oVar);
        }
    }

    public int t1(int i10) {
        int i11;
        int i12;
        for (int i13 = 0; i13 < this.f19953M0; i13++) {
            e eVar = this.f19952L0[i13];
            if (i10 == 0 && (i12 = eVar.f19793I0) != -1) {
                return i12;
            }
            if (i10 == 1 && (i11 = eVar.f19795J0) != -1) {
                return i11;
            }
        }
        return -1;
    }

    @Override // a1.i
    public void c(f fVar) {
    }
}

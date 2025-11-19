package a1;

import a1.e;
import b1.C2197b;
import java.util.HashSet;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public class l extends j {

    /* renamed from: N0, reason: collision with root package name */
    private int f19955N0 = 0;

    /* renamed from: O0, reason: collision with root package name */
    private int f19956O0 = 0;

    /* renamed from: P0, reason: collision with root package name */
    private int f19957P0 = 0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f19958Q0 = 0;

    /* renamed from: R0, reason: collision with root package name */
    private int f19959R0 = 0;

    /* renamed from: S0, reason: collision with root package name */
    private int f19960S0 = 0;

    /* renamed from: T0, reason: collision with root package name */
    private int f19961T0 = 0;

    /* renamed from: U0, reason: collision with root package name */
    private int f19962U0 = 0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f19963V0 = false;

    /* renamed from: W0, reason: collision with root package name */
    private int f19964W0 = 0;

    /* renamed from: X0, reason: collision with root package name */
    private int f19965X0 = 0;

    /* renamed from: Y0, reason: collision with root package name */
    protected C2197b.a f19966Y0 = new C2197b.a();

    /* renamed from: Z0, reason: collision with root package name */
    C2197b.InterfaceC0421b f19967Z0 = null;

    public int A1() {
        return this.f19961T0;
    }

    public int B1() {
        return this.f19962U0;
    }

    public int C1() {
        return this.f19955N0;
    }

    protected void E1(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.f19967Z0 == null && K() != null) {
            this.f19967Z0 = ((f) K()).K1();
        }
        C2197b.a aVar = this.f19966Y0;
        aVar.f30000a = bVar;
        aVar.f30001b = bVar2;
        aVar.f30002c = i10;
        aVar.f30003d = i11;
        this.f19967Z0.b(eVar, aVar);
        eVar.l1(this.f19966Y0.f30004e);
        eVar.M0(this.f19966Y0.f30005f);
        eVar.L0(this.f19966Y0.f30007h);
        eVar.B0(this.f19966Y0.f30006g);
    }

    protected boolean F1() {
        e eVar = this.f19813a0;
        C2197b.InterfaceC0421b interfaceC0421bK1 = eVar != null ? ((f) eVar).K1() : null;
        if (interfaceC0421bK1 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.f19953M0; i10++) {
            e eVar2 = this.f19952L0[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b bVarU = eVar2.u(0);
                e.b bVarU2 = eVar2.u(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar || eVar2.f19856w == 1 || bVarU2 != bVar || eVar2.f19858x == 1) {
                    if (bVarU == bVar) {
                        bVarU = e.b.WRAP_CONTENT;
                    }
                    if (bVarU2 == bVar) {
                        bVarU2 = e.b.WRAP_CONTENT;
                    }
                    C2197b.a aVar = this.f19966Y0;
                    aVar.f30000a = bVarU;
                    aVar.f30001b = bVarU2;
                    aVar.f30002c = eVar2.W();
                    this.f19966Y0.f30003d = eVar2.x();
                    interfaceC0421bK1.b(eVar2, this.f19966Y0);
                    eVar2.l1(this.f19966Y0.f30004e);
                    eVar2.M0(this.f19966Y0.f30005f);
                    eVar2.B0(this.f19966Y0.f30006g);
                }
            }
        }
        return true;
    }

    public boolean G1() {
        return this.f19963V0;
    }

    protected void H1(boolean z10) {
        this.f19963V0 = z10;
    }

    public void I1(int i10, int i11) {
        this.f19964W0 = i10;
        this.f19965X0 = i11;
    }

    public void J1(int i10) {
        this.f19957P0 = i10;
        this.f19955N0 = i10;
        this.f19958Q0 = i10;
        this.f19956O0 = i10;
        this.f19959R0 = i10;
        this.f19960S0 = i10;
    }

    public void K1(int i10) {
        this.f19956O0 = i10;
    }

    public void L1(int i10) {
        this.f19960S0 = i10;
    }

    public void M1(int i10) {
        this.f19957P0 = i10;
        this.f19961T0 = i10;
    }

    public void N1(int i10) {
        this.f19958Q0 = i10;
        this.f19962U0 = i10;
    }

    public void O1(int i10) {
        this.f19959R0 = i10;
        this.f19961T0 = i10;
        this.f19962U0 = i10;
    }

    public void P1(int i10) {
        this.f19955N0 = i10;
    }

    @Override // a1.j, a1.i
    public void c(f fVar) {
        v1();
    }

    public void u1(boolean z10) {
        int i10 = this.f19959R0;
        if (i10 > 0 || this.f19960S0 > 0) {
            if (z10) {
                this.f19961T0 = this.f19960S0;
                this.f19962U0 = i10;
            } else {
                this.f19961T0 = i10;
                this.f19962U0 = this.f19960S0;
            }
        }
    }

    public void v1() {
        for (int i10 = 0; i10 < this.f19953M0; i10++) {
            e eVar = this.f19952L0[i10];
            if (eVar != null) {
                eVar.V0(true);
            }
        }
    }

    public boolean w1(HashSet<e> hashSet) {
        for (int i10 = 0; i10 < this.f19953M0; i10++) {
            if (hashSet.contains(this.f19952L0[i10])) {
                return true;
            }
        }
        return false;
    }

    public int x1() {
        return this.f19965X0;
    }

    public int y1() {
        return this.f19964W0;
    }

    public int z1() {
        return this.f19956O0;
    }

    public void D1(int i10, int i11, int i12, int i13) {
    }
}

package Fb;

import Ra.InterfaceC1689b;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.g0;
import Ra.h0;
import Ua.AbstractC1779s;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import lb.C3929i;
import nb.InterfaceC4077c;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes3.dex */
public final class O extends Ua.O implements InterfaceC1021b {

    /* renamed from: f0, reason: collision with root package name */
    private final C3929i f4604f0;

    /* renamed from: g0, reason: collision with root package name */
    private final InterfaceC4077c f4605g0;

    /* renamed from: h0, reason: collision with root package name */
    private final nb.g f4606h0;

    /* renamed from: i0, reason: collision with root package name */
    private final nb.h f4607i0;

    /* renamed from: j0, reason: collision with root package name */
    private final InterfaceC1037s f4608j0;

    public /* synthetic */ O(InterfaceC1700m interfaceC1700m, g0 g0Var, Sa.h hVar, qb.f fVar, InterfaceC1689b.a aVar, C3929i c3929i, InterfaceC4077c interfaceC4077c, nb.g gVar, nb.h hVar2, InterfaceC1037s interfaceC1037s, h0 h0Var, int i10, C3854k c3854k) {
        this(interfaceC1700m, g0Var, hVar, fVar, aVar, c3929i, interfaceC4077c, gVar, hVar2, interfaceC1037s, (i10 & 1024) != 0 ? null : h0Var);
    }

    @Override // Ua.O, Ua.AbstractC1779s
    /* renamed from: M0 */
    protected AbstractC1779s p1(InterfaceC1700m newOwner, InterfaceC1712z interfaceC1712z, InterfaceC1689b.a kind, qb.f fVar, Sa.h annotations, h0 source) {
        qb.f fVar2;
        C3862t.g(newOwner, "newOwner");
        C3862t.g(kind, "kind");
        C3862t.g(annotations, "annotations");
        C3862t.g(source, "source");
        g0 g0Var = (g0) interfaceC1712z;
        if (fVar == null) {
            qb.f name = getName();
            C3862t.f(name, "getName(...)");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        O o10 = new O(newOwner, g0Var, annotations, fVar2, kind, D(), Y(), R(), r1(), b0(), source);
        o10.Z0(R0());
        return o10;
    }

    @Override // Fb.InterfaceC1038t
    public nb.g R() {
        return this.f4606h0;
    }

    @Override // Fb.InterfaceC1038t
    public InterfaceC4077c Y() {
        return this.f4605g0;
    }

    @Override // Fb.InterfaceC1038t
    public InterfaceC1037s b0() {
        return this.f4608j0;
    }

    @Override // Fb.InterfaceC1038t
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public C3929i D() {
        return this.f4604f0;
    }

    public nb.h r1() {
        return this.f4607i0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(InterfaceC1700m containingDeclaration, g0 g0Var, Sa.h annotations, qb.f name, InterfaceC1689b.a kind, C3929i proto, InterfaceC4077c nameResolver, nb.g typeTable, nb.h versionRequirementTable, InterfaceC1037s interfaceC1037s, h0 h0Var) {
        super(containingDeclaration, g0Var, annotations, name, kind, h0Var == null ? h0.f15158a : h0Var);
        C3862t.g(containingDeclaration, "containingDeclaration");
        C3862t.g(annotations, "annotations");
        C3862t.g(name, "name");
        C3862t.g(kind, "kind");
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(typeTable, "typeTable");
        C3862t.g(versionRequirementTable, "versionRequirementTable");
        this.f4604f0 = proto;
        this.f4605g0 = nameResolver;
        this.f4606h0 = typeTable;
        this.f4607i0 = versionRequirementTable;
        this.f4608j0 = interfaceC1037s;
    }
}

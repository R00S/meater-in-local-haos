package Fb;

import Ra.AbstractC1707u;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1700m;
import Ra.Z;
import Ra.h0;
import kotlin.jvm.internal.C3862t;
import lb.C3934n;
import nb.C4076b;
import nb.InterfaceC4077c;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes3.dex */
public final class N extends Ua.K implements InterfaceC1021b {

    /* renamed from: d0, reason: collision with root package name */
    private final C3934n f4599d0;

    /* renamed from: e0, reason: collision with root package name */
    private final InterfaceC4077c f4600e0;

    /* renamed from: f0, reason: collision with root package name */
    private final nb.g f4601f0;

    /* renamed from: g0, reason: collision with root package name */
    private final nb.h f4602g0;

    /* renamed from: h0, reason: collision with root package name */
    private final InterfaceC1037s f4603h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC1700m containingDeclaration, Z z10, Sa.h annotations, Ra.E modality, AbstractC1707u visibility, boolean z11, qb.f name, InterfaceC1689b.a kind, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, C3934n proto, InterfaceC4077c nameResolver, nb.g typeTable, nb.h versionRequirementTable, InterfaceC1037s interfaceC1037s) {
        super(containingDeclaration, z10, annotations, modality, visibility, z11, name, kind, h0.f15158a, z12, z13, z16, false, z14, z15);
        C3862t.g(containingDeclaration, "containingDeclaration");
        C3862t.g(annotations, "annotations");
        C3862t.g(modality, "modality");
        C3862t.g(visibility, "visibility");
        C3862t.g(name, "name");
        C3862t.g(kind, "kind");
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(typeTable, "typeTable");
        C3862t.g(versionRequirementTable, "versionRequirementTable");
        this.f4599d0 = proto;
        this.f4600e0 = nameResolver;
        this.f4601f0 = typeTable;
        this.f4602g0 = versionRequirementTable;
        this.f4603h0 = interfaceC1037s;
    }

    @Override // Ua.K
    protected Ua.K Q0(InterfaceC1700m newOwner, Ra.E newModality, AbstractC1707u newVisibility, Z z10, InterfaceC1689b.a kind, qb.f newName, h0 source) {
        C3862t.g(newOwner, "newOwner");
        C3862t.g(newModality, "newModality");
        C3862t.g(newVisibility, "newVisibility");
        C3862t.g(kind, "kind");
        C3862t.g(newName, "newName");
        C3862t.g(source, "source");
        return new N(newOwner, z10, getAnnotations(), newModality, newVisibility, h0(), newName, kind, p0(), z(), isExternal(), N(), K(), D(), Y(), R(), h1(), b0());
    }

    @Override // Fb.InterfaceC1038t
    public nb.g R() {
        return this.f4601f0;
    }

    @Override // Fb.InterfaceC1038t
    public InterfaceC4077c Y() {
        return this.f4600e0;
    }

    @Override // Fb.InterfaceC1038t
    public InterfaceC1037s b0() {
        return this.f4603h0;
    }

    @Override // Fb.InterfaceC1038t
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public C3934n D() {
        return this.f4599d0;
    }

    public nb.h h1() {
        return this.f4602g0;
    }

    @Override // Ua.K, Ra.D
    public boolean isExternal() {
        Boolean boolD = C4076b.f45801E.d(D().b0());
        C3862t.f(boolD, "get(...)");
        return boolD.booleanValue();
    }
}

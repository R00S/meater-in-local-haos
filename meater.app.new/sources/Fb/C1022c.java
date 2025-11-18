package Fb;

import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1699l;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.h0;
import Ua.C1770i;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import lb.C3924d;
import nb.InterfaceC4077c;

/* compiled from: DeserializedMemberDescriptor.kt */
/* renamed from: Fb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1022c extends C1770i implements InterfaceC1021b {

    /* renamed from: g0, reason: collision with root package name */
    private final C3924d f4624g0;

    /* renamed from: h0, reason: collision with root package name */
    private final InterfaceC4077c f4625h0;

    /* renamed from: i0, reason: collision with root package name */
    private final nb.g f4626i0;

    /* renamed from: j0, reason: collision with root package name */
    private final nb.h f4627j0;

    /* renamed from: k0, reason: collision with root package name */
    private final InterfaceC1037s f4628k0;

    public /* synthetic */ C1022c(InterfaceC1692e interfaceC1692e, InterfaceC1699l interfaceC1699l, Sa.h hVar, boolean z10, InterfaceC1689b.a aVar, C3924d c3924d, InterfaceC4077c interfaceC4077c, nb.g gVar, nb.h hVar2, InterfaceC1037s interfaceC1037s, h0 h0Var, int i10, C3854k c3854k) {
        this(interfaceC1692e, interfaceC1699l, hVar, z10, aVar, c3924d, interfaceC4077c, gVar, hVar2, interfaceC1037s, (i10 & 1024) != 0 ? null : h0Var);
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1712z
    public boolean O() {
        return false;
    }

    @Override // Fb.InterfaceC1038t
    public nb.g R() {
        return this.f4626i0;
    }

    @Override // Fb.InterfaceC1038t
    public InterfaceC4077c Y() {
        return this.f4625h0;
    }

    @Override // Fb.InterfaceC1038t
    public InterfaceC1037s b0() {
        return this.f4628k0;
    }

    @Override // Ua.AbstractC1779s, Ra.D
    public boolean isExternal() {
        return false;
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1712z
    public boolean isInline() {
        return false;
    }

    @Override // Ua.AbstractC1779s, Ra.InterfaceC1712z
    public boolean isSuspend() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ua.C1770i
    /* renamed from: t1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C1022c p1(InterfaceC1700m newOwner, InterfaceC1712z interfaceC1712z, InterfaceC1689b.a kind, qb.f fVar, Sa.h annotations, h0 source) {
        C3862t.g(newOwner, "newOwner");
        C3862t.g(kind, "kind");
        C3862t.g(annotations, "annotations");
        C3862t.g(source, "source");
        C1022c c1022c = new C1022c((InterfaceC1692e) newOwner, (InterfaceC1699l) interfaceC1712z, annotations, this.f17822f0, kind, D(), Y(), R(), v1(), b0(), source);
        c1022c.Z0(R0());
        return c1022c;
    }

    @Override // Fb.InterfaceC1038t
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public C3924d D() {
        return this.f4624g0;
    }

    public nb.h v1() {
        return this.f4627j0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1022c(InterfaceC1692e containingDeclaration, InterfaceC1699l interfaceC1699l, Sa.h annotations, boolean z10, InterfaceC1689b.a kind, C3924d proto, InterfaceC4077c nameResolver, nb.g typeTable, nb.h versionRequirementTable, InterfaceC1037s interfaceC1037s, h0 h0Var) {
        super(containingDeclaration, interfaceC1699l, annotations, z10, kind, h0Var == null ? h0.f15158a : h0Var);
        C3862t.g(containingDeclaration, "containingDeclaration");
        C3862t.g(annotations, "annotations");
        C3862t.g(kind, "kind");
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(typeTable, "typeTable");
        C3862t.g(versionRequirementTable, "versionRequirementTable");
        this.f4624g0 = proto;
        this.f4625h0 = nameResolver;
        this.f4626i0 = typeTable;
        this.f4627j0 = versionRequirementTable;
        this.f4628k0 = interfaceC1037s;
    }
}

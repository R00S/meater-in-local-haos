package Db;

import Fb.InterfaceC1037s;
import Ra.InterfaceC1700m;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import lb.C3939s;
import nb.AbstractC4075a;
import nb.InterfaceC4077c;

/* compiled from: context.kt */
/* renamed from: Db.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1010p {

    /* renamed from: a, reason: collision with root package name */
    private final C1008n f3714a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4077c f3715b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1700m f3716c;

    /* renamed from: d, reason: collision with root package name */
    private final nb.g f3717d;

    /* renamed from: e, reason: collision with root package name */
    private final nb.h f3718e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC4075a f3719f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC1037s f3720g;

    /* renamed from: h, reason: collision with root package name */
    private final X f3721h;

    /* renamed from: i, reason: collision with root package name */
    private final K f3722i;

    public C1010p(C1008n components, InterfaceC4077c nameResolver, InterfaceC1700m containingDeclaration, nb.g typeTable, nb.h versionRequirementTable, AbstractC4075a metadataVersion, InterfaceC1037s interfaceC1037s, X x10, List<C3939s> typeParameters) {
        String strC;
        C3862t.g(components, "components");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(containingDeclaration, "containingDeclaration");
        C3862t.g(typeTable, "typeTable");
        C3862t.g(versionRequirementTable, "versionRequirementTable");
        C3862t.g(metadataVersion, "metadataVersion");
        C3862t.g(typeParameters, "typeParameters");
        this.f3714a = components;
        this.f3715b = nameResolver;
        this.f3716c = containingDeclaration;
        this.f3717d = typeTable;
        this.f3718e = versionRequirementTable;
        this.f3719f = metadataVersion;
        this.f3720g = interfaceC1037s;
        this.f3721h = new X(this, x10, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (interfaceC1037s == null || (strC = interfaceC1037s.c()) == null) ? "[container not found]" : strC);
        this.f3722i = new K(this);
    }

    public static /* synthetic */ C1010p b(C1010p c1010p, InterfaceC1700m interfaceC1700m, List list, InterfaceC4077c interfaceC4077c, nb.g gVar, nb.h hVar, AbstractC4075a abstractC4075a, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC4077c = c1010p.f3715b;
        }
        InterfaceC4077c interfaceC4077c2 = interfaceC4077c;
        if ((i10 & 8) != 0) {
            gVar = c1010p.f3717d;
        }
        nb.g gVar2 = gVar;
        if ((i10 & 16) != 0) {
            hVar = c1010p.f3718e;
        }
        nb.h hVar2 = hVar;
        if ((i10 & 32) != 0) {
            abstractC4075a = c1010p.f3719f;
        }
        return c1010p.a(interfaceC1700m, list, interfaceC4077c2, gVar2, hVar2, abstractC4075a);
    }

    public final C1010p a(InterfaceC1700m descriptor, List<C3939s> typeParameterProtos, InterfaceC4077c nameResolver, nb.g typeTable, nb.h hVar, AbstractC4075a metadataVersion) {
        C3862t.g(descriptor, "descriptor");
        C3862t.g(typeParameterProtos, "typeParameterProtos");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(typeTable, "typeTable");
        nb.h versionRequirementTable = hVar;
        C3862t.g(versionRequirementTable, "versionRequirementTable");
        C3862t.g(metadataVersion, "metadataVersion");
        C1008n c1008n = this.f3714a;
        if (!nb.i.b(metadataVersion)) {
            versionRequirementTable = this.f3718e;
        }
        return new C1010p(c1008n, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, this.f3720g, this.f3721h, typeParameterProtos);
    }

    public final C1008n c() {
        return this.f3714a;
    }

    public final InterfaceC1037s d() {
        return this.f3720g;
    }

    public final InterfaceC1700m e() {
        return this.f3716c;
    }

    public final K f() {
        return this.f3722i;
    }

    public final InterfaceC4077c g() {
        return this.f3715b;
    }

    public final Gb.n h() {
        return this.f3714a.u();
    }

    public final X i() {
        return this.f3721h;
    }

    public final nb.g j() {
        return this.f3717d;
    }

    public final nb.h k() {
        return this.f3718e;
    }
}

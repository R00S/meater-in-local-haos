package Ua;

import Ra.InterfaceC1700m;
import Ra.h0;

/* compiled from: ClassDescriptorBase.java */
/* renamed from: Ua.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1771j extends AbstractC1762a {

    /* renamed from: G, reason: collision with root package name */
    private final InterfaceC1700m f17823G;

    /* renamed from: H, reason: collision with root package name */
    private final h0 f17824H;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f17825I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1771j(Gb.n nVar, InterfaceC1700m interfaceC1700m, qb.f fVar, h0 h0Var, boolean z10) {
        super(nVar, fVar);
        if (nVar == null) {
            E0(0);
        }
        if (interfaceC1700m == null) {
            E0(1);
        }
        if (fVar == null) {
            E0(2);
        }
        if (h0Var == null) {
            E0(3);
        }
        this.f17823G = interfaceC1700m;
        this.f17824H = h0Var;
        this.f17825I = z10;
    }

    private static /* synthetic */ void E0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Ra.InterfaceC1692e, Ra.InterfaceC1701n, Ra.InterfaceC1700m
    public InterfaceC1700m c() {
        InterfaceC1700m interfaceC1700m = this.f17823G;
        if (interfaceC1700m == null) {
            E0(4);
        }
        return interfaceC1700m;
    }

    public boolean isExternal() {
        return this.f17825I;
    }

    @Override // Ra.InterfaceC1703p
    public h0 j() {
        h0 h0Var = this.f17824H;
        if (h0Var == null) {
            E0(5);
        }
        return h0Var;
    }
}

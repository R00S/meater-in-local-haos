package Ua;

import Ra.InterfaceC1700m;
import Ra.InterfaceC1701n;
import Ra.InterfaceC1703p;
import Ra.h0;

/* compiled from: DeclarationDescriptorNonRootImpl.java */
/* renamed from: Ua.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1775n extends AbstractC1774m implements InterfaceC1701n {

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC1700m f17835D;

    /* renamed from: E, reason: collision with root package name */
    private final h0 f17836E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1775n(InterfaceC1700m interfaceC1700m, Sa.h hVar, qb.f fVar, h0 h0Var) {
        super(hVar, fVar);
        if (interfaceC1700m == null) {
            H(0);
        }
        if (hVar == null) {
            H(1);
        }
        if (fVar == null) {
            H(2);
        }
        if (h0Var == null) {
            H(3);
        }
        this.f17835D = interfaceC1700m;
        this.f17836E = h0Var;
    }

    private static /* synthetic */ void H(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Ua.AbstractC1774m, Ra.InterfaceC1700m
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public InterfaceC1703p b() {
        InterfaceC1703p interfaceC1703p = (InterfaceC1703p) super.b();
        if (interfaceC1703p == null) {
            H(4);
        }
        return interfaceC1703p;
    }

    public InterfaceC1700m c() {
        InterfaceC1700m interfaceC1700m = this.f17835D;
        if (interfaceC1700m == null) {
            H(5);
        }
        return interfaceC1700m;
    }

    public h0 j() {
        h0 h0Var = this.f17836E;
        if (h0Var == null) {
            H(6);
        }
        return h0Var;
    }
}

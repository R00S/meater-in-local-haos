package Ua;

import Hb.Q0;
import Ra.InterfaceC1700m;
import Ra.h0;
import Ra.k0;

/* compiled from: AbstractLazyTypeParameterDescriptor.java */
/* renamed from: Ua.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1763b extends AbstractC1769h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1763b(Gb.n nVar, InterfaceC1700m interfaceC1700m, Sa.h hVar, qb.f fVar, Q0 q02, boolean z10, int i10, h0 h0Var, k0 k0Var) {
        super(nVar, interfaceC1700m, hVar, fVar, q02, z10, i10, h0Var, k0Var);
        if (nVar == null) {
            H(0);
        }
        if (interfaceC1700m == null) {
            H(1);
        }
        if (hVar == null) {
            H(2);
        }
        if (fVar == null) {
            H(3);
        }
        if (q02 == null) {
            H(4);
        }
        if (h0Var == null) {
            H(5);
        }
        if (k0Var == null) {
            H(6);
        }
    }

    private static /* synthetic */ void H(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Ua.AbstractC1774m
    public String toString() {
        String str = "";
        String str2 = E() ? "reified " : "";
        if (p() != Q0.f5693F) {
            str = p() + " ";
        }
        return String.format("%s%s%s", str2, str, getName());
    }
}

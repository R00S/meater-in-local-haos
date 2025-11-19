package Ua;

import Ra.InterfaceC1700m;

/* compiled from: DeclarationDescriptorImpl.java */
/* renamed from: Ua.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1774m extends Sa.b implements InterfaceC1700m {

    /* renamed from: C, reason: collision with root package name */
    private final qb.f f17834C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1774m(Sa.h hVar, qb.f fVar) {
        super(hVar);
        if (hVar == null) {
            H(0);
        }
        if (fVar == null) {
            H(1);
        }
        this.f17834C = fVar;
    }

    private static /* synthetic */ void H(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 5 || i10 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 == 4) {
                objArr[2] = "toString";
            } else if (i10 != 5 && i10 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String z0(InterfaceC1700m interfaceC1700m) {
        if (interfaceC1700m == null) {
            H(4);
        }
        try {
            String str = sb.n.f49599k.O(interfaceC1700m) + "[" + interfaceC1700m.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(interfaceC1700m)) + "]";
            if (str == null) {
                H(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = interfaceC1700m.getClass().getSimpleName() + " " + interfaceC1700m.getName();
            if (str2 == null) {
                H(6);
            }
            return str2;
        }
    }

    @Override // Ra.J
    public qb.f getName() {
        qb.f fVar = this.f17834C;
        if (fVar == null) {
            H(2);
        }
        return fVar;
    }

    public String toString() {
        return z0(this);
    }

    public InterfaceC1700m b() {
        return this;
    }
}

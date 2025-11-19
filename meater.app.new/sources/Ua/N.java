package Ua;

import Ra.InterfaceC1700m;

/* compiled from: ReceiverParameterDescriptorImpl.java */
/* loaded from: classes3.dex */
public class N extends AbstractC1764c {

    /* renamed from: D, reason: collision with root package name */
    private final InterfaceC1700m f17762D;

    /* renamed from: E, reason: collision with root package name */
    private Bb.g f17763E;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC1700m interfaceC1700m, Bb.g gVar, Sa.h hVar) {
        this(interfaceC1700m, gVar, hVar, qb.h.f48206i);
        if (interfaceC1700m == null) {
            H(0);
        }
        if (gVar == null) {
            H(1);
        }
        if (hVar == null) {
            H(2);
        }
    }

    private static /* synthetic */ void H(int i10) {
        String str = (i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "outType";
                break;
        }
        if (i10 == 7) {
            objArr[1] = "getValue";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i10) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Ra.InterfaceC1700m
    public InterfaceC1700m c() {
        InterfaceC1700m interfaceC1700m = this.f17762D;
        if (interfaceC1700m == null) {
            H(8);
        }
        return interfaceC1700m;
    }

    @Override // Ra.c0
    public Bb.g getValue() {
        Bb.g gVar = this.f17763E;
        if (gVar == null) {
            H(7);
        }
        return gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(InterfaceC1700m interfaceC1700m, Bb.g gVar, Sa.h hVar, qb.f fVar) {
        super(hVar, fVar);
        if (interfaceC1700m == null) {
            H(3);
        }
        if (gVar == null) {
            H(4);
        }
        if (hVar == null) {
            H(5);
        }
        if (fVar == null) {
            H(6);
        }
        this.f17762D = interfaceC1700m;
        this.f17763E = gVar;
    }
}

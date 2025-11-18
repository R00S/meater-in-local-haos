package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;

/* compiled from: TypeCheckerProcedureCallbacksImpl.java */
/* renamed from: kotlin.f0.y.e.j0.l.t1.t */
/* loaded from: classes3.dex */
class C10409t implements InterfaceC10411v {
    C10409t() {
    }

    /* renamed from: b */
    private static /* synthetic */ void m36961b(int i2) {
        Object[] objArr = new Object[3];
        switch (i2) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i2) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10411v
    /* renamed from: a */
    public boolean mo36962a(InterfaceC10345e1 interfaceC10345e1, InterfaceC10345e1 interfaceC10345e12) {
        if (interfaceC10345e1 == null) {
            m36961b(3);
        }
        if (interfaceC10345e12 == null) {
            m36961b(4);
        }
        return interfaceC10345e1.equals(interfaceC10345e12);
    }
}

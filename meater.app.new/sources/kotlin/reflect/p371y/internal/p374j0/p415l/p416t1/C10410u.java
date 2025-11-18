package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: TypeCheckingProcedure.java */
/* renamed from: kotlin.f0.y.e.j0.l.t1.u */
/* loaded from: classes3.dex */
public class C10410u {
    /* renamed from: a */
    private static /* synthetic */ void m36963a(int i2) {
        String str = (i2 == 7 || i2 == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 7 || i2 == 10) ? 2 : 3];
        switch (i2) {
            case 1:
            case 3:
            case 18:
            case 20:
                objArr[0] = "supertype";
                break;
            case 2:
            case 17:
            case 19:
            default:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "typeCheckingProcedureCallbacks";
                break;
            case 5:
            case 8:
            case 23:
                objArr[0] = MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD;
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case 11:
                objArr[0] = "type1";
                break;
            case 12:
                objArr[0] = "type2";
                break;
            case 13:
                objArr[0] = "typeParameter";
                break;
            case 14:
                objArr[0] = "typeArgument";
                break;
            case 15:
                objArr[0] = "typeParameterVariance";
                break;
            case 16:
                objArr[0] = "typeArgumentVariance";
                break;
            case 21:
                objArr[0] = "subtypeArgumentProjection";
                break;
            case 22:
                objArr[0] = "supertypeArgumentProjection";
                break;
        }
        if (i2 == 7) {
            objArr[1] = "getOutType";
        } else if (i2 != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i2) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case 10:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case 11:
            case 12:
                objArr[2] = "equalTypes";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "getEffectiveProjectionKind";
                break;
            case 17:
            case 18:
                objArr[2] = "isSubtypeOf";
                break;
            case 19:
            case 20:
                objArr[2] = "checkSubtypeForTheSameConstructor";
                break;
            case 21:
            case 22:
            case 23:
                objArr[2] = "capture";
                break;
            default:
                objArr[2] = "findCorrespondingSupertype";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 7 && i2 != 10) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: b */
    public static AbstractC10344e0 m36964b(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02) {
        if (abstractC10344e0 == null) {
            m36963a(0);
        }
        if (abstractC10344e02 == null) {
            m36963a(1);
        }
        return m36965c(abstractC10344e0, abstractC10344e02, new C10409t());
    }

    /* renamed from: c */
    public static AbstractC10344e0 m36965c(AbstractC10344e0 abstractC10344e0, AbstractC10344e0 abstractC10344e02, InterfaceC10411v interfaceC10411v) {
        if (abstractC10344e0 == null) {
            m36963a(2);
        }
        if (abstractC10344e02 == null) {
            m36963a(3);
        }
        if (interfaceC10411v == null) {
            m36963a(4);
        }
        return C10414y.m36982d(abstractC10344e0, abstractC10344e02, interfaceC10411v);
    }
}

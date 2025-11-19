package Ib;

import Hb.U;

/* compiled from: TypeCheckingProcedure.java */
/* loaded from: classes3.dex */
public class y {
    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 7 || i10 == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 7 || i10 == 10) ? 2 : 3];
        switch (i10) {
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
                objArr[0] = "parameter";
                break;
            case 6:
            case 9:
                objArr[0] = "argument";
                break;
            case 7:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "type1";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "type2";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
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
        if (i10 == 7) {
            objArr[1] = "getOutType";
        } else if (i10 != 10) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure";
        } else {
            objArr[1] = "getInType";
        }
        switch (i10) {
            case 5:
            case 6:
                objArr[2] = "getOutType";
                break;
            case 7:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                break;
            case 8:
            case 9:
                objArr[2] = "getInType";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "equalTypes";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
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
        if (i10 != 7 && i10 != 10) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static U b(U u10, U u11) {
        if (u10 == null) {
            a(0);
        }
        if (u11 == null) {
            a(1);
        }
        return c(u10, u11, new x());
    }

    public static U c(U u10, U u11, z zVar) {
        if (u10 == null) {
            a(2);
        }
        if (u11 == null) {
            a(3);
        }
        if (zVar == null) {
            a(4);
        }
        return D.d(u10, u11, zVar);
    }
}

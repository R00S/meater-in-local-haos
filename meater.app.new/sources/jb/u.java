package jb;

import jb.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import yb.C5148d;
import yb.EnumC5149e;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes3.dex */
final class u implements t<s> {

    /* renamed from: a, reason: collision with root package name */
    public static final u f43680a = new u();

    /* compiled from: methodSignatureMapping.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43681a;

        static {
            int[] iArr = new int[Oa.m.values().length];
            try {
                iArr[Oa.m.f13338H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Oa.m.f13339I.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Oa.m.f13340J.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Oa.m.f13341K.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Oa.m.f13342L.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Oa.m.f13343M.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Oa.m.f13344N.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Oa.m.f13345O.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f43681a = iArr;
        }
    }

    private u() {
    }

    @Override // jb.t
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public s e(s possiblyPrimitiveType) {
        C3862t.g(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof s.d)) {
            return possiblyPrimitiveType;
        }
        s.d dVar = (s.d) possiblyPrimitiveType;
        if (dVar.i() == null) {
            return possiblyPrimitiveType;
        }
        String strF = C5148d.c(dVar.i().u()).f();
        C3862t.f(strF, "getInternalName(...)");
        return c(strF);
    }

    @Override // jb.t
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public s b(String representation) {
        EnumC5149e enumC5149e;
        C3862t.g(representation, "representation");
        representation.length();
        char cCharAt = representation.charAt(0);
        EnumC5149e[] enumC5149eArrValues = EnumC5149e.values();
        int length = enumC5149eArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                enumC5149e = null;
                break;
            }
            enumC5149e = enumC5149eArrValues[i10];
            if (enumC5149e.p().charAt(0) == cCharAt) {
                break;
            }
            i10++;
        }
        if (enumC5149e != null) {
            return new s.d(enumC5149e);
        }
        if (cCharAt == 'V') {
            return new s.d(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            C3862t.f(strSubstring, "substring(...)");
            return new s.a(b(strSubstring));
        }
        if (cCharAt == 'L') {
            Ub.n.O(representation, ';', false, 2, null);
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        C3862t.f(strSubstring2, "substring(...)");
        return new s.c(strSubstring2);
    }

    @Override // jb.t
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public s.c c(String internalName) {
        C3862t.g(internalName, "internalName");
        return new s.c(internalName);
    }

    @Override // jb.t
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public s d(Oa.m primitiveType) {
        C3862t.g(primitiveType, "primitiveType");
        switch (a.f43681a[primitiveType.ordinal()]) {
            case 1:
                return s.f43668a.a();
            case 2:
                return s.f43668a.c();
            case 3:
                return s.f43668a.b();
            case 4:
                return s.f43668a.h();
            case 5:
                return s.f43668a.f();
            case 6:
                return s.f43668a.e();
            case 7:
                return s.f43668a.g();
            case 8:
                return s.f43668a.d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // jb.t
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public s f() {
        return c("java/lang/Class");
    }

    @Override // jb.t
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String a(s type) {
        String strP;
        C3862t.g(type, "type");
        if (type instanceof s.a) {
            return '[' + a(((s.a) type).i());
        }
        if (type instanceof s.d) {
            EnumC5149e enumC5149eI = ((s.d) type).i();
            return (enumC5149eI == null || (strP = enumC5149eI.p()) == null) ? "V" : strP;
        }
        if (!(type instanceof s.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return 'L' + ((s.c) type).i() + ';';
    }
}

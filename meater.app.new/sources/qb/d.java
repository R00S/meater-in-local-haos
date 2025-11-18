package qb;

import Ba.l;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.C3831l;

/* compiled from: FqNameUnsafe.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    private static final f f48185e = f.w("<root>");

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f48186f = Pattern.compile("\\.");

    /* renamed from: g, reason: collision with root package name */
    private static final l<String, f> f48187g = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f48188a;

    /* renamed from: b, reason: collision with root package name */
    private transient c f48189b;

    /* renamed from: c, reason: collision with root package name */
    private transient d f48190c;

    /* renamed from: d, reason: collision with root package name */
    private transient f f48191d;

    /* compiled from: FqNameUnsafe.java */
    static class a implements l<String, f> {
        a() {
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f invoke(String str) {
            return f.s(str);
        }
    }

    d(String str, c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f48188a = str;
        this.f48189b = cVar;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 18:
                i11 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "shortName";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 18:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private void d() {
        int iLastIndexOf = this.f48188a.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f48191d = f.s(this.f48188a.substring(iLastIndexOf + 1));
            this.f48190c = new d(this.f48188a.substring(0, iLastIndexOf));
        } else {
            this.f48191d = f.s(this.f48188a);
            this.f48190c = c.f48182c.j();
        }
    }

    public static d m(f fVar) {
        if (fVar == null) {
            a(17);
        }
        return new d(fVar.j(), c.f48182c.j(), fVar);
    }

    public String b() {
        String str = this.f48188a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    public d c(f fVar) {
        String strJ;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            strJ = fVar.j();
        } else {
            strJ = this.f48188a + "." + fVar.j();
        }
        return new d(strJ, this, fVar);
    }

    public boolean e() {
        return this.f48188a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f48188a.equals(((d) obj).f48188a);
    }

    public boolean f() {
        return this.f48189b != null || b().indexOf(60) < 0;
    }

    public d g() {
        d dVar = this.f48190c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        d dVar2 = this.f48190c;
        if (dVar2 == null) {
            a(8);
        }
        return dVar2;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public List<f> h() {
        List<f> listEmptyList = e() ? Collections.emptyList() : C3831l.s0(f48186f.split(this.f48188a), f48187g);
        if (listEmptyList == null) {
            a(14);
        }
        return listEmptyList;
    }

    public int hashCode() {
        return this.f48188a.hashCode();
    }

    public f i() {
        f fVar = this.f48191d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        f fVar2 = this.f48191d;
        if (fVar2 == null) {
            a(11);
        }
        return fVar2;
    }

    public f j() {
        if (e()) {
            f fVar = f48185e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f fVarI = i();
        if (fVarI == null) {
            a(13);
        }
        return fVarI;
    }

    public boolean k(f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int iIndexOf = this.f48188a.indexOf(46);
        if (iIndexOf == -1) {
            iIndexOf = this.f48188a.length();
        }
        String strJ = fVar.j();
        return iIndexOf == strJ.length() && this.f48188a.regionMatches(0, strJ, 0, iIndexOf);
    }

    public c l() {
        c cVar = this.f48189b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f48189b = cVar2;
        return cVar2;
    }

    public String toString() {
        String strJ = e() ? f48185e.j() : this.f48188a;
        if (strJ == null) {
            a(18);
        }
        return strJ;
    }

    public d(String str) {
        if (str == null) {
            a(2);
        }
        this.f48188a = str;
    }

    private d(String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f48188a = str;
        this.f48190c = dVar;
        this.f48191d = fVar;
    }
}

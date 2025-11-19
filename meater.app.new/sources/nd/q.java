package nd;

import Cc.C0982e;
import java.io.EOFException;
import java.util.regex.Pattern;
import oc.AbstractC4179C;
import oc.C4178B;
import oc.s;
import oc.u;
import oc.v;
import oc.y;

/* compiled from: RequestBuilder.java */
/* loaded from: classes3.dex */
final class q {

    /* renamed from: l, reason: collision with root package name */
    private static final char[] f45971l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f45972m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    private final String f45973a;

    /* renamed from: b, reason: collision with root package name */
    private final oc.v f45974b;

    /* renamed from: c, reason: collision with root package name */
    private String f45975c;

    /* renamed from: d, reason: collision with root package name */
    private v.a f45976d;

    /* renamed from: e, reason: collision with root package name */
    private final C4178B.a f45977e = new C4178B.a();

    /* renamed from: f, reason: collision with root package name */
    private final u.a f45978f;

    /* renamed from: g, reason: collision with root package name */
    private oc.x f45979g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f45980h;

    /* renamed from: i, reason: collision with root package name */
    private y.a f45981i;

    /* renamed from: j, reason: collision with root package name */
    private s.a f45982j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC4179C f45983k;

    /* compiled from: RequestBuilder.java */
    private static class a extends AbstractC4179C {

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC4179C f45984b;

        /* renamed from: c, reason: collision with root package name */
        private final oc.x f45985c;

        a(AbstractC4179C abstractC4179C, oc.x xVar) {
            this.f45984b = abstractC4179C;
            this.f45985c = xVar;
        }

        @Override // oc.AbstractC4179C
        public long a() {
            return this.f45984b.a();
        }

        @Override // oc.AbstractC4179C
        /* renamed from: b */
        public oc.x getContentType() {
            return this.f45985c;
        }

        @Override // oc.AbstractC4179C
        public void h(Cc.f fVar) {
            this.f45984b.h(fVar);
        }
    }

    q(String str, oc.v vVar, String str2, oc.u uVar, oc.x xVar, boolean z10, boolean z11, boolean z12) {
        this.f45973a = str;
        this.f45974b = vVar;
        this.f45975c = str2;
        this.f45979g = xVar;
        this.f45980h = z10;
        if (uVar != null) {
            this.f45978f = uVar.i();
        } else {
            this.f45978f = new u.a();
        }
        if (z11) {
            this.f45982j = new s.a();
        } else if (z12) {
            y.a aVar = new y.a();
            this.f45981i = aVar;
            aVar.d(y.f47125l);
        }
    }

    private static String i(String str, boolean z10) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                C0982e c0982e = new C0982e();
                c0982e.J0(str, 0, iCharCount);
                j(c0982e, str, iCharCount, length, z10);
                return c0982e.Q();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    private static void j(C0982e c0982e, String str, int i10, int i11, boolean z10) throws EOFException {
        C0982e c0982e2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (c0982e2 == null) {
                        c0982e2 = new C0982e();
                    }
                    c0982e2.u1(iCodePointAt);
                    while (!c0982e2.c0()) {
                        byte b10 = c0982e2.readByte();
                        c0982e.d0(37);
                        char[] cArr = f45971l;
                        c0982e.d0(cArr[((b10 & 255) >> 4) & 15]);
                        c0982e.d0(cArr[b10 & 15]);
                    }
                } else {
                    c0982e.u1(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    void a(String str, String str2, boolean z10) {
        if (z10) {
            this.f45982j.b(str, str2);
        } else {
            this.f45982j.a(str, str2);
        }
    }

    void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f45978f.a(str, str2);
            return;
        }
        try {
            this.f45979g = oc.x.e(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    void c(oc.u uVar) {
        this.f45978f.b(uVar);
    }

    void d(oc.u uVar, AbstractC4179C abstractC4179C) {
        this.f45981i.a(uVar, abstractC4179C);
    }

    void e(y.c cVar) {
        this.f45981i.b(cVar);
    }

    void f(String str, String str2, boolean z10) throws EOFException {
        if (this.f45975c == null) {
            throw new AssertionError();
        }
        String strI = i(str2, z10);
        String strReplace = this.f45975c.replace("{" + str + "}", strI);
        if (!f45972m.matcher(strReplace).matches()) {
            this.f45975c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    void g(String str, String str2, boolean z10) {
        String str3 = this.f45975c;
        if (str3 != null) {
            v.a aVarL = this.f45974b.l(str3);
            this.f45976d = aVarL;
            if (aVarL == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f45974b + ", Relative: " + this.f45975c);
            }
            this.f45975c = null;
        }
        if (z10) {
            this.f45976d.a(str, str2);
        } else {
            this.f45976d.b(str, str2);
        }
    }

    <T> void h(Class<T> cls, T t10) {
        this.f45977e.h(cls, t10);
    }

    C4178B.a k() {
        oc.v vVarR;
        v.a aVar = this.f45976d;
        if (aVar != null) {
            vVarR = aVar.c();
        } else {
            vVarR = this.f45974b.r(this.f45975c);
            if (vVarR == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f45974b + ", Relative: " + this.f45975c);
            }
        }
        AbstractC4179C aVar2 = this.f45983k;
        if (aVar2 == null) {
            s.a aVar3 = this.f45982j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                y.a aVar4 = this.f45981i;
                if (aVar4 != null) {
                    aVar2 = aVar4.c();
                } else if (this.f45980h) {
                    aVar2 = AbstractC4179C.e(null, new byte[0]);
                }
            }
        }
        oc.x xVar = this.f45979g;
        if (xVar != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, xVar);
            } else {
                this.f45978f.a("Content-Type", xVar.getMediaType());
            }
        }
        return this.f45977e.j(vVarR).e(this.f45978f.e()).f(this.f45973a, aVar2);
    }

    void l(AbstractC4179C abstractC4179C) {
        this.f45983k = abstractC4179C;
    }

    void m(Object obj) {
        this.f45975c = obj.toString();
    }
}

package kotlin.reflect.p371y.internal.p374j0.p397f;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;

/* compiled from: CallableId.kt */
/* renamed from: kotlin.f0.y.e.j0.f.a */
/* loaded from: classes3.dex */
public final class C10158a {

    /* renamed from: a */
    private static final a f39240a = new a(null);

    /* renamed from: b */
    @Deprecated
    private static final C10163f f39241b;

    /* renamed from: c */
    @Deprecated
    private static final C10160c f39242c;

    /* renamed from: d */
    private final C10160c f39243d;

    /* renamed from: e */
    private final C10160c f39244e;

    /* renamed from: f */
    private final C10163f f39245f;

    /* renamed from: g */
    private final C10160c f39246g;

    /* compiled from: CallableId.kt */
    /* renamed from: kotlin.f0.y.e.j0.f.a$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    static {
        C10163f c10163f = C10165h.f39276l;
        f39241b = c10163f;
        C10160c c10160cM35419k = C10160c.m35419k(c10163f);
        C9801m.m32345e(c10160cM35419k, "topLevel(LOCAL_NAME)");
        f39242c = c10160cM35419k;
    }

    public C10158a(C10160c c10160c, C10160c c10160c2, C10163f c10163f, C10160c c10160c3) {
        C9801m.m32346f(c10160c, "packageName");
        C9801m.m32346f(c10163f, "callableName");
        this.f39243d = c10160c;
        this.f39244e = c10160c2;
        this.f39245f = c10163f;
        this.f39246g = c10160c3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10158a)) {
            return false;
        }
        C10158a c10158a = (C10158a) obj;
        return C9801m.m32341a(this.f39243d, c10158a.f39243d) && C9801m.m32341a(this.f39244e, c10158a.f39244e) && C9801m.m32341a(this.f39245f, c10158a.f39245f) && C9801m.m32341a(this.f39246g, c10158a.f39246g);
    }

    public int hashCode() {
        int iHashCode = this.f39243d.hashCode() * 31;
        C10160c c10160c = this.f39244e;
        int iHashCode2 = (((iHashCode + (c10160c == null ? 0 : c10160c.hashCode())) * 31) + this.f39245f.hashCode()) * 31;
        C10160c c10160c2 = this.f39246g;
        return iHashCode2 + (c10160c2 != null ? c10160c2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String strM35420b = this.f39243d.m35420b();
        C9801m.m32345e(strM35420b, "packageName.asString()");
        sb.append(C10546u.m37524z(strM35420b, '.', '/', false, 4, null));
        sb.append("/");
        C10160c c10160c = this.f39244e;
        if (c10160c != null) {
            sb.append(c10160c);
            sb.append(".");
        }
        sb.append(this.f39245f);
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ C10158a(C10160c c10160c, C10160c c10160c2, C10163f c10163f, C10160c c10160c3, int i2, C9789g c9789g) {
        this(c10160c, c10160c2, c10163f, (i2 & 8) != 0 ? null : c10160c3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10158a(C10160c c10160c, C10163f c10163f) {
        this(c10160c, null, c10163f, null, 8, null);
        C9801m.m32346f(c10160c, "packageName");
        C9801m.m32346f(c10163f, "callableName");
    }
}

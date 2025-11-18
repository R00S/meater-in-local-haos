package ab;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;

/* compiled from: Jsr305Settings.kt */
/* renamed from: ab.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1926G {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC1934O f20129a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC1934O f20130b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<qb.c, EnumC1934O> f20131c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4164i f20132d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f20133e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1926G(EnumC1934O globalLevel, EnumC1934O enumC1934O, Map<qb.c, ? extends EnumC1934O> userDefinedLevelForSpecificAnnotation) {
        C3862t.g(globalLevel, "globalLevel");
        C3862t.g(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f20129a = globalLevel;
        this.f20130b = enumC1934O;
        this.f20131c = userDefinedLevelForSpecificAnnotation;
        this.f20132d = C4165j.a(new C1925F(this));
        EnumC1934O enumC1934O2 = EnumC1934O.f20195D;
        this.f20133e = globalLevel == enumC1934O2 && enumC1934O == enumC1934O2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] b(C1926G c1926g) {
        List listC = kotlin.collections.r.c();
        listC.add(c1926g.f20129a.j());
        EnumC1934O enumC1934O = c1926g.f20130b;
        if (enumC1934O != null) {
            listC.add("under-migration:" + enumC1934O.j());
        }
        for (Map.Entry<qb.c, EnumC1934O> entry : c1926g.f20131c.entrySet()) {
            listC.add('@' + entry.getKey() + ':' + entry.getValue().j());
        }
        return (String[]) kotlin.collections.r.a(listC).toArray(new String[0]);
    }

    public final EnumC1934O c() {
        return this.f20129a;
    }

    public final EnumC1934O d() {
        return this.f20130b;
    }

    public final Map<qb.c, EnumC1934O> e() {
        return this.f20131c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1926G)) {
            return false;
        }
        C1926G c1926g = (C1926G) obj;
        return this.f20129a == c1926g.f20129a && this.f20130b == c1926g.f20130b && C3862t.b(this.f20131c, c1926g.f20131c);
    }

    public final boolean f() {
        return this.f20133e;
    }

    public int hashCode() {
        int iHashCode = this.f20129a.hashCode() * 31;
        EnumC1934O enumC1934O = this.f20130b;
        return ((iHashCode + (enumC1934O == null ? 0 : enumC1934O.hashCode())) * 31) + this.f20131c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f20129a + ", migrationLevel=" + this.f20130b + ", userDefinedLevelForSpecificAnnotation=" + this.f20131c + ')';
    }

    public /* synthetic */ C1926G(EnumC1934O enumC1934O, EnumC1934O enumC1934O2, Map map, int i10, C3854k c3854k) {
        this(enumC1934O, (i10 & 2) != 0 ? null : enumC1934O2, (i10 & 4) != 0 ? kotlin.collections.M.h() : map);
    }
}

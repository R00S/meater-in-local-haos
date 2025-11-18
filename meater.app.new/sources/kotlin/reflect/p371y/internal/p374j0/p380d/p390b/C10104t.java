package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10116d;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;

/* compiled from: MemberSignature.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.t */
/* loaded from: classes3.dex */
public final class C10104t {

    /* renamed from: a */
    public static final a f38485a = new a(null);

    /* renamed from: b */
    private final String f38486b;

    /* compiled from: MemberSignature.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C10104t m34031a(String str, String str2) {
            C9801m.m32346f(str, "name");
            C9801m.m32346f(str2, "desc");
            return new C10104t(str + '#' + str2, null);
        }

        /* renamed from: b */
        public final C10104t m34032b(AbstractC10116d abstractC10116d) {
            C9801m.m32346f(abstractC10116d, RoomInstalled.SIGNATURE);
            if (abstractC10116d instanceof AbstractC10116d.b) {
                return m34034d(abstractC10116d.mo34249c(), abstractC10116d.mo34248b());
            }
            if (abstractC10116d instanceof AbstractC10116d.a) {
                return m34031a(abstractC10116d.mo34249c(), abstractC10116d.mo34248b());
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: c */
        public final C10104t m34033c(InterfaceC10151c interfaceC10151c, C10112a.c cVar) {
            C9801m.m32346f(interfaceC10151c, "nameResolver");
            C9801m.m32346f(cVar, RoomInstalled.SIGNATURE);
            return m34034d(interfaceC10151c.getString(cVar.m34114x()), interfaceC10151c.getString(cVar.m34113w()));
        }

        /* renamed from: d */
        public final C10104t m34034d(String str, String str2) {
            C9801m.m32346f(str, "name");
            C9801m.m32346f(str2, "desc");
            return new C10104t(str + str2, null);
        }

        /* renamed from: e */
        public final C10104t m34035e(C10104t c10104t, int i2) {
            C9801m.m32346f(c10104t, RoomInstalled.SIGNATURE);
            return new C10104t(c10104t.m34030a() + '@' + i2, null);
        }
    }

    private C10104t(String str) {
        this.f38486b = str;
    }

    public /* synthetic */ C10104t(String str, C9789g c9789g) {
        this(str);
    }

    /* renamed from: a */
    public final String m34030a() {
        return this.f38486b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10104t) && C9801m.m32341a(this.f38486b, ((C10104t) obj).f38486b);
    }

    public int hashCode() {
        return this.f38486b.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f38486b + ')';
    }
}

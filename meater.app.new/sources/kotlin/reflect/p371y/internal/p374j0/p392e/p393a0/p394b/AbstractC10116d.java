package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: JvmMemberSignature.kt */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.d */
/* loaded from: classes3.dex */
public abstract class AbstractC10116d {

    /* compiled from: JvmMemberSignature.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.a0.b.d$a */
    public static final class a extends AbstractC10116d {

        /* renamed from: a */
        private final String f38590a;

        /* renamed from: b */
        private final String f38591b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            C9801m.m32346f(str, "name");
            C9801m.m32346f(str2, "desc");
            this.f38590a = str;
            this.f38591b = str2;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10116d
        /* renamed from: a */
        public String mo34247a() {
            return mo34249c() + ':' + mo34248b();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10116d
        /* renamed from: b */
        public String mo34248b() {
            return this.f38591b;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10116d
        /* renamed from: c */
        public String mo34249c() {
            return this.f38590a;
        }

        /* renamed from: d */
        public final String m34250d() {
            return mo34249c();
        }

        /* renamed from: e */
        public final String m34251e() {
            return mo34248b();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C9801m.m32341a(mo34249c(), aVar.mo34249c()) && C9801m.m32341a(mo34248b(), aVar.mo34248b());
        }

        public int hashCode() {
            return (mo34249c().hashCode() * 31) + mo34248b().hashCode();
        }
    }

    /* compiled from: JvmMemberSignature.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.a0.b.d$b */
    public static final class b extends AbstractC10116d {

        /* renamed from: a */
        private final String f38592a;

        /* renamed from: b */
        private final String f38593b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(null);
            C9801m.m32346f(str, "name");
            C9801m.m32346f(str2, "desc");
            this.f38592a = str;
            this.f38593b = str2;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10116d
        /* renamed from: a */
        public String mo34247a() {
            return mo34249c() + mo34248b();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10116d
        /* renamed from: b */
        public String mo34248b() {
            return this.f38593b;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.AbstractC10116d
        /* renamed from: c */
        public String mo34249c() {
            return this.f38592a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C9801m.m32341a(mo34249c(), bVar.mo34249c()) && C9801m.m32341a(mo34248b(), bVar.mo34248b());
        }

        public int hashCode() {
            return (mo34249c().hashCode() * 31) + mo34248b().hashCode();
        }
    }

    private AbstractC10116d() {
    }

    public /* synthetic */ AbstractC10116d(C9789g c9789g) {
        this();
    }

    /* renamed from: a */
    public abstract String mo34247a();

    /* renamed from: b */
    public abstract String mo34248b();

    /* renamed from: c */
    public abstract String mo34249c();

    public final String toString() {
        return mo34247a();
    }
}

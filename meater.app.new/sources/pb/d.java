package pb;

import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: JvmMemberSignature.kt */
/* loaded from: classes3.dex */
public abstract class d {

    /* compiled from: JvmMemberSignature.kt */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private final String f47728a;

        /* renamed from: b, reason: collision with root package name */
        private final String f47729b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String name, String desc) {
            super(null);
            C3862t.g(name, "name");
            C3862t.g(desc, "desc");
            this.f47728a = name;
            this.f47729b = desc;
        }

        @Override // pb.d
        public String a() {
            return e() + ':' + d();
        }

        public final String b() {
            return this.f47728a;
        }

        public final String c() {
            return this.f47729b;
        }

        public String d() {
            return this.f47729b;
        }

        public String e() {
            return this.f47728a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C3862t.b(this.f47728a, aVar.f47728a) && C3862t.b(this.f47729b, aVar.f47729b);
        }

        public int hashCode() {
            return (this.f47728a.hashCode() * 31) + this.f47729b.hashCode();
        }
    }

    /* compiled from: JvmMemberSignature.kt */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private final String f47730a;

        /* renamed from: b, reason: collision with root package name */
        private final String f47731b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String name, String desc) {
            super(null);
            C3862t.g(name, "name");
            C3862t.g(desc, "desc");
            this.f47730a = name;
            this.f47731b = desc;
        }

        public static /* synthetic */ b c(b bVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = bVar.f47730a;
            }
            if ((i10 & 2) != 0) {
                str2 = bVar.f47731b;
            }
            return bVar.b(str, str2);
        }

        @Override // pb.d
        public String a() {
            return e() + d();
        }

        public final b b(String name, String desc) {
            C3862t.g(name, "name");
            C3862t.g(desc, "desc");
            return new b(name, desc);
        }

        public String d() {
            return this.f47731b;
        }

        public String e() {
            return this.f47730a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C3862t.b(this.f47730a, bVar.f47730a) && C3862t.b(this.f47731b, bVar.f47731b);
        }

        public int hashCode() {
            return (this.f47730a.hashCode() * 31) + this.f47731b.hashCode();
        }
    }

    public /* synthetic */ d(C3854k c3854k) {
        this();
    }

    public abstract String a();

    public final String toString() {
        return a();
    }

    private d() {
    }
}

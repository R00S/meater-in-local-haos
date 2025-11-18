package jb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import nb.InterfaceC4077c;
import ob.C4176a;
import pb.d;

/* compiled from: MemberSignature.kt */
/* renamed from: jb.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3757A {

    /* renamed from: b, reason: collision with root package name */
    public static final a f43569b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f43570a;

    /* compiled from: MemberSignature.kt */
    /* renamed from: jb.A$a */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final C3757A a(String name, String desc) {
            C3862t.g(name, "name");
            C3862t.g(desc, "desc");
            return new C3757A(name + '#' + desc, null);
        }

        public final C3757A b(pb.d signature) {
            C3862t.g(signature, "signature");
            if (signature instanceof d.b) {
                d.b bVar = (d.b) signature;
                return d(bVar.e(), bVar.d());
            }
            if (!(signature instanceof d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            d.a aVar = (d.a) signature;
            return a(aVar.e(), aVar.d());
        }

        public final C3757A c(InterfaceC4077c nameResolver, C4176a.c signature) {
            C3862t.g(nameResolver, "nameResolver");
            C3862t.g(signature, "signature");
            return d(nameResolver.getString(signature.y()), nameResolver.getString(signature.x()));
        }

        public final C3757A d(String name, String desc) {
            C3862t.g(name, "name");
            C3862t.g(desc, "desc");
            return new C3757A(name + desc, null);
        }

        public final C3757A e(C3757A signature, int i10) {
            C3862t.g(signature, "signature");
            return new C3757A(signature.a() + '@' + i10, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C3757A(String str, C3854k c3854k) {
        this(str);
    }

    public final String a() {
        return this.f43570a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3757A) && C3862t.b(this.f43570a, ((C3757A) obj).f43570a);
    }

    public int hashCode() {
        return this.f43570a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f43570a + ')';
    }

    private C3757A(String str) {
        this.f43570a = str;
    }
}

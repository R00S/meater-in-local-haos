package ab;

import hb.InterfaceC3514g;
import hb.InterfaceC3528u;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: JavaClassFinder.kt */
/* renamed from: ab.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1961u {
    Set<String> a(qb.c cVar);

    InterfaceC3528u b(qb.c cVar, boolean z10);

    InterfaceC3514g c(a aVar);

    /* compiled from: JavaClassFinder.kt */
    /* renamed from: ab.u$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final qb.b f20270a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f20271b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC3514g f20272c;

        public a(qb.b classId, byte[] bArr, InterfaceC3514g interfaceC3514g) {
            C3862t.g(classId, "classId");
            this.f20270a = classId;
            this.f20271b = bArr;
            this.f20272c = interfaceC3514g;
        }

        public final qb.b a() {
            return this.f20270a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C3862t.b(this.f20270a, aVar.f20270a) && C3862t.b(this.f20271b, aVar.f20271b) && C3862t.b(this.f20272c, aVar.f20272c);
        }

        public int hashCode() {
            int iHashCode = this.f20270a.hashCode() * 31;
            byte[] bArr = this.f20271b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            InterfaceC3514g interfaceC3514g = this.f20272c;
            return iHashCode2 + (interfaceC3514g != null ? interfaceC3514g.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f20270a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f20271b) + ", outerClass=" + this.f20272c + ')';
        }

        public /* synthetic */ a(qb.b bVar, byte[] bArr, InterfaceC3514g interfaceC3514g, int i10, C3854k c3854k) {
            this(bVar, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : interfaceC3514g);
        }
    }
}

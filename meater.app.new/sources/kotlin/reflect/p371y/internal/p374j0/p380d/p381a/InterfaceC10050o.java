package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10044u;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;

/* compiled from: JavaClassFinder.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o */
/* loaded from: classes2.dex */
public interface InterfaceC10050o {

    /* compiled from: JavaClassFinder.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC10044u m33632a(InterfaceC10050o interfaceC10050o, C10160c c10160c, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findPackage");
            }
            if ((i2 & 2) != 0) {
                z = true;
            }
            return interfaceC10050o.mo33631c(c10160c, z);
        }
    }

    /* renamed from: a */
    InterfaceC10030g mo33629a(b bVar);

    /* renamed from: b */
    Set<String> mo33630b(C10160c c10160c);

    /* renamed from: c */
    InterfaceC10044u mo33631c(C10160c c10160c, boolean z);

    /* compiled from: JavaClassFinder.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o$b */
    public static final class b {

        /* renamed from: a */
        private final C10159b f38197a;

        /* renamed from: b */
        private final byte[] f38198b;

        /* renamed from: c */
        private final InterfaceC10030g f38199c;

        public b(C10159b c10159b, byte[] bArr, InterfaceC10030g interfaceC10030g) {
            C9801m.m32346f(c10159b, "classId");
            this.f38197a = c10159b;
            this.f38198b = bArr;
            this.f38199c = interfaceC10030g;
        }

        /* renamed from: a */
        public final C10159b m33633a() {
            return this.f38197a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C9801m.m32341a(this.f38197a, bVar.f38197a) && C9801m.m32341a(this.f38198b, bVar.f38198b) && C9801m.m32341a(this.f38199c, bVar.f38199c);
        }

        public int hashCode() {
            int iHashCode = this.f38197a.hashCode() * 31;
            byte[] bArr = this.f38198b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            InterfaceC10030g interfaceC10030g = this.f38199c;
            return iHashCode2 + (interfaceC10030g != null ? interfaceC10030g.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f38197a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f38198b) + ", outerClass=" + this.f38199c + ')';
        }

        public /* synthetic */ b(C10159b c10159b, byte[] bArr, InterfaceC10030g interfaceC10030g, int i2, C9789g c9789g) {
            this(c10159b, (i2 & 2) != 0 ? null : bArr, (i2 & 4) != 0 ? null : interfaceC10030g);
        }
    }
}

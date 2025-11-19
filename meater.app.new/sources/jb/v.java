package jb;

import hb.InterfaceC3514g;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: KotlinClassFinder.kt */
/* loaded from: classes3.dex */
public interface v extends Db.A {

    /* compiled from: KotlinClassFinder.kt */
    public static abstract class a {

        /* compiled from: KotlinClassFinder.kt */
        /* renamed from: jb.v$a$a, reason: collision with other inner class name */
        public static final class C0565a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final byte[] f43682a;

            public final byte[] b() {
                return this.f43682a;
            }
        }

        /* compiled from: KotlinClassFinder.kt */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final x f43683a;

            /* renamed from: b, reason: collision with root package name */
            private final byte[] f43684b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x kotlinJvmBinaryClass, byte[] bArr) {
                super(null);
                C3862t.g(kotlinJvmBinaryClass, "kotlinJvmBinaryClass");
                this.f43683a = kotlinJvmBinaryClass;
                this.f43684b = bArr;
            }

            public final x b() {
                return this.f43683a;
            }

            public /* synthetic */ b(x xVar, byte[] bArr, int i10, C3854k c3854k) {
                this(xVar, (i10 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final x a() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar != null) {
                return bVar.b();
            }
            return null;
        }

        private a() {
        }
    }

    a b(qb.b bVar, pb.e eVar);

    a c(InterfaceC3514g interfaceC3514g, pb.e eVar);
}

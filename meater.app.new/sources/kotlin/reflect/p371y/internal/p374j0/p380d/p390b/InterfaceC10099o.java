package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10030g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10311u;

/* compiled from: KotlinClassFinder.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.o */
/* loaded from: classes3.dex */
public interface InterfaceC10099o extends InterfaceC10311u {

    /* compiled from: KotlinClassFinder.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.o$a */
    public static abstract class a {

        /* compiled from: KotlinClassFinder.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.o$a$a, reason: collision with other inner class name */
        public static final class C11551a extends a {

            /* renamed from: a */
            private final byte[] f38477a;

            /* renamed from: b */
            public final byte[] m34021b() {
                return this.f38477a;
            }
        }

        /* compiled from: KotlinClassFinder.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.o$a$b */
        public static final class b extends a {

            /* renamed from: a */
            private final InterfaceC10101q f38478a;

            /* renamed from: b */
            private final byte[] f38479b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC10101q interfaceC10101q, byte[] bArr) {
                super(null);
                C9801m.m32346f(interfaceC10101q, "kotlinJvmBinaryClass");
                this.f38478a = interfaceC10101q;
                this.f38479b = bArr;
            }

            /* renamed from: b */
            public final InterfaceC10101q m34022b() {
                return this.f38478a;
            }

            public /* synthetic */ b(InterfaceC10101q interfaceC10101q, byte[] bArr, int i2, C9789g c9789g) {
                this(interfaceC10101q, (i2 & 2) != 0 ? null : bArr);
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC10101q m34020a() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar != null) {
                return bVar.m34022b();
            }
            return null;
        }
    }

    /* renamed from: a */
    a mo34018a(InterfaceC10030g interfaceC10030g);

    /* renamed from: c */
    a mo34019c(C10159b c10159b);
}

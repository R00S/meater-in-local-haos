package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.F4;
import com.google.android.gms.internal.measurement.F4.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public abstract class F4<MessageType extends F4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends O3<MessageType, BuilderType> {
    private static Map<Class<?>, F4<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected T5 zzb = T5.k();

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
    public static abstract class a<MessageType extends F4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends N3<MessageType, BuilderType> {

        /* renamed from: B, reason: collision with root package name */
        private final MessageType f33730B;

        /* renamed from: C, reason: collision with root package name */
        protected MessageType f33731C;

        protected a(MessageType messagetype) {
            this.f33730B = messagetype;
            if (messagetype.J()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f33731C = (MessageType) messagetype.D();
        }

        private static <MessageType> void p(MessageType messagetype, MessageType messagetype2) {
            C2628y5.a().c(messagetype).g(messagetype, messagetype2);
        }

        private final BuilderType u(byte[] bArr, int i10, int i11, C2571r4 c2571r4) throws zzkp {
            if (!this.f33731C.J()) {
                t();
            }
            try {
                C2628y5.a().c(this.f33731C).d(this.f33731C, bArr, 0, i11, new T3(c2571r4));
                return this;
            } catch (zzkp e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw zzkp.g();
            }
        }

        @Override // com.google.android.gms.internal.measurement.N3
        public /* synthetic */ Object clone() {
            a aVar = (a) this.f33730B.s(f.f33736e, null, null);
            aVar.f33731C = (MessageType) y();
            return aVar;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2533m5
        public final boolean g() {
            return F4.w(this.f33731C, false);
        }

        @Override // com.google.android.gms.internal.measurement.N3
        public final /* synthetic */ N3 k(byte[] bArr, int i10, int i11) {
            return u(bArr, 0, i11, C2571r4.f34285c);
        }

        @Override // com.google.android.gms.internal.measurement.N3
        public final /* synthetic */ N3 l(byte[] bArr, int i10, int i11, C2571r4 c2571r4) {
            return u(bArr, 0, i11, c2571r4);
        }

        public final BuilderType o(MessageType messagetype) {
            if (this.f33730B.equals(messagetype)) {
                return this;
            }
            if (!this.f33731C.J()) {
                t();
            }
            p(this.f33731C, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2541n5
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public final MessageType x() {
            MessageType messagetype = (MessageType) y();
            if (messagetype.g()) {
                return messagetype;
            }
            throw new zzmv(messagetype);
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2541n5
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public MessageType y() {
            if (!this.f33731C.J()) {
                return this.f33731C;
            }
            this.f33731C.H();
            return this.f33731C;
        }

        protected final void s() {
            if (this.f33731C.J()) {
                return;
            }
            t();
        }

        protected void t() {
            MessageType messagetype = (MessageType) this.f33730B.D();
            p(messagetype, this.f33731C);
            this.f33731C = messagetype;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends F4<MessageType, BuilderType> implements InterfaceC2533m5 {
        protected C2595u4<e> zzc = C2595u4.i();

        final C2595u4<e> K() {
            if (this.zzc.r()) {
                this.zzc = (C2595u4) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
    protected static class c<T extends F4<T, ?>> extends P3<T> {
        public c(T t10) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
    public static class d<ContainingType extends InterfaceC2517k5, Type> extends C2556p4<ContainingType, Type> {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
    static final class e implements InterfaceC2611w4<e> {
        @Override // com.google.android.gms.internal.measurement.InterfaceC2611w4
        public final int a() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2611w4
        public final EnumC2461d6 b() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2611w4
        public final EnumC2486g6 d() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2611w4
        public final boolean f() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2611w4
        public final boolean h() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2611w4
        public final InterfaceC2541n5 l(InterfaceC2541n5 interfaceC2541n5, InterfaceC2517k5 interfaceC2517k5) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.InterfaceC2611w4
        public final InterfaceC2580s5 q(InterfaceC2580s5 interfaceC2580s5, InterfaceC2580s5 interfaceC2580s52) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
    public enum f {

        /* renamed from: a, reason: collision with root package name */
        public static final int f33732a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f33733b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f33734c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f33735d = 4;

        /* renamed from: e, reason: collision with root package name */
        public static final int f33736e = 5;

        /* renamed from: f, reason: collision with root package name */
        public static final int f33737f = 6;

        /* renamed from: g, reason: collision with root package name */
        public static final int f33738g = 7;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ int[] f33739h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f33739h.clone();
        }
    }

    private static final <T extends F4<T, ?>> boolean A(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.s(f.f33732a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zE = C2628y5.a().c(t10).e(t10);
        if (z10) {
            t10.s(f.f33733b, zE ? t10 : null, null);
        }
        return zE;
    }

    protected static J4 E() {
        return G4.h();
    }

    protected static M4 F() {
        return Z4.h();
    }

    protected static <E> L4<E> G() {
        return B5.i();
    }

    private final int n() {
        return C2628y5.a().c(this).c(this);
    }

    static <T extends F4<?, ?>> T p(Class<T> cls) throws ClassNotFoundException {
        F4<?, ?> f42 = zzc.get(cls);
        if (f42 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                f42 = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (f42 == null) {
            f42 = (T) ((F4) V5.b(cls)).s(f.f33737f, null, null);
            if (f42 == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, f42);
        }
        return (T) f42;
    }

    protected static <E> L4<E> q(L4<E> l42) {
        return l42.g(l42.size() << 1);
    }

    protected static M4 r(M4 m42) {
        return m42.g(m42.size() << 1);
    }

    protected static Object t(InterfaceC2517k5 interfaceC2517k5, String str, Object[] objArr) {
        return new A5(interfaceC2517k5, str, objArr);
    }

    static Object u(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static <T extends F4<?, ?>> void v(Class<T> cls, T t10) {
        t10.I();
        zzc.put(cls, t10);
    }

    static /* synthetic */ boolean w(F4 f42, boolean z10) {
        return A(f42, false);
    }

    private final int z(C5<?> c52) {
        return c52 == null ? C2628y5.a().c(this).b(this) : c52.b(this);
    }

    protected final <MessageType extends F4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType B() {
        return (BuilderType) s(f.f33736e, null, null);
    }

    public final BuilderType C() {
        return (BuilderType) ((a) s(f.f33736e, null, null)).o(this);
    }

    final MessageType D() {
        return (MessageType) s(f.f33735d, null, null);
    }

    protected final void H() {
        C2628y5.a().c(this).f(this);
        I();
    }

    final void I() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final boolean J() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2517k5
    public final /* synthetic */ InterfaceC2541n5 b() {
        return ((a) s(f.f33736e, null, null)).o(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2533m5
    public final /* synthetic */ InterfaceC2517k5 c() {
        return (F4) s(f.f33737f, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2517k5
    public final int d() {
        return e(null);
    }

    @Override // com.google.android.gms.internal.measurement.O3
    final int e(C5 c52) {
        if (!J()) {
            if (l() != Integer.MAX_VALUE) {
                return l();
            }
            int iZ = z(c52);
            k(iZ);
            return iZ;
        }
        int iZ2 = z(c52);
        if (iZ2 >= 0) {
            return iZ2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZ2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C2628y5.a().c(this).i(this, (F4) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2517k5
    public final /* synthetic */ InterfaceC2541n5 f() {
        return (a) s(f.f33736e, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2533m5
    public final boolean g() {
        return A(this, true);
    }

    public int hashCode() {
        if (J()) {
            return n();
        }
        if (this.zza == 0) {
            this.zza = n();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2517k5
    public final void i(zzjn zzjnVar) {
        C2628y5.a().c(this).h(this, C2540n4.P(zzjnVar));
    }

    @Override // com.google.android.gms.internal.measurement.O3
    final void k(int i10) {
        if (i10 >= 0) {
            this.zzd = (i10 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.O3
    final int l() {
        return this.zzd & Integer.MAX_VALUE;
    }

    protected final <MessageType extends F4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType o(MessageType messagetype) {
        return (BuilderType) B().o(messagetype);
    }

    protected abstract Object s(int i10, Object obj, Object obj2);

    public String toString() {
        return C2557p5.a(this, super.toString());
    }
}

package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;
import com.google.android.gms.internal.measurement.zzfd.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public abstract class zzfd<MessageType extends zzfd<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzdl<MessageType, BuilderType> {
    private static Map<Object, zzfd<?, ?>> zzd = new ConcurrentHashMap();
    protected zzhy zzb = zzhy.m22330a();
    private int zzc = -1;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.zzfd$a */
    static final class C7632a implements zzey<C7632a> {
        @Override // com.google.android.gms.internal.measurement.zzey
        /* renamed from: a */
        public final int mo22250a() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        /* renamed from: b */
        public final zzim mo22251b() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        /* renamed from: c */
        public final zzip mo22252c() {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        /* renamed from: d */
        public final boolean mo22253d() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        /* renamed from: e */
        public final boolean mo22254e() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        /* renamed from: o */
        public final zzgn mo22255o(zzgn zzgnVar, zzgo zzgoVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.measurement.zzey
        /* renamed from: z */
        public final zzgt mo22256z(zzgt zzgtVar, zzgt zzgtVar2) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
    public static class zza<T extends zzfd<T, ?>> extends zzdp<T> {

        /* renamed from: b */
        private final T f28119b;

        public zza(T t) {
            this.f28119b = t;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
    public static abstract class zzb<MessageType extends zzfd<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzdn<MessageType, BuilderType> {

        /* renamed from: f */
        private final MessageType f28120f;

        /* renamed from: g */
        protected MessageType f28121g;

        /* renamed from: h */
        private boolean f28122h = false;

        protected zzb(MessageType messagetype) {
            this.f28120f = messagetype;
            this.f28121g = (MessageType) messagetype.mo21510p(zze.f28126d, null, null);
        }

        /* renamed from: q */
        private static void m22275q(MessageType messagetype, MessageType messagetype2) {
            C7543l3.m21234a().m21236c(messagetype).mo21104j(messagetype, messagetype2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.measurement.zzdn
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final BuilderType mo22145k(zzeg zzegVar, zzeq zzeqVar) throws IOException {
            m22279t();
            try {
                C7543l3.m21234a().m21236c(this.f28121g).mo21103i(this.f28121g, C7625z1.m21479P(zzegVar), zzeqVar);
                return this;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof IOException) {
                    throw ((IOException) e2.getCause());
                }
                throw e2;
            }
        }

        /* renamed from: s */
        private final BuilderType m22277s(byte[] bArr, int i2, int i3, zzeq zzeqVar) throws zzfo {
            m22279t();
            try {
                C7543l3.m21234a().m21236c(this.f28121g).mo21098d(this.f28121g, bArr, 0, i3 + 0, new C7547m1(zzeqVar));
                return this;
            } catch (zzfo e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            } catch (IndexOutOfBoundsException unused) {
                throw zzfo.m22296a();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.measurement.zzdn
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.f28120f.mo21510p(zze.f28127e, null, null);
            zzbVar.mo22144j((zzfd) mo22282x());
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzgq
        /* renamed from: d */
        public final /* synthetic */ zzgo mo22268d() {
            return this.f28120f;
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        /* renamed from: l */
        public final /* synthetic */ zzdn mo22146l(byte[] bArr, int i2, int i3) throws zzfo {
            return m22277s(bArr, 0, i3, zzeq.m22245a());
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        /* renamed from: m */
        public final /* synthetic */ zzdn mo22147m(byte[] bArr, int i2, int i3, zzeq zzeqVar) throws zzfo {
            return m22277s(bArr, 0, i3, zzeqVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        /* renamed from: o */
        public final /* synthetic */ zzdn clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.measurement.zzdn
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final BuilderType mo22144j(MessageType messagetype) {
            m22279t();
            m22275q(this.f28121g, messagetype);
            return this;
        }

        /* renamed from: t */
        protected final void m22279t() {
            if (this.f28122h) {
                MessageType messagetype = (MessageType) this.f28121g.mo21510p(zze.f28126d, null, null);
                m22275q(messagetype, this.f28121g);
                this.f28121g = messagetype;
                this.f28122h = false;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzgn
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public MessageType mo22282x() {
            if (this.f28122h) {
                return this.f28121g;
            }
            MessageType messagetype = this.f28121g;
            C7543l3.m21234a().m21236c(messagetype).mo21100f(messagetype);
            this.f28122h = true;
            return this.f28121g;
        }

        @Override // com.google.android.gms.internal.measurement.zzgn
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public final MessageType mo22283y() {
            MessageType messagetype = (MessageType) mo22282x();
            if (messagetype.mo22267b()) {
                return messagetype;
            }
            throw new zzhw(messagetype);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzfd<MessageType, BuilderType> implements zzgq {
        protected C7518h2<C7632a> zzc = C7518h2.m21108c();

        /* renamed from: B */
        final C7518h2<C7632a> m22284B() {
            if (this.zzc.m21119n()) {
                this.zzc = (C7518h2) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
    public enum zze {

        /* renamed from: a */
        public static final int f28123a = 1;

        /* renamed from: b */
        public static final int f28124b = 2;

        /* renamed from: c */
        public static final int f28125c = 3;

        /* renamed from: d */
        public static final int f28126d = 4;

        /* renamed from: e */
        public static final int f28127e = 5;

        /* renamed from: f */
        public static final int f28128f = 6;

        /* renamed from: g */
        public static final int f28129g = 7;

        /* renamed from: i */
        public static final int f28131i = 1;

        /* renamed from: j */
        public static final int f28132j = 2;

        /* renamed from: l */
        public static final int f28134l = 1;

        /* renamed from: m */
        public static final int f28135m = 2;

        /* renamed from: h */
        private static final /* synthetic */ int[] f28130h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: k */
        private static final /* synthetic */ int[] f28133k = {1, 2};

        /* renamed from: n */
        private static final /* synthetic */ int[] f28136n = {1, 2};

        /* renamed from: a */
        public static int[] m22285a() {
            return (int[]) f28130h.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
    public static class zzf<ContainingType extends zzgo, Type> extends zzer<ContainingType, Type> {
    }

    /* renamed from: A */
    protected static <E> zzfl<E> m22257A() {
        return C7561o3.m21268h();
    }

    /* renamed from: m */
    static <T extends zzfd<?, ?>> T m22258m(Class<T> cls) throws ClassNotFoundException {
        zzfd<?, ?> zzfdVar = zzd.get(cls);
        if (zzfdVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfdVar = zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzfdVar == null) {
            zzfdVar = (T) ((zzfd) C7538k4.m21191c(cls)).mo21510p(zze.f28128f, null, null);
            if (zzfdVar == null) {
                throw new IllegalStateException();
            }
            zzd.put(cls, zzfdVar);
        }
        return (T) zzfdVar;
    }

    /* renamed from: n */
    protected static <E> zzfl<E> m22259n(zzfl<E> zzflVar) {
        int size = zzflVar.size();
        return zzflVar.mo20982d(size == 0 ? 10 : size << 1);
    }

    /* renamed from: o */
    protected static zzfm m22260o(zzfm zzfmVar) {
        int size = zzfmVar.size();
        return zzfmVar.mo20982d(size == 0 ? 10 : size << 1);
    }

    /* renamed from: q */
    protected static Object m22261q(zzgo zzgoVar, String str, Object[] objArr) {
        return new C7555n3(zzgoVar, str, objArr);
    }

    /* renamed from: r */
    static Object m22262r(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: s */
    protected static <T extends zzfd<?, ?>> void m22263s(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    /* renamed from: t */
    protected static final <T extends zzfd<T, ?>> boolean m22264t(T t, boolean z) {
        byte bByteValue = ((Byte) t.mo21510p(zze.f28123a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo21099e = C7543l3.m21234a().m21236c(t).mo21099e(t);
        if (z) {
            t.mo21510p(zze.f28124b, zMo21099e ? t : null, null);
        }
        return zMo21099e;
    }

    /* renamed from: w */
    protected static zzfj m22265w() {
        return C7554n2.m21239g();
    }

    /* renamed from: z */
    protected static zzfm m22266z() {
        return C7608w2.m21436f();
    }

    @Override // com.google.android.gms.internal.measurement.zzgq
    /* renamed from: b */
    public final boolean mo22267b() {
        return m22264t(this, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzgq
    /* renamed from: d */
    public final /* synthetic */ zzgo mo22268d() {
        return (zzfd) mo21510p(zze.f28128f, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    /* renamed from: e */
    public final /* synthetic */ zzgn mo22269e() {
        zzb zzbVar = (zzb) mo21510p(zze.f28127e, null, null);
        zzbVar.mo22144j(this);
        return zzbVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzfd) mo21510p(zze.f28128f, null, null)).getClass().isInstance(obj)) {
            return C7543l3.m21234a().m21236c(this).mo21101g(this, (zzfd) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    /* renamed from: f */
    public final /* synthetic */ zzgn mo22270f() {
        return (zzb) mo21510p(zze.f28127e, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    /* renamed from: g */
    public final void mo22271g(zzen zzenVar) throws IOException {
        C7543l3.m21234a().m21236c(this).mo21102h(this, C7488c2.m20987P(zzenVar));
    }

    public int hashCode() {
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int iMo21097c = C7543l3.m21234a().m21236c(this).mo21097c(this);
        this.zza = iMo21097c;
        return iMo21097c;
    }

    @Override // com.google.android.gms.internal.measurement.zzgo
    /* renamed from: i */
    public final int mo22272i() {
        if (this.zzc == -1) {
            this.zzc = C7543l3.m21234a().m21236c(this).mo21096b(this);
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    /* renamed from: k */
    final int mo22137k() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzdl
    /* renamed from: l */
    final void mo22138l(int i2) {
        this.zzc = i2;
    }

    /* renamed from: p */
    protected abstract Object mo21510p(int i2, Object obj, Object obj2);

    public String toString() {
        return C7507f3.m21051a(this, super.toString());
    }

    /* renamed from: u */
    protected final <MessageType extends zzfd<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType m22273u() {
        return (BuilderType) mo21510p(zze.f28127e, null, null);
    }

    /* renamed from: v */
    public final BuilderType m22274v() {
        BuilderType buildertype = (BuilderType) mo21510p(zze.f28127e, null, null);
        buildertype.mo22144j(this);
        return buildertype;
    }
}

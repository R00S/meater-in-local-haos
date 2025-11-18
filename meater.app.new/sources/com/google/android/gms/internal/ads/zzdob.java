package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import com.google.android.gms.internal.ads.zzdob.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class zzdob<MessageType extends zzdob<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdmi<MessageType, BuilderType> {
    private static Map<Object, zzdob<?, ?>> zzhhf = new ConcurrentHashMap();
    protected zzdqu zzhhd = zzdqu.m19782f();
    private int zzhhe = -1;

    public static abstract class zza<MessageType extends zzdob<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzdmj<MessageType, BuilderType> {

        /* renamed from: f */
        private final MessageType f25754f;

        /* renamed from: g */
        protected MessageType f25755g;

        /* renamed from: h */
        private boolean f25756h = false;

        protected zza(MessageType messagetype) {
            this.f25754f = messagetype;
            this.f25755g = (MessageType) messagetype.mo17725q(zze.f25761d, null, null);
        }

        /* renamed from: o */
        private static void m19730o(MessageType messagetype, MessageType messagetype2) {
            C6725gw.m15176b().m15177a(messagetype).mo14821a(messagetype, messagetype2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.ads.zzdmj
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final BuilderType mo19591k(zzdnd zzdndVar, zzdno zzdnoVar) throws IOException {
            m19735p();
            try {
                C6725gw.m15176b().m15177a(this.f25755g).mo14828h(this.f25755g, C7093qu.m15804c(zzdndVar), zzdnoVar);
                return this;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof IOException) {
                    throw ((IOException) e2.getCause());
                }
                throw e2;
            }
        }

        /* renamed from: t */
        private final BuilderType m19732t(byte[] bArr, int i2, int i3, zzdno zzdnoVar) throws zzdok {
            m19735p();
            try {
                C6725gw.m15176b().m15177a(this.f25755g).mo14827g(this.f25755g, bArr, 0, i3 + 0, new C6538bu(zzdnoVar));
                return this;
            } catch (zzdok e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            } catch (IndexOutOfBoundsException unused) {
                throw zzdok.m19750a();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.ads.zzdmj
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.f25754f.mo17725q(zze.f25762e, null, null);
            zzaVar.mo19590j((zzdob) mo19733a1());
            return zzaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdpm
        /* renamed from: f */
        public final /* synthetic */ zzdpk mo19727f() {
            return this.f25754f;
        }

        @Override // com.google.android.gms.internal.ads.zzdmj
        /* renamed from: l */
        public final /* synthetic */ zzdmj mo19592l(byte[] bArr, int i2, int i3, zzdno zzdnoVar) throws zzdok {
            return m19732t(bArr, 0, i3, zzdnoVar);
        }

        @Override // com.google.android.gms.internal.ads.zzdmj
        /* renamed from: m */
        public final /* synthetic */ zzdmj clone() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.ads.zzdmj
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final BuilderType mo19590j(MessageType messagetype) {
            m19735p();
            m19730o(this.f25755g, messagetype);
            return this;
        }

        /* renamed from: p */
        protected final void m19735p() {
            if (this.f25756h) {
                MessageType messagetype = (MessageType) this.f25755g.mo17725q(zze.f25761d, null, null);
                m19730o(messagetype, this.f25755g);
                this.f25755g = messagetype;
                this.f25756h = false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzdpl
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public MessageType mo19733a1() {
            if (this.f25756h) {
                return this.f25755g;
            }
            MessageType messagetype = this.f25755g;
            C6725gw.m15176b().m15177a(messagetype).mo14826f(messagetype);
            this.f25756h = true;
            return this.f25755g;
        }

        @Override // com.google.android.gms.internal.ads.zzdpl
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final MessageType mo19736p0() {
            MessageType messagetype = (MessageType) mo19733a1();
            byte bByteValue = ((Byte) messagetype.mo17725q(zze.f25758a, null, null)).byteValue();
            boolean zMo14830j = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zMo14830j = false;
                } else {
                    zMo14830j = C6725gw.m15176b().m15177a(messagetype).mo14830j(messagetype);
                    messagetype.mo17725q(zze.f25759b, zMo14830j ? messagetype : null, null);
                }
            }
            if (zMo14830j) {
                return messagetype;
            }
            throw new zzdqs(messagetype);
        }
    }

    public static class zzb<T extends zzdob<T, ?>> extends zzdmk<T> {

        /* renamed from: b */
        private final T f25757b;

        public zzb(T t) {
            this.f25757b = t;
        }
    }

    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType> extends zzdob<MessageType, BuilderType> implements zzdpm {
        protected C7389yu<Object> zzhhj = C7389yu.m16114m();
    }

    public static class zzd<ContainingType extends zzdpk, Type> extends zzdnm<ContainingType, Type> {
    }

    public enum zze {

        /* renamed from: a */
        public static final int f25758a = 1;

        /* renamed from: b */
        public static final int f25759b = 2;

        /* renamed from: c */
        public static final int f25760c = 3;

        /* renamed from: d */
        public static final int f25761d = 4;

        /* renamed from: e */
        public static final int f25762e = 5;

        /* renamed from: f */
        public static final int f25763f = 6;

        /* renamed from: g */
        public static final int f25764g = 7;

        /* renamed from: i */
        public static final int f25766i = 1;

        /* renamed from: j */
        public static final int f25767j = 2;

        /* renamed from: l */
        public static final int f25769l = 1;

        /* renamed from: m */
        public static final int f25770m = 2;

        /* renamed from: h */
        private static final /* synthetic */ int[] f25765h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: k */
        private static final /* synthetic */ int[] f25768k = {1, 2};

        /* renamed from: n */
        private static final /* synthetic */ int[] f25771n = {1, 2};

        /* renamed from: a */
        public static int[] m19739a() {
            return (int[]) f25765h.clone();
        }
    }

    /* renamed from: k */
    protected static <T extends zzdob<T, ?>> T m19713k(T t, zzdmr zzdmrVar) throws zzdok {
        boolean zMo14830j;
        T t2 = (T) m19714l(t, zzdmrVar, zzdno.m19702d());
        boolean zMo14830j2 = false;
        if (t2 != null) {
            byte bByteValue = ((Byte) t2.mo17725q(zze.f25758a, null, null)).byteValue();
            if (bByteValue == 1) {
                zMo14830j = true;
            } else if (bByteValue == 0) {
                zMo14830j = false;
            } else {
                zMo14830j = C6725gw.m15176b().m15177a(t2).mo14830j(t2);
                t2.mo17725q(zze.f25759b, zMo14830j ? t2 : null, null);
            }
            if (!zMo14830j) {
                throw new zzdqs(t2).m19780a().m19758i(t2);
            }
        }
        if (t2 != null) {
            byte bByteValue2 = ((Byte) t2.mo17725q(zze.f25758a, null, null)).byteValue();
            if (bByteValue2 == 1) {
                zMo14830j2 = true;
            } else if (bByteValue2 != 0) {
                zMo14830j2 = C6725gw.m15176b().m15177a(t2).mo14830j(t2);
                t2.mo17725q(zze.f25759b, zMo14830j2 ? t2 : null, null);
            }
            if (!zMo14830j2) {
                throw new zzdqs(t2).m19780a().m19758i(t2);
            }
        }
        return t2;
    }

    /* renamed from: l */
    private static <T extends zzdob<T, ?>> T m19714l(T t, zzdmr zzdmrVar, zzdno zzdnoVar) throws zzdok {
        try {
            zzdnd zzdndVarMo15570q = zzdmrVar.mo15570q();
            T t2 = (T) m19715m(t, zzdndVarMo15570q, zzdnoVar);
            try {
                zzdndVarMo15570q.mo15781x(0);
                return t2;
            } catch (zzdok e2) {
                throw e2.m19758i(t2);
            }
        } catch (zzdok e3) {
            throw e3;
        }
    }

    /* renamed from: m */
    private static <T extends zzdob<T, ?>> T m19715m(T t, zzdnd zzdndVar, zzdno zzdnoVar) throws zzdok {
        T t2 = (T) t.mo17725q(zze.f25761d, null, null);
        try {
            C6725gw.m15176b().m15177a(t2).mo14828h(t2, C7093qu.m15804c(zzdndVar), zzdnoVar);
            C6725gw.m15176b().m15177a(t2).mo14826f(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzdok) {
                throw ((zzdok) e2.getCause());
            }
            throw new zzdok(e2.getMessage()).m19758i(t2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof zzdok) {
                throw ((zzdok) e3.getCause());
            }
            throw e3;
        }
    }

    /* renamed from: n */
    protected static <T extends zzdob<T, ?>> T m19716n(T t, byte[] bArr) throws zzdok {
        boolean zMo14830j = false;
        T t2 = (T) m19717o(t, bArr, 0, bArr.length, zzdno.m19702d());
        if (t2 != null) {
            byte bByteValue = ((Byte) t2.mo17725q(zze.f25758a, null, null)).byteValue();
            if (bByteValue == 1) {
                zMo14830j = true;
            } else if (bByteValue != 0) {
                zMo14830j = C6725gw.m15176b().m15177a(t2).mo14830j(t2);
                t2.mo17725q(zze.f25759b, zMo14830j ? t2 : null, null);
            }
            if (!zMo14830j) {
                throw new zzdqs(t2).m19780a().m19758i(t2);
            }
        }
        return t2;
    }

    /* renamed from: o */
    private static <T extends zzdob<T, ?>> T m19717o(T t, byte[] bArr, int i2, int i3, zzdno zzdnoVar) throws zzdok {
        T t2 = (T) t.mo17725q(zze.f25761d, null, null);
        try {
            C6725gw.m15176b().m15177a(t2).mo14827g(t2, bArr, 0, i3, new C6538bu(zzdnoVar));
            C6725gw.m15176b().m15177a(t2).mo14826f(t2);
            if (t2.zzhcf == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e2) {
            if (e2.getCause() instanceof zzdok) {
                throw ((zzdok) e2.getCause());
            }
            throw new zzdok(e2.getMessage()).m19758i(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzdok.m19750a().m19758i(t2);
        }
    }

    /* renamed from: p */
    protected static <T extends zzdob<T, ?>> T m19718p(T t, byte[] bArr, zzdno zzdnoVar) throws zzdok {
        boolean zMo14830j = false;
        T t2 = (T) m19717o(t, bArr, 0, bArr.length, zzdnoVar);
        if (t2 != null) {
            byte bByteValue = ((Byte) t2.mo17725q(zze.f25758a, null, null)).byteValue();
            if (bByteValue == 1) {
                zMo14830j = true;
            } else if (bByteValue != 0) {
                zMo14830j = C6725gw.m15176b().m15177a(t2).mo14830j(t2);
                t2.mo17725q(zze.f25759b, zMo14830j ? t2 : null, null);
            }
            if (!zMo14830j) {
                throw new zzdqs(t2).m19780a().m19758i(t2);
            }
        }
        return t2;
    }

    /* renamed from: r */
    protected static Object m19719r(zzdpk zzdpkVar, String str, Object[] objArr) {
        return new C6799iw(zzdpkVar, str, objArr);
    }

    /* renamed from: s */
    static Object m19720s(Method method, Object obj, Object... objArr) {
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

    /* renamed from: t */
    protected static <T extends zzdob<?, ?>> void m19721t(Class<T> cls, T t) {
        zzhhf.put(cls, t);
    }

    /* renamed from: u */
    protected static zzdoh m19722u() {
        return C6724gv.m15170h();
    }

    /* renamed from: v */
    protected static <E> zzdoj<E> m19723v() {
        return C6762hw.m15318f();
    }

    /* renamed from: w */
    static <T extends zzdob<?, ?>> T m19724w(Class<T> cls) throws ClassNotFoundException {
        zzdob<?, ?> zzdobVar = zzhhf.get(cls);
        if (zzdobVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzdobVar = zzhhf.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzdobVar == null) {
            zzdobVar = (T) ((zzdob) C6726gx.m15180B(cls)).mo17725q(zze.f25763f, null, null);
            if (zzdobVar == null) {
                throw new IllegalStateException();
            }
            zzhhf.put(cls, zzdobVar);
        }
        return (T) zzdobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdpk
    /* renamed from: b */
    public final /* synthetic */ zzdpl mo19725b() {
        zza zzaVar = (zza) mo17725q(zze.f25762e, null, null);
        zzaVar.mo19590j(this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    /* renamed from: c */
    final int mo19585c() {
        return this.zzhhe;
    }

    @Override // com.google.android.gms.internal.ads.zzdpk
    /* renamed from: d */
    public final /* synthetic */ zzdpl mo19726d() {
        return (zza) mo17725q(zze.f25762e, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzdob) mo17725q(zze.f25763f, null, null)).getClass().isInstance(obj)) {
            return C6725gw.m15176b().m15177a(this).mo14822b(this, (zzdob) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    /* renamed from: f */
    public final /* synthetic */ zzdpk mo19727f() {
        return (zzdob) mo17725q(zze.f25763f, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdpk
    /* renamed from: h */
    public final void mo19728h(zzdni zzdniVar) throws IOException {
        C6725gw.m15176b().m15178c(getClass()).mo14825e(this, C7167su.m15853a(zzdniVar));
    }

    public int hashCode() {
        int i2 = this.zzhcf;
        if (i2 != 0) {
            return i2;
        }
        int iMo14824d = C6725gw.m15176b().m15177a(this).mo14824d(this);
        this.zzhcf = iMo14824d;
        return iMo14824d;
    }

    @Override // com.google.android.gms.internal.ads.zzdpk
    /* renamed from: i */
    public final int mo19729i() {
        if (this.zzhhe == -1) {
            this.zzhhe = C6725gw.m15176b().m15177a(this).mo14829i(this);
        }
        return this.zzhhe;
    }

    @Override // com.google.android.gms.internal.ads.zzdpm
    public final boolean isInitialized() {
        byte bByteValue = ((Byte) mo17725q(zze.f25758a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo14830j = C6725gw.m15176b().m15177a(this).mo14830j(this);
        mo17725q(zze.f25759b, zMo14830j ? this : null, null);
        return zMo14830j;
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    /* renamed from: j */
    final void mo19588j(int i2) {
        this.zzhhe = i2;
    }

    /* renamed from: q */
    protected abstract Object mo17725q(int i2, Object obj, Object obj2);

    public String toString() {
        return C7427zv.m16161a(this, super.toString());
    }
}

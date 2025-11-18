package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzbj;
import com.google.android.gms.internal.measurement.zzfd;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzbo {

    /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
    public static final class zza extends zzfd<zza, C11493zza> implements zzgq {
        private static final zza zzh;
        private static volatile zzgx<zza> zzi;
        private int zzc;
        private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
        private boolean zze;
        private boolean zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        /* renamed from: com.google.android.gms.internal.measurement.zzbo$zza$zza, reason: collision with other inner class name */
        public static final class C11493zza extends zzfd.zzb<zza, C11493zza> implements zzgq {
            private C11493zza() {
                super(zza.zzh);
            }

            /* renamed from: A */
            public final String m21600A() {
                return ((zza) this.f28121g).m21595B();
            }

            /* renamed from: B */
            public final boolean m21601B() {
                return ((zza) this.f28121g).m21596E();
            }

            /* renamed from: C */
            public final boolean m21602C() {
                return ((zza) this.f28121g).m21597F();
            }

            /* renamed from: D */
            public final boolean m21603D() {
                return ((zza) this.f28121g).m21598G();
            }

            /* renamed from: E */
            public final int m21604E() {
                return ((zza) this.f28121g).m21599H();
            }

            /* renamed from: w */
            public final C11493zza m21605w(String str) {
                m22279t();
                ((zza) this.f28121g).m21593D(str);
                return this;
            }

            /* synthetic */ C11493zza(C7504f0 c7504f0) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzh = zzaVar;
            zzfd.m22263s(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public final void m21593D(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        /* renamed from: B */
        public final String m21595B() {
            return this.zzd;
        }

        /* renamed from: E */
        public final boolean m21596E() {
            return this.zze;
        }

        /* renamed from: F */
        public final boolean m21597F() {
            return this.zzf;
        }

        /* renamed from: G */
        public final boolean m21598G() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: H */
        public final int m21599H() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7504f0 c7504f0 = null;
            switch (C7504f0.f27723a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C11493zza(c7504f0);
                case 3:
                    return zzfd.m22261q(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0004\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzgx<zza> zzaVar = zzi;
                    if (zzaVar == null) {
                        synchronized (zza.class) {
                            zzaVar = zzi;
                            if (zzaVar == null) {
                                zzaVar = new zzfd.zza<>(zzh);
                                zzi = zzaVar;
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
    public static final class zzb extends zzfd<zzb, zza> implements zzgq {
        private static final zzb zzl;
        private static volatile zzgx<zzb> zzm;
        private int zzc;
        private long zzd;
        private int zzf;
        private boolean zzk;
        private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzfl<zzc> zzg = zzfd.m22257A();
        private zzfl<zza> zzh = zzfd.m22257A();
        private zzfl<zzbj.zza> zzi = zzfd.m22257A();
        private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zzb, zza> implements zzgq {
            private zza() {
                super(zzb.zzl);
            }

            /* renamed from: A */
            public final zza m21622A(int i2) {
                return ((zzb) this.f28121g).m21613B(i2);
            }

            /* renamed from: B */
            public final zza m21623B(int i2, zza.C11493zza c11493zza) {
                m22279t();
                ((zzb) this.f28121g).m21606C(i2, c11493zza);
                return this;
            }

            /* renamed from: C */
            public final List<zzbj.zza> m21624C() {
                return Collections.unmodifiableList(((zzb) this.f28121g).m21620L());
            }

            /* renamed from: D */
            public final zza m21625D() {
                m22279t();
                ((zzb) this.f28121g).m21612Q();
                return this;
            }

            /* renamed from: w */
            public final int m21626w() {
                return ((zzb) this.f28121g).m21619K();
            }

            /* synthetic */ zza(C7504f0 c7504f0) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzl = zzbVar;
            zzfd.m22263s(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final void m21606C(int i2, zza.C11493zza c11493zza) {
            if (!this.zzh.mo21145a()) {
                this.zzh = zzfd.m22259n(this.zzh);
            }
            this.zzh.set(i2, (zza) ((zzfd) c11493zza.mo22283y()));
        }

        /* renamed from: N */
        public static zza m21609N() {
            return zzl.m22273u();
        }

        /* renamed from: O */
        public static zzb m21610O() {
            return zzl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Q */
        public final void m21612Q() {
            this.zzi = zzfd.m22257A();
        }

        /* renamed from: B */
        public final zza m21613B(int i2) {
            return this.zzh.get(i2);
        }

        /* renamed from: F */
        public final boolean m21614F() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: G */
        public final long m21615G() {
            return this.zzd;
        }

        /* renamed from: H */
        public final boolean m21616H() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: I */
        public final String m21617I() {
            return this.zze;
        }

        /* renamed from: J */
        public final List<zzc> m21618J() {
            return this.zzg;
        }

        /* renamed from: K */
        public final int m21619K() {
            return this.zzh.size();
        }

        /* renamed from: L */
        public final List<zzbj.zza> m21620L() {
            return this.zzi;
        }

        /* renamed from: M */
        public final boolean m21621M() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7504f0 c7504f0 = null;
            switch (C7504f0.f27723a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(c7504f0);
                case 3:
                    return zzfd.m22261q(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\b\u0003\b\u0007\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzc.class, "zzh", zza.class, "zzi", zzbj.zza.class, "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    zzgx<zzb> zzaVar = zzm;
                    if (zzaVar == null) {
                        synchronized (zzb.class) {
                            zzaVar = zzm;
                            if (zzaVar == null) {
                                zzaVar = new zzfd.zza<>(zzl);
                                zzm = zzaVar;
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
    public static final class zzc extends zzfd<zzc, zza> implements zzgq {
        private static final zzc zzf;
        private static volatile zzgx<zzc> zzg;
        private int zzc;
        private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zze = HttpUrl.FRAGMENT_ENCODE_SET;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zzc, zza> implements zzgq {
            private zza() {
                super(zzc.zzf);
            }

            /* synthetic */ zza(C7504f0 c7504f0) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzf = zzcVar;
            zzfd.m22263s(zzc.class, zzcVar);
        }

        private zzc() {
        }

        /* renamed from: B */
        public final String m21628B() {
            return this.zzd;
        }

        /* renamed from: C */
        public final String m21629C() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7504f0 c7504f0 = null;
            switch (C7504f0.f27723a[i2 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(c7504f0);
                case 3:
                    return zzfd.m22261q(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzgx<zzc> zzaVar = zzg;
                    if (zzaVar == null) {
                        synchronized (zzc.class) {
                            zzaVar = zzg;
                            if (zzaVar == null) {
                                zzaVar = new zzfd.zza<>(zzf);
                                zzg = zzaVar;
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}

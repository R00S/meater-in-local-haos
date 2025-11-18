package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzbj {

    /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
    public static final class zza extends zzfd<zza, C11492zza> implements zzgq {
        private static final zza zzi;
        private static volatile zzgx<zza> zzj;
        private int zzc;
        private int zzd;
        private zzfl<zze> zze = zzfd.m22257A();
        private zzfl<zzb> zzf = zzfd.m22257A();
        private boolean zzg;
        private boolean zzh;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        /* renamed from: com.google.android.gms.internal.measurement.zzbj$zza$zza, reason: collision with other inner class name */
        public static final class C11492zza extends zzfd.zzb<zza, C11492zza> implements zzgq {
            private C11492zza() {
                super(zza.zzi);
            }

            /* renamed from: A */
            public final C11492zza m21511A(int i2, zzb.zza zzaVar) {
                m22279t();
                ((zza) this.f28121g).m21497C(i2, zzaVar);
                return this;
            }

            /* renamed from: B */
            public final C11492zza m21512B(int i2, zze.zza zzaVar) {
                m22279t();
                ((zza) this.f28121g).m21498D(i2, zzaVar);
                return this;
            }

            /* renamed from: C */
            public final zze m21513C(int i2) {
                return ((zza) this.f28121g).m21502B(i2);
            }

            /* renamed from: D */
            public final int m21514D() {
                return ((zza) this.f28121g).m21509M();
            }

            /* renamed from: E */
            public final zzb m21515E(int i2) {
                return ((zza) this.f28121g).m21505I(i2);
            }

            /* renamed from: w */
            public final int m21516w() {
                return ((zza) this.f28121g).m21507K();
            }

            /* synthetic */ C11492zza(C7474a0 c7474a0) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzi = zzaVar;
            zzfd.m22263s(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final void m21497C(int i2, zzb.zza zzaVar) {
            if (!this.zzf.mo21145a()) {
                this.zzf = zzfd.m22259n(this.zzf);
            }
            this.zzf.set(i2, (zzb) ((zzfd) zzaVar.mo22283y()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public final void m21498D(int i2, zze.zza zzaVar) {
            if (!this.zze.mo21145a()) {
                this.zze = zzfd.m22259n(this.zze);
            }
            this.zze.set(i2, (zze) ((zzfd) zzaVar.mo22283y()));
        }

        /* renamed from: B */
        public final zze m21502B(int i2) {
            return this.zze.get(i2);
        }

        /* renamed from: G */
        public final boolean m21503G() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: H */
        public final int m21504H() {
            return this.zzd;
        }

        /* renamed from: I */
        public final zzb m21505I(int i2) {
            return this.zzf.get(i2);
        }

        /* renamed from: J */
        public final List<zze> m21506J() {
            return this.zze;
        }

        /* renamed from: K */
        public final int m21507K() {
            return this.zze.size();
        }

        /* renamed from: L */
        public final List<zzb> m21508L() {
            return this.zzf;
        }

        /* renamed from: M */
        public final int m21509M() {
            return this.zzf.size();
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7474a0 c7474a0 = null;
            switch (C7474a0.f27684a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C11492zza(c7474a0);
                case 3:
                    return zzfd.m22261q(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0007\u0001\u0005\u0007\u0002", new Object[]{"zzc", "zzd", "zze", zze.class, "zzf", zzb.class, "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    zzgx<zza> zzaVar = zzj;
                    if (zzaVar == null) {
                        synchronized (zza.class) {
                            zzaVar = zzj;
                            if (zzaVar == null) {
                                zzaVar = new zzfd.zza<>(zzi);
                                zzj = zzaVar;
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
        private int zzd;
        private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzfl<zzc> zzf = zzfd.m22257A();
        private boolean zzg;
        private zzd zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zzb, zza> implements zzgq {
            private zza() {
                super(zzb.zzl);
            }

            /* renamed from: A */
            public final zza m21535A(String str) {
                m22279t();
                ((zzb) this.f28121g).m21520F(str);
                return this;
            }

            /* renamed from: B */
            public final zzc m21536B(int i2) {
                return ((zzb) this.f28121g).m21523B(i2);
            }

            /* renamed from: C */
            public final String m21537C() {
                return ((zzb) this.f28121g).m21526I();
            }

            /* renamed from: D */
            public final int m21538D() {
                return ((zzb) this.f28121g).m21528K();
            }

            /* renamed from: w */
            public final zza m21539w(int i2, zzc zzcVar) {
                m22279t();
                ((zzb) this.f28121g).m21517C(i2, zzcVar);
                return this;
            }

            /* synthetic */ zza(C7474a0 c7474a0) {
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
        public final void m21517C(int i2, zzc zzcVar) {
            zzcVar.getClass();
            if (!this.zzf.mo21145a()) {
                this.zzf = zzfd.m22259n(this.zzf);
            }
            this.zzf.set(i2, zzcVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F */
        public final void m21520F(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        /* renamed from: R */
        public static zza m21521R() {
            return zzl.m22273u();
        }

        /* renamed from: B */
        public final zzc m21523B(int i2) {
            return this.zzf.get(i2);
        }

        /* renamed from: G */
        public final boolean m21524G() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: H */
        public final int m21525H() {
            return this.zzd;
        }

        /* renamed from: I */
        public final String m21526I() {
            return this.zze;
        }

        /* renamed from: J */
        public final List<zzc> m21527J() {
            return this.zzf;
        }

        /* renamed from: K */
        public final int m21528K() {
            return this.zzf.size();
        }

        /* renamed from: L */
        public final boolean m21529L() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: M */
        public final zzd m21530M() {
            zzd zzdVar = this.zzh;
            return zzdVar == null ? zzd.m21552L() : zzdVar;
        }

        /* renamed from: N */
        public final boolean m21531N() {
            return this.zzi;
        }

        /* renamed from: O */
        public final boolean m21532O() {
            return this.zzj;
        }

        /* renamed from: P */
        public final boolean m21533P() {
            return (this.zzc & 64) != 0;
        }

        /* renamed from: Q */
        public final boolean m21534Q() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7474a0 c7474a0 = null;
            switch (C7474a0.f27684a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(c7474a0);
                case 3:
                    return zzfd.m22261q(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", zzc.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
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
        private static final zzc zzh;
        private static volatile zzgx<zzc> zzi;
        private int zzc;
        private zzf zzd;
        private zzd zze;
        private boolean zzf;
        private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zzc, zza> implements zzgq {
            private zza() {
                super(zzc.zzh);
            }

            /* renamed from: w */
            public final zza m21551w(String str) {
                m22279t();
                ((zzc) this.f28121g).m21541C(str);
                return this;
            }

            /* synthetic */ zza(C7474a0 c7474a0) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzh = zzcVar;
            zzfd.m22263s(zzc.class, zzcVar);
        }

        private zzc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final void m21541C(String str) {
            str.getClass();
            this.zzc |= 8;
            this.zzg = str;
        }

        /* renamed from: K */
        public static zzc m21542K() {
            return zzh;
        }

        /* renamed from: D */
        public final boolean m21544D() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: E */
        public final zzf m21545E() {
            zzf zzfVar = this.zzd;
            return zzfVar == null ? zzf.m21580J() : zzfVar;
        }

        /* renamed from: F */
        public final boolean m21546F() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: G */
        public final zzd m21547G() {
            zzd zzdVar = this.zze;
            return zzdVar == null ? zzd.m21552L() : zzdVar;
        }

        /* renamed from: H */
        public final boolean m21548H() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: I */
        public final boolean m21549I() {
            return this.zzf;
        }

        /* renamed from: J */
        public final String m21550J() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7474a0 c7474a0 = null;
            switch (C7474a0.f27684a[i2 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(c7474a0);
                case 3:
                    return zzfd.m22261q(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzgx<zzc> zzaVar = zzi;
                    if (zzaVar == null) {
                        synchronized (zzc.class) {
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
    public static final class zzd extends zzfd<zzd, zzb> implements zzgq {
        private static final zzd zzi;
        private static volatile zzgx<zzd> zzj;
        private int zzc;
        private int zzd;
        private boolean zze;
        private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public enum zza implements zzfi {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);


            /* renamed from: k */
            private static final zzfh<zza> f27963k = new C7486c0();

            /* renamed from: m */
            private final int f27965m;

            zza(int i2) {
                this.f27965m = i2;
            }

            /* renamed from: g */
            public static zza m21564g(int i2) {
                if (i2 == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i2 == 1) {
                    return LESS_THAN;
                }
                if (i2 == 2) {
                    return GREATER_THAN;
                }
                if (i2 == 3) {
                    return EQUAL;
                }
                if (i2 != 4) {
                    return null;
                }
                return BETWEEN;
            }

            /* renamed from: k */
            public static zzfk m21565k() {
                return C7480b0.f27692a;
            }

            @Override // com.google.android.gms.internal.measurement.zzfi
            /* renamed from: a */
            public final int mo21566a() {
                return this.f27965m;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f27965m + " name=" + name() + '>';
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zzb extends zzfd.zzb<zzd, zzb> implements zzgq {
            private zzb() {
                super(zzd.zzi);
            }

            /* synthetic */ zzb(C7474a0 c7474a0) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzi = zzdVar;
            zzfd.m22263s(zzd.class, zzdVar);
        }

        private zzd() {
        }

        /* renamed from: L */
        public static zzd m21552L() {
            return zzi;
        }

        /* renamed from: B */
        public final boolean m21554B() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: C */
        public final zza m21555C() {
            zza zzaVarM21564g = zza.m21564g(this.zzd);
            return zzaVarM21564g == null ? zza.UNKNOWN_COMPARISON_TYPE : zzaVarM21564g;
        }

        /* renamed from: D */
        public final boolean m21556D() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: E */
        public final boolean m21557E() {
            return this.zze;
        }

        /* renamed from: F */
        public final boolean m21558F() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: G */
        public final String m21559G() {
            return this.zzf;
        }

        /* renamed from: H */
        public final boolean m21560H() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: I */
        public final String m21561I() {
            return this.zzg;
        }

        /* renamed from: J */
        public final boolean m21562J() {
            return (this.zzc & 16) != 0;
        }

        /* renamed from: K */
        public final String m21563K() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7474a0 c7474a0 = null;
            switch (C7474a0.f27684a[i2 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb(c7474a0);
                case 3:
                    return zzfd.m22261q(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzc", "zzd", zza.m21565k(), "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    zzgx<zzd> zzaVar = zzj;
                    if (zzaVar == null) {
                        synchronized (zzd.class) {
                            zzaVar = zzj;
                            if (zzaVar == null) {
                                zzaVar = new zzfd.zza<>(zzi);
                                zzj = zzaVar;
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
    public static final class zze extends zzfd<zze, zza> implements zzgq {
        private static final zze zzj;
        private static volatile zzgx<zze> zzk;
        private int zzc;
        private int zzd;
        private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzc zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zze, zza> implements zzgq {
            private zza() {
                super(zze.zzj);
            }

            /* renamed from: w */
            public final zza m21579w(String str) {
                m22279t();
                ((zze) this.f28121g).m21568C(str);
                return this;
            }

            /* synthetic */ zza(C7474a0 c7474a0) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzj = zzeVar;
            zzfd.m22263s(zze.class, zzeVar);
        }

        private zze() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final void m21568C(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        /* renamed from: L */
        public static zza m21569L() {
            return zzj.m22273u();
        }

        /* renamed from: D */
        public final boolean m21571D() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: E */
        public final int m21572E() {
            return this.zzd;
        }

        /* renamed from: F */
        public final String m21573F() {
            return this.zze;
        }

        /* renamed from: G */
        public final zzc m21574G() {
            zzc zzcVar = this.zzf;
            return zzcVar == null ? zzc.m21542K() : zzcVar;
        }

        /* renamed from: H */
        public final boolean m21575H() {
            return this.zzg;
        }

        /* renamed from: I */
        public final boolean m21576I() {
            return this.zzh;
        }

        /* renamed from: J */
        public final boolean m21577J() {
            return (this.zzc & 32) != 0;
        }

        /* renamed from: K */
        public final boolean m21578K() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7474a0 c7474a0 = null;
            switch (C7474a0.f27684a[i2 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(c7474a0);
                case 3:
                    return zzfd.m22261q(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    zzgx<zze> zzaVar = zzk;
                    if (zzaVar == null) {
                        synchronized (zze.class) {
                            zzaVar = zzk;
                            if (zzaVar == null) {
                                zzaVar = new zzfd.zza<>(zzj);
                                zzk = zzaVar;
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
    public static final class zzf extends zzfd<zzf, zza> implements zzgq {
        private static final zzf zzh;
        private static volatile zzgx<zzf> zzi;
        private int zzc;
        private int zzd;
        private boolean zzf;
        private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzfl<String> zzg = zzfd.m22257A();

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zzf, zza> implements zzgq {
            private zza() {
                super(zzf.zzh);
            }

            /* synthetic */ zza(C7474a0 c7474a0) {
                this();
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public enum zzb implements zzfi {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);


            /* renamed from: m */
            private static final zzfh<zzb> f27973m = new C7492d0();

            /* renamed from: o */
            private final int f27975o;

            zzb(int i2) {
                this.f27975o = i2;
            }

            /* renamed from: g */
            public static zzb m21590g(int i2) {
                switch (i2) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            /* renamed from: k */
            public static zzfk m21591k() {
                return C7498e0.f27717a;
            }

            @Override // com.google.android.gms.internal.measurement.zzfi
            /* renamed from: a */
            public final int mo21566a() {
                return this.f27975o;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f27975o + " name=" + name() + '>';
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzh = zzfVar;
            zzfd.m22263s(zzf.class, zzfVar);
        }

        private zzf() {
        }

        /* renamed from: J */
        public static zzf m21580J() {
            return zzh;
        }

        /* renamed from: B */
        public final boolean m21582B() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: C */
        public final zzb m21583C() {
            zzb zzbVarM21590g = zzb.m21590g(this.zzd);
            return zzbVarM21590g == null ? zzb.UNKNOWN_MATCH_TYPE : zzbVarM21590g;
        }

        /* renamed from: D */
        public final boolean m21584D() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: E */
        public final String m21585E() {
            return this.zze;
        }

        /* renamed from: F */
        public final boolean m21586F() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: G */
        public final boolean m21587G() {
            return this.zzf;
        }

        /* renamed from: H */
        public final List<String> m21588H() {
            return this.zzg;
        }

        /* renamed from: I */
        public final int m21589I() {
            return this.zzg.size();
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7474a0 c7474a0 = null;
            switch (C7474a0.f27684a[i2 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(c7474a0);
                case 3:
                    return zzfd.m22261q(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zzc", "zzd", zzb.m21591k(), "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzgx<zzf> zzaVar = zzi;
                    if (zzaVar == null) {
                        synchronized (zzf.class) {
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
}

package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.file.CacheHelper;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.measurement.zzfd;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzbr {

    /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
    public static final class zza extends zzfd<zza, C11494zza> implements zzgq {
        private static final zza zzh;
        private static volatile zzgx<zza> zzi;
        private int zzc;
        private int zzd;
        private zzi zze;
        private zzi zzf;
        private boolean zzg;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        /* renamed from: com.google.android.gms.internal.measurement.zzbr$zza$zza, reason: collision with other inner class name */
        public static final class C11494zza extends zzfd.zzb<zza, C11494zza> implements zzgq {
            private C11494zza() {
                super(zza.zzh);
            }

            /* renamed from: A */
            public final C11494zza m21647A(zzi.zza zzaVar) {
                m22279t();
                ((zza) this.f28121g).m21635G(zzaVar);
                return this;
            }

            /* renamed from: B */
            public final C11494zza m21648B(zzi zziVar) {
                m22279t();
                ((zza) this.f28121g).m21636H(zziVar);
                return this;
            }

            /* renamed from: C */
            public final C11494zza m21649C(boolean z) {
                m22279t();
                ((zza) this.f28121g).m21637I(z);
                return this;
            }

            /* renamed from: D */
            public final boolean m21650D() {
                return ((zza) this.f28121g).m21643M();
            }

            /* renamed from: E */
            public final zzi m21651E() {
                return ((zza) this.f28121g).m21644N();
            }

            /* renamed from: w */
            public final C11494zza m21652w(int i2) {
                m22279t();
                ((zza) this.f28121g).m21630B(i2);
                return this;
            }

            /* synthetic */ C11494zza(C7510g0 c7510g0) {
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
        /* renamed from: B */
        public final void m21630B(int i2) {
            this.zzc |= 1;
            this.zzd = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: G */
        public final void m21635G(zzi.zza zzaVar) {
            this.zze = (zzi) ((zzfd) zzaVar.mo22283y());
            this.zzc |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H */
        public final void m21636H(zzi zziVar) {
            zziVar.getClass();
            this.zzf = zziVar;
            this.zzc |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: I */
        public final void m21637I(boolean z) {
            this.zzc |= 8;
            this.zzg = z;
        }

        /* renamed from: Q */
        public static C11494zza m21638Q() {
            return zzh.m22273u();
        }

        /* renamed from: J */
        public final boolean m21640J() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: K */
        public final int m21641K() {
            return this.zzd;
        }

        /* renamed from: L */
        public final zzi m21642L() {
            zzi zziVar = this.zze;
            return zziVar == null ? zzi.m22005b0() : zziVar;
        }

        /* renamed from: M */
        public final boolean m21643M() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: N */
        public final zzi m21644N() {
            zzi zziVar = this.zzf;
            return zziVar == null ? zzi.m22005b0() : zziVar;
        }

        /* renamed from: O */
        public final boolean m21645O() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: P */
        public final boolean m21646P() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7510g0 c7510g0 = null;
            switch (C7510g0.f27728a[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C11494zza(c7510g0);
                case 3:
                    return zzfd.m22261q(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
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
        private static final zzb zzf;
        private static volatile zzgx<zzb> zzg;
        private int zzc;
        private int zzd;
        private long zze;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zzb, zza> implements zzgq {
            private zza() {
                super(zzb.zzf);
            }

            /* renamed from: A */
            public final zza m21663A(long j2) {
                m22279t();
                ((zzb) this.f28121g).m21654C(j2);
                return this;
            }

            /* renamed from: w */
            public final zza m21664w(int i2) {
                m22279t();
                ((zzb) this.f28121g).m21653B(i2);
                return this;
            }

            /* synthetic */ zza(C7510g0 c7510g0) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzf = zzbVar;
            zzfd.m22263s(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public final void m21653B(int i2) {
            this.zzc |= 1;
            this.zzd = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final void m21654C(long j2) {
            this.zzc |= 2;
            this.zze = j2;
        }

        /* renamed from: J */
        public static zza m21657J() {
            return zzf.m22273u();
        }

        /* renamed from: F */
        public final boolean m21659F() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: G */
        public final int m21660G() {
            return this.zzd;
        }

        /* renamed from: H */
        public final boolean m21661H() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: I */
        public final long m21662I() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7510g0 c7510g0 = null;
            switch (C7510g0.f27728a[i2 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(c7510g0);
                case 3:
                    return zzfd.m22261q(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzgx<zzb> zzaVar = zzg;
                    if (zzaVar == null) {
                        synchronized (zzb.class) {
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

    /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
    public static final class zzc extends zzfd<zzc, zza> implements zzgq {
        private static final zzc zzi;
        private static volatile zzgx<zzc> zzj;
        private int zzc;
        private zzfl<zze> zzd = zzfd.m22257A();
        private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
        private long zzf;
        private long zzg;
        private int zzh;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zzc, zza> implements zzgq {
            private zza() {
                super(zzc.zzi);
            }

            /* renamed from: A */
            public final zza m21694A(int i2, zze zzeVar) {
                m22279t();
                ((zzc) this.f28121g).m21666E(i2, zzeVar);
                return this;
            }

            /* renamed from: B */
            public final zza m21695B(long j2) {
                m22279t();
                ((zzc) this.f28121g).m21667F(j2);
                return this;
            }

            /* renamed from: C */
            public final zza m21696C(zze.zza zzaVar) {
                m22279t();
                ((zzc) this.f28121g).m21675N(zzaVar);
                return this;
            }

            /* renamed from: D */
            public final zza m21697D(zze zzeVar) {
                m22279t();
                ((zzc) this.f28121g).m21676O(zzeVar);
                return this;
            }

            /* renamed from: E */
            public final zza m21698E(String str) {
                m22279t();
                ((zzc) this.f28121g).m21677P(str);
                return this;
            }

            /* renamed from: F */
            public final zze m21699F(int i2) {
                return ((zzc) this.f28121g).m21684B(i2);
            }

            /* renamed from: G */
            public final List<zze> m21700G() {
                return Collections.unmodifiableList(((zzc) this.f28121g).m21685C());
            }

            /* renamed from: H */
            public final int m21701H() {
                return ((zzc) this.f28121g).m21686Q();
            }

            /* renamed from: I */
            public final zza m21702I(int i2) {
                m22279t();
                ((zzc) this.f28121g).m21678R(i2);
                return this;
            }

            /* renamed from: J */
            public final zza m21703J(long j2) {
                m22279t();
                ((zzc) this.f28121g).m21679S(j2);
                return this;
            }

            /* renamed from: K */
            public final String m21704K() {
                return ((zzc) this.f28121g).m21687U();
            }

            /* renamed from: L */
            public final boolean m21705L() {
                return ((zzc) this.f28121g).m21688V();
            }

            /* renamed from: M */
            public final long m21706M() {
                return ((zzc) this.f28121g).m21689W();
            }

            /* renamed from: N */
            public final long m21707N() {
                return ((zzc) this.f28121g).m21691Z();
            }

            /* renamed from: w */
            public final zza m21708w(int i2, zze.zza zzaVar) {
                m22279t();
                ((zzc) this.f28121g).m21665D(i2, zzaVar);
                return this;
            }

            /* synthetic */ zza(C7510g0 c7510g0) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzi = zzcVar;
            zzfd.m22263s(zzc.class, zzcVar);
        }

        private zzc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public final void m21665D(int i2, zze.zza zzaVar) {
            m21683e0();
            this.zzd.set(i2, (zze) ((zzfd) zzaVar.mo22283y()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public final void m21666E(int i2, zze zzeVar) {
            zzeVar.getClass();
            m21683e0();
            this.zzd.set(i2, zzeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F */
        public final void m21667F(long j2) {
            this.zzc |= 2;
            this.zzf = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: N */
        public final void m21675N(zze.zza zzaVar) {
            m21683e0();
            this.zzd.add((zze) ((zzfd) zzaVar.mo22283y()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: O */
        public final void m21676O(zze zzeVar) {
            zzeVar.getClass();
            m21683e0();
            this.zzd.add(zzeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: P */
        public final void m21677P(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zze = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: R */
        public final void m21678R(int i2) {
            m21683e0();
            this.zzd.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: S */
        public final void m21679S(long j2) {
            this.zzc |= 4;
            this.zzg = j2;
        }

        /* renamed from: c0 */
        public static zza m21681c0() {
            return zzi.m22273u();
        }

        /* renamed from: e0 */
        private final void m21683e0() {
            if (this.zzd.mo21145a()) {
                return;
            }
            this.zzd = zzfd.m22259n(this.zzd);
        }

        /* renamed from: B */
        public final zze m21684B(int i2) {
            return this.zzd.get(i2);
        }

        /* renamed from: C */
        public final List<zze> m21685C() {
            return this.zzd;
        }

        /* renamed from: Q */
        public final int m21686Q() {
            return this.zzd.size();
        }

        /* renamed from: U */
        public final String m21687U() {
            return this.zze;
        }

        /* renamed from: V */
        public final boolean m21688V() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: W */
        public final long m21689W() {
            return this.zzf;
        }

        /* renamed from: X */
        public final boolean m21690X() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: Z */
        public final long m21691Z() {
            return this.zzg;
        }

        /* renamed from: a0 */
        public final boolean m21692a0() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: b0 */
        public final int m21693b0() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7510g0 c7510g0 = null;
            switch (C7510g0.f27728a[i2 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(c7510g0);
                case 3:
                    return zzfd.m22261q(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0004\u0003", new Object[]{"zzc", "zzd", zze.class, "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    zzgx<zzc> zzaVar = zzj;
                    if (zzaVar == null) {
                        synchronized (zzc.class) {
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
    public static final class zzd extends zzfd<zzd, zza> implements zzgq {
        private static final zzd zzf;
        private static volatile zzgx<zzd> zzg;
        private int zzc;
        private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
        private long zze;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zzd, zza> implements zzgq {
            private zza() {
                super(zzd.zzf);
            }

            /* renamed from: A */
            public final zza m21715A(String str) {
                m22279t();
                ((zzd) this.f28121g).m21713F(str);
                return this;
            }

            /* renamed from: w */
            public final zza m21716w(long j2) {
                m22279t();
                ((zzd) this.f28121g).m21710C(j2);
                return this;
            }

            /* synthetic */ zza(C7510g0 c7510g0) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzf = zzdVar;
            zzfd.m22263s(zzd.class, zzdVar);
        }

        private zzd() {
        }

        /* renamed from: B */
        public static zza m21709B() {
            return zzf.m22273u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final void m21710C(long j2) {
            this.zzc |= 2;
            this.zze = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F */
        public final void m21713F(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7510g0 c7510g0 = null;
            switch (C7510g0.f27728a[i2 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(c7510g0);
                case 3:
                    return zzfd.m22261q(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzgx<zzd> zzaVar = zzg;
                    if (zzaVar == null) {
                        synchronized (zzd.class) {
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

    /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
    public static final class zze extends zzfd<zze, zza> implements zzgq {
        private static final zze zzi;
        private static volatile zzgx<zze> zzj;
        private int zzc;
        private String zzd = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
        private long zzf;
        private float zzg;
        private double zzh;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zze, zza> implements zzgq {
            private zza() {
                super(zze.zzi);
            }

            /* renamed from: A */
            public final zza m21740A(double d2) {
                m22279t();
                ((zze) this.f28121g).m21717C(d2);
                return this;
            }

            /* renamed from: B */
            public final zza m21741B(long j2) {
                m22279t();
                ((zze) this.f28121g).m21718D(j2);
                return this;
            }

            /* renamed from: C */
            public final zza m21742C(String str) {
                m22279t();
                ((zze) this.f28121g).m21723I(str);
                return this;
            }

            /* renamed from: D */
            public final zza m21743D() {
                m22279t();
                ((zze) this.f28121g).m21731W();
                return this;
            }

            /* renamed from: E */
            public final zza m21744E(String str) {
                m22279t();
                ((zze) this.f28121g).m21726L(str);
                return this;
            }

            /* renamed from: F */
            public final zza m21745F() {
                m22279t();
                ((zze) this.f28121g).m21732X();
                return this;
            }

            /* renamed from: w */
            public final zza m21746w() {
                m22279t();
                ((zze) this.f28121g).m21730V();
                return this;
            }

            /* synthetic */ zza(C7510g0 c7510g0) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzi = zzeVar;
            zzfd.m22263s(zze.class, zzeVar);
        }

        private zze() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final void m21717C(double d2) {
            this.zzc |= 16;
            this.zzh = d2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public final void m21718D(long j2) {
            this.zzc |= 4;
            this.zzf = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: I */
        public final void m21723I(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: L */
        public final void m21726L(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        /* renamed from: T */
        public static zza m21728T() {
            return zzi.m22273u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: V */
        public final void m21730V() {
            this.zzc &= -3;
            this.zze = zzi.zze;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public final void m21731W() {
            this.zzc &= -5;
            this.zzf = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: X */
        public final void m21732X() {
            this.zzc &= -17;
            this.zzh = 0.0d;
        }

        /* renamed from: B */
        public final String m21733B() {
            return this.zzd;
        }

        /* renamed from: M */
        public final boolean m21734M() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: N */
        public final String m21735N() {
            return this.zze;
        }

        /* renamed from: P */
        public final boolean m21736P() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: Q */
        public final long m21737Q() {
            return this.zzf;
        }

        /* renamed from: R */
        public final boolean m21738R() {
            return (this.zzc & 16) != 0;
        }

        /* renamed from: S */
        public final double m21739S() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7510g0 c7510g0 = null;
            switch (C7510g0.f27728a[i2 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(c7510g0);
                case 3:
                    return zzfd.m22261q(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0001\u0003\u0005\u0000\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    zzgx<zze> zzaVar = zzj;
                    if (zzaVar == null) {
                        synchronized (zze.class) {
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
    public static final class zzf extends zzfd<zzf, zza> implements zzgq {
        private static final zzf zzd;
        private static volatile zzgx<zzf> zze;
        private zzfl<zzg> zzc = zzfd.m22257A();

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zzf, zza> implements zzgq {
            private zza() {
                super(zzf.zzd);
            }

            /* renamed from: A */
            public final zzg m21753A(int i2) {
                return ((zzf) this.f28121g).m21751B(0);
            }

            /* renamed from: w */
            public final zza m21754w(zzg.zza zzaVar) {
                m22279t();
                ((zzf) this.f28121g).m21748E(zzaVar);
                return this;
            }

            /* synthetic */ zza(C7510g0 c7510g0) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzd = zzfVar;
            zzfd.m22263s(zzf.class, zzfVar);
        }

        private zzf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public final void m21748E(zzg.zza zzaVar) {
            if (!this.zzc.mo21145a()) {
                this.zzc = zzfd.m22259n(this.zzc);
            }
            this.zzc.add((zzg) ((zzfd) zzaVar.mo22283y()));
        }

        /* renamed from: F */
        public static zza m21749F() {
            return zzd.m22273u();
        }

        /* renamed from: B */
        public final zzg m21751B(int i2) {
            return this.zzc.get(0);
        }

        /* renamed from: C */
        public final List<zzg> m21752C() {
            return this.zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7510g0 c7510g0 = null;
            switch (C7510g0.f27728a[i2 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(c7510g0);
                case 3:
                    return zzfd.m22261q(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzg.class});
                case 4:
                    return zzd;
                case 5:
                    zzgx<zzf> zzaVar = zze;
                    if (zzaVar == null) {
                        synchronized (zzf.class) {
                            zzaVar = zze;
                            if (zzaVar == null) {
                                zzaVar = new zzfd.zza<>(zzd);
                                zze = zzaVar;
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
    public static final class zzg extends zzfd<zzg, zza> implements zzgq {
        private static final zzg zzav;
        private static volatile zzgx<zzg> zzaw;
        private int zzaa;
        private boolean zzad;
        private int zzag;
        private int zzah;
        private int zzai;
        private long zzak;
        private long zzal;
        private int zzao;
        private zzh zzaq;
        private long zzas;
        private long zzat;
        private int zzc;
        private int zzd;
        private int zze;
        private long zzh;
        private long zzi;
        private long zzj;
        private long zzk;
        private long zzl;
        private int zzq;
        private long zzu;
        private long zzv;
        private boolean zzx;
        private long zzz;
        private zzfl<zzc> zzf = zzfd.m22257A();
        private zzfl<zzk> zzg = zzfd.m22257A();
        private String zzm = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzn = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzo = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzp = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzr = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzs = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzt = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzw = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzy = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzab = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzac = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzfl<zza> zzae = zzfd.m22257A();
        private String zzaf = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzaj = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzam = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzan = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzap = HttpUrl.FRAGMENT_ENCODE_SET;
        private zzfj zzar = zzfd.m22265w();
        private String zzau = HttpUrl.FRAGMENT_ENCODE_SET;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zzg, zza> implements zzgq {
            private zza() {
                super(zzg.zzav);
            }

            /* renamed from: A */
            public final zza m21921A(int i2, zzc.zza zzaVar) {
                m22279t();
                ((zzg) this.f28121g).m21759C(i2, zzaVar);
                return this;
            }

            /* renamed from: A0 */
            public final zza m21922A0(long j2) {
                m22279t();
                ((zzg) this.f28121g).m21830g2(j2);
                return this;
            }

            /* renamed from: B */
            public final zza m21923B(int i2, zzk zzkVar) {
                m22279t();
                ((zzg) this.f28121g).m21761D(i2, zzkVar);
                return this;
            }

            /* renamed from: B0 */
            public final zza m21924B0(String str) {
                m22279t();
                ((zzg) this.f28121g).m21836j2(str);
                return this;
            }

            /* renamed from: C */
            public final zza m21925C(long j2) {
                m22279t();
                ((zzg) this.f28121g).m21763E(j2);
                return this;
            }

            /* renamed from: C0 */
            public final String m21926C0() {
                return ((zzg) this.f28121g).m21877L2();
            }

            /* renamed from: D */
            public final zza m21927D(zzc.zza zzaVar) {
                m22279t();
                ((zzg) this.f28121g).m21766F(zzaVar);
                return this;
            }

            /* renamed from: D0 */
            public final zza m21928D0() {
                m22279t();
                ((zzg) this.f28121g).m21818Z0();
                return this;
            }

            /* renamed from: E */
            public final zza m21929E(zzh.zzb zzbVar) {
                m22279t();
                ((zzg) this.f28121g).m21800S(zzbVar);
                return this;
            }

            /* renamed from: E0 */
            public final zza m21930E0(long j2) {
                m22279t();
                ((zzg) this.f28121g).m21838k2(j2);
                return this;
            }

            /* renamed from: F */
            public final zza m21931F(zzk.zza zzaVar) {
                m22279t();
                ((zzg) this.f28121g).m21802T(zzaVar);
                return this;
            }

            /* renamed from: F0 */
            public final zza m21932F0(String str) {
                m22279t();
                ((zzg) this.f28121g).m21843n2(str);
                return this;
            }

            /* renamed from: G */
            public final zza m21933G(zzk zzkVar) {
                m22279t();
                ((zzg) this.f28121g).m21805U(zzkVar);
                return this;
            }

            /* renamed from: G0 */
            public final zza m21934G0(long j2) {
                m22279t();
                ((zzg) this.f28121g).m21847q2(j2);
                return this;
            }

            /* renamed from: H */
            public final zza m21935H(Iterable<? extends zzc> iterable) {
                m22279t();
                ((zzg) this.f28121g).m21808V(iterable);
                return this;
            }

            /* renamed from: H0 */
            public final zza m21936H0(String str) {
                m22279t();
                ((zzg) this.f28121g).m21853t2(str);
                return this;
            }

            /* renamed from: I */
            public final zza m21937I(String str) {
                m22279t();
                ((zzg) this.f28121g).m21811W(str);
                return this;
            }

            /* renamed from: I0 */
            public final String m21938I0() {
                return ((zzg) this.f28121g).m21903n0();
            }

            /* renamed from: J */
            public final zza m21939J(boolean z) {
                m22279t();
                ((zzg) this.f28121g).m21814X(z);
                return this;
            }

            /* renamed from: K */
            public final List<zzc> m21940K() {
                return Collections.unmodifiableList(((zzg) this.f28121g).m21889b1());
            }

            /* renamed from: K0 */
            public final zza m21941K0() {
                m22279t();
                ((zzg) this.f28121g).m21820a1();
                return this;
            }

            /* renamed from: L */
            public final int m21942L() {
                return ((zzg) this.f28121g).m21901l1();
            }

            /* renamed from: L0 */
            public final zza m21943L0(String str) {
                m22279t();
                ((zzg) this.f28121g).m21856v2(str);
                return this;
            }

            /* renamed from: M */
            public final zzc m21944M(int i2) {
                return ((zzg) this.f28121g).m21864B(i2);
            }

            /* renamed from: N */
            public final zza m21945N(long j2) {
                m22279t();
                ((zzg) this.f28121g).m21762D0(j2);
                return this;
            }

            /* renamed from: N0 */
            public final zza m21946N0() {
                m22279t();
                ((zzg) this.f28121g).m21837k1();
                return this;
            }

            /* renamed from: O */
            public final zza m21947O(Iterable<? extends zzk> iterable) {
                m22279t();
                ((zzg) this.f28121g).m21782K0(iterable);
                return this;
            }

            /* renamed from: O0 */
            public final zza m21948O0(String str) {
                m22279t();
                ((zzg) this.f28121g).m21862z2(null);
                return this;
            }

            /* renamed from: P */
            public final zza m21949P(String str) {
                m22279t();
                ((zzg) this.f28121g).m21785L0(str);
                return this;
            }

            /* renamed from: P0 */
            public final zza m21950P0(String str) {
                m22279t();
                ((zzg) this.f28121g).m21758B2(str);
                return this;
            }

            /* renamed from: Q */
            public final zza m21951Q(boolean z) {
                m22279t();
                ((zzg) this.f28121g).m21788M0(z);
                return this;
            }

            /* renamed from: R */
            public final zza m21952R() {
                m22279t();
                ((zzg) this.f28121g).m21806U0();
                return this;
            }

            /* renamed from: S */
            public final zza m21953S(int i2) {
                m22279t();
                ((zzg) this.f28121g).m21857w1(i2);
                return this;
            }

            /* renamed from: T */
            public final zza m21954T(long j2) {
                m22279t();
                ((zzg) this.f28121g).m21823c1(j2);
                return this;
            }

            /* renamed from: U */
            public final zza m21955U(Iterable<? extends zza> iterable) {
                m22279t();
                ((zzg) this.f28121g).m21833i1(iterable);
                return this;
            }

            /* renamed from: V */
            public final zza m21956V(String str) {
                m22279t();
                ((zzg) this.f28121g).m21835j1(str);
                return this;
            }

            /* renamed from: X */
            public final zza m21957X(long j2) {
                m22279t();
                ((zzg) this.f28121g).m21842n1(j2);
                return this;
            }

            /* renamed from: Z */
            public final zza m21958Z(Iterable<? extends Integer> iterable) {
                m22279t();
                ((zzg) this.f28121g).m21852t1(iterable);
                return this;
            }

            /* renamed from: a0 */
            public final zza m21959a0(String str) {
                m22279t();
                ((zzg) this.f28121g).m21854u1(str);
                return this;
            }

            /* renamed from: b0 */
            public final zzk m21960b0(int i2) {
                return ((zzg) this.f28121g).m21866C0(i2);
            }

            /* renamed from: c0 */
            public final List<zzk> m21961c0() {
                return Collections.unmodifiableList(((zzg) this.f28121g).m21914v1());
            }

            /* renamed from: d0 */
            public final int m21962d0() {
                return ((zzg) this.f28121g).m21868D1();
            }

            /* renamed from: f0 */
            public final zza m21963f0(int i2) {
                m22279t();
                ((zzg) this.f28121g).m21765E1(i2);
                return this;
            }

            /* renamed from: g0 */
            public final zza m21964g0(long j2) {
                m22279t();
                ((zzg) this.f28121g).m21858x1(j2);
                return this;
            }

            /* renamed from: h0 */
            public final zza m21965h0(String str) {
                m22279t();
                ((zzg) this.f28121g).m21760C1(str);
                return this;
            }

            /* renamed from: j0 */
            public final long m21966j0() {
                return ((zzg) this.f28121g).m21894e2();
            }

            /* renamed from: k0 */
            public final zza m21967k0(int i2) {
                m22279t();
                ((zzg) this.f28121g).m21786L1(i2);
                return this;
            }

            /* renamed from: l0 */
            public final zza m21968l0(long j2) {
                m22279t();
                ((zzg) this.f28121g).m21768F1(j2);
                return this;
            }

            /* renamed from: m0 */
            public final zza m21969m0(String str) {
                m22279t();
                ((zzg) this.f28121g).m21783K1(str);
                return this;
            }

            /* renamed from: n0 */
            public final long m21970n0() {
                return ((zzg) this.f28121g).m21907p2();
            }

            /* renamed from: o0 */
            public final zza m21971o0(int i2) {
                m22279t();
                ((zzg) this.f28121g).m21804T1(i2);
                return this;
            }

            /* renamed from: q0 */
            public final zza m21972q0(long j2) {
                m22279t();
                ((zzg) this.f28121g).m21789M1(j2);
                return this;
            }

            /* renamed from: r0 */
            public final zza m21973r0(String str) {
                m22279t();
                ((zzg) this.f28121g).m21797Q1(str);
                return this;
            }

            /* renamed from: s0 */
            public final zza m21974s0() {
                m22279t();
                ((zzg) this.f28121g).m21812W0();
                return this;
            }

            /* renamed from: t0 */
            public final zza m21975t0(int i2) {
                m22279t();
                ((zzg) this.f28121g).m21817Y1(i2);
                return this;
            }

            /* renamed from: u0 */
            public final zza m21976u0(long j2) {
                m22279t();
                ((zzg) this.f28121g).m21807U1(j2);
                return this;
            }

            /* renamed from: v0 */
            public final zza m21977v0(String str) {
                m22279t();
                ((zzg) this.f28121g).m21815X1(str);
                return this;
            }

            /* renamed from: w */
            public final zza m21978w(int i2) {
                m22279t();
                ((zzg) this.f28121g).m21840m1(1);
                return this;
            }

            /* renamed from: w0 */
            public final zza m21979w0() {
                m22279t();
                ((zzg) this.f28121g).m21816Y0();
                return this;
            }

            /* renamed from: x0 */
            public final zza m21980x0(int i2) {
                m22279t();
                ((zzg) this.f28121g).m21828f2(i2);
                return this;
            }

            /* renamed from: y0 */
            public final zza m21981y0(long j2) {
                m22279t();
                ((zzg) this.f28121g).m21819Z1(j2);
                return this;
            }

            /* renamed from: z0 */
            public final zza m21982z0(String str) {
                m22279t();
                ((zzg) this.f28121g).m21824c2(str);
                return this;
            }

            /* synthetic */ zza(C7510g0 c7510g0) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzav = zzgVar;
            zzfd.m22263s(zzg.class, zzgVar);
        }

        private zzg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B2 */
        public final void m21758B2(String str) {
            str.getClass();
            this.zzd |= 4;
            this.zzap = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final void m21759C(int i2, zzc.zza zzaVar) {
            m21803T0();
            this.zzf.set(i2, (zzc) ((zzfd) zzaVar.mo22283y()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C1 */
        public final void m21760C1(String str) {
            str.getClass();
            this.zzc |= RecyclerView.AbstractC0599l.FLAG_MOVED;
            this.zzr = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D */
        public final void m21761D(int i2, zzk zzkVar) {
            zzkVar.getClass();
            m21809V0();
            this.zzg.set(i2, zzkVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D0 */
        public final void m21762D0(long j2) {
            this.zzc |= 4;
            this.zzi = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E */
        public final void m21763E(long j2) {
            this.zzc |= 2;
            this.zzh = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E1 */
        public final void m21765E1(int i2) {
            m21809V0();
            this.zzg.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F */
        public final void m21766F(zzc.zza zzaVar) {
            m21803T0();
            this.zzf.add((zzc) ((zzfd) zzaVar.mo22283y()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: F1 */
        public final void m21768F1(long j2) {
            this.zzc |= Http2.INITIAL_MAX_FRAME_SIZE;
            this.zzu = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: K0 */
        public final void m21782K0(Iterable<? extends zzk> iterable) {
            m21809V0();
            zzdl.m22134c(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: K1 */
        public final void m21783K1(String str) {
            str.getClass();
            this.zzc |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.zzs = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: L0 */
        public final void m21785L0(String str) {
            str.getClass();
            this.zzc |= 128;
            this.zzn = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: L1 */
        public final void m21786L1(int i2) {
            this.zzc |= 1024;
            this.zzq = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: M0 */
        public final void m21788M0(boolean z) {
            this.zzc |= 8388608;
            this.zzad = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: M1 */
        public final void m21789M1(long j2) {
            this.zzc |= 32768;
            this.zzv = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Q1 */
        public final void m21797Q1(String str) {
            str.getClass();
            this.zzc |= 8192;
            this.zzt = str;
        }

        /* renamed from: R0 */
        public static zza m21799R0() {
            return zzav.m22273u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: S */
        public final void m21800S(zzh.zzb zzbVar) {
            this.zzaq = (zzh) ((zzfd) zzbVar.mo22283y());
            this.zzd |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: T */
        public final void m21802T(zzk.zza zzaVar) {
            m21809V0();
            this.zzg.add((zzk) ((zzfd) zzaVar.mo22283y()));
        }

        /* renamed from: T0 */
        private final void m21803T0() {
            if (this.zzf.mo21145a()) {
                return;
            }
            this.zzf = zzfd.m22259n(this.zzf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: T1 */
        public final void m21804T1(int i2) {
            this.zzc |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
            this.zzaa = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: U */
        public final void m21805U(zzk zzkVar) {
            zzkVar.getClass();
            m21809V0();
            this.zzg.add(zzkVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: U0 */
        public final void m21806U0() {
            this.zzf = zzfd.m22257A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: U1 */
        public final void m21807U1(long j2) {
            this.zzc |= 524288;
            this.zzz = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: V */
        public final void m21808V(Iterable<? extends zzc> iterable) {
            m21803T0();
            zzdl.m22134c(iterable, this.zzf);
        }

        /* renamed from: V0 */
        private final void m21809V0() {
            if (this.zzg.mo21145a()) {
                return;
            }
            this.zzg = zzfd.m22259n(this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public final void m21811W(String str) {
            str.getClass();
            this.zzc |= 64;
            this.zzm = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W0 */
        public final void m21812W0() {
            this.zzc &= -17;
            this.zzk = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: X */
        public final void m21814X(boolean z) {
            this.zzc |= 131072;
            this.zzx = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: X1 */
        public final void m21815X1(String str) {
            str.getClass();
            this.zzc |= 65536;
            this.zzw = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Y0 */
        public final void m21816Y0() {
            this.zzc &= -33;
            this.zzl = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Y1 */
        public final void m21817Y1(int i2) {
            this.zzc |= 33554432;
            this.zzag = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Z0 */
        public final void m21818Z0() {
            this.zzc &= -2097153;
            this.zzab = zzav.zzab;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Z1 */
        public final void m21819Z1(long j2) {
            this.zzc |= 536870912;
            this.zzak = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a1 */
        public final void m21820a1() {
            this.zzae = zzfd.m22257A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c1 */
        public final void m21823c1(long j2) {
            this.zzc |= 8;
            this.zzj = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c2 */
        public final void m21824c2(String str) {
            str.getClass();
            this.zzc |= 262144;
            this.zzy = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f2 */
        public final void m21828f2(int i2) {
            this.zzd |= 2;
            this.zzao = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g2 */
        public final void m21830g2(long j2) {
            this.zzc |= 1073741824;
            this.zzal = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i1 */
        public final void m21833i1(Iterable<? extends zza> iterable) {
            if (!this.zzae.mo21145a()) {
                this.zzae = zzfd.m22259n(this.zzae);
            }
            zzdl.m22134c(iterable, this.zzae);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j1 */
        public final void m21835j1(String str) {
            str.getClass();
            this.zzc |= 256;
            this.zzo = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j2 */
        public final void m21836j2(String str) {
            str.getClass();
            this.zzc |= 2097152;
            this.zzab = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k1 */
        public final void m21837k1() {
            this.zzc &= Integer.MAX_VALUE;
            this.zzam = zzav.zzam;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k2 */
        public final void m21838k2(long j2) {
            this.zzd |= 16;
            this.zzas = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m1 */
        public final void m21840m1(int i2) {
            this.zzc |= 1;
            this.zze = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n1 */
        public final void m21842n1(long j2) {
            this.zzc |= 16;
            this.zzk = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n2 */
        public final void m21843n2(String str) {
            str.getClass();
            this.zzc |= 4194304;
            this.zzac = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q2 */
        public final void m21847q2(long j2) {
            this.zzd |= 32;
            this.zzat = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t1 */
        public final void m21852t1(Iterable<? extends Integer> iterable) {
            if (!this.zzar.mo21145a()) {
                zzfj zzfjVar = this.zzar;
                int size = zzfjVar.size();
                this.zzar = zzfjVar.mo20982d(size == 0 ? 10 : size << 1);
            }
            zzdl.m22134c(iterable, this.zzar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t2 */
        public final void m21853t2(String str) {
            str.getClass();
            this.zzc |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
            this.zzaf = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u1 */
        public final void m21854u1(String str) {
            str.getClass();
            this.zzc |= AdRequest.MAX_CONTENT_URL_LENGTH;
            this.zzp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v2 */
        public final void m21856v2(String str) {
            str.getClass();
            this.zzc |= 268435456;
            this.zzaj = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w1 */
        public final void m21857w1(int i2) {
            m21803T0();
            this.zzf.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x1 */
        public final void m21858x1(long j2) {
            this.zzc |= 32;
            this.zzl = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z2 */
        public final void m21862z2(String str) {
            str.getClass();
            this.zzc |= Integer.MIN_VALUE;
            this.zzam = str;
        }

        /* renamed from: A0 */
        public final boolean m21863A0() {
            return (this.zzd & 2) != 0;
        }

        /* renamed from: B */
        public final zzc m21864B(int i2) {
            return this.zzf.get(i2);
        }

        /* renamed from: B0 */
        public final int m21865B0() {
            return this.zze;
        }

        /* renamed from: C0 */
        public final zzk m21866C0(int i2) {
            return this.zzg.get(i2);
        }

        /* renamed from: C2 */
        public final boolean m21867C2() {
            return (this.zzc & 32) != 0;
        }

        /* renamed from: D1 */
        public final int m21868D1() {
            return this.zzg.size();
        }

        /* renamed from: D2 */
        public final long m21869D2() {
            return this.zzl;
        }

        /* renamed from: E2 */
        public final String m21870E2() {
            return this.zzm;
        }

        /* renamed from: F2 */
        public final String m21871F2() {
            return this.zzn;
        }

        /* renamed from: G2 */
        public final String m21872G2() {
            return this.zzo;
        }

        /* renamed from: H2 */
        public final String m21873H2() {
            return this.zzp;
        }

        /* renamed from: I2 */
        public final boolean m21874I2() {
            return (this.zzc & 1024) != 0;
        }

        /* renamed from: J2 */
        public final int m21875J2() {
            return this.zzq;
        }

        /* renamed from: K2 */
        public final String m21876K2() {
            return this.zzr;
        }

        /* renamed from: L2 */
        public final String m21877L2() {
            return this.zzs;
        }

        /* renamed from: M2 */
        public final String m21878M2() {
            return this.zzt;
        }

        /* renamed from: N0 */
        public final int m21879N0() {
            return this.zzao;
        }

        /* renamed from: N2 */
        public final boolean m21880N2() {
            return (this.zzc & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
        }

        /* renamed from: O0 */
        public final String m21881O0() {
            return this.zzap;
        }

        /* renamed from: P0 */
        public final boolean m21882P0() {
            return (this.zzd & 16) != 0;
        }

        /* renamed from: Q0 */
        public final long m21883Q0() {
            return this.zzas;
        }

        /* renamed from: R1 */
        public final boolean m21884R1() {
            return (this.zzc & 2) != 0;
        }

        /* renamed from: S1 */
        public final long m21885S1() {
            return this.zzh;
        }

        /* renamed from: Z */
        public final boolean m21886Z() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: a0 */
        public final long m21887a0() {
            return this.zzu;
        }

        /* renamed from: b0 */
        public final boolean m21888b0() {
            return (this.zzc & 32768) != 0;
        }

        /* renamed from: b1 */
        public final List<zzc> m21889b1() {
            return this.zzf;
        }

        /* renamed from: c0 */
        public final long m21890c0() {
            return this.zzv;
        }

        /* renamed from: d0 */
        public final String m21891d0() {
            return this.zzw;
        }

        /* renamed from: d2 */
        public final boolean m21892d2() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: e0 */
        public final boolean m21893e0() {
            return (this.zzc & 131072) != 0;
        }

        /* renamed from: e2 */
        public final long m21894e2() {
            return this.zzi;
        }

        /* renamed from: f0 */
        public final boolean m21895f0() {
            return this.zzx;
        }

        /* renamed from: g0 */
        public final String m21896g0() {
            return this.zzy;
        }

        /* renamed from: h0 */
        public final boolean m21897h0() {
            return (this.zzc & 524288) != 0;
        }

        /* renamed from: j0 */
        public final long m21898j0() {
            return this.zzz;
        }

        /* renamed from: k0 */
        public final boolean m21899k0() {
            return (this.zzc & CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES) != 0;
        }

        /* renamed from: l0 */
        public final int m21900l0() {
            return this.zzaa;
        }

        /* renamed from: l1 */
        public final int m21901l1() {
            return this.zzf.size();
        }

        /* renamed from: m0 */
        public final String m21902m0() {
            return this.zzab;
        }

        /* renamed from: n0 */
        public final String m21903n0() {
            return this.zzac;
        }

        /* renamed from: o0 */
        public final boolean m21904o0() {
            return (this.zzc & 8388608) != 0;
        }

        /* renamed from: o2 */
        public final boolean m21905o2() {
            return (this.zzc & 8) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7510g0 c7510g0 = null;
            switch (C7510g0.f27728a[i2 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(c7510g0);
                case 3:
                    return zzfd.m22261q(zzav, "\u0001+\u0000\u0002\u00012+\u0000\u0004\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0002\u0001\u0005\u0002\u0002\u0006\u0002\u0003\u0007\u0002\u0005\b\b\u0006\t\b\u0007\n\b\b\u000b\b\t\f\u0004\n\r\b\u000b\u000e\b\f\u0010\b\r\u0011\u0002\u000e\u0012\u0002\u000f\u0013\b\u0010\u0014\u0007\u0011\u0015\b\u0012\u0016\u0002\u0013\u0017\u0004\u0014\u0018\b\u0015\u0019\b\u0016\u001a\u0002\u0004\u001c\u0007\u0017\u001d\u001b\u001e\b\u0018\u001f\u0004\u0019 \u0004\u001a!\u0004\u001b\"\b\u001c#\u0002\u001d$\u0002\u001e%\b\u001f&\b '\u0004!)\b\",\t#-\u001d.\u0002$/\u0002%2\b&", new Object[]{"zzc", "zzd", "zze", "zzf", zzc.class, "zzg", zzk.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzk", "zzad", "zzae", zza.class, "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau"});
                case 4:
                    return zzav;
                case 5:
                    zzgx<zzg> zzaVar = zzaw;
                    if (zzaVar == null) {
                        synchronized (zzg.class) {
                            zzaVar = zzaw;
                            if (zzaVar == null) {
                                zzaVar = new zzfd.zza<>(zzav);
                                zzaw = zzaVar;
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

        /* renamed from: p0 */
        public final boolean m21906p0() {
            return this.zzad;
        }

        /* renamed from: p2 */
        public final long m21907p2() {
            return this.zzj;
        }

        /* renamed from: q0 */
        public final List<zza> m21908q0() {
            return this.zzae;
        }

        /* renamed from: r0 */
        public final String m21909r0() {
            return this.zzaf;
        }

        /* renamed from: s0 */
        public final boolean m21910s0() {
            return (this.zzc & 33554432) != 0;
        }

        /* renamed from: t0 */
        public final int m21911t0() {
            return this.zzag;
        }

        /* renamed from: u0 */
        public final String m21912u0() {
            return this.zzaj;
        }

        /* renamed from: v0 */
        public final boolean m21913v0() {
            return (this.zzc & 536870912) != 0;
        }

        /* renamed from: v1 */
        public final List<zzk> m21914v1() {
            return this.zzg;
        }

        /* renamed from: w0 */
        public final long m21915w0() {
            return this.zzak;
        }

        /* renamed from: w2 */
        public final boolean m21916w2() {
            return (this.zzc & 16) != 0;
        }

        /* renamed from: x0 */
        public final boolean m21917x0() {
            return (this.zzc & 1073741824) != 0;
        }

        /* renamed from: x2 */
        public final long m21918x2() {
            return this.zzk;
        }

        /* renamed from: y0 */
        public final long m21919y0() {
            return this.zzal;
        }

        /* renamed from: z0 */
        public final String m21920z0() {
            return this.zzam;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
    public static final class zzh extends zzfd<zzh, zzb> implements zzgq {
        private static final zzh zzf;
        private static volatile zzgx<zzh> zzg;
        private int zzc;
        private int zzd = 1;
        private zzfl<zzd> zze = zzfd.m22257A();

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public enum zza implements zzfi {
            RADS(1),
            PROVISIONING(2);


            /* renamed from: h */
            private static final zzfh<zza> f27978h = new C7522i0();

            /* renamed from: j */
            private final int f27980j;

            zza(int i2) {
                this.f27980j = i2;
            }

            /* renamed from: g */
            public static zza m21987g(int i2) {
                if (i2 == 1) {
                    return RADS;
                }
                if (i2 != 2) {
                    return null;
                }
                return PROVISIONING;
            }

            /* renamed from: k */
            public static zzfk m21988k() {
                return C7516h0.f27754a;
            }

            @Override // com.google.android.gms.internal.measurement.zzfi
            /* renamed from: a */
            public final int mo21566a() {
                return this.f27980j;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f27980j + " name=" + name() + '>';
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zzb extends zzfd.zzb<zzh, zzb> implements zzgq {
            private zzb() {
                super(zzh.zzf);
            }

            /* renamed from: w */
            public final zzb m21989w(zzd.zza zzaVar) {
                m22279t();
                ((zzh) this.f28121g).m21984C(zzaVar);
                return this;
            }

            /* synthetic */ zzb(C7510g0 c7510g0) {
                this();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzf = zzhVar;
            zzfd.m22263s(zzh.class, zzhVar);
        }

        private zzh() {
        }

        /* renamed from: B */
        public static zzb m21983B() {
            return zzf.m22273u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final void m21984C(zzd.zza zzaVar) {
            if (!this.zze.mo21145a()) {
                this.zze = zzfd.m22259n(this.zze);
            }
            this.zze.add((zzd) ((zzfd) zzaVar.mo22283y()));
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7510g0 c7510g0 = null;
            switch (C7510g0.f27728a[i2 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zzb(c7510g0);
                case 3:
                    return zzfd.m22261q(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zzc", "zzd", zza.m21988k(), "zze", zzd.class});
                case 4:
                    return zzf;
                case 5:
                    zzgx<zzh> zzaVar = zzg;
                    if (zzaVar == null) {
                        synchronized (zzh.class) {
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

    /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
    public static final class zzi extends zzfd<zzi, zza> implements zzgq {
        private static final zzi zzg;
        private static volatile zzgx<zzi> zzh;
        private zzfm zzc = zzfd.m22266z();
        private zzfm zzd = zzfd.m22266z();
        private zzfl<zzb> zze = zzfd.m22257A();
        private zzfl<zzj> zzf = zzfd.m22257A();

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zzi, zza> implements zzgq {
            private zza() {
                super(zzi.zzg);
            }

            /* renamed from: A */
            public final zza m22021A(int i2) {
                m22279t();
                ((zzi) this.f28121g).m22000R(i2);
                return this;
            }

            /* renamed from: B */
            public final zza m22022B(Iterable<? extends Long> iterable) {
                m22279t();
                ((zzi) this.f28121g).m21993G(iterable);
                return this;
            }

            /* renamed from: C */
            public final zza m22023C() {
                m22279t();
                ((zzi) this.f28121g).m22008e0();
                return this;
            }

            /* renamed from: D */
            public final zza m22024D(int i2) {
                m22279t();
                ((zzi) this.f28121g).m22003V(i2);
                return this;
            }

            /* renamed from: E */
            public final zza m22025E(Iterable<? extends Long> iterable) {
                m22279t();
                ((zzi) this.f28121g).m21997M(iterable);
                return this;
            }

            /* renamed from: F */
            public final zza m22026F(Iterable<? extends zzb> iterable) {
                m22279t();
                ((zzi) this.f28121g).m21999P(iterable);
                return this;
            }

            /* renamed from: G */
            public final zza m22027G(Iterable<? extends zzj> iterable) {
                m22279t();
                ((zzi) this.f28121g).m22002T(iterable);
                return this;
            }

            /* renamed from: w */
            public final zza m22028w() {
                m22279t();
                ((zzi) this.f28121g).m22007d0();
                return this;
            }

            /* synthetic */ zza(C7510g0 c7510g0) {
                this();
            }
        }

        static {
            zzi zziVar = new zzi();
            zzg = zziVar;
            zzfd.m22263s(zzi.class, zziVar);
        }

        private zzi() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: G */
        public final void m21993G(Iterable<? extends Long> iterable) {
            if (!this.zzc.mo21145a()) {
                this.zzc = zzfd.m22260o(this.zzc);
            }
            zzdl.m22134c(iterable, this.zzc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: M */
        public final void m21997M(Iterable<? extends Long> iterable) {
            if (!this.zzd.mo21145a()) {
                this.zzd = zzfd.m22260o(this.zzd);
            }
            zzdl.m22134c(iterable, this.zzd);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: P */
        public final void m21999P(Iterable<? extends zzb> iterable) {
            m22009f0();
            zzdl.m22134c(iterable, this.zze);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: R */
        public final void m22000R(int i2) {
            m22009f0();
            this.zze.remove(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: T */
        public final void m22002T(Iterable<? extends zzj> iterable) {
            m22010g0();
            zzdl.m22134c(iterable, this.zzf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: V */
        public final void m22003V(int i2) {
            m22010g0();
            this.zzf.remove(i2);
        }

        /* renamed from: a0 */
        public static zza m22004a0() {
            return zzg.m22273u();
        }

        /* renamed from: b0 */
        public static zzi m22005b0() {
            return zzg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d0 */
        public final void m22007d0() {
            this.zzc = zzfd.m22266z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e0 */
        public final void m22008e0() {
            this.zzd = zzfd.m22266z();
        }

        /* renamed from: f0 */
        private final void m22009f0() {
            if (this.zze.mo21145a()) {
                return;
            }
            this.zze = zzfd.m22259n(this.zze);
        }

        /* renamed from: g0 */
        private final void m22010g0() {
            if (this.zzf.mo21145a()) {
                return;
            }
            this.zzf = zzfd.m22259n(this.zzf);
        }

        /* renamed from: B */
        public final zzb m22011B(int i2) {
            return this.zze.get(i2);
        }

        /* renamed from: C */
        public final List<Long> m22012C() {
            return this.zzc;
        }

        /* renamed from: H */
        public final int m22013H() {
            return this.zzc.size();
        }

        /* renamed from: I */
        public final zzj m22014I(int i2) {
            return this.zzf.get(i2);
        }

        /* renamed from: N */
        public final List<Long> m22015N() {
            return this.zzd;
        }

        /* renamed from: Q */
        public final int m22016Q() {
            return this.zzd.size();
        }

        /* renamed from: U */
        public final List<zzb> m22017U() {
            return this.zze;
        }

        /* renamed from: W */
        public final int m22018W() {
            return this.zze.size();
        }

        /* renamed from: X */
        public final List<zzj> m22019X() {
            return this.zzf;
        }

        /* renamed from: Z */
        public final int m22020Z() {
            return this.zzf.size();
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7510g0 c7510g0 = null;
            switch (C7510g0.f27728a[i2 - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza(c7510g0);
                case 3:
                    return zzfd.m22261q(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", zzb.class, "zzf", zzj.class});
                case 4:
                    return zzg;
                case 5:
                    zzgx<zzi> zzaVar = zzh;
                    if (zzaVar == null) {
                        synchronized (zzi.class) {
                            zzaVar = zzh;
                            if (zzaVar == null) {
                                zzaVar = new zzfd.zza<>(zzg);
                                zzh = zzaVar;
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
    public static final class zzj extends zzfd<zzj, zza> implements zzgq {
        private static final zzj zzf;
        private static volatile zzgx<zzj> zzg;
        private int zzc;
        private int zzd;
        private zzfm zze = zzfd.m22266z();

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zzj, zza> implements zzgq {
            private zza() {
                super(zzj.zzf);
            }

            /* renamed from: A */
            public final zza m22045A(int i2) {
                m22279t();
                ((zzj) this.f28121g).m22035K(i2);
                return this;
            }

            /* renamed from: B */
            public final zza m22046B(long j2) {
                m22279t();
                ((zzj) this.f28121g).m22029C(j2);
                return this;
            }

            /* renamed from: C */
            public final zza m22047C(Iterable<? extends Long> iterable) {
                m22279t();
                ((zzj) this.f28121g).m22034H(iterable);
                return this;
            }

            /* renamed from: w */
            public final zza m22048w() {
                m22279t();
                ((zzj) this.f28121g).m22039Q();
                return this;
            }

            /* synthetic */ zza(C7510g0 c7510g0) {
                this();
            }
        }

        static {
            zzj zzjVar = new zzj();
            zzf = zzjVar;
            zzfd.m22263s(zzj.class, zzjVar);
        }

        private zzj() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final void m22029C(long j2) {
            m22038P();
            this.zze.mo21439G0(j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H */
        public final void m22034H(Iterable<? extends Long> iterable) {
            m22038P();
            zzdl.m22134c(iterable, this.zze);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: K */
        public final void m22035K(int i2) {
            this.zzc |= 1;
            this.zzd = i2;
        }

        /* renamed from: N */
        public static zza m22036N() {
            return zzf.m22273u();
        }

        /* renamed from: P */
        private final void m22038P() {
            if (this.zze.mo21145a()) {
                return;
            }
            this.zze = zzfd.m22260o(this.zze);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Q */
        public final void m22039Q() {
            this.zze = zzfd.m22266z();
        }

        /* renamed from: B */
        public final long m22040B(int i2) {
            return this.zze.mo21440e(i2);
        }

        /* renamed from: I */
        public final boolean m22041I() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: J */
        public final int m22042J() {
            return this.zzd;
        }

        /* renamed from: L */
        public final List<Long> m22043L() {
            return this.zze;
        }

        /* renamed from: M */
        public final int m22044M() {
            return this.zze.size();
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7510g0 c7510g0 = null;
            switch (C7510g0.f27728a[i2 - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza(c7510g0);
                case 3:
                    return zzfd.m22261q(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzgx<zzj> zzaVar = zzg;
                    if (zzaVar == null) {
                        synchronized (zzj.class) {
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

    /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
    public static final class zzk extends zzfd<zzk, zza> implements zzgq {
        private static final zzk zzj;
        private static volatile zzgx<zzk> zzk;
        private int zzc;
        private long zzd;
        private String zze = HttpUrl.FRAGMENT_ENCODE_SET;
        private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
        private long zzg;
        private float zzh;
        private double zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
        public static final class zza extends zzfd.zzb<zzk, zza> implements zzgq {
            private zza() {
                super(zzk.zzj);
            }

            /* renamed from: A */
            public final zza m22076A(double d2) {
                m22279t();
                ((zzk) this.f28121g).m22049B(d2);
                return this;
            }

            /* renamed from: B */
            public final zza m22077B(long j2) {
                m22279t();
                ((zzk) this.f28121g).m22050C(j2);
                return this;
            }

            /* renamed from: C */
            public final zza m22078C(String str) {
                m22279t();
                ((zzk) this.f28121g).m22055H(str);
                return this;
            }

            /* renamed from: D */
            public final zza m22079D() {
                m22279t();
                ((zzk) this.f28121g).m22065b0();
                return this;
            }

            /* renamed from: E */
            public final zza m22080E(long j2) {
                m22279t();
                ((zzk) this.f28121g).m22056K(j2);
                return this;
            }

            /* renamed from: F */
            public final zza m22081F(String str) {
                m22279t();
                ((zzk) this.f28121g).m22060O(str);
                return this;
            }

            /* renamed from: G */
            public final zza m22082G() {
                m22279t();
                ((zzk) this.f28121g).m22066c0();
                return this;
            }

            /* renamed from: w */
            public final zza m22083w() {
                m22279t();
                ((zzk) this.f28121g).m22064a0();
                return this;
            }

            /* synthetic */ zza(C7510g0 c7510g0) {
                this();
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzj = zzkVar;
            zzfd.m22263s(zzk.class, zzkVar);
        }

        private zzk() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B */
        public final void m22049B(double d2) {
            this.zzc |= 32;
            this.zzi = d2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public final void m22050C(long j2) {
            this.zzc |= 1;
            this.zzd = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H */
        public final void m22055H(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: K */
        public final void m22056K(long j2) {
            this.zzc |= 8;
            this.zzg = j2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: O */
        public final void m22060O(String str) {
            str.getClass();
            this.zzc |= 4;
            this.zzf = str;
        }

        /* renamed from: X */
        public static zza m22062X() {
            return zzj.m22273u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a0 */
        public final void m22064a0() {
            this.zzc &= -5;
            this.zzf = zzj.zzf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b0 */
        public final void m22065b0() {
            this.zzc &= -9;
            this.zzg = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c0 */
        public final void m22066c0() {
            this.zzc &= -33;
            this.zzi = 0.0d;
        }

        /* renamed from: I */
        public final boolean m22067I() {
            return (this.zzc & 1) != 0;
        }

        /* renamed from: J */
        public final long m22068J() {
            return this.zzd;
        }

        /* renamed from: P */
        public final String m22069P() {
            return this.zze;
        }

        /* renamed from: R */
        public final boolean m22070R() {
            return (this.zzc & 4) != 0;
        }

        /* renamed from: S */
        public final String m22071S() {
            return this.zzf;
        }

        /* renamed from: T */
        public final boolean m22072T() {
            return (this.zzc & 8) != 0;
        }

        /* renamed from: U */
        public final long m22073U() {
            return this.zzg;
        }

        /* renamed from: V */
        public final boolean m22074V() {
            return (this.zzc & 32) != 0;
        }

        /* renamed from: W */
        public final double m22075W() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.measurement.zzfd
        /* renamed from: p */
        protected final Object mo21510p(int i2, Object obj, Object obj2) {
            C7510g0 c7510g0 = null;
            switch (C7510g0.f27728a[i2 - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza(c7510g0);
                case 3:
                    return zzfd.m22261q(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\u0001\u0004\u0006\u0000\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    zzgx<zzk> zzaVar = zzk;
                    if (zzaVar == null) {
                        synchronized (zzk.class) {
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
}

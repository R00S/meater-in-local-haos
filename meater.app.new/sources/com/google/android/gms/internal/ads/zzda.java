package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.zzbi;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes2.dex */
public class zzda {

    /* renamed from: a */
    private static final ConditionVariable f25409a = new ConditionVariable();

    /* renamed from: b */
    protected static volatile zzwo f25410b = null;

    /* renamed from: c */
    private static volatile Random f25411c = null;

    /* renamed from: d */
    private zzdy f25412d;

    /* renamed from: e */
    protected volatile Boolean f25413e;

    public zzda(zzdy zzdyVar) {
        this.f25412d = zzdyVar;
        zzdyVar.m19908r().execute(new RunnableC6498ar(this));
    }

    /* renamed from: d */
    public static int m19123d() {
        try {
            return Build.VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : m19124e().nextInt();
        } catch (RuntimeException unused) {
            return m19124e().nextInt();
        }
    }

    /* renamed from: e */
    private static Random m19124e() {
        if (f25411c == null) {
            synchronized (zzda.class) {
                if (f25411c == null) {
                    f25411c = new Random();
                }
            }
        }
        return f25411c;
    }

    /* renamed from: b */
    public final void m19126b(int i2, int i3, long j2) {
        m19127c(i2, i3, j2, null);
    }

    /* renamed from: c */
    public final void m19127c(int i2, int i3, long j2, Exception exc) {
        try {
            f25409a.block();
            if (!this.f25413e.booleanValue() || f25410b == null) {
                return;
            }
            zzbi.zza.C11477zza c11477zzaM17727u = zzbi.zza.m17720F().m17728v(this.f25412d.f26008b.getPackageName()).m17727u(j2);
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                zzdmb.m19579a(exc, new PrintWriter(stringWriter));
                c11477zzaM17727u.m17729w(stringWriter.toString()).m17726A(exc.getClass().getName());
            }
            zzws zzwsVarM20700a = f25410b.m20700a(((zzbi.zza) ((zzdob) c11477zzaM17727u.mo19736p0())).mo19587g());
            zzwsVarM20700a.m20702b(i2);
            if (i3 != -1) {
                zzwsVarM20700a.m20701a(i3);
            }
            zzwsVarM20700a.m20703c();
        } catch (Exception unused) {
        }
    }
}

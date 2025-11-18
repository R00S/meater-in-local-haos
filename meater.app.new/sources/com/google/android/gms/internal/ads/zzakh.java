package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Executor;

@zzard
/* loaded from: classes2.dex */
public final class zzakh {

    /* renamed from: a */
    private final Object f22080a;

    /* renamed from: b */
    private final Context f22081b;

    /* renamed from: c */
    private final String f22082c;

    /* renamed from: d */
    private final zzbai f22083d;

    /* renamed from: e */
    private zzayp<zzajw> f22084e;

    /* renamed from: f */
    private zzayp<zzajw> f22085f;

    /* renamed from: g */
    private zzala f22086g;

    /* renamed from: h */
    private int f22087h;

    public zzakh(Context context, zzbai zzbaiVar, String str) {
        this.f22080a = new Object();
        this.f22087h = 1;
        this.f22082c = str;
        this.f22081b = context.getApplicationContext();
        this.f22083d = zzbaiVar;
        this.f22084e = new zzakv();
        this.f22085f = new zzakv();
    }

    /* renamed from: c */
    protected final zzala m16637c(final zzdh zzdhVar) {
        final zzala zzalaVar = new zzala(this.f22085f);
        zzbbm.f22757a.execute(new Runnable(this, zzdhVar, zzalaVar) { // from class: com.google.android.gms.internal.ads.i1

            /* renamed from: f */
            private final zzakh f19254f;

            /* renamed from: g */
            private final zzdh f19255g;

            /* renamed from: h */
            private final zzala f19256h;

            {
                this.f19254f = this;
                this.f19255g = zzdhVar;
                this.f19256h = zzalaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19254f.m16640g(this.f19255g, this.f19256h);
            }
        });
        zzalaVar.m17390d(new C7138s1(this, zzalaVar), new C7175t1(this, zzalaVar));
        return zzalaVar;
    }

    /* renamed from: e */
    final /* synthetic */ void m16638e(zzajw zzajwVar) {
        if (zzajwVar.mo16605l()) {
            this.f22087h = 1;
        }
    }

    /* renamed from: f */
    final /* synthetic */ void m16639f(zzala zzalaVar, zzajw zzajwVar) {
        synchronized (this.f22080a) {
            if (zzalaVar.m17388a() != -1 && zzalaVar.m17388a() != 1) {
                zzalaVar.m17389b();
                Executor executor = zzbbm.f22757a;
                zzajwVar.getClass();
                executor.execute(RunnableC6953n1.m15591a(zzajwVar));
                zzawz.m17082m("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }

    /* renamed from: g */
    final /* synthetic */ void m16640g(zzdh zzdhVar, final zzala zzalaVar) {
        try {
            Context context = this.f22081b;
            zzbai zzbaiVar = this.f22083d;
            final zzajw zzajjVar = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21689Q0)).booleanValue() ? new zzajj(context, zzbaiVar) : new zzajy(context, zzbaiVar, zzdhVar, null);
            zzajjVar.mo16607q(new zzajx(this, zzalaVar, zzajjVar) { // from class: com.google.android.gms.internal.ads.l1

                /* renamed from: a */
                private final zzakh f19735a;

                /* renamed from: b */
                private final zzala f19736b;

                /* renamed from: c */
                private final zzajw f19737c;

                {
                    this.f19735a = this;
                    this.f19736b = zzalaVar;
                    this.f19737c = zzajjVar;
                }

                @Override // com.google.android.gms.internal.ads.zzajx
                /* renamed from: a */
                public final void mo15503a() {
                    final zzakh zzakhVar = this.f19735a;
                    final zzala zzalaVar2 = this.f19736b;
                    final zzajw zzajwVar = this.f19737c;
                    zzaxi.f22654a.postDelayed(new Runnable(zzakhVar, zzalaVar2, zzajwVar) { // from class: com.google.android.gms.internal.ads.m1

                        /* renamed from: f */
                        private final zzakh f19856f;

                        /* renamed from: g */
                        private final zzala f19857g;

                        /* renamed from: h */
                        private final zzajw f19858h;

                        {
                            this.f19856f = zzakhVar;
                            this.f19857g = zzalaVar2;
                            this.f19858h = zzajwVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f19856f.m16639f(this.f19857g, this.f19858h);
                        }
                    }, C7212u1.f20603b);
                }
            });
            zzajjVar.mo16627f("/jsLoaded", new C6990o1(this, zzalaVar, zzajjVar));
            zzazk zzazkVar = new zzazk();
            C7027p1 c7027p1 = new C7027p1(this, zzdhVar, zzajjVar, zzazkVar);
            zzazkVar.m17281b(c7027p1);
            zzajjVar.mo16627f("/requestReload", c7027p1);
            if (this.f22082c.endsWith(".js")) {
                zzajjVar.mo16606o0(this.f22082c);
            } else if (this.f22082c.startsWith("<html>")) {
                zzajjVar.mo16609u0(this.f22082c);
            } else {
                zzajjVar.mo16604T(this.f22082c);
            }
            zzaxi.f22654a.postDelayed(new RunnableC7064q1(this, zzalaVar, zzajjVar), C7212u1.f20602a);
        } catch (Throwable th) {
            zzbad.m17347c("Error creating webview.", th);
            zzk.zzlk().m17052e(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzalaVar.m17389b();
        }
    }

    /* renamed from: h */
    public final zzakw m16641h(zzdh zzdhVar) {
        synchronized (this.f22080a) {
            synchronized (this.f22080a) {
                if (this.f22086g != null && this.f22087h == 0) {
                    if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21802i)).booleanValue()) {
                        this.f22086g.m17390d(new zzbbv(this) { // from class: com.google.android.gms.internal.ads.j1

                            /* renamed from: a */
                            private final zzakh f19422a;

                            {
                                this.f19422a = this;
                            }

                            @Override // com.google.android.gms.internal.ads.zzbbv
                            /* renamed from: a */
                            public final void mo14740a(Object obj) {
                                this.f19422a.m16638e((zzajw) obj);
                            }
                        }, C6842k1.f19513a);
                    }
                }
            }
            zzala zzalaVar = this.f22086g;
            if (zzalaVar != null && zzalaVar.m17388a() != -1) {
                int i2 = this.f22087h;
                if (i2 == 0) {
                    return this.f22086g.m16649g();
                }
                if (i2 == 1) {
                    this.f22087h = 2;
                    m16637c(null);
                    return this.f22086g.m16649g();
                }
                if (i2 == 2) {
                    return this.f22086g.m16649g();
                }
                return this.f22086g.m16649g();
            }
            this.f22087h = 2;
            zzala zzalaVarM16637c = m16637c(null);
            this.f22086g = zzalaVarM16637c;
            return zzalaVarM16637c.m16649g();
        }
    }

    public zzakh(Context context, zzbai zzbaiVar, String str, zzayp<zzajw> zzaypVar, zzayp<zzajw> zzaypVar2) {
        this(context, zzbaiVar, str);
        this.f22084e = zzaypVar;
        this.f22085f = zzaypVar2;
    }
}

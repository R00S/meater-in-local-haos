package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.AbstractC6263f;
import com.google.android.datatransport.runtime.backends.AbstractC6264g;
import com.google.android.datatransport.runtime.backends.InterfaceC6262e;
import com.google.android.datatransport.runtime.backends.InterfaceC6270m;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6296a;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import p241e.p254e.p256b.p257a.C8785b;
import p241e.p254e.p256b.p257a.p258i.AbstractC8867j;
import p241e.p254e.p256b.p257a.p258i.AbstractC8874q;
import p241e.p254e.p256b.p257a.p258i.C8866i;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.AbstractC8839q0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8823i0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8825j0;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8854a;
import p241e.p254e.p256b.p257a.p258i.p266y.p267a.C8885a;
import p241e.p254e.p256b.p257a.p258i.p266y.p267a.C8887c;
import p241e.p254e.p256b.p257a.p258i.p268z.C8891a;

/* compiled from: Uploader.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.u */
/* loaded from: classes2.dex */
public class C6291u {

    /* renamed from: a */
    private final Context f16839a;

    /* renamed from: b */
    private final InterfaceC6262e f16840b;

    /* renamed from: c */
    private final InterfaceC8825j0 f16841c;

    /* renamed from: d */
    private final InterfaceC6295y f16842d;

    /* renamed from: e */
    private final Executor f16843e;

    /* renamed from: f */
    private final InterfaceC6296a f16844f;

    /* renamed from: g */
    private final InterfaceC8854a f16845g;

    /* renamed from: h */
    private final InterfaceC8854a f16846h;

    /* renamed from: i */
    private final InterfaceC8823i0 f16847i;

    @Inject
    public C6291u(Context context, InterfaceC6262e interfaceC6262e, InterfaceC8825j0 interfaceC8825j0, InterfaceC6295y interfaceC6295y, Executor executor, InterfaceC6296a interfaceC6296a, InterfaceC8854a interfaceC8854a, InterfaceC8854a interfaceC8854a2, InterfaceC8823i0 interfaceC8823i0) {
        this.f16839a = context;
        this.f16840b = interfaceC6262e;
        this.f16841c = interfaceC8825j0;
        this.f16842d = interfaceC6295y;
        this.f16843e = executor;
        this.f16844f = interfaceC6296a;
        this.f16845g = interfaceC8854a;
        this.f16846h = interfaceC8854a2;
        this.f16847i = interfaceC8823i0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m13577d(AbstractC8874q abstractC8874q) {
        return Boolean.valueOf(this.f16841c.mo27999b1(abstractC8874q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Iterable m13578f(AbstractC8874q abstractC8874q) {
        return this.f16841c.mo27994G(abstractC8874q);
    }

    /* renamed from: g */
    private /* synthetic */ Object m13568g(Iterable iterable, AbstractC8874q abstractC8874q, long j2) {
        this.f16841c.mo28000e1(iterable);
        this.f16841c.mo27995O(abstractC8874q, this.f16845g.mo28110a() + j2);
        return null;
    }

    /* renamed from: i */
    private /* synthetic */ Object m13569i(Iterable iterable) {
        this.f16841c.mo28002q(iterable);
        return null;
    }

    /* renamed from: k */
    private /* synthetic */ Object m13570k() {
        this.f16847i.mo27991a();
        return null;
    }

    /* renamed from: m */
    private /* synthetic */ Object m13571m(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f16847i.mo27993d(((Integer) r0.getValue()).intValue(), C8887c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* renamed from: o */
    private /* synthetic */ Object m13572o(AbstractC8874q abstractC8874q, long j2) {
        this.f16841c.mo27995O(abstractC8874q, this.f16845g.mo28110a() + j2);
        return null;
    }

    /* renamed from: q */
    private /* synthetic */ Object m13573q(AbstractC8874q abstractC8874q, int i2) {
        this.f16842d.mo13540a(abstractC8874q, i2 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m13585t(final AbstractC8874q abstractC8874q, final int i2, Runnable runnable) {
        try {
            try {
                InterfaceC6296a interfaceC6296a = this.f16844f;
                final InterfaceC8825j0 interfaceC8825j0 = this.f16841c;
                interfaceC8825j0.getClass();
                interfaceC6296a.mo13599b(new InterfaceC6296a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b
                    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6296a.a
                    public final Object execute() {
                        return Integer.valueOf(interfaceC8825j0.mo28001o());
                    }
                });
                if (m13576b()) {
                    m13586u(abstractC8874q, i2);
                } else {
                    this.f16844f.mo13599b(new InterfaceC6296a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.k
                        @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6296a.a
                        public final Object execute() {
                            this.f16810a.m13584r(abstractC8874q, i2);
                            return null;
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                this.f16842d.mo13540a(abstractC8874q, i2 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: a */
    public AbstractC8867j m13575a(InterfaceC6270m interfaceC6270m) {
        InterfaceC6296a interfaceC6296a = this.f16844f;
        final InterfaceC8823i0 interfaceC8823i0 = this.f16847i;
        interfaceC8823i0.getClass();
        return interfaceC6270m.mo13414b(AbstractC8867j.m28150a().mo28107i(this.f16845g.mo28110a()).mo28109k(this.f16846h.mo28110a()).mo28108j("GDT_CLIENT_METRICS").mo28106h(new C8866i(C8785b.m27945b("proto"), ((C8885a) interfaceC6296a.mo13599b(new InterfaceC6296a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.o
            @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6296a.a
            public final Object execute() {
                return interfaceC8823i0.mo27992c();
            }
        })).m28195f())).mo28102d());
    }

    /* renamed from: b */
    boolean m13576b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f16839a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: h */
    public /* synthetic */ Object m13579h(Iterable iterable, AbstractC8874q abstractC8874q, long j2) {
        m13568g(iterable, abstractC8874q, j2);
        return null;
    }

    /* renamed from: j */
    public /* synthetic */ Object m13580j(Iterable iterable) {
        m13569i(iterable);
        return null;
    }

    /* renamed from: l */
    public /* synthetic */ Object m13581l() {
        m13570k();
        return null;
    }

    /* renamed from: n */
    public /* synthetic */ Object m13582n(Map map) {
        m13571m(map);
        return null;
    }

    /* renamed from: p */
    public /* synthetic */ Object m13583p(AbstractC8874q abstractC8874q, long j2) {
        m13572o(abstractC8874q, j2);
        return null;
    }

    /* renamed from: r */
    public /* synthetic */ Object m13584r(AbstractC8874q abstractC8874q, int i2) {
        m13573q(abstractC8874q, i2);
        return null;
    }

    /* renamed from: u */
    public AbstractC6264g m13586u(final AbstractC8874q abstractC8874q, int i2) {
        AbstractC6264g abstractC6264gMo13413a;
        InterfaceC6270m interfaceC6270m = this.f16840b.get(abstractC8874q.mo28134b());
        long jMax = 0;
        AbstractC6264g abstractC6264gM13523e = AbstractC6264g.m13523e(0L);
        while (true) {
            final long j2 = jMax;
            while (((Boolean) this.f16844f.mo13599b(new InterfaceC6296a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.e
                @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6296a.a
                public final Object execute() {
                    return this.f16795a.m13577d(abstractC8874q);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f16844f.mo13599b(new InterfaceC6296a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
                    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6296a.a
                    public final Object execute() {
                        return this.f16799a.m13578f(abstractC8874q);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return abstractC6264gM13523e;
                }
                if (interfaceC6270m == null) {
                    C8891a.m28230b("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC8874q);
                    abstractC6264gMo13413a = AbstractC6264g.m13521a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC8839q0) it.next()).mo27988b());
                    }
                    if (abstractC8874q.m28170e()) {
                        arrayList.add(m13575a(interfaceC6270m));
                    }
                    abstractC6264gMo13413a = interfaceC6270m.mo13413a(AbstractC6263f.m13520a().mo13512b(arrayList).mo13513c(abstractC8874q.mo28135c()).mo13511a());
                }
                abstractC6264gM13523e = abstractC6264gMo13413a;
                if (abstractC6264gM13523e.mo13515c() == AbstractC6264g.a.TRANSIENT_ERROR) {
                    this.f16844f.mo13599b(new InterfaceC6296a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
                        @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6296a.a
                        public final Object execute() {
                            this.f16801a.m13579h(iterable, abstractC8874q, j2);
                            return null;
                        }
                    });
                    this.f16842d.mo13541b(abstractC8874q, i2 + 1, true);
                    return abstractC6264gM13523e;
                }
                this.f16844f.mo13599b(new InterfaceC6296a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.j
                    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6296a.a
                    public final Object execute() {
                        this.f16808a.m13580j(iterable);
                        return null;
                    }
                });
                if (abstractC6264gM13523e.mo13515c() == AbstractC6264g.a.OK) {
                    jMax = Math.max(j2, abstractC6264gM13523e.mo13514b());
                    if (abstractC8874q.m28170e()) {
                        this.f16844f.mo13599b(new InterfaceC6296a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.l
                            @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6296a.a
                            public final Object execute() {
                                this.f16813a.m13581l();
                                return null;
                            }
                        });
                    }
                } else if (abstractC6264gM13523e.mo13515c() == AbstractC6264g.a.INVALID_PAYLOAD) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strMo28100j = ((AbstractC8839q0) it2.next()).mo27988b().mo28100j();
                        if (map.containsKey(strMo28100j)) {
                            map.put(strMo28100j, Integer.valueOf(((Integer) map.get(strMo28100j)).intValue() + 1));
                        } else {
                            map.put(strMo28100j, 1);
                        }
                    }
                    this.f16844f.mo13599b(new InterfaceC6296a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
                        @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6296a.a
                        public final Object execute() {
                            this.f16797a.m13582n(map);
                            return null;
                        }
                    });
                }
            }
            this.f16844f.mo13599b(new InterfaceC6296a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
                @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6296a.a
                public final Object execute() {
                    this.f16805a.m13583p(abstractC8874q, j2);
                    return null;
                }
            });
            return abstractC6264gM13523e;
        }
    }

    /* renamed from: v */
    public void m13587v(final AbstractC8874q abstractC8874q, final int i2, final Runnable runnable) {
        this.f16843e.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f16791f.m13585t(abstractC8874q, i2, runnable);
            }
        });
    }
}

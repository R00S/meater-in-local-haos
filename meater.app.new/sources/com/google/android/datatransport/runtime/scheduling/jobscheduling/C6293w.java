package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.InterfaceC6296a;
import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import p241e.p254e.p256b.p257a.p258i.AbstractC8874q;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8825j0;

/* compiled from: WorkInitializer.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.w */
/* loaded from: classes2.dex */
public class C6293w {

    /* renamed from: a */
    private final Executor f16857a;

    /* renamed from: b */
    private final InterfaceC8825j0 f16858b;

    /* renamed from: c */
    private final InterfaceC6295y f16859c;

    /* renamed from: d */
    private final InterfaceC6296a f16860d;

    @Inject
    C6293w(Executor executor, InterfaceC8825j0 interfaceC8825j0, InterfaceC6295y interfaceC6295y, InterfaceC6296a interfaceC6296a) {
        this.f16857a = executor;
        this.f16858b = interfaceC8825j0;
        this.f16859c = interfaceC6295y;
        this.f16860d = interfaceC6296a;
    }

    /* renamed from: b */
    private /* synthetic */ Object m13591b() {
        Iterator<AbstractC8874q> it = this.f16858b.mo27997U().iterator();
        while (it.hasNext()) {
            this.f16859c.mo13540a(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m13595e() {
        this.f16860d.mo13599b(new InterfaceC6296a.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.m
            @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6296a.a
            public final Object execute() {
                this.f16814a.m13594c();
                return null;
            }
        });
    }

    /* renamed from: a */
    public void m13593a() {
        this.f16857a.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f16815f.m13595e();
            }
        });
    }

    /* renamed from: c */
    public /* synthetic */ Object m13594c() {
        m13591b();
        return null;
    }
}

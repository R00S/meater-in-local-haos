package p241e.p254e.p256b.p257a.p258i.p260b0;

import com.google.android.datatransport.runtime.backends.InterfaceC6262e;
import com.google.android.datatransport.runtime.backends.InterfaceC6270m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6295y;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6296a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;
import p241e.p254e.p256b.p257a.InterfaceC8791h;
import p241e.p254e.p256b.p257a.p258i.AbstractC8867j;
import p241e.p254e.p256b.p257a.p258i.AbstractC8874q;
import p241e.p254e.p256b.p257a.p258i.C8878u;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8825j0;

/* compiled from: DefaultScheduler.java */
/* renamed from: e.e.b.a.i.b0.c */
/* loaded from: classes2.dex */
public class C8799c implements InterfaceC8801e {

    /* renamed from: a */
    private static final Logger f33448a = Logger.getLogger(C8878u.class.getName());

    /* renamed from: b */
    private final InterfaceC6295y f33449b;

    /* renamed from: c */
    private final Executor f33450c;

    /* renamed from: d */
    private final InterfaceC6262e f33451d;

    /* renamed from: e */
    private final InterfaceC8825j0 f33452e;

    /* renamed from: f */
    private final InterfaceC6296a f33453f;

    @Inject
    public C8799c(Executor executor, InterfaceC6262e interfaceC6262e, InterfaceC6295y interfaceC6295y, InterfaceC8825j0 interfaceC8825j0, InterfaceC6296a interfaceC6296a) {
        this.f33450c = executor;
        this.f33451d = interfaceC6262e;
        this.f33449b = interfaceC6295y;
        this.f33452e = interfaceC8825j0;
        this.f33453f = interfaceC6296a;
    }

    /* renamed from: b */
    private /* synthetic */ Object m27958b(AbstractC8874q abstractC8874q, AbstractC8867j abstractC8867j) {
        this.f33452e.mo27996S0(abstractC8874q, abstractC8867j);
        this.f33449b.mo13540a(abstractC8874q, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m27962e(final AbstractC8874q abstractC8874q, InterfaceC8791h interfaceC8791h, AbstractC8867j abstractC8867j) {
        try {
            InterfaceC6270m interfaceC6270m = this.f33451d.get(abstractC8874q.mo28134b());
            if (interfaceC6270m == null) {
                String str = String.format("Transport backend '%s' is not registered", abstractC8874q.mo28134b());
                f33448a.warning(str);
                interfaceC8791h.mo26010a(new IllegalArgumentException(str));
            } else {
                final AbstractC8867j abstractC8867jMo13414b = interfaceC6270m.mo13414b(abstractC8867j);
                this.f33453f.mo13599b(new InterfaceC6296a.a() { // from class: e.e.b.a.i.b0.b
                    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6296a.a
                    public final Object execute() {
                        this.f33445a.m27961c(abstractC8874q, abstractC8867jMo13414b);
                        return null;
                    }
                });
                interfaceC8791h.mo26010a(null);
            }
        } catch (Exception e2) {
            f33448a.warning("Error scheduling event " + e2.getMessage());
            interfaceC8791h.mo26010a(e2);
        }
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.InterfaceC8801e
    /* renamed from: a */
    public void mo27960a(final AbstractC8874q abstractC8874q, final AbstractC8867j abstractC8867j, final InterfaceC8791h interfaceC8791h) {
        this.f33450c.execute(new Runnable() { // from class: e.e.b.a.i.b0.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f33441f.m27962e(abstractC8874q, interfaceC8791h, abstractC8867j);
            }
        });
    }

    /* renamed from: c */
    public /* synthetic */ Object m27961c(AbstractC8874q abstractC8874q, AbstractC8867j abstractC8867j) {
        m27958b(abstractC8874q, abstractC8867j);
        return null;
    }
}

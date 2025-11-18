package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.AbstractC0807n;
import androidx.work.C0709h;
import androidx.work.C0817x;
import androidx.work.InterfaceC0710i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C0733b;
import androidx.work.impl.foreground.InterfaceC0732a;
import androidx.work.impl.p016n.InterfaceC0776q;
import androidx.work.impl.utils.p017o.C0798c;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import java.util.UUID;
import p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a;

/* compiled from: WorkForegroundUpdater.java */
/* renamed from: androidx.work.impl.utils.l */
/* loaded from: classes.dex */
public class C0793l implements InterfaceC0710i {

    /* renamed from: a */
    private static final String f4900a = AbstractC0807n.m5223f("WMFgUpdater");

    /* renamed from: b */
    private final InterfaceC0799a f4901b;

    /* renamed from: c */
    final InterfaceC0732a f4902c;

    /* renamed from: d */
    final InterfaceC0776q f4903d;

    /* compiled from: WorkForegroundUpdater.java */
    /* renamed from: androidx.work.impl.utils.l$a */
    class a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0798c f4904f;

        /* renamed from: g */
        final /* synthetic */ UUID f4905g;

        /* renamed from: h */
        final /* synthetic */ C0709h f4906h;

        /* renamed from: i */
        final /* synthetic */ Context f4907i;

        a(C0798c c0798c, UUID uuid, C0709h c0709h, Context context) {
            this.f4904f = c0798c;
            this.f4905g = uuid;
            this.f4906h = c0709h;
            this.f4907i = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f4904f.isCancelled()) {
                    String string = this.f4905g.toString();
                    C0817x.a aVarMo5109l = C0793l.this.f4903d.mo5109l(string);
                    if (aVarMo5109l == null || aVarMo5109l.m5237g()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C0793l.this.f4902c.mo4930a(string, this.f4906h);
                    this.f4907i.startService(C0733b.m4949a(this.f4907i, string, this.f4906h));
                }
                this.f4904f.mo5193q(null);
            } catch (Throwable th) {
                this.f4904f.mo5194r(th);
            }
        }
    }

    public C0793l(WorkDatabase workDatabase, InterfaceC0732a interfaceC0732a, InterfaceC0799a interfaceC0799a) {
        this.f4902c = interfaceC0732a;
        this.f4901b = interfaceC0799a;
        this.f4903d = workDatabase.mo4854j();
    }

    @Override // androidx.work.InterfaceC0710i
    /* renamed from: a */
    public InterfaceFutureC8955a<Void> mo4844a(Context context, UUID uuid, C0709h c0709h) {
        C0798c c0798cM5203u = C0798c.m5203u();
        this.f4901b.mo5205b(new a(c0798cM5203u, uuid, c0709h, context));
        return c0798cM5203u;
    }
}

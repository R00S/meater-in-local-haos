package kotlin;

import Ba.p;
import Xb.A0;
import Xb.C1841i;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.J;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ta.g;

/* compiled from: Effects.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\rR0\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LO/c0;", "LO/R0;", "Lta/g;", "parentCoroutineContext", "Lkotlin/Function2;", "LXb/I;", "Lta/d;", "Loa/F;", "", "task", "<init>", "(Lta/g;LBa/p;)V", "d", "()V", "c", "b", "B", "LBa/p;", "C", "LXb/I;", "scope", "LXb/v0;", "D", "LXb/v0;", "job", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1534c0 implements R0 {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final p<I, InterfaceC4588d<? super C4153F>, Object> task;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final I scope;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 job;

    /* JADX WARN: Multi-variable type inference failed */
    public C1534c0(g gVar, p<? super I, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar) {
        this.task = pVar;
        this.scope = J.a(gVar);
    }

    @Override // kotlin.R0
    public void b() {
        InterfaceC1867v0 interfaceC1867v0 = this.job;
        if (interfaceC1867v0 != null) {
            interfaceC1867v0.e(new C1540e0());
        }
        this.job = null;
    }

    @Override // kotlin.R0
    public void c() {
        InterfaceC1867v0 interfaceC1867v0 = this.job;
        if (interfaceC1867v0 != null) {
            interfaceC1867v0.e(new C1540e0());
        }
        this.job = null;
    }

    @Override // kotlin.R0
    public void d() {
        InterfaceC1867v0 interfaceC1867v0 = this.job;
        if (interfaceC1867v0 != null) {
            A0.e(interfaceC1867v0, "Old job was still running!", null, 2, null);
        }
        this.job = C1841i.d(this.scope, null, null, this.task, 3, null);
    }
}

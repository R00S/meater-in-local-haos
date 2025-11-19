package Xb;

import dc.C3102a;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LXb/E0;", "T", "LXb/Q;", "Lta/g;", "parentContext", "Lkotlin/Function2;", "LXb/I;", "Lta/d;", "", "block", "<init>", "(Lta/g;LBa/p;)V", "Loa/F;", "M0", "()V", "E", "Lta/d;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class E0<T> extends Q<T> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4588d<C4153F> continuation;

    public E0(ta.g gVar, Ba.p<? super I, ? super InterfaceC4588d<? super T>, ? extends Object> pVar) {
        super(gVar, false);
        this.continuation = C4696b.a(pVar, this, this);
    }

    @Override // Xb.C0
    protected void M0() throws Throwable {
        C3102a.c(this.continuation, this);
    }
}

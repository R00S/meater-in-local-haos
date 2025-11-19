package kotlin;

import Ba.l;
import Xb.C1849m;
import Xb.InterfaceC1847l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import oa.C4172q;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Latch.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LO/b0;", "", "<init>", "()V", "Loa/F;", "d", "f", "c", "(Lta/d;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "lock", "", "Lta/d;", "b", "Ljava/util/List;", "awaiters", "spareList", "", "Z", "_isOpen", "e", "()Z", "isOpen", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1531b0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<InterfaceC4588d<C4153F>> awaiters = new ArrayList();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private List<InterfaceC4588d<C4153F>> spareList = new ArrayList();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean _isOpen = true;

    /* compiled from: Latch.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.b0$a */
    static final class a extends AbstractC3864v implements l<Throwable, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC1847l<C4153F> f12814C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC1847l<? super C4153F> interfaceC1847l) {
            super(1);
            this.f12814C = interfaceC1847l;
        }

        public final void a(Throwable th) {
            Object obj = C1531b0.this.lock;
            C1531b0 c1531b0 = C1531b0.this;
            InterfaceC1847l<C4153F> interfaceC1847l = this.f12814C;
            synchronized (obj) {
                c1531b0.awaiters.remove(interfaceC1847l);
                C4153F c4153f = C4153F.f46609a;
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    public final Object c(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        if (e()) {
            return C4153F.f46609a;
        }
        C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
        c1849m.x();
        synchronized (this.lock) {
            this.awaiters.add(c1849m);
        }
        c1849m.R(new a(c1849m));
        Object objR = c1849m.r();
        if (objR == C4696b.e()) {
            h.c(interfaceC4588d);
        }
        return objR == C4696b.e() ? objR : C4153F.f46609a;
    }

    public final void d() {
        synchronized (this.lock) {
            this._isOpen = false;
            C4153F c4153f = C4153F.f46609a;
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.lock) {
            z10 = this._isOpen;
        }
        return z10;
    }

    public final void f() {
        synchronized (this.lock) {
            try {
                if (e()) {
                    return;
                }
                List<InterfaceC4588d<C4153F>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    InterfaceC4588d<C4153F> interfaceC4588d = list.get(i10);
                    C4172q.Companion companion = C4172q.INSTANCE;
                    interfaceC4588d.resumeWith(C4172q.a(C4153F.f46609a));
                }
                list.clear();
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

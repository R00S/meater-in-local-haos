package Yb;

import Ba.l;
import Xb.C1873y0;
import Xb.InterfaceC1828b0;
import Xb.InterfaceC1847l;
import Xb.J0;
import Xb.S;
import Xb.Z;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.g;

/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J%\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"LYb/d;", "LYb/e;", "LXb/S;", "Landroid/os/Handler;", "handler", "", "name", "", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "Lta/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Loa/F;", "S0", "(Lta/g;Ljava/lang/Runnable;)V", "v0", "(Lta/g;)Z", "p0", "", "timeMillis", "LXb/l;", "continuation", "i0", "(JLXb/l;)V", "LXb/b0;", "h0", "(JLjava/lang/Runnable;Lta/g;)LXb/b0;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "D", "Landroid/os/Handler;", "E", "Ljava/lang/String;", "F", "Z", "G", "LYb/d;", "U0", "()LYb/d;", "immediate", "kotlinx-coroutines-android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends e implements S {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final boolean invokeImmediately;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final d immediate;

    /* compiled from: Runnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1847l f19544B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ d f19545C;

        public a(InterfaceC1847l interfaceC1847l, d dVar) {
            this.f19544B = interfaceC1847l;
            this.f19545C = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f19544B.F(this.f19545C, C4153F.f46609a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends AbstractC3864v implements l<Throwable, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Runnable f19547C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f19547C = runnable;
        }

        public final void a(Throwable th) {
            d.this.handler.removeCallbacks(this.f19547C);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    private d(Handler handler, String str, boolean z10) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z10;
        this.immediate = z10 ? this : new d(handler, str, true);
    }

    private final void S0(g context, Runnable block) {
        C1873y0.d(context, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Z.b().p0(context, block);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(d dVar, Runnable runnable) {
        dVar.handler.removeCallbacks(runnable);
    }

    @Override // Yb.e
    /* renamed from: U0, reason: from getter and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public d M0() {
        return this.immediate;
    }

    public boolean equals(Object other) {
        if (other instanceof d) {
            d dVar = (d) other;
            if (dVar.handler == this.handler && dVar.invokeImmediately == this.invokeImmediately) {
                return true;
            }
        }
        return false;
    }

    @Override // Yb.e, Xb.S
    public InterfaceC1828b0 h0(long timeMillis, final Runnable block, g context) {
        if (this.handler.postDelayed(block, Ha.g.h(timeMillis, 4611686018427387903L))) {
            return new InterfaceC1828b0() { // from class: Yb.c
                @Override // Xb.InterfaceC1828b0
                public final void c() {
                    d.X0(this.f19538B, block);
                }
            };
        }
        S0(context, block);
        return J0.f19029B;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler) ^ (this.invokeImmediately ? 1231 : 1237);
    }

    @Override // Xb.S
    public void i0(long timeMillis, InterfaceC1847l<? super C4153F> continuation) {
        a aVar = new a(continuation, this);
        if (this.handler.postDelayed(aVar, Ha.g.h(timeMillis, 4611686018427387903L))) {
            continuation.R(new b(aVar));
        } else {
            S0(continuation.getContext(), aVar);
        }
    }

    @Override // Xb.E
    public void p0(g context, Runnable block) {
        if (this.handler.post(block)) {
            return;
        }
        S0(context, block);
    }

    @Override // Xb.G0, Xb.E
    public String toString() {
        String strL0 = L0();
        if (strL0 != null) {
            return strL0;
        }
        String string = this.name;
        if (string == null) {
            string = this.handler.toString();
        }
        if (!this.invokeImmediately) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // Xb.E
    public boolean v0(g context) {
        return (this.invokeImmediately && C3862t.b(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    public /* synthetic */ d(Handler handler, String str, int i10, C3854k c3854k) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public d(Handler handler, String str) {
        this(handler, str, false);
    }
}

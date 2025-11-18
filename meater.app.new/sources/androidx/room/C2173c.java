package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import u3.InterfaceC4669g;
import u3.InterfaceC4670h;

/* compiled from: AutoCloser.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u000eR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010,\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u001dR\u0014\u0010.\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010:\u001a\u0002048\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010@\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b;\u0010/\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010D\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b \u0010A\u001a\u0004\b;\u0010\u0016\"\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010FR\u0014\u0010H\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010(R\u0014\u0010J\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010(R\u0011\u0010L\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bI\u0010K¨\u0006M"}, d2 = {"Landroidx/room/c;", "", "", "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Ljava/util/concurrent/Executor;", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", "Lu3/h;", "delegateOpenHelper", "Loa/F;", "k", "(Lu3/h;)V", "V", "Lkotlin/Function1;", "Lu3/g;", "block", "g", "(LBa/l;)Ljava/lang/Object;", "j", "()Lu3/g;", "e", "()V", "d", "Ljava/lang/Runnable;", "onAutoClose", "m", "(Ljava/lang/Runnable;)V", "a", "Lu3/h;", "i", "()Lu3/h;", "n", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", "c", "Ljava/lang/Runnable;", "getOnAutoCloseCallback$room_runtime_release", "()Ljava/lang/Runnable;", "setOnAutoCloseCallback$room_runtime_release", "onAutoCloseCallback", "Ljava/lang/Object;", "lock", "J", "autoCloseTimeoutInMs", "f", "Ljava/util/concurrent/Executor;", "executor", "", "I", "getRefCount$room_runtime_release", "()I", "setRefCount$room_runtime_release", "(I)V", "refCount", "h", "getLastDecrementRefCountTimeStamp$room_runtime_release", "()J", "setLastDecrementRefCountTimeStamp$room_runtime_release", "(J)V", "lastDecrementRefCountTimeStamp", "Lu3/g;", "setDelegateDatabase$room_runtime_release", "(Lu3/g;)V", "delegateDatabase", "", "Z", "manuallyClosed", "executeAutoCloser", "l", "autoCloser", "()Z", "isActive", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2173c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public InterfaceC4670h delegateOpenHelper;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Runnable onAutoCloseCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long autoCloseTimeoutInMs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Executor executor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int refCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long lastDecrementRefCountTimeStamp;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4669g delegateDatabase;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean manuallyClosed;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Runnable executeAutoCloser;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Runnable autoCloser;

    public C2173c(long j10, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        C3862t.g(autoCloseTimeUnit, "autoCloseTimeUnit");
        C3862t.g(autoCloseExecutor, "autoCloseExecutor");
        this.handler = new Handler(Looper.getMainLooper());
        this.lock = new Object();
        this.autoCloseTimeoutInMs = autoCloseTimeUnit.toMillis(j10);
        this.executor = autoCloseExecutor;
        this.lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
        this.executeAutoCloser = new Runnable() { // from class: androidx.room.a
            @Override // java.lang.Runnable
            public final void run() {
                C2173c.f(this.f29096B);
            }
        };
        this.autoCloser = new Runnable() { // from class: androidx.room.b
            @Override // java.lang.Runnable
            public final void run() {
                C2173c.c(this.f29097B);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C2173c this$0) {
        C4153F c4153f;
        C3862t.g(this$0, "this$0");
        synchronized (this$0.lock) {
            try {
                if (SystemClock.uptimeMillis() - this$0.lastDecrementRefCountTimeStamp < this$0.autoCloseTimeoutInMs) {
                    return;
                }
                if (this$0.refCount != 0) {
                    return;
                }
                Runnable runnable = this$0.onAutoCloseCallback;
                if (runnable != null) {
                    runnable.run();
                    c4153f = C4153F.f46609a;
                } else {
                    c4153f = null;
                }
                if (c4153f == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                InterfaceC4669g interfaceC4669g = this$0.delegateDatabase;
                if (interfaceC4669g != null && interfaceC4669g.isOpen()) {
                    interfaceC4669g.close();
                }
                this$0.delegateDatabase = null;
                C4153F c4153f2 = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C2173c this$0) {
        C3862t.g(this$0, "this$0");
        this$0.executor.execute(this$0.autoCloser);
    }

    public final void d() {
        synchronized (this.lock) {
            try {
                this.manuallyClosed = true;
                InterfaceC4669g interfaceC4669g = this.delegateDatabase;
                if (interfaceC4669g != null) {
                    interfaceC4669g.close();
                }
                this.delegateDatabase = null;
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.lock) {
            try {
                int i10 = this.refCount;
                if (i10 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i11 = i10 - 1;
                this.refCount = i11;
                if (i11 == 0) {
                    if (this.delegateDatabase == null) {
                        return;
                    } else {
                        this.handler.postDelayed(this.executeAutoCloser, this.autoCloseTimeoutInMs);
                    }
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <V> V g(Ba.l<? super InterfaceC4669g, ? extends V> block) {
        C3862t.g(block, "block");
        try {
            return block.invoke(j());
        } finally {
            e();
        }
    }

    /* renamed from: h, reason: from getter */
    public final InterfaceC4669g getDelegateDatabase() {
        return this.delegateDatabase;
    }

    public final InterfaceC4670h i() {
        InterfaceC4670h interfaceC4670h = this.delegateOpenHelper;
        if (interfaceC4670h != null) {
            return interfaceC4670h;
        }
        C3862t.u("delegateOpenHelper");
        return null;
    }

    public final InterfaceC4669g j() {
        synchronized (this.lock) {
            this.handler.removeCallbacks(this.executeAutoCloser);
            this.refCount++;
            if (this.manuallyClosed) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            InterfaceC4669g interfaceC4669g = this.delegateDatabase;
            if (interfaceC4669g != null && interfaceC4669g.isOpen()) {
                return interfaceC4669g;
            }
            InterfaceC4669g writableDatabase = i().getWritableDatabase();
            this.delegateDatabase = writableDatabase;
            return writableDatabase;
        }
    }

    public final void k(InterfaceC4670h delegateOpenHelper) {
        C3862t.g(delegateOpenHelper, "delegateOpenHelper");
        n(delegateOpenHelper);
    }

    public final boolean l() {
        return !this.manuallyClosed;
    }

    public final void m(Runnable onAutoClose) {
        C3862t.g(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    public final void n(InterfaceC4670h interfaceC4670h) {
        C3862t.g(interfaceC4670h, "<set-?>");
        this.delegateOpenHelper = interfaceC4670h;
    }
}

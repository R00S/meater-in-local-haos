package kotlinx.coroutines;

import kotlin.C9821b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.scheduling.Task;
import okhttp3.HttpUrl;

/* compiled from: DispatchedTask.kt */
@Metadata(m32266d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0002\b\u0014J\u001f\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u001b\u001a\u00020\fJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000eH ¢\u0006\u0002\b\u001dR\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m32267d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", HttpUrl.FRAGMENT_ENCODE_SET, "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "cancelCompletedResult", HttpUrl.FRAGMENT_ENCODE_SET, "takenState", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "cancelCompletedResult$kotlinx_coroutines_core", "getExceptionalResult", "state", "getExceptionalResult$kotlinx_coroutines_core", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "handleFatalException", "exception", "finallyException", "run", "takeState", "takeState$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.b1, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class DispatchedTask<T> extends Task {

    /* renamed from: h */
    public int f41578h;

    public DispatchedTask(int i2) {
        this.f41578h = i2;
    }

    /* renamed from: a */
    public void mo39114a(Object obj, Throwable th) {
    }

    /* renamed from: c */
    public abstract Continuation<T> mo39115c();

    /* renamed from: d */
    public Throwable mo39116d(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.f41577b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public <T> T mo39117f(Object obj) {
        return obj;
    }

    /* renamed from: i */
    public final void m39118i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C9821b.m32367a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C9801m.m32343c(th);
        C11017l0.m39620a(mo39115c().getF41861l(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: j */
    public abstract Object mo39119j();

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[Catch: all -> 0x00d9, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {all -> 0x00d9, blocks: (B:13:0x0019, B:15:0x0030, B:39:0x00a6, B:41:0x00ac, B:49:0x00cf, B:52:0x00d8, B:51:0x00d5, B:18:0x0036, B:20:0x0044, B:22:0x004c, B:25:0x0058, B:27:0x005e, B:29:0x006d, B:32:0x0072, B:33:0x0079, B:37:0x00a2, B:35:0x0087, B:36:0x0095), top: B:64:0x0019, inners: #3 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.DispatchedTask.run():void");
    }
}

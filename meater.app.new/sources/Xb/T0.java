package Xb;

import cc.C2361F;
import cc.C2366K;
import kotlin.Metadata;

/* compiled from: EventLoop.common.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00040\fj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0011"}, d2 = {"LXb/T0;", "", "<init>", "()V", "LXb/f0;", "a", "()LXb/f0;", "Loa/F;", "c", "eventLoop", "d", "(LXb/f0;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class T0 {

    /* renamed from: a, reason: collision with root package name */
    public static final T0 f19045a = new T0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final ThreadLocal<AbstractC1836f0> ref = C2366K.a(new C2361F("ThreadLocalEventLoop"));

    private T0() {
    }

    public final AbstractC1836f0 a() {
        return ref.get();
    }

    public final AbstractC1836f0 b() {
        ThreadLocal<AbstractC1836f0> threadLocal = ref;
        AbstractC1836f0 abstractC1836f0 = threadLocal.get();
        if (abstractC1836f0 != null) {
            return abstractC1836f0;
        }
        AbstractC1836f0 abstractC1836f0A = C1842i0.a();
        threadLocal.set(abstractC1836f0A);
        return abstractC1836f0A;
    }

    public final void c() {
        ref.set(null);
    }

    public final void d(AbstractC1836f0 eventLoop) {
        ref.set(eventLoop);
    }
}

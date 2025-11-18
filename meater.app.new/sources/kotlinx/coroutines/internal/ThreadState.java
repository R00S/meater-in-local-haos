package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.ThreadContextElement;
import okhttp3.HttpUrl;

/* compiled from: ThreadContext.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0013"}, m32267d2 = {"Lkotlinx/coroutines/internal/ThreadState;", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Lkotlin/coroutines/CoroutineContext;", "n", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/coroutines/CoroutineContext;I)V", "elements", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/ThreadContextElement;", "[Lkotlinx/coroutines/ThreadContextElement;", "i", "values", "[Ljava/lang/Object;", "append", HttpUrl.FRAGMENT_ENCODE_SET, "element", "value", "restore", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.l0, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class ThreadState {

    /* renamed from: a */
    public final CoroutineContext f41801a;

    /* renamed from: b */
    private final Object[] f41802b;

    /* renamed from: c */
    private final ThreadContextElement<Object>[] f41803c;

    /* renamed from: d */
    private int f41804d;

    public ThreadState(CoroutineContext coroutineContext, int i2) {
        this.f41801a = coroutineContext;
        this.f41802b = new Object[i2];
        this.f41803c = new ThreadContextElement[i2];
    }

    /* renamed from: a */
    public final void m39532a(ThreadContextElement<?> threadContextElement, Object obj) {
        Object[] objArr = this.f41802b;
        int i2 = this.f41804d;
        objArr[i2] = obj;
        ThreadContextElement<Object>[] threadContextElementArr = this.f41803c;
        this.f41804d = i2 + 1;
        threadContextElementArr[i2] = threadContextElement;
    }

    /* renamed from: b */
    public final void m39533b(CoroutineContext coroutineContext) {
        int length = this.f41803c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            ThreadContextElement<Object> threadContextElement = this.f41803c[length];
            C9801m.m32343c(threadContextElement);
            threadContextElement.mo39627z(coroutineContext, this.f41802b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }
}

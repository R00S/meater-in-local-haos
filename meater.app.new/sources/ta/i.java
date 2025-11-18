package ta;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4172q;
import ua.C4696b;
import ua.EnumC4695a;

/* compiled from: SafeContinuationJvm.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u000fB!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lta/i;", "T", "Lta/d;", "Lkotlin/coroutines/jvm/internal/e;", "delegate", "", "initialResult", "<init>", "(Lta/d;Ljava/lang/Object;)V", "(Lta/d;)V", "Loa/q;", "result", "Loa/F;", "resumeWith", "(Ljava/lang/Object;)V", "a", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "B", "Lta/d;", "Ljava/lang/Object;", "Lta/g;", "getContext", "()Lta/g;", "context", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "C", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i<T> implements InterfaceC4588d<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: C, reason: collision with root package name */
    private static final a f50001C = new a(null);

    /* renamed from: D, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<i<?>, Object> f50002D = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4588d<T> delegate;
    private volatile Object result;

    /* compiled from: SafeContinuationJvm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lta/i$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(InterfaceC4588d<? super T> delegate, Object obj) {
        C3862t.g(delegate, "delegate");
        this.delegate = delegate;
        this.result = obj;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        EnumC4695a enumC4695a = EnumC4695a.f50512C;
        if (obj == enumC4695a) {
            if (androidx.concurrent.futures.b.a(f50002D, this, enumC4695a, C4696b.e())) {
                return C4696b.e();
            }
            obj = this.result;
        }
        if (obj == EnumC4695a.f50513D) {
            return C4696b.e();
        }
        if (obj instanceof C4172q.Failure) {
            throw ((C4172q.Failure) obj).exception;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        InterfaceC4588d<T> interfaceC4588d = this.delegate;
        if (interfaceC4588d instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) interfaceC4588d;
        }
        return null;
    }

    @Override // ta.InterfaceC4588d
    public g getContext() {
        return this.delegate.getContext();
    }

    @Override // ta.InterfaceC4588d
    public void resumeWith(Object result) {
        while (true) {
            Object obj = this.result;
            EnumC4695a enumC4695a = EnumC4695a.f50512C;
            if (obj == enumC4695a) {
                if (androidx.concurrent.futures.b.a(f50002D, this, enumC4695a, result)) {
                    return;
                }
            } else {
                if (obj != C4696b.e()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.b.a(f50002D, this, C4696b.e(), EnumC4695a.f50513D)) {
                    this.delegate.resumeWith(result);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC4588d<? super T> delegate) {
        this(delegate, EnumC4695a.f50512C);
        C3862t.g(delegate, "delegate");
    }
}

package kotlin;

import Z.g;
import android.os.Looper;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4165j;
import oa.InterfaceC4164i;

/* compiled from: ActualAndroid.android.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"!\u0010 \u001a\u00020\u001a8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\"\u001a\u0010#\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\u0016\u0010\"*\f\b\u0000\u0010%\"\u00020$2\u00020$¨\u0006&"}, d2 = {"T", "value", "LO/l1;", "policy", "LZ/g;", "d", "(Ljava/lang/Object;LO/l1;)LZ/g;", "", "LO/m0;", "b", "(I)LO/m0;", "", "LO/n0;", "c", "(J)LO/n0;", "", "LO/l0;", "a", "(F)LO/l0;", "", "message", "", "e", "Loa/F;", "f", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "LO/g0;", "Loa/i;", "getDefaultMonotonicFrameClock", "()LO/g0;", "getDefaultMonotonicFrameClock$annotations", "()V", "DefaultMonotonicFrameClock", "J", "()J", "MainThreadId", "", "CheckResult", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1530b {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC4164i f12806a = C4165j.a(a.f12808B);

    /* renamed from: b, reason: collision with root package name */
    private static final long f12807b;

    /* compiled from: ActualAndroid.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO/g0;", "a", "()LO/g0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: O.b$a */
    static final class a extends AbstractC3864v implements Ba.a<InterfaceC1545g0> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f12808B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1545g0 invoke() {
            return Looper.getMainLooper() != null ? C1498F.f12603B : X0.f12760B;
        }
    }

    static {
        long id2;
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        f12807b = id2;
    }

    public static final InterfaceC1555l0 a(float f10) {
        return new C1571t0(f10);
    }

    public static final InterfaceC1557m0 b(int i10) {
        return new C1573u0(i10);
    }

    public static final InterfaceC1559n0 c(long j10) {
        return new C1575v0(j10);
    }

    public static final <T> g<T> d(T t10, l1<T> l1Var) {
        return new C1577w0(t10, l1Var);
    }

    public static final long e() {
        return f12807b;
    }

    public static final void f(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }
}

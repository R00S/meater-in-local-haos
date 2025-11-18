package kotlin.reflect.p371y.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ThrowingCaller.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/ThrowingCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "member", "getMember", "()Ljava/lang/Void;", "parameterTypes", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", HttpUrl.FRAGMENT_ENCODE_SET, "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.i0.j, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class ThrowingCaller implements Caller {

    /* renamed from: a */
    public static final ThrowingCaller f37430a = new ThrowingCaller();

    private ThrowingCaller() {
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    /* renamed from: a */
    public List<Type> mo32637a() {
        return C10817u.m38888j();
    }

    /* renamed from: b */
    public Void m32677b() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    public Object call(Object[] args) {
        C9801m.m32346f(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    public /* bridge */ /* synthetic */ Member getMember() {
        return (Member) m32677b();
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    public Type getReturnType() {
        Class cls = Void.TYPE;
        C9801m.m32345e(cls, "TYPE");
        return cls;
    }
}

package p241e.p254e.p256b.p257a.p258i.p259a0;

/* compiled from: Retries.java */
/* renamed from: e.e.b.a.i.a0.b */
/* loaded from: classes2.dex */
public final class C8794b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m27950a(int i2, TInput tinput, InterfaceC8793a<TInput, TResult, TException> interfaceC8793a, InterfaceC8795c<TInput, TResult> interfaceC8795c) throws Throwable {
        TResult tresultMo13396a;
        if (i2 < 1) {
            return interfaceC8793a.mo13396a(tinput);
        }
        do {
            tresultMo13396a = interfaceC8793a.mo13396a(tinput);
            tinput = interfaceC8795c.mo13395a(tinput, tresultMo13396a);
            if (tinput == null) {
                break;
            }
            i2--;
        } while (i2 >= 1);
        return tresultMo13396a;
    }
}

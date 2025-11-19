package R6;

/* compiled from: Retries.java */
/* loaded from: classes2.dex */
public final class b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i10, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) {
        TResult tresultApply;
        if (i10 < 1) {
            return aVar.apply(tinput);
        }
        do {
            tresultApply = aVar.apply(tinput);
            tinput = cVar.a(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return tresultApply;
    }
}

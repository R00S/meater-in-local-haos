package ka;

import ja.C3756a;
import kotlin.Metadata;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lka/a;", "", "", "message", "Loa/F;", "a", "(Ljava/lang/String;)V", "Lja/a;", "state", "b", "(Lja/a;)V", "errorMessage", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "c", "(Ljava/lang/String;Ljava/lang/Exception;)V", "uniflow-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: ka.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3813a {

    /* compiled from: Logger.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: ka.a$a, reason: collision with other inner class name */
    public static final class C0572a {
        public static /* synthetic */ void a(InterfaceC3813a interfaceC3813a, String str, Exception exc, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logError");
            }
            if ((i10 & 2) != 0) {
                exc = null;
            }
            interfaceC3813a.c(str, exc);
        }
    }

    void a(String message);

    void b(C3756a state);

    void c(String errorMessage, Exception error);
}

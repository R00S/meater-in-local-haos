package ka;

import ja.C3756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: UniFlowLogger.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lka/c;", "Lka/a;", "<init>", "()V", "", "message", "Loa/F;", "a", "(Ljava/lang/String;)V", "Lja/a;", "state", "b", "(Lja/a;)V", "errorMessage", "Ljava/lang/Exception;", "Lkotlin/Exception;", "error", "c", "(Ljava/lang/String;Ljava/lang/Exception;)V", "<set-?>", "Lka/a;", "getLogger", "()Lka/a;", "logger", "uniflow-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: ka.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3815c implements InterfaceC3813a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3815c f43834a = new C3815c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static InterfaceC3813a logger = new C3814b(null, false, 3, null);

    private C3815c() {
    }

    @Override // ka.InterfaceC3813a
    public void a(String message) {
        C3862t.g(message, "message");
        logger.a(message);
    }

    @Override // ka.InterfaceC3813a
    public void b(C3756a state) {
        C3862t.g(state, "state");
        logger.b(state);
    }

    @Override // ka.InterfaceC3813a
    public void c(String errorMessage, Exception error) {
        C3862t.g(errorMessage, "errorMessage");
        logger.c(errorMessage, error);
    }
}

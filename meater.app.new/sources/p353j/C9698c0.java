package p353j;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.C9801m;

/* compiled from: JvmOkio.kt */
/* renamed from: j.c0 */
/* loaded from: classes3.dex */
final class C9698c0 extends C9699d {

    /* renamed from: a */
    private final Socket f37033a;

    public C9698c0(Socket socket) {
        C9801m.m32346f(socket, "socket");
        this.f37033a = socket;
    }

    @Override // p353j.C9699d
    protected IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p353j.C9699d
    protected void timedOut() throws IOException {
        try {
            this.f37033a.close();
        } catch (AssertionError e2) {
            if (!C9718q.m32121e(e2)) {
                throw e2;
            }
            C9719r.f37071a.log(Level.WARNING, "Failed to close timed out socket " + this.f37033a, (Throwable) e2);
        } catch (Exception e3) {
            C9719r.f37071a.log(Level.WARNING, "Failed to close timed out socket " + this.f37033a, (Throwable) e3);
        }
    }
}

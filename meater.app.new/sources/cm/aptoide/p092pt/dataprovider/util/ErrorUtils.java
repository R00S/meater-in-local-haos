package cm.aptoide.p092pt.dataprovider.util;

import cm.aptoide.p092pt.dataprovider.exception.NoNetworkConnectionException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public class ErrorUtils {
    public static boolean isNoNetworkConnection(Throwable th) {
        return (th instanceof NoNetworkConnectionException) || (th.getCause() != null && (th.getCause() instanceof SocketTimeoutException)) || (th instanceof UnknownHostException) || (th instanceof ConnectException);
    }
}

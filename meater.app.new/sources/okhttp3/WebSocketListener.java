package okhttp3;

import cm.aptoide.p092pt.root.execution.Command;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import p353j.C9710i;

/* compiled from: WebSocketListener.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J)\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m32267d2 = {"Lokhttp3/WebSocketListener;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/WebSocket;", "webSocket", "Lokhttp3/Response;", "response", "Lkotlin/u;", "onOpen", "(Lokhttp3/WebSocket;Lokhttp3/Response;)V", HttpUrl.FRAGMENT_ENCODE_SET, Command.CommandHandler.TEXT, "onMessage", "(Lokhttp3/WebSocket;Ljava/lang/String;)V", "Lj/i;", "bytes", "(Lokhttp3/WebSocket;Lj/i;)V", HttpUrl.FRAGMENT_ENCODE_SET, "code", "reason", "onClosing", "(Lokhttp3/WebSocket;ILjava/lang/String;)V", "onClosed", HttpUrl.FRAGMENT_ENCODE_SET, "t", "onFailure", "(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int code, String reason) {
        C9801m.m32346f(webSocket, "webSocket");
        C9801m.m32346f(reason, "reason");
    }

    public void onClosing(WebSocket webSocket, int code, String reason) {
        C9801m.m32346f(webSocket, "webSocket");
        C9801m.m32346f(reason, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
        C9801m.m32346f(webSocket, "webSocket");
        C9801m.m32346f(t, "t");
    }

    public void onMessage(WebSocket webSocket, C9710i bytes) {
        C9801m.m32346f(webSocket, "webSocket");
        C9801m.m32346f(bytes, "bytes");
    }

    public void onMessage(WebSocket webSocket, String text) {
        C9801m.m32346f(webSocket, "webSocket");
        C9801m.m32346f(text, Command.CommandHandler.TEXT);
    }

    public void onOpen(WebSocket webSocket, Response response) {
        C9801m.m32346f(webSocket, "webSocket");
        C9801m.m32346f(response, "response");
    }
}

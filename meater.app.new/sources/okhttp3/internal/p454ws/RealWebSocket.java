package okhttp3.internal.p454ws;

import cm.aptoide.p092pt.database.room.RoomNotification;
import cm.aptoide.p092pt.root.execution.Command;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.collections.C10815t;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.p454ws.WebSocketReader;
import p353j.C9710i;
import p353j.InterfaceC9705g;
import p353j.InterfaceC9709h;

/* compiled from: RealWebSocket.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u0002:\n\u0083\u0001\u0082\u0001\u0084\u0001\u0085\u0001\u0086\u0001BC\u0012\u0006\u0010\u007f\u001a\u00020~\u0012\u0006\u0010W\u001a\u00020\u0010\u0012\u0006\u0010z\u001a\u00020y\u0012\u0006\u0010_\u001a\u00020^\u0012\u0006\u0010b\u001a\u00020\u0013\u0012\b\u0010T\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010w\u001a\u00020\u0013¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010!\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010&\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\r¢\u0006\u0004\b(\u0010\u000fJ\r\u0010)\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u001d\u0010.\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\r¢\u0006\u0004\b0\u0010\u000fJ\r\u00101\u001a\u00020\t¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\t¢\u0006\u0004\b3\u00102J\r\u00104\u001a\u00020\t¢\u0006\u0004\b4\u00102J\u0017\u00106\u001a\u00020\r2\u0006\u00105\u001a\u00020\"H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00106\u001a\u00020\r2\u0006\u00108\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u00109J\u0017\u0010;\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u0007H\u0016¢\u0006\u0004\b;\u00109J\u0017\u0010<\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u0007H\u0016¢\u0006\u0004\b<\u00109J\u001f\u0010?\u001a\u00020\r2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\"H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u00105\u001a\u00020\"H\u0016¢\u0006\u0004\b\u000b\u0010AJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010BJ\u0015\u0010C\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0007¢\u0006\u0004\bC\u0010BJ!\u0010D\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\bD\u0010EJ'\u0010D\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010\"2\u0006\u0010F\u001a\u00020\u0013¢\u0006\u0004\bD\u0010GJ\u000f\u0010I\u001a\u00020\u0004H\u0000¢\u0006\u0004\bH\u0010*J\u000f\u0010K\u001a\u00020\rH\u0000¢\u0006\u0004\bJ\u0010\u000fJ#\u0010O\u001a\u00020\r2\n\u0010N\u001a\u00060Lj\u0002`M2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bO\u0010PR\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00070Q8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010T\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010VR\u0016\u0010W\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010aR\u0016\u0010b\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010VR\u0016\u0010c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u00101\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010]R\u0016\u0010g\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010dR\u0018\u0010i\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u00104\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010]R\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u001c\u0010o\u001a\b\u0012\u0004\u0012\u00020n0Q8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010SR\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010]R\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010t\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010v\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010fR\u0016\u0010w\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010VR\u0016\u0010x\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010dR\u001c\u0010z\u001a\u00020y8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010f¨\u0006\u0087\u0001"}, m32267d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/ws/WebSocketExtensions;", HttpUrl.FRAGMENT_ENCODE_SET, "isValid", "(Lokhttp3/internal/ws/WebSocketExtensions;)Z", "Lj/i;", "data", HttpUrl.FRAGMENT_ENCODE_SET, "formatOpcode", "send", "(Lj/i;I)Z", "Lkotlin/u;", "runWriter", "()V", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", HttpUrl.FRAGMENT_ENCODE_SET, "queueSize", "()J", "cancel", "Lokhttp3/OkHttpClient;", "client", "connect", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Response;", "response", "Lokhttp3/internal/connection/Exchange;", "exchange", "checkUpgradeSuccess$okhttp", "(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)V", "checkUpgradeSuccess", HttpUrl.FRAGMENT_ENCODE_SET, "name", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "streams", "initReaderAndWriter", "(Ljava/lang/String;Lokhttp3/internal/ws/RealWebSocket$Streams;)V", "loopReader", "processNextFrame", "()Z", "timeout", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)V", "tearDown", "sentPingCount", "()I", "receivedPingCount", "receivedPongCount", Command.CommandHandler.TEXT, "onReadMessage", "(Ljava/lang/String;)V", "bytes", "(Lj/i;)V", "payload", "onReadPing", "onReadPong", "code", "reason", "onReadClose", "(ILjava/lang/String;)V", "(Ljava/lang/String;)Z", "(Lj/i;)Z", "pong", "close", "(ILjava/lang/String;)Z", "cancelAfterCloseMillis", "(ILjava/lang/String;J)Z", "writeOneFrame$okhttp", "writeOneFrame", "writePingFrame$okhttp", "writePingFrame", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failWebSocket", "(Ljava/lang/Exception;Lokhttp3/Response;)V", "Ljava/util/ArrayDeque;", "pongQueue", "Ljava/util/ArrayDeque;", "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", "J", "originalRequest", "Lokhttp3/Request;", "Lokhttp3/internal/concurrent/Task;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "receivedCloseCode", "I", "Ljava/util/Random;", "random", "Ljava/util/Random;", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "pingIntervalMillis", "failed", "Z", "receivedCloseReason", "Ljava/lang/String;", "awaitingPong", "Lokhttp3/internal/ws/WebSocketReader;", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "Lokhttp3/internal/ws/WebSocketWriter;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", HttpUrl.FRAGMENT_ENCODE_SET, "messageAndCloseQueue", "Lokhttp3/Call;", "call", "Lokhttp3/Call;", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", RoomNotification.KEY, "minimumDeflateSize", "enqueuedClose", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocketListener;", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "Companion", "Close", "Message", "Streams", "WriterTask", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private boolean awaitingPong;
    private Call call;
    private boolean enqueuedClose;
    private WebSocketExtensions extensions;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private String name;
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<C9710i> pongQueue;
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private TaskQueue taskQueue;
    private WebSocketWriter writer;
    private Task writerTask;
    private static final List<Protocol> ONLY_HTTP1 = C10815t.m38883e(Protocol.HTTP_1_1);

    /* compiled from: RealWebSocket.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m32267d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", HttpUrl.FRAGMENT_ENCODE_SET, "Lj/i;", "reason", "Lj/i;", "getReason", "()Lj/i;", HttpUrl.FRAGMENT_ENCODE_SET, "cancelAfterCloseMillis", "J", "getCancelAfterCloseMillis", "()J", HttpUrl.FRAGMENT_ENCODE_SET, "code", "I", "getCode", "()I", "<init>", "(ILj/i;J)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final C9710i reason;

        public Close(int i2, C9710i c9710i, long j2) {
            this.code = i2;
            this.reason = c9710i;
            this.cancelAfterCloseMillis = j2;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }

        public final int getCode() {
            return this.code;
        }

        public final C9710i getReason() {
            return this.reason;
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m32267d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "formatOpcode", "I", "getFormatOpcode", "()I", "Lj/i;", "data", "Lj/i;", "getData", "()Lj/i;", "<init>", "(ILj/i;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Message {
        private final C9710i data;
        private final int formatOpcode;

        public Message(int i2, C9710i c9710i) {
            C9801m.m32346f(c9710i, "data");
            this.formatOpcode = i2;
            this.data = c9710i;
        }

        public final C9710i getData() {
            return this.data;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m32267d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "Lj/h;", "source", "Lj/h;", "getSource", "()Lj/h;", HttpUrl.FRAGMENT_ENCODE_SET, "client", "Z", "getClient", "()Z", "Lj/g;", "sink", "Lj/g;", "getSink", "()Lj/g;", "<init>", "(ZLj/h;Lj/g;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final InterfaceC9705g sink;
        private final InterfaceC9709h source;

        public Streams(boolean z, InterfaceC9709h interfaceC9709h, InterfaceC9705g interfaceC9705g) {
            C9801m.m32346f(interfaceC9709h, "source");
            C9801m.m32346f(interfaceC9705g, "sink");
            this.client = z;
            this.source = interfaceC9709h;
            this.sink = interfaceC9705g;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final InterfaceC9705g getSink() {
            return this.sink;
        }

        public final InterfaceC9709h getSource() {
            return this.source;
        }
    }

    /* compiled from: RealWebSocket.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m32267d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", HttpUrl.FRAGMENT_ENCODE_SET, "runOnce", "()J", "<init>", "(Lokhttp3/internal/ws/RealWebSocket;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    private final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.name + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            try {
                return RealWebSocket.this.writeOneFrame$okhttp() ? 0L : -1L;
            } catch (IOException e2) {
                RealWebSocket.this.failWebSocket(e2, null);
                return -1L;
            }
        }
    }

    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j2, WebSocketExtensions webSocketExtensions, long j3) {
        C9801m.m32346f(taskRunner, "taskRunner");
        C9801m.m32346f(request, "originalRequest");
        C9801m.m32346f(webSocketListener, "listener");
        C9801m.m32346f(random, "random");
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random;
        this.pingIntervalMillis = j2;
        this.extensions = webSocketExtensions;
        this.minimumDeflateSize = j3;
        this.taskQueue = taskRunner.newQueue();
        this.pongQueue = new ArrayDeque<>();
        this.messageAndCloseQueue = new ArrayDeque<>();
        this.receivedCloseCode = -1;
        if (!C9801m.m32341a("GET", request.method())) {
            throw new IllegalArgumentException(("Request must be GET: " + request.method()).toString());
        }
        C9710i.a aVar = C9710i.f37052g;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        C10775u c10775u = C10775u.f41439a;
        this.key = C9710i.a.m32099f(aVar, bArr, 0, 0, 3, null).mo31977g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid(WebSocketExtensions webSocketExtensions) {
        if (webSocketExtensions.unknownValues || webSocketExtensions.clientMaxWindowBits != null) {
            return false;
        }
        Integer num = webSocketExtensions.serverMaxWindowBits;
        if (num == null) {
            return true;
        }
        int iIntValue = num.intValue();
        return 8 <= iIntValue && 15 >= iIntValue;
    }

    private final void runWriter() {
        if (!Util.assertionsEnabled || Thread.holdsLock(this)) {
            Task task = this.writerTask;
            if (task != null) {
                TaskQueue.schedule$default(this.taskQueue, task, 0L, 2, null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        C9801m.m32345e(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public final void awaitTermination(long timeout, TimeUnit timeUnit) throws InterruptedException {
        C9801m.m32346f(timeUnit, "timeUnit");
        this.taskQueue.idleLatch().await(timeout, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
        Call call = this.call;
        C9801m.m32343c(call);
        call.cancel();
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws IOException {
        C9801m.m32346f(response, "response");
        if (response.code() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
        String strHeader$default = Response.header$default(response, "Connection", null, 2, null);
        if (!C10546u.m37515q("Upgrade", strHeader$default, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strHeader$default + '\'');
        }
        String strHeader$default2 = Response.header$default(response, "Upgrade", null, 2, null);
        if (!C10546u.m37515q("websocket", strHeader$default2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strHeader$default2 + '\'');
        }
        String strHeader$default3 = Response.header$default(response, "Sec-WebSocket-Accept", null, 2, null);
        String strMo31977g = C9710i.f37052g.m32103d(this.key + WebSocketProtocol.ACCEPT_MAGIC).m32091N().mo31977g();
        if (!(!C9801m.m32341a(strMo31977g, strHeader$default3))) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strMo31977g + "' but was '" + strHeader$default3 + '\'');
    }

    @Override // okhttp3.WebSocket
    public boolean close(int code, String reason) {
        return close(code, reason, CANCEL_AFTER_CLOSE_MILLIS);
    }

    public final void connect(OkHttpClient client) {
        C9801m.m32346f(client, "client");
        if (this.originalRequest.header("Sec-WebSocket-Extensions") != null) {
            failWebSocket(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return;
        }
        OkHttpClient okHttpClientBuild = client.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request requestBuild = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").header("Sec-WebSocket-Extensions", "permessage-deflate").build();
        RealCall realCall = new RealCall(okHttpClientBuild, requestBuild, true);
        this.call = realCall;
        C9801m.m32343c(realCall);
        realCall.enqueue(new Callback() { // from class: okhttp3.internal.ws.RealWebSocket.connect.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e2) {
                C9801m.m32346f(call, "call");
                C9801m.m32346f(e2, "e");
                RealWebSocket.this.failWebSocket(e2, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                C9801m.m32346f(call, "call");
                C9801m.m32346f(response, "response");
                Exchange exchange = response.getExchange();
                try {
                    RealWebSocket.this.checkUpgradeSuccess$okhttp(response, exchange);
                    C9801m.m32343c(exchange);
                    Streams streamsNewWebSocketStreams = exchange.newWebSocketStreams();
                    WebSocketExtensions webSocketExtensions = WebSocketExtensions.INSTANCE.parse(response.headers());
                    RealWebSocket.this.extensions = webSocketExtensions;
                    if (!RealWebSocket.this.isValid(webSocketExtensions)) {
                        synchronized (RealWebSocket.this) {
                            RealWebSocket.this.messageAndCloseQueue.clear();
                            RealWebSocket.this.close(1010, "unexpected Sec-WebSocket-Extensions in response header");
                        }
                    }
                    try {
                        RealWebSocket.this.initReaderAndWriter(Util.okHttpName + " WebSocket " + requestBuild.url().redact(), streamsNewWebSocketStreams);
                        RealWebSocket.this.getListener().onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e2) {
                        RealWebSocket.this.failWebSocket(e2, null);
                    }
                } catch (IOException e3) {
                    if (exchange != null) {
                        exchange.webSocketUpgradeFailed();
                    }
                    RealWebSocket.this.failWebSocket(e3, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    public final void failWebSocket(Exception e2, Response response) {
        C9801m.m32346f(e2, "e");
        synchronized (this) {
            if (this.failed) {
                return;
            }
            this.failed = true;
            Streams streams = this.streams;
            this.streams = null;
            WebSocketReader webSocketReader = this.reader;
            this.reader = null;
            WebSocketWriter webSocketWriter = this.writer;
            this.writer = null;
            this.taskQueue.shutdown();
            C10775u c10775u = C10775u.f41439a;
            try {
                this.listener.onFailure(this, e2, response);
            } finally {
                if (streams != null) {
                    Util.closeQuietly(streams);
                }
                if (webSocketReader != null) {
                    Util.closeQuietly(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.closeQuietly(webSocketWriter);
                }
            }
        }
    }

    /* renamed from: getListener$okhttp, reason: from getter */
    public final WebSocketListener getListener() {
        return this.listener;
    }

    public final void initReaderAndWriter(final String name, final Streams streams) throws IOException {
        C9801m.m32346f(name, "name");
        C9801m.m32346f(streams, "streams");
        final WebSocketExtensions webSocketExtensions = this.extensions;
        C9801m.m32343c(webSocketExtensions);
        synchronized (this) {
            this.name = name;
            this.streams = streams;
            this.writer = new WebSocketWriter(streams.getClient(), streams.getSink(), this.random, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(streams.getClient()), this.minimumDeflateSize);
            this.writerTask = new WriterTask();
            long j2 = this.pingIntervalMillis;
            if (j2 != 0) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(j2);
                final String str = name + " ping";
                this.taskQueue.schedule(new Task(str) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$$inlined$synchronized$lambda$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long runOnce() {
                        this.writePingFrame$okhttp();
                        return nanos;
                    }
                }, nanos);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            C10775u c10775u = C10775u.f41439a;
        }
        this.reader = new WebSocketReader(streams.getClient(), streams.getSource(), this, webSocketExtensions.perMessageDeflate, webSocketExtensions.noContextTakeover(!streams.getClient()));
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            C9801m.m32343c(webSocketReader);
            webSocketReader.processNextFrame();
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int code, String reason) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        C9801m.m32346f(reason, "reason");
        boolean z = true;
        if (!(code != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.receivedCloseCode != -1) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("already closed".toString());
            }
            this.receivedCloseCode = code;
            this.receivedCloseReason = reason;
            streams = null;
            if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                Streams streams2 = this.streams;
                this.streams = null;
                webSocketReader = this.reader;
                this.reader = null;
                webSocketWriter = this.writer;
                this.writer = null;
                this.taskQueue.shutdown();
                streams = streams2;
            } else {
                webSocketReader = null;
                webSocketWriter = null;
            }
            C10775u c10775u = C10775u.f41439a;
        }
        try {
            this.listener.onClosing(this, code, reason);
            if (streams != null) {
                this.listener.onClosed(this, code, reason);
            }
        } finally {
            if (streams != null) {
                Util.closeQuietly(streams);
            }
            if (webSocketReader != null) {
                Util.closeQuietly(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.closeQuietly(webSocketWriter);
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(String text) throws IOException {
        C9801m.m32346f(text, Command.CommandHandler.TEXT);
        this.listener.onMessage(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(C9710i payload) {
        C9801m.m32346f(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            this.receivedPingCount++;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(C9710i payload) {
        C9801m.m32346f(payload, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public final synchronized boolean pong(C9710i payload) {
        C9801m.m32346f(payload, "payload");
        if (!this.failed && (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty())) {
            this.pongQueue.add(payload);
            runWriter();
            return true;
        }
        return false;
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            C9801m.m32343c(webSocketReader);
            webSocketReader.processNextFrame();
            return this.receivedCloseCode == -1;
        } catch (Exception e2) {
            failWebSocket(e2, null);
            return false;
        }
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
        return this.queueSize;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    @Override // okhttp3.WebSocket
    /* renamed from: request, reason: from getter */
    public Request getOriginalRequest() {
        return this.originalRequest;
    }

    @Override // okhttp3.WebSocket
    public boolean send(String text) {
        C9801m.m32346f(text, Command.CommandHandler.TEXT);
        return send(C9710i.f37052g.m32103d(text), 1);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final void tearDown() throws InterruptedException {
        this.taskQueue.shutdown();
        this.taskQueue.idleLatch().await(10L, TimeUnit.SECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ce  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, okhttp3.internal.ws.WebSocketWriter] */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.a0.d.f0] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, okhttp3.internal.ws.RealWebSocket$Streams] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, okhttp3.internal.ws.WebSocketReader] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, okhttp3.internal.ws.WebSocketWriter] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v16, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [j.i] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean writeOneFrame$okhttp() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p454ws.RealWebSocket.writeOneFrame$okhttp():boolean");
    }

    public final void writePingFrame$okhttp() {
        synchronized (this) {
            if (this.failed) {
                return;
            }
            WebSocketWriter webSocketWriter = this.writer;
            if (webSocketWriter != null) {
                int i2 = this.awaitingPong ? this.sentPingCount : -1;
                this.sentPingCount++;
                this.awaitingPong = true;
                C10775u c10775u = C10775u.f41439a;
                if (i2 == -1) {
                    try {
                        webSocketWriter.writePing(C9710i.f37051f);
                        return;
                    } catch (IOException e2) {
                        failWebSocket(e2, null);
                        return;
                    }
                }
                failWebSocket(new SocketTimeoutException("sent ping but didn't receive pong within " + this.pingIntervalMillis + "ms (after " + (i2 - 1) + " successful ping/pongs)"), null);
            }
        }
    }

    public final synchronized boolean close(int code, String reason, long cancelAfterCloseMillis) {
        WebSocketProtocol.INSTANCE.validateCloseCode(code);
        C9710i c9710iM32103d = null;
        if (reason != null) {
            c9710iM32103d = C9710i.f37052g.m32103d(reason);
            if (!(((long) c9710iM32103d.m32093P()) <= 123)) {
                throw new IllegalArgumentException(("reason.size() > 123: " + reason).toString());
            }
        }
        if (!this.failed && !this.enqueuedClose) {
            this.enqueuedClose = true;
            this.messageAndCloseQueue.add(new Close(code, c9710iM32103d, cancelAfterCloseMillis));
            runWriter();
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(C9710i bytes) throws IOException {
        C9801m.m32346f(bytes, "bytes");
        this.listener.onMessage(this, bytes);
    }

    @Override // okhttp3.WebSocket
    public boolean send(C9710i bytes) {
        C9801m.m32346f(bytes, "bytes");
        return send(bytes, 2);
    }

    private final synchronized boolean send(C9710i data, int formatOpcode) {
        if (!this.failed && !this.enqueuedClose) {
            if (this.queueSize + data.m32093P() > MAX_QUEUE_SIZE) {
                close(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, null);
                return false;
            }
            this.queueSize += data.m32093P();
            this.messageAndCloseQueue.add(new Message(formatOpcode, data));
            runWriter();
            return true;
        }
        return false;
    }
}

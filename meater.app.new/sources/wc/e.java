package wc;

import Cc.C0982e;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.O;
import oa.C4153F;
import okhttp3.internal.http2.ConnectionShutdownException;
import sc.AbstractC4529a;
import sc.C4531c;
import wc.g;

/* compiled from: Http2Connection.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\t\u0018\u0000 ¸\u00012\u00020\u0001:\b¹\u0001º\u0001»\u0001¼\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\"\u0010#J/\u0010'\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u001a¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010-\u001a\u00020)H\u0000¢\u0006\u0004\b.\u0010,J\u001f\u00100\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u001aH\u0000¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0012¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u00122\u0006\u0010-\u001a\u00020)¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0012H\u0016¢\u0006\u0004\b;\u00108J)\u0010?\u001a\u00020\u00122\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020)2\b\u0010>\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b?\u0010@J#\u0010D\u001a\u00020\u00122\b\b\u0002\u0010A\u001a\u00020\u000b2\b\b\u0002\u0010C\u001a\u00020BH\u0007¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u001a¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0012H\u0000¢\u0006\u0004\bI\u00108J\u0017\u0010J\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\bJ\u0010KJ%\u0010L\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\bL\u0010MJ-\u0010O\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010N\u001a\u00020\u000bH\u0000¢\u0006\u0004\bO\u0010PJ/\u0010S\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010R\u001a\u00020Q2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u000bH\u0000¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\bU\u0010,R\u001a\u0010Z\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010`\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R&\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010k\u001a\u00020g8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\b\\\u0010jR\"\u0010r\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010v\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bs\u0010m\u001a\u0004\bt\u0010o\"\u0004\bu\u0010qR\u0016\u0010x\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010WR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010yR\u0014\u0010}\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010~\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010|R\u0014\u0010\u007f\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010|R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0084\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010{R\u0018\u0010\u0086\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010{R\u0018\u0010\u0088\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010{R\u0018\u0010\u008a\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010{R\u0018\u0010\u008c\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010{R\u0018\u0010\u008e\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010{R\u001d\u0010\u0093\u0001\u001a\u00030\u008f\u00018\u0006¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0087\u0001\u0010\u0092\u0001R*\u0010\u0097\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0091\u0001\u001a\u0006\b\u0089\u0001\u0010\u0092\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R)\u0010\u009c\u0001\u001a\u00020\u001a2\u0007\u0010\u0098\u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0099\u0001\u0010{\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R(\u0010\u009e\u0001\u001a\u00020\u001a2\u0007\u0010\u0098\u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0004\b\u0016\u0010{\u001a\u0006\b\u009d\u0001\u0010\u009b\u0001R(\u0010 \u0001\u001a\u00020\u001a2\u0007\u0010\u0098\u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0004\bd\u0010{\u001a\u0006\b\u009f\u0001\u0010\u009b\u0001R)\u0010£\u0001\u001a\u00020\u001a2\u0007\u0010\u0098\u0001\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b¡\u0001\u0010{\u001a\u0006\b¢\u0001\u0010\u009b\u0001R\u001f\u0010¨\u0001\u001a\u00030¤\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bW\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R\u001d\u0010\u00ad\u0001\u001a\u00030©\u00018\u0006¢\u0006\u0010\n\u0006\b¢\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R!\u0010³\u0001\u001a\u00070®\u0001R\u00020\u00008\u0006¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u001e\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001¨\u0006½\u0001"}, d2 = {"Lwc/e;", "Ljava/io/Closeable;", "Lwc/e$a;", "builder", "<init>", "(Lwc/e$a;)V", "", "associatedStreamId", "", "Lwc/b;", "requestHeaders", "", "out", "Lwc/h;", "h0", "(ILjava/util/List;Z)Lwc/h;", "Ljava/io/IOException;", "e", "Loa/F;", "y", "(Ljava/io/IOException;)V", "id", "W", "(I)Lwc/h;", "streamId", "G0", "", "read", "X0", "(J)V", "i0", "(Ljava/util/List;Z)Lwc/h;", "outFinished", "alternating", "g1", "(IZLjava/util/List;)V", "LCc/e;", "buffer", "byteCount", "a1", "(IZLCc/e;J)V", "Lwc/a;", "errorCode", "n1", "(ILwc/a;)V", "statusCode", "k1", "unacknowledgedBytesRead", "q1", "(IJ)V", "reply", "payload1", "payload2", "h1", "(ZII)V", "flush", "()V", "P0", "(Lwc/a;)V", "close", "connectionCode", "streamCode", "cause", "x", "(Lwc/a;Lwc/a;Ljava/io/IOException;)V", "sendConnectionPreface", "Lsc/e;", "taskRunner", "S0", "(ZLsc/e;)V", "nowNs", "f0", "(J)Z", "L0", "C0", "(I)Z", "r0", "(ILjava/util/List;)V", "inFinished", "p0", "(ILjava/util/List;Z)V", "LCc/g;", "source", "o0", "(ILCc/g;IZ)V", "v0", "B", "Z", "z", "()Z", "client", "Lwc/e$c;", "C", "Lwc/e$c;", "L", "()Lwc/e$c;", "listener", "", "D", "Ljava/util/Map;", "X", "()Ljava/util/Map;", "streams", "", "E", "Ljava/lang/String;", "()Ljava/lang/String;", "connectionName", "F", "I", "K", "()I", "M0", "(I)V", "lastGoodStreamId", "G", "N", "setNextStreamId$okhttp", "nextStreamId", "H", "isShutdown", "Lsc/e;", "Lsc/d;", "J", "Lsc/d;", "writerQueue", "pushQueue", "settingsListenerQueue", "Lwc/k;", "M", "Lwc/k;", "pushObserver", "intervalPingsSent", "O", "intervalPongsReceived", "P", "degradedPingsSent", "Q", "degradedPongsReceived", "R", "awaitPongsReceived", "S", "degradedPongDeadlineNs", "Lwc/l;", "T", "Lwc/l;", "()Lwc/l;", "okHttpSettings", "U", "O0", "(Lwc/l;)V", "peerSettings", "<set-?>", "V", "getReadBytesTotal", "()J", "readBytesTotal", "getReadBytesAcknowledged", "readBytesAcknowledged", "getWriteBytesTotal", "writeBytesTotal", "Y", "a0", "writeBytesMaximum", "Ljava/net/Socket;", "Ljava/net/Socket;", "getSocket$okhttp", "()Ljava/net/Socket;", "socket", "Lwc/i;", "Lwc/i;", "e0", "()Lwc/i;", "writer", "Lwc/e$d;", "b0", "Lwc/e$d;", "getReaderRunnable", "()Lwc/e$d;", "readerRunnable", "", "c0", "Ljava/util/Set;", "currentPushRequests", "d0", "a", "b", "c", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements Closeable {

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e0, reason: collision with root package name */
    private static final wc.l f52070e0;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final c listener;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, wc.h> streams;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final String connectionName;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private int lastGoodStreamId;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private int nextStreamId;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private boolean isShutdown;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final sc.e taskRunner;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final sc.d writerQueue;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final sc.d pushQueue;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final sc.d settingsListenerQueue;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final wc.k pushObserver;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private long intervalPingsSent;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private long intervalPongsReceived;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private long degradedPingsSent;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private long degradedPongsReceived;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private long awaitPongsReceived;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private long degradedPongDeadlineNs;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final wc.l okHttpSettings;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private wc.l peerSettings;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private long readBytesTotal;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private long readBytesAcknowledged;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private long writeBytesTotal;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private long writeBytesMaximum;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final Socket socket;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final wc.i writer;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private final d readerRunnable;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> currentPushRequests;

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0010\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00100\u001a\u00020\n8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b%\u0010-\"\u0004\b.\u0010/R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010=\u001a\u0004\b+\u0010>\"\u0004\b?\u0010@R\"\u0010F\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010B\u001a\u0004\b7\u0010C\"\u0004\bD\u0010ER\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010G\u001a\u0004\b1\u0010H\"\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lwc/e$a;", "", "", "client", "Lsc/e;", "taskRunner", "<init>", "(ZLsc/e;)V", "Ljava/net/Socket;", "socket", "", "peerName", "LCc/g;", "source", "LCc/f;", "sink", "q", "(Ljava/net/Socket;Ljava/lang/String;LCc/g;LCc/f;)Lwc/e$a;", "Lwc/e$c;", "listener", "k", "(Lwc/e$c;)Lwc/e$a;", "", "pingIntervalMillis", "l", "(I)Lwc/e$a;", "Lwc/e;", "a", "()Lwc/e;", "Z", "b", "()Z", "setClient$okhttp", "(Z)V", "Lsc/e;", "j", "()Lsc/e;", "c", "Ljava/net/Socket;", "h", "()Ljava/net/Socket;", "o", "(Ljava/net/Socket;)V", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "connectionName", "e", "LCc/g;", "i", "()LCc/g;", "p", "(LCc/g;)V", "f", "LCc/f;", "g", "()LCc/f;", "n", "(LCc/f;)V", "Lwc/e$c;", "()Lwc/e$c;", "setListener$okhttp", "(Lwc/e$c;)V", "Lwc/k;", "Lwc/k;", "()Lwc/k;", "setPushObserver$okhttp", "(Lwc/k;)V", "pushObserver", "I", "()I", "setPingIntervalMillis$okhttp", "(I)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean client;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final sc.e taskRunner;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public Socket socket;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        public String connectionName;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        public Cc.g source;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        public Cc.f sink;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private c listener;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private wc.k pushObserver;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private int pingIntervalMillis;

        public a(boolean z10, sc.e taskRunner) {
            C3862t.g(taskRunner, "taskRunner");
            this.client = z10;
            this.taskRunner = taskRunner;
            this.listener = c.f52109b;
            this.pushObserver = wc.k.f52211b;
        }

        public final e a() {
            return new e(this);
        }

        /* renamed from: b, reason: from getter */
        public final boolean getClient() {
            return this.client;
        }

        public final String c() {
            String str = this.connectionName;
            if (str != null) {
                return str;
            }
            C3862t.u("connectionName");
            return null;
        }

        /* renamed from: d, reason: from getter */
        public final c getListener() {
            return this.listener;
        }

        /* renamed from: e, reason: from getter */
        public final int getPingIntervalMillis() {
            return this.pingIntervalMillis;
        }

        /* renamed from: f, reason: from getter */
        public final wc.k getPushObserver() {
            return this.pushObserver;
        }

        public final Cc.f g() {
            Cc.f fVar = this.sink;
            if (fVar != null) {
                return fVar;
            }
            C3862t.u("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.socket;
            if (socket != null) {
                return socket;
            }
            C3862t.u("socket");
            return null;
        }

        public final Cc.g i() {
            Cc.g gVar = this.source;
            if (gVar != null) {
                return gVar;
            }
            C3862t.u("source");
            return null;
        }

        /* renamed from: j, reason: from getter */
        public final sc.e getTaskRunner() {
            return this.taskRunner;
        }

        public final a k(c listener) {
            C3862t.g(listener, "listener");
            this.listener = listener;
            return this;
        }

        public final a l(int pingIntervalMillis) {
            this.pingIntervalMillis = pingIntervalMillis;
            return this;
        }

        public final void m(String str) {
            C3862t.g(str, "<set-?>");
            this.connectionName = str;
        }

        public final void n(Cc.f fVar) {
            C3862t.g(fVar, "<set-?>");
            this.sink = fVar;
        }

        public final void o(Socket socket) {
            C3862t.g(socket, "<set-?>");
            this.socket = socket;
        }

        public final void p(Cc.g gVar) {
            C3862t.g(gVar, "<set-?>");
            this.source = gVar;
        }

        public final a q(Socket socket, String peerName, Cc.g source, Cc.f sink) {
            String str;
            C3862t.g(socket, "socket");
            C3862t.g(peerName, "peerName");
            C3862t.g(source, "source");
            C3862t.g(sink, "sink");
            o(socket);
            if (this.client) {
                str = pc.d.f47759i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m(str);
            p(source);
            n(sink);
            return this;
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lwc/e$b;", "", "<init>", "()V", "Lwc/l;", "DEFAULT_SETTINGS", "Lwc/l;", "a", "()Lwc/l;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wc.e$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final wc.l a() {
            return e.f52070e0;
        }

        private Companion() {
        }
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \r2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwc/e$c;", "", "<init>", "()V", "Lwc/h;", "stream", "Loa/F;", "b", "(Lwc/h;)V", "Lwc/e;", "connection", "Lwc/l;", "settings", "a", "(Lwc/e;Lwc/l;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f52109b = new a();

        /* compiled from: Http2Connection.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"wc/e$c$a", "Lwc/e$c;", "Lwc/h;", "stream", "Loa/F;", "b", "(Lwc/h;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends c {
            a() {
            }

            @Override // wc.e.c
            public void b(wc.h stream) {
                C3862t.g(stream, "stream");
                stream.d(wc.a.REFUSED_STREAM, null);
            }
        }

        public void a(e connection, wc.l settings) {
            C3862t.g(connection, "connection");
            C3862t.g(settings, "settings");
        }

        public abstract void b(wc.h stream);
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"sc/c", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wc.e$e, reason: collision with other inner class name */
    public static final class C0756e extends AbstractC4529a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f52122e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f52123f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C0982e f52124g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f52125h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f52126i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0756e(String str, boolean z10, e eVar, int i10, C0982e c0982e, int i11, boolean z11) {
            super(str, z10);
            this.f52122e = eVar;
            this.f52123f = i10;
            this.f52124g = c0982e;
            this.f52125h = i11;
            this.f52126i = z11;
        }

        @Override // sc.AbstractC4529a
        public long f() {
            try {
                boolean zB = this.f52122e.pushObserver.b(this.f52123f, this.f52124g, this.f52125h, this.f52126i);
                if (zB) {
                    this.f52122e.getWriter().m(this.f52123f, wc.a.CANCEL);
                }
                if (!zB && !this.f52126i) {
                    return -1L;
                }
                synchronized (this.f52122e) {
                    this.f52122e.currentPushRequests.remove(Integer.valueOf(this.f52123f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"sc/c", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f extends AbstractC4529a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f52127e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f52128f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f52129g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f52130h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z10, e eVar, int i10, List list, boolean z11) {
            super(str, z10);
            this.f52127e = eVar;
            this.f52128f = i10;
            this.f52129g = list;
            this.f52130h = z11;
        }

        @Override // sc.AbstractC4529a
        public long f() {
            boolean zD = this.f52127e.pushObserver.d(this.f52128f, this.f52129g, this.f52130h);
            if (zD) {
                try {
                    this.f52127e.getWriter().m(this.f52128f, wc.a.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zD && !this.f52130h) {
                return -1L;
            }
            synchronized (this.f52127e) {
                this.f52127e.currentPushRequests.remove(Integer.valueOf(this.f52128f));
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"sc/c", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g extends AbstractC4529a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f52131e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f52132f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f52133g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z10, e eVar, int i10, List list) {
            super(str, z10);
            this.f52131e = eVar;
            this.f52132f = i10;
            this.f52133g = list;
        }

        @Override // sc.AbstractC4529a
        public long f() {
            if (!this.f52131e.pushObserver.c(this.f52132f, this.f52133g)) {
                return -1L;
            }
            try {
                this.f52131e.getWriter().m(this.f52132f, wc.a.CANCEL);
                synchronized (this.f52131e) {
                    this.f52131e.currentPushRequests.remove(Integer.valueOf(this.f52132f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"sc/c", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h extends AbstractC4529a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f52134e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f52135f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ wc.a f52136g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z10, e eVar, int i10, wc.a aVar) {
            super(str, z10);
            this.f52134e = eVar;
            this.f52135f = i10;
            this.f52136g = aVar;
        }

        @Override // sc.AbstractC4529a
        public long f() {
            this.f52134e.pushObserver.a(this.f52135f, this.f52136g);
            synchronized (this.f52134e) {
                this.f52134e.currentPushRequests.remove(Integer.valueOf(this.f52135f));
                C4153F c4153f = C4153F.f46609a;
            }
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"sc/c", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i extends AbstractC4529a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f52137e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z10, e eVar) {
            super(str, z10);
            this.f52137e = eVar;
        }

        @Override // sc.AbstractC4529a
        public long f() throws IOException {
            this.f52137e.h1(false, 2, 0);
            return -1L;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"wc/e$j", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class j extends AbstractC4529a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f52138e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f52139f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, e eVar, long j10) {
            super(str, false, 2, null);
            this.f52138e = eVar;
            this.f52139f = j10;
        }

        @Override // sc.AbstractC4529a
        public long f() throws IOException {
            boolean z10;
            synchronized (this.f52138e) {
                if (this.f52138e.intervalPongsReceived < this.f52138e.intervalPingsSent) {
                    z10 = true;
                } else {
                    this.f52138e.intervalPingsSent++;
                    z10 = false;
                }
            }
            if (z10) {
                this.f52138e.y(null);
                return -1L;
            }
            this.f52138e.h1(false, 1, 0);
            return this.f52139f;
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"sc/c", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class k extends AbstractC4529a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f52140e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f52141f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ wc.a f52142g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z10, e eVar, int i10, wc.a aVar) {
            super(str, z10);
            this.f52140e = eVar;
            this.f52141f = i10;
            this.f52142g = aVar;
        }

        @Override // sc.AbstractC4529a
        public long f() throws IOException {
            try {
                this.f52140e.k1(this.f52141f, this.f52142g);
                return -1L;
            } catch (IOException e10) {
                this.f52140e.y(e10);
                return -1L;
            }
        }
    }

    /* compiled from: TaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"sc/c", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l extends AbstractC4529a {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ e f52143e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f52144f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f52145g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z10, e eVar, int i10, long j10) {
            super(str, z10);
            this.f52143e = eVar;
            this.f52144f = i10;
            this.f52145g = j10;
        }

        @Override // sc.AbstractC4529a
        public long f() throws IOException {
            try {
                this.f52143e.getWriter().o(this.f52144f, this.f52145g);
                return -1L;
            } catch (IOException e10) {
                this.f52143e.y(e10);
                return -1L;
            }
        }
    }

    static {
        wc.l lVar = new wc.l();
        lVar.h(7, 65535);
        lVar.h(5, 16384);
        f52070e0 = lVar;
    }

    public e(a builder) {
        C3862t.g(builder, "builder");
        boolean client = builder.getClient();
        this.client = client;
        this.listener = builder.getListener();
        this.streams = new LinkedHashMap();
        String strC = builder.c();
        this.connectionName = strC;
        this.nextStreamId = builder.getClient() ? 3 : 2;
        sc.e taskRunner = builder.getTaskRunner();
        this.taskRunner = taskRunner;
        sc.d dVarI = taskRunner.i();
        this.writerQueue = dVarI;
        this.pushQueue = taskRunner.i();
        this.settingsListenerQueue = taskRunner.i();
        this.pushObserver = builder.getPushObserver();
        wc.l lVar = new wc.l();
        if (builder.getClient()) {
            lVar.h(7, 16777216);
        }
        this.okHttpSettings = lVar;
        this.peerSettings = f52070e0;
        this.writeBytesMaximum = r2.c();
        this.socket = builder.h();
        this.writer = new wc.i(builder.g(), client);
        this.readerRunnable = new d(this, new wc.g(builder.i(), client));
        this.currentPushRequests = new LinkedHashSet();
        if (builder.getPingIntervalMillis() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.getPingIntervalMillis());
            dVarI.i(new j(strC + " ping", this, nanos), nanos);
        }
    }

    public static /* synthetic */ void U0(e eVar, boolean z10, sc.e eVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            eVar2 = sc.e.f49702i;
        }
        eVar.S0(z10, eVar2);
    }

    private final wc.h h0(int associatedStreamId, List<b> requestHeaders, boolean out) {
        int i10;
        wc.h hVar;
        boolean z10 = true;
        boolean z11 = !out;
        synchronized (this.writer) {
            try {
                synchronized (this) {
                    try {
                        if (this.nextStreamId > 1073741823) {
                            P0(wc.a.REFUSED_STREAM);
                        }
                        if (this.isShutdown) {
                            throw new ConnectionShutdownException();
                        }
                        i10 = this.nextStreamId;
                        this.nextStreamId = i10 + 2;
                        hVar = new wc.h(i10, this, z11, false, null);
                        if (out && this.writeBytesTotal < this.writeBytesMaximum && hVar.getWriteBytesTotal() < hVar.getWriteBytesMaximum()) {
                            z10 = false;
                        }
                        if (hVar.u()) {
                            this.streams.put(Integer.valueOf(i10), hVar);
                        }
                        C4153F c4153f = C4153F.f46609a;
                    } finally {
                    }
                }
                if (associatedStreamId == 0) {
                    this.writer.g(z11, i10, requestHeaders);
                } else {
                    if (this.client) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                    }
                    this.writer.l(associatedStreamId, i10, requestHeaders);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            this.writer.flush();
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(IOException e10) throws IOException {
        wc.a aVar = wc.a.PROTOCOL_ERROR;
        x(aVar, aVar, e10);
    }

    /* renamed from: C, reason: from getter */
    public final String getConnectionName() {
        return this.connectionName;
    }

    public final boolean C0(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    public final synchronized wc.h G0(int streamId) {
        wc.h hVarRemove;
        hVarRemove = this.streams.remove(Integer.valueOf(streamId));
        C3862t.e(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return hVarRemove;
    }

    /* renamed from: K, reason: from getter */
    public final int getLastGoodStreamId() {
        return this.lastGoodStreamId;
    }

    /* renamed from: L, reason: from getter */
    public final c getListener() {
        return this.listener;
    }

    public final void L0() {
        synchronized (this) {
            long j10 = this.degradedPongsReceived;
            long j11 = this.degradedPingsSent;
            if (j10 < j11) {
                return;
            }
            this.degradedPingsSent = j11 + 1;
            this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
            C4153F c4153f = C4153F.f46609a;
            this.writerQueue.i(new i(this.connectionName + " ping", true, this), 0L);
        }
    }

    public final void M0(int i10) {
        this.lastGoodStreamId = i10;
    }

    /* renamed from: N, reason: from getter */
    public final int getNextStreamId() {
        return this.nextStreamId;
    }

    public final void O0(wc.l lVar) {
        C3862t.g(lVar, "<set-?>");
        this.peerSettings = lVar;
    }

    /* renamed from: P, reason: from getter */
    public final wc.l getOkHttpSettings() {
        return this.okHttpSettings;
    }

    public final void P0(wc.a statusCode) {
        C3862t.g(statusCode, "statusCode");
        synchronized (this.writer) {
            M m10 = new M();
            synchronized (this) {
                if (this.isShutdown) {
                    return;
                }
                this.isShutdown = true;
                int i10 = this.lastGoodStreamId;
                m10.f43976B = i10;
                C4153F c4153f = C4153F.f46609a;
                this.writer.f(i10, statusCode, pc.d.f47751a);
            }
        }
    }

    /* renamed from: Q, reason: from getter */
    public final wc.l getPeerSettings() {
        return this.peerSettings;
    }

    public final void S0(boolean sendConnectionPreface, sc.e taskRunner) {
        C3862t.g(taskRunner, "taskRunner");
        if (sendConnectionPreface) {
            this.writer.b();
            this.writer.n(this.okHttpSettings);
            if (this.okHttpSettings.c() != 65535) {
                this.writer.o(0, r5 - 65535);
            }
        }
        taskRunner.i().i(new C4531c(this.connectionName, true, this.readerRunnable), 0L);
    }

    public final synchronized wc.h W(int id2) {
        return this.streams.get(Integer.valueOf(id2));
    }

    public final Map<Integer, wc.h> X() {
        return this.streams;
    }

    public final synchronized void X0(long read) {
        long j10 = this.readBytesTotal + read;
        this.readBytesTotal = j10;
        long j11 = j10 - this.readBytesAcknowledged;
        if (j11 >= this.okHttpSettings.c() / 2) {
            q1(0, j11);
            this.readBytesAcknowledged += j11;
        }
    }

    /* renamed from: a0, reason: from getter */
    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.writer.j());
        r6 = r2;
        r8.writeBytesTotal += r6;
        r4 = oa.C4153F.f46609a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a1(int r9, boolean r10, Cc.C0982e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            wc.i r12 = r8.writer
            r12.c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r6 = r8.writeBytesMaximum     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L39
            java.util.Map<java.lang.Integer, wc.h> r2 = r8.streams     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r2 == 0) goto L31
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.C3862t.e(r8, r2)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            goto L12
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
        L39:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2f
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2f
            wc.i r4 = r8.writer     // Catch: java.lang.Throwable -> L2f
            int r4 = r4.getMaxFrameSize()     // Catch: java.lang.Throwable -> L2f
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.writeBytesTotal     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.writeBytesTotal = r4     // Catch: java.lang.Throwable -> L2f
            oa.F r4 = oa.C4153F.f46609a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            wc.i r4 = r8.writer
            if (r10 == 0) goto L5d
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = r3
        L5e:
            r4.c(r5, r9, r11, r2)
            goto Ld
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wc.e.a1(int, boolean, Cc.e, long):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        x(wc.a.NO_ERROR, wc.a.CANCEL, null);
    }

    /* renamed from: e0, reason: from getter */
    public final wc.i getWriter() {
        return this.writer;
    }

    public final synchronized boolean f0(long nowNs) {
        if (this.isShutdown) {
            return false;
        }
        if (this.degradedPongsReceived < this.degradedPingsSent) {
            if (nowNs >= this.degradedPongDeadlineNs) {
                return false;
            }
        }
        return true;
    }

    public final void flush() {
        this.writer.flush();
    }

    public final void g1(int streamId, boolean outFinished, List<b> alternating) {
        C3862t.g(alternating, "alternating");
        this.writer.g(outFinished, streamId, alternating);
    }

    public final void h1(boolean reply, int payload1, int payload2) throws IOException {
        try {
            this.writer.k(reply, payload1, payload2);
        } catch (IOException e10) {
            y(e10);
        }
    }

    public final wc.h i0(List<b> requestHeaders, boolean out) {
        C3862t.g(requestHeaders, "requestHeaders");
        return h0(0, requestHeaders, out);
    }

    public final void k1(int streamId, wc.a statusCode) {
        C3862t.g(statusCode, "statusCode");
        this.writer.m(streamId, statusCode);
    }

    public final void n1(int streamId, wc.a errorCode) {
        C3862t.g(errorCode, "errorCode");
        this.writerQueue.i(new k(this.connectionName + '[' + streamId + "] writeSynReset", true, this, streamId, errorCode), 0L);
    }

    public final void o0(int streamId, Cc.g source, int byteCount, boolean inFinished) {
        C3862t.g(source, "source");
        C0982e c0982e = new C0982e();
        long j10 = byteCount;
        source.t1(j10);
        source.I0(c0982e, j10);
        this.pushQueue.i(new C0756e(this.connectionName + '[' + streamId + "] onData", true, this, streamId, c0982e, byteCount, inFinished), 0L);
    }

    public final void p0(int streamId, List<b> requestHeaders, boolean inFinished) {
        C3862t.g(requestHeaders, "requestHeaders");
        this.pushQueue.i(new f(this.connectionName + '[' + streamId + "] onHeaders", true, this, streamId, requestHeaders, inFinished), 0L);
    }

    public final void q1(int streamId, long unacknowledgedBytesRead) {
        this.writerQueue.i(new l(this.connectionName + '[' + streamId + "] windowUpdate", true, this, streamId, unacknowledgedBytesRead), 0L);
    }

    public final void r0(int streamId, List<b> requestHeaders) {
        C3862t.g(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(streamId))) {
                n1(streamId, wc.a.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(streamId));
            this.pushQueue.i(new g(this.connectionName + '[' + streamId + "] onRequest", true, this, streamId, requestHeaders), 0L);
        }
    }

    public final void v0(int streamId, wc.a errorCode) {
        C3862t.g(errorCode, "errorCode");
        this.pushQueue.i(new h(this.connectionName + '[' + streamId + "] onReset", true, this, streamId, errorCode), 0L);
    }

    public final void x(wc.a connectionCode, wc.a streamCode, IOException cause) throws IOException {
        int i10;
        Object[] array;
        C3862t.g(connectionCode, "connectionCode");
        C3862t.g(streamCode, "streamCode");
        if (pc.d.f47758h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            P0(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.streams.isEmpty()) {
                    array = null;
                } else {
                    array = this.streams.values().toArray(new wc.h[0]);
                    this.streams.clear();
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
        wc.h[] hVarArr = (wc.h[]) array;
        if (hVarArr != null) {
            for (wc.h hVar : hVarArr) {
                try {
                    hVar.d(streamCode, cause);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException unused3) {
        }
        try {
            this.socket.close();
        } catch (IOException unused4) {
        }
        this.writerQueue.n();
        this.pushQueue.n();
        this.settingsListenerQueue.n();
    }

    /* renamed from: z, reason: from getter */
    public final boolean getClient() {
        return this.client;
    }

    /* compiled from: Http2Connection.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\tJ'\u0010'\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J'\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J/\u00105\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0006\u00103\u001a\u00020\f2\u0006\u00104\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u00106J-\u00109\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u00020\f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lwc/e$d;", "Lwc/g$c;", "Lkotlin/Function0;", "Loa/F;", "Lwc/g;", "reader", "<init>", "(Lwc/e;Lwc/g;)V", "r", "()V", "", "inFinished", "", "streamId", "LCc/g;", "source", "length", "d", "(ZILCc/g;I)V", "associatedStreamId", "", "Lwc/b;", "headerBlock", "b", "(ZIILjava/util/List;)V", "Lwc/a;", "errorCode", "n", "(ILwc/a;)V", "clearPrevious", "Lwc/l;", "settings", "o", "(ZLwc/l;)V", "q", "a", "ack", "payload1", "payload2", "i", "(ZII)V", "lastGoodStreamId", "LCc/h;", "debugData", "j", "(ILwc/a;LCc/h;)V", "", "windowSizeIncrement", "c", "(IJ)V", "streamDependency", "weight", "exclusive", "m", "(IIIZ)V", "promisedStreamId", "requestHeaders", "p", "(IILjava/util/List;)V", "B", "Lwc/g;", "getReader$okhttp", "()Lwc/g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class d implements g.c, Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final wc.g reader;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ e f52111C;

        /* compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"sc/c", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends AbstractC4529a {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ e f52112e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ O f52113f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, e eVar, O o10) {
                super(str, z10);
                this.f52112e = eVar;
                this.f52113f = o10;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // sc.AbstractC4529a
            public long f() {
                this.f52112e.getListener().a(this.f52112e, (wc.l) this.f52113f.f43978B);
                return -1L;
            }
        }

        /* compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"sc/c", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class b extends AbstractC4529a {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ e f52114e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ wc.h f52115f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, e eVar, wc.h hVar) {
                super(str, z10);
                this.f52114e = eVar;
                this.f52115f = hVar;
            }

            @Override // sc.AbstractC4529a
            public long f() {
                try {
                    this.f52114e.getListener().b(this.f52115f);
                    return -1L;
                } catch (IOException e10) {
                    yc.j.INSTANCE.g().k("Http2Connection.Listener failure for " + this.f52114e.getConnectionName(), 4, e10);
                    try {
                        this.f52115f.d(wc.a.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"sc/c", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c extends AbstractC4529a {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ e f52116e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f52117f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f52118g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, e eVar, int i10, int i11) {
                super(str, z10);
                this.f52116e = eVar;
                this.f52117f = i10;
                this.f52118g = i11;
            }

            @Override // sc.AbstractC4529a
            public long f() throws IOException {
                this.f52116e.h1(true, this.f52117f, this.f52118g);
                return -1L;
            }
        }

        /* compiled from: TaskQueue.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"sc/c", "Lsc/a;", "", "f", "()J", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: wc.e$d$d, reason: collision with other inner class name */
        public static final class C0755d extends AbstractC4529a {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ d f52119e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f52120f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ wc.l f52121g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0755d(String str, boolean z10, d dVar, boolean z11, wc.l lVar) {
                super(str, z10);
                this.f52119e = dVar;
                this.f52120f = z11;
                this.f52121g = lVar;
            }

            @Override // sc.AbstractC4529a
            public long f() {
                this.f52119e.q(this.f52120f, this.f52121g);
                return -1L;
            }
        }

        public d(e eVar, wc.g reader) {
            C3862t.g(reader, "reader");
            this.f52111C = eVar;
            this.reader = reader;
        }

        @Override // wc.g.c
        public void b(boolean inFinished, int streamId, int associatedStreamId, List<wc.b> headerBlock) {
            C3862t.g(headerBlock, "headerBlock");
            if (this.f52111C.C0(streamId)) {
                this.f52111C.p0(streamId, headerBlock, inFinished);
                return;
            }
            e eVar = this.f52111C;
            synchronized (eVar) {
                wc.h hVarW = eVar.W(streamId);
                if (hVarW != null) {
                    C4153F c4153f = C4153F.f46609a;
                    hVarW.x(pc.d.Q(headerBlock), inFinished);
                    return;
                }
                if (eVar.isShutdown) {
                    return;
                }
                if (streamId <= eVar.getLastGoodStreamId()) {
                    return;
                }
                if (streamId % 2 == eVar.getNextStreamId() % 2) {
                    return;
                }
                wc.h hVar = new wc.h(streamId, eVar, false, inFinished, pc.d.Q(headerBlock));
                eVar.M0(streamId);
                eVar.X().put(Integer.valueOf(streamId), hVar);
                eVar.taskRunner.i().i(new b(eVar.getConnectionName() + '[' + streamId + "] onStream", true, eVar, hVar), 0L);
            }
        }

        @Override // wc.g.c
        public void c(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                e eVar = this.f52111C;
                synchronized (eVar) {
                    eVar.writeBytesMaximum = eVar.getWriteBytesMaximum() + windowSizeIncrement;
                    C3862t.e(eVar, "null cannot be cast to non-null type java.lang.Object");
                    eVar.notifyAll();
                    C4153F c4153f = C4153F.f46609a;
                }
                return;
            }
            wc.h hVarW = this.f52111C.W(streamId);
            if (hVarW != null) {
                synchronized (hVarW) {
                    hVarW.a(windowSizeIncrement);
                    C4153F c4153f2 = C4153F.f46609a;
                }
            }
        }

        @Override // wc.g.c
        public void d(boolean inFinished, int streamId, Cc.g source, int length) {
            C3862t.g(source, "source");
            if (this.f52111C.C0(streamId)) {
                this.f52111C.o0(streamId, source, length, inFinished);
                return;
            }
            wc.h hVarW = this.f52111C.W(streamId);
            if (hVarW == null) {
                this.f52111C.n1(streamId, wc.a.PROTOCOL_ERROR);
                long j10 = length;
                this.f52111C.X0(j10);
                source.w(j10);
                return;
            }
            hVarW.w(source, length);
            if (inFinished) {
                hVarW.x(pc.d.f47752b, true);
            }
        }

        @Override // wc.g.c
        public void i(boolean ack, int payload1, int payload2) {
            if (!ack) {
                this.f52111C.writerQueue.i(new c(this.f52111C.getConnectionName() + " ping", true, this.f52111C, payload1, payload2), 0L);
                return;
            }
            e eVar = this.f52111C;
            synchronized (eVar) {
                try {
                    if (payload1 == 1) {
                        eVar.intervalPongsReceived++;
                    } else if (payload1 != 2) {
                        if (payload1 == 3) {
                            eVar.awaitPongsReceived++;
                            C3862t.e(eVar, "null cannot be cast to non-null type java.lang.Object");
                            eVar.notifyAll();
                        }
                        C4153F c4153f = C4153F.f46609a;
                    } else {
                        eVar.degradedPongsReceived++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() throws Throwable {
            r();
            return C4153F.f46609a;
        }

        @Override // wc.g.c
        public void j(int lastGoodStreamId, wc.a errorCode, Cc.h debugData) {
            int i10;
            Object[] array;
            C3862t.g(errorCode, "errorCode");
            C3862t.g(debugData, "debugData");
            debugData.J();
            e eVar = this.f52111C;
            synchronized (eVar) {
                array = eVar.X().values().toArray(new wc.h[0]);
                eVar.isShutdown = true;
                C4153F c4153f = C4153F.f46609a;
            }
            for (wc.h hVar : (wc.h[]) array) {
                if (hVar.getId() > lastGoodStreamId && hVar.t()) {
                    hVar.y(wc.a.REFUSED_STREAM);
                    this.f52111C.G0(hVar.getId());
                }
            }
        }

        @Override // wc.g.c
        public void n(int streamId, wc.a errorCode) {
            C3862t.g(errorCode, "errorCode");
            if (this.f52111C.C0(streamId)) {
                this.f52111C.v0(streamId, errorCode);
                return;
            }
            wc.h hVarG0 = this.f52111C.G0(streamId);
            if (hVarG0 != null) {
                hVarG0.y(errorCode);
            }
        }

        @Override // wc.g.c
        public void o(boolean clearPrevious, wc.l settings) {
            C3862t.g(settings, "settings");
            this.f52111C.writerQueue.i(new C0755d(this.f52111C.getConnectionName() + " applyAndAckSettings", true, this, clearPrevious, settings), 0L);
        }

        @Override // wc.g.c
        public void p(int streamId, int promisedStreamId, List<wc.b> requestHeaders) {
            C3862t.g(requestHeaders, "requestHeaders");
            this.f52111C.r0(promisedStreamId, requestHeaders);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v2, types: [T, wc.l] */
        /* JADX WARN: Type inference failed for: r13v3 */
        public final void q(boolean clearPrevious, wc.l settings) {
            ?? r13;
            long jC;
            int i10;
            wc.h[] hVarArr;
            C3862t.g(settings, "settings");
            O o10 = new O();
            wc.i writer = this.f52111C.getWriter();
            e eVar = this.f52111C;
            synchronized (writer) {
                synchronized (eVar) {
                    try {
                        wc.l peerSettings = eVar.getPeerSettings();
                        if (clearPrevious) {
                            r13 = settings;
                        } else {
                            wc.l lVar = new wc.l();
                            lVar.g(peerSettings);
                            lVar.g(settings);
                            r13 = lVar;
                        }
                        o10.f43978B = r13;
                        jC = r13.c() - peerSettings.c();
                        hVarArr = (jC == 0 || eVar.X().isEmpty()) ? null : (wc.h[]) eVar.X().values().toArray(new wc.h[0]);
                        eVar.O0((wc.l) o10.f43978B);
                        eVar.settingsListenerQueue.i(new a(eVar.getConnectionName() + " onSettings", true, eVar, o10), 0L);
                        C4153F c4153f = C4153F.f46609a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    eVar.getWriter().a((wc.l) o10.f43978B);
                } catch (IOException e10) {
                    eVar.y(e10);
                }
                C4153F c4153f2 = C4153F.f46609a;
            }
            if (hVarArr != null) {
                for (wc.h hVar : hVarArr) {
                    synchronized (hVar) {
                        hVar.a(jC);
                        C4153F c4153f3 = C4153F.f46609a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [wc.a] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, wc.g] */
        public void r() throws Throwable {
            wc.a aVar;
            wc.a aVar2;
            wc.a aVar3 = wc.a.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.reader.c(this);
                    while (this.reader.b(false, this)) {
                    }
                    aVar2 = wc.a.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar3;
                    this.f52111C.x(aVar, aVar3, e10);
                    pc.d.m(this.reader);
                    throw th;
                }
                try {
                    this.f52111C.x(aVar2, wc.a.CANCEL, null);
                    aVar = aVar2;
                } catch (IOException e12) {
                    e10 = e12;
                    wc.a aVar4 = wc.a.PROTOCOL_ERROR;
                    e eVar = this.f52111C;
                    eVar.x(aVar4, aVar4, e10);
                    aVar = eVar;
                    aVar3 = this.reader;
                    pc.d.m(aVar3);
                }
                aVar3 = this.reader;
                pc.d.m(aVar3);
            } catch (Throwable th2) {
                th = th2;
                this.f52111C.x(aVar, aVar3, e10);
                pc.d.m(this.reader);
                throw th;
            }
        }

        @Override // wc.g.c
        public void a() {
        }

        @Override // wc.g.c
        public void m(int streamId, int streamDependency, int weight, boolean exclusive) {
        }
    }
}

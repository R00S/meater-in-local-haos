package oc;

import Bc.c;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oc.InterfaceC4185e;
import oc.r;
import yc.j;

/* compiled from: OkHttpClient.kt */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 \u009a\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u009b\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00108G¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168G¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8G¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8G¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010+\u001a\u00020&8G¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00100\u001a\u00020,8G¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u0017\u00106\u001a\u0002018G¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u00109\u001a\u00020,8G¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u0010/R\u0017\u0010;\u001a\u00020,8G¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b:\u0010/R\u0017\u0010A\u001a\u00020<8G¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010G\u001a\u0004\u0018\u00010B8G¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010M\u001a\u00020H8G¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010R\u001a\u0004\u0018\u00010N8G¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\b\u0017\u0010QR\u0017\u0010W\u001a\u00020S8G¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\b#\u0010VR\u0017\u0010Y\u001a\u0002018G¢\u0006\f\n\u0004\bX\u00103\u001a\u0004\b\u001e\u00105R\u0017\u0010^\u001a\u00020Z8G¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b2\u0010]R\u0016\u0010b\u001a\u0004\u0018\u00010_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0019\u0010f\u001a\u0004\u0018\u00010c8G¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u001d\u0010k\u001a\b\u0012\u0004\u0012\u00020h0\u001c8G¢\u0006\f\n\u0004\bi\u0010\u001f\u001a\u0004\bj\u0010!R\u001d\u0010n\u001a\b\u0012\u0004\u0012\u00020l0\u001c8G¢\u0006\f\n\u0004\bm\u0010\u001f\u001a\u0004\b\u0011\u0010!R\u0017\u0010t\u001a\u00020o8G¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0017\u0010z\u001a\u00020u8G¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0019\u0010~\u001a\u0004\u0018\u00010{8G¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u001c\u0010\u0084\u0001\u001a\u00030\u0080\u00018G¢\u0006\u000f\n\u0005\b\u0081\u0001\u00107\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0086\u0001\u001a\u00030\u0080\u00018G¢\u0006\u000e\n\u0004\b.\u00107\u001a\u0006\b\u0085\u0001\u0010\u0083\u0001R\u001b\u0010\u0088\u0001\u001a\u00030\u0080\u00018G¢\u0006\u000e\n\u0005\b\u0087\u0001\u00107\u001a\u0005\b'\u0010\u0083\u0001R\u001b\u0010\u008a\u0001\u001a\u00030\u0080\u00018G¢\u0006\u000e\n\u0005\b\u0089\u0001\u00107\u001a\u0005\bC\u0010\u0083\u0001R\u001c\u0010\u008d\u0001\u001a\u00030\u0080\u00018G¢\u0006\u000f\n\u0005\b\u008b\u0001\u00107\u001a\u0006\b\u008c\u0001\u0010\u0083\u0001R\u001c\u0010\u0090\u0001\u001a\u00030\u008e\u00018G¢\u0006\u000f\n\u0005\b\u008f\u0001\u0010\n\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001d\u0010\u0097\u0001\u001a\u00030\u0092\u00018\u0006¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0013\u0010\u0099\u0001\u001a\u00020_8G¢\u0006\u0007\u001a\u0005\b7\u0010\u0098\u0001¨\u0006\u009c\u0001"}, d2 = {"Loc/z;", "", "Loc/e$a;", "", "Loc/z$a;", "builder", "<init>", "(Loc/z$a;)V", "()V", "Loa/F;", "J", "Loc/B;", "request", "Loc/e;", "b", "(Loc/B;)Loc/e;", "Loc/p;", "B", "Loc/p;", "o", "()Loc/p;", "dispatcher", "Loc/k;", "C", "Loc/k;", "l", "()Loc/k;", "connectionPool", "", "Loc/w;", "D", "Ljava/util/List;", "v", "()Ljava/util/List;", "interceptors", "E", "w", "networkInterceptors", "Loc/r$c;", "F", "Loc/r$c;", "q", "()Loc/r$c;", "eventListenerFactory", "", "G", "Z", "()Z", "retryOnConnectionFailure", "Loc/b;", "H", "Loc/b;", "f", "()Loc/b;", "authenticator", "I", "r", "followRedirects", "s", "followSslRedirects", "Loc/n;", "K", "Loc/n;", "n", "()Loc/n;", "cookieJar", "Loc/c;", "L", "Loc/c;", "g", "()Loc/c;", "cache", "Loc/q;", "M", "Loc/q;", "p", "()Loc/q;", "dns", "Ljava/net/Proxy;", "N", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "O", "Ljava/net/ProxySelector;", "()Ljava/net/ProxySelector;", "proxySelector", "P", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Q", "Ljavax/net/SocketFactory;", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "R", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "S", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "()Ljavax/net/ssl/X509TrustManager;", "Loc/l;", "T", "m", "connectionSpecs", "Loc/A;", "U", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "V", "Ljavax/net/ssl/HostnameVerifier;", "u", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Loc/g;", "W", "Loc/g;", "i", "()Loc/g;", "certificatePinner", "LBc/c;", "X", "LBc/c;", "certificateChainCleaner", "()LBc/c;", "", "Y", "h", "()I", "callTimeoutMillis", "k", "connectTimeoutMillis", "a0", "readTimeoutMillis", "b0", "writeTimeoutMillis", "c0", "A", "pingIntervalMillis", "", "d0", "minWebSocketMessageToCompress", "()J", "Ltc/h;", "e0", "Ltc/h;", "t", "()Ltc/h;", "routeDatabase", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "f0", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class z implements Cloneable, InterfaceC4185e.a {

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g0, reason: collision with root package name */
    private static final List<EnumC4177A> f47141g0 = pc.d.w(EnumC4177A.HTTP_2, EnumC4177A.HTTP_1_1);

    /* renamed from: h0, reason: collision with root package name */
    private static final List<l> f47142h0 = pc.d.w(l.f47033i, l.f47035k);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final p dispatcher;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final k connectionPool;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final List<w> interceptors;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final List<w> networkInterceptors;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final r.c eventListenerFactory;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final boolean retryOnConnectionFailure;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4182b authenticator;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final boolean followRedirects;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final boolean followSslRedirects;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private final n cookieJar;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final C4183c cache;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final q dns;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final Proxy proxy;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final ProxySelector proxySelector;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4182b proxyAuthenticator;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final SocketFactory socketFactory;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private final SSLSocketFactory sslSocketFactoryOrNull;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final X509TrustManager x509TrustManager;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final List<l> connectionSpecs;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final List<EnumC4177A> protocols;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private final HostnameVerifier hostnameVerifier;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    private final C4187g certificatePinner;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final Bc.c certificateChainCleaner;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    private final int callTimeoutMillis;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final int connectTimeoutMillis;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final int readTimeoutMillis;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private final int writeTimeoutMillis;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private final int pingIntervalMillis;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private final long minWebSocketMessageToCompress;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private final tc.h routeDatabase;

    /* compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b$\u0010#J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'R\"\u0010.\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R \u00108\u001a\b\u0012\u0004\u0012\u00020\b048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R \u0010:\u001a\b\u0012\u0004\u0012\u00020\b048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b9\u00107R\"\u0010A\u001a\u00020;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bG\u0010I\"\u0004\bJ\u0010KR\"\u0010O\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010B\u001a\u0004\bM\u0010D\"\u0004\bN\u0010FR\"\u0010S\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010B\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR\"\u0010[\u001a\u00020T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\bL\u0010^\"\u0004\b_\u0010`R\"\u0010h\u001a\u00020a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR$\u0010o\u001a\u0004\u0018\u00010i8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR$\u0010w\u001a\u0004\u0018\u00010p8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\"\u0010z\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010H\u001a\u0004\bx\u0010I\"\u0004\by\u0010KR$\u0010\u0081\u0001\u001a\u00020{8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b*\u0010|\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R+\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bd\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R+\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b=\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R,\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0090\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bM\u00105\u001a\u0004\bq\u00107\"\u0006\b\u0091\u0001\u0010\u0092\u0001R+\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bQ\u00105\u001a\u0005\b\u0094\u0001\u00107\"\u0006\b\u0095\u0001\u0010\u0092\u0001R*\u0010\u009c\u0001\u001a\u00030\u0096\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0097\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R(\u0010¢\u0001\u001a\u00030\u009d\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b6\u0010\u009e\u0001\u001a\u0005\b\\\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R+\u0010©\u0001\u001a\u0005\u0018\u00010£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0005\bU\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R(\u0010¯\u0001\u001a\u00030ª\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b9\u0010«\u0001\u001a\u0005\bP\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R)\u0010²\u0001\u001a\u00030ª\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b°\u0001\u0010«\u0001\u001a\u0005\bb\u0010¬\u0001\"\u0006\b±\u0001\u0010®\u0001R*\u0010µ\u0001\u001a\u00030ª\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010«\u0001\u001a\u0006\b³\u0001\u0010¬\u0001\"\u0006\b´\u0001\u0010®\u0001R)\u0010·\u0001\u001a\u00030ª\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bk\u0010«\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b¶\u0001\u0010®\u0001R)\u0010¹\u0001\u001a\u00030ª\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bx\u0010«\u0001\u001a\u0006\b°\u0001\u0010¬\u0001\"\u0006\b¸\u0001\u0010®\u0001R(\u0010½\u0001\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bs\u0010\u008b\u0001\u001a\u0006\b¤\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R,\u0010Ä\u0001\u001a\u0005\u0018\u00010¾\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001¨\u0006Å\u0001"}, d2 = {"Loc/z$a;", "", "<init>", "()V", "Loc/k;", "connectionPool", "f", "(Loc/k;)Loc/z$a;", "Loc/w;", "interceptor", "a", "(Loc/w;)Loc/z$a;", "b", "", "retryOnConnectionFailure", "M", "(Z)Loc/z$a;", "Loc/b;", "authenticator", "c", "(Loc/b;)Loc/z$a;", "Loc/c;", "cache", "e", "(Loc/c;)Loc/z$a;", "", "Loc/A;", "protocols", "K", "(Ljava/util/List;)Loc/z$a;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "L", "(JLjava/util/concurrent/TimeUnit;)Loc/z$a;", "N", "Loc/z;", "d", "()Loc/z;", "Loc/p;", "Loc/p;", "p", "()Loc/p;", "setDispatcher$okhttp", "(Loc/p;)V", "dispatcher", "Loc/k;", "m", "()Loc/k;", "setConnectionPool$okhttp", "(Loc/k;)V", "", "Ljava/util/List;", "v", "()Ljava/util/List;", "interceptors", "x", "networkInterceptors", "Loc/r$c;", "Loc/r$c;", "r", "()Loc/r$c;", "setEventListenerFactory$okhttp", "(Loc/r$c;)V", "eventListenerFactory", "Z", "E", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "g", "Loc/b;", "()Loc/b;", "setAuthenticator$okhttp", "(Loc/b;)V", "h", "s", "setFollowRedirects$okhttp", "followRedirects", "i", "t", "setFollowSslRedirects$okhttp", "followSslRedirects", "Loc/n;", "j", "Loc/n;", "o", "()Loc/n;", "setCookieJar$okhttp", "(Loc/n;)V", "cookieJar", "k", "Loc/c;", "()Loc/c;", "setCache$okhttp", "(Loc/c;)V", "Loc/q;", "l", "Loc/q;", "q", "()Loc/q;", "setDns$okhttp", "(Loc/q;)V", "dns", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "A", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "proxy", "Ljava/net/ProxySelector;", "n", "Ljava/net/ProxySelector;", "C", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "proxySelector", "B", "setProxyAuthenticator$okhttp", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "G", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "H", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "J", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "x509TrustManagerOrNull", "Loc/l;", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "connectionSpecs", "z", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "u", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "hostnameVerifier", "Loc/g;", "Loc/g;", "()Loc/g;", "setCertificatePinner$okhttp", "(Loc/g;)V", "certificatePinner", "LBc/c;", "w", "LBc/c;", "()LBc/c;", "setCertificateChainCleaner$okhttp", "(LBc/c;)V", "certificateChainCleaner", "", "I", "()I", "setCallTimeout$okhttp", "(I)V", "callTimeout", "y", "setConnectTimeout$okhttp", "connectTimeout", "D", "setReadTimeout$okhttp", "readTimeout", "setWriteTimeout$okhttp", "writeTimeout", "setPingInterval$okhttp", "pingInterval", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "minWebSocketMessageToCompress", "Ltc/h;", "Ltc/h;", "F", "()Ltc/h;", "setRouteDatabase$okhttp", "(Ltc/h;)V", "routeDatabase", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: A, reason: collision with root package name and from kotlin metadata */
        private int writeTimeout;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int pingInterval;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private long minWebSocketMessageToCompress;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private tc.h routeDatabase;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private p dispatcher = new p();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private k connectionPool = new k();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<w> interceptors = new ArrayList();

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<w> networkInterceptors = new ArrayList();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private r.c eventListenerFactory = pc.d.g(r.f47073b);

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean retryOnConnectionFailure = true;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private InterfaceC4182b authenticator;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean followRedirects;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean followSslRedirects;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private n cookieJar;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private C4183c cache;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private q dns;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private Proxy proxy;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private ProxySelector proxySelector;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private InterfaceC4182b proxyAuthenticator;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private SocketFactory socketFactory;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private SSLSocketFactory sslSocketFactoryOrNull;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private X509TrustManager x509TrustManagerOrNull;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private List<l> connectionSpecs;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private List<? extends EnumC4177A> protocols;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private HostnameVerifier hostnameVerifier;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private C4187g certificatePinner;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private Bc.c certificateChainCleaner;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private int callTimeout;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private int connectTimeout;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private int readTimeout;

        public a() {
            InterfaceC4182b interfaceC4182b = InterfaceC4182b.f46833b;
            this.authenticator = interfaceC4182b;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = n.f47059b;
            this.dns = q.f47070b;
            this.proxyAuthenticator = interfaceC4182b;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C3862t.f(socketFactory, "getDefault()");
            this.socketFactory = socketFactory;
            Companion companion = z.INSTANCE;
            this.connectionSpecs = companion.a();
            this.protocols = companion.b();
            this.hostnameVerifier = Bc.d.f1968a;
            this.certificatePinner = C4187g.f46893d;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        /* renamed from: A, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        /* renamed from: B, reason: from getter */
        public final InterfaceC4182b getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        /* renamed from: C, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        /* renamed from: D, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        /* renamed from: E, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        /* renamed from: F, reason: from getter */
        public final tc.h getRouteDatabase() {
            return this.routeDatabase;
        }

        /* renamed from: G, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        /* renamed from: H, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        /* renamed from: I, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        /* renamed from: J, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        public final a K(List<? extends EnumC4177A> protocols) {
            C3862t.g(protocols, "protocols");
            List listZ0 = kotlin.collections.r.Z0(protocols);
            EnumC4177A enumC4177A = EnumC4177A.H2_PRIOR_KNOWLEDGE;
            if (!listZ0.contains(enumC4177A) && !listZ0.contains(EnumC4177A.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + listZ0).toString());
            }
            if (listZ0.contains(enumC4177A) && listZ0.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + listZ0).toString());
            }
            if (listZ0.contains(EnumC4177A.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + listZ0).toString());
            }
            C3862t.e(listZ0, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
            if (listZ0.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            listZ0.remove(EnumC4177A.SPDY_3);
            if (!C3862t.b(listZ0, this.protocols)) {
                this.routeDatabase = null;
            }
            List<? extends EnumC4177A> listUnmodifiableList = Collections.unmodifiableList(listZ0);
            C3862t.f(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
            this.protocols = listUnmodifiableList;
            return this;
        }

        public final a L(long timeout, TimeUnit unit) {
            C3862t.g(unit, "unit");
            this.readTimeout = pc.d.k("timeout", timeout, unit);
            return this;
        }

        public final a M(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        public final a N(long timeout, TimeUnit unit) {
            C3862t.g(unit, "unit");
            this.writeTimeout = pc.d.k("timeout", timeout, unit);
            return this;
        }

        public final a a(w interceptor) {
            C3862t.g(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        public final a b(w interceptor) {
            C3862t.g(interceptor, "interceptor");
            this.networkInterceptors.add(interceptor);
            return this;
        }

        public final a c(InterfaceC4182b authenticator) {
            C3862t.g(authenticator, "authenticator");
            this.authenticator = authenticator;
            return this;
        }

        public final z d() {
            return new z(this);
        }

        public final a e(C4183c cache) {
            this.cache = cache;
            return this;
        }

        public final a f(k connectionPool) {
            C3862t.g(connectionPool, "connectionPool");
            this.connectionPool = connectionPool;
            return this;
        }

        /* renamed from: g, reason: from getter */
        public final InterfaceC4182b getAuthenticator() {
            return this.authenticator;
        }

        /* renamed from: h, reason: from getter */
        public final C4183c getCache() {
            return this.cache;
        }

        /* renamed from: i, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        /* renamed from: j, reason: from getter */
        public final Bc.c getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        /* renamed from: k, reason: from getter */
        public final C4187g getCertificatePinner() {
            return this.certificatePinner;
        }

        /* renamed from: l, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        /* renamed from: m, reason: from getter */
        public final k getConnectionPool() {
            return this.connectionPool;
        }

        public final List<l> n() {
            return this.connectionSpecs;
        }

        /* renamed from: o, reason: from getter */
        public final n getCookieJar() {
            return this.cookieJar;
        }

        /* renamed from: p, reason: from getter */
        public final p getDispatcher() {
            return this.dispatcher;
        }

        /* renamed from: q, reason: from getter */
        public final q getDns() {
            return this.dns;
        }

        /* renamed from: r, reason: from getter */
        public final r.c getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* renamed from: s, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        /* renamed from: t, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        /* renamed from: u, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        public final List<w> v() {
            return this.interceptors;
        }

        /* renamed from: w, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        public final List<w> x() {
            return this.networkInterceptors;
        }

        /* renamed from: y, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final List<EnumC4177A> z() {
            return this.protocols;
        }
    }

    /* compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Loc/z$b;", "", "<init>", "()V", "", "Loc/A;", "DEFAULT_PROTOCOLS", "Ljava/util/List;", "b", "()Ljava/util/List;", "Loc/l;", "DEFAULT_CONNECTION_SPECS", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.z$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final List<l> a() {
            return z.f47142h0;
        }

        public final List<EnumC4177A> b() {
            return z.f47141g0;
        }

        private Companion() {
        }
    }

    public z(a builder) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelector;
        C3862t.g(builder, "builder");
        this.dispatcher = builder.getDispatcher();
        this.connectionPool = builder.getConnectionPool();
        this.interceptors = pc.d.T(builder.v());
        this.networkInterceptors = pc.d.T(builder.x());
        this.eventListenerFactory = builder.getEventListenerFactory();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
        this.authenticator = builder.getAuthenticator();
        this.followRedirects = builder.getFollowRedirects();
        this.followSslRedirects = builder.getFollowSslRedirects();
        this.cookieJar = builder.getCookieJar();
        this.cache = builder.getCache();
        this.dns = builder.getDns();
        this.proxy = builder.getProxy();
        if (builder.getProxy() != null) {
            proxySelector = Ac.a.f1171a;
        } else {
            proxySelector = builder.getProxySelector();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = Ac.a.f1171a;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        List<l> listN = builder.n();
        this.connectionSpecs = listN;
        this.protocols = builder.z();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        this.connectTimeoutMillis = builder.getConnectTimeout();
        this.readTimeoutMillis = builder.getReadTimeout();
        this.writeTimeoutMillis = builder.getWriteTimeout();
        this.pingIntervalMillis = builder.getPingInterval();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        tc.h routeDatabase = builder.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new tc.h() : routeDatabase;
        List<l> list = listN;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = C4187g.f46893d;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).getIsTls()) {
                    if (builder.getSslSocketFactoryOrNull() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
                        Bc.c certificateChainCleaner = builder.getCertificateChainCleaner();
                        C3862t.d(certificateChainCleaner);
                        this.certificateChainCleaner = certificateChainCleaner;
                        X509TrustManager x509TrustManagerOrNull = builder.getX509TrustManagerOrNull();
                        C3862t.d(x509TrustManagerOrNull);
                        this.x509TrustManager = x509TrustManagerOrNull;
                        C4187g certificatePinner = builder.getCertificatePinner();
                        C3862t.d(certificateChainCleaner);
                        this.certificatePinner = certificatePinner.e(certificateChainCleaner);
                    } else {
                        j.Companion companion = yc.j.INSTANCE;
                        X509TrustManager x509TrustManagerP = companion.g().p();
                        this.x509TrustManager = x509TrustManagerP;
                        yc.j jVarG = companion.g();
                        C3862t.d(x509TrustManagerP);
                        this.sslSocketFactoryOrNull = jVarG.o(x509TrustManagerP);
                        c.Companion companion2 = Bc.c.INSTANCE;
                        C3862t.d(x509TrustManagerP);
                        Bc.c cVarA = companion2.a(x509TrustManagerP);
                        this.certificateChainCleaner = cVarA;
                        C4187g certificatePinner2 = builder.getCertificatePinner();
                        C3862t.d(cVarA);
                        this.certificatePinner = certificatePinner2.e(cVarA);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = C4187g.f46893d;
        }
        J();
    }

    private final void J() {
        List<w> list = this.interceptors;
        C3862t.e(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        List<w> list2 = this.networkInterceptors;
        C3862t.e(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<l> list3 = this.connectionSpecs;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).getIsTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!C3862t.b(this.certificatePinner, C4187g.f46893d)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: A, reason: from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    public final List<EnumC4177A> B() {
        return this.protocols;
    }

    /* renamed from: C, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    /* renamed from: D, reason: from getter */
    public final InterfaceC4182b getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    /* renamed from: E, reason: from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    /* renamed from: F, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    /* renamed from: G, reason: from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    /* renamed from: H, reason: from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory I() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: L, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @Override // oc.InterfaceC4185e.a
    public InterfaceC4185e b(C4178B request) {
        C3862t.g(request, "request");
        return new tc.e(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: f, reason: from getter */
    public final InterfaceC4182b getAuthenticator() {
        return this.authenticator;
    }

    /* renamed from: g, reason: from getter */
    public final C4183c getCache() {
        return this.cache;
    }

    /* renamed from: h, reason: from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    /* renamed from: i, reason: from getter */
    public final C4187g getCertificatePinner() {
        return this.certificatePinner;
    }

    /* renamed from: k, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    /* renamed from: l, reason: from getter */
    public final k getConnectionPool() {
        return this.connectionPool;
    }

    public final List<l> m() {
        return this.connectionSpecs;
    }

    /* renamed from: n, reason: from getter */
    public final n getCookieJar() {
        return this.cookieJar;
    }

    /* renamed from: o, reason: from getter */
    public final p getDispatcher() {
        return this.dispatcher;
    }

    /* renamed from: p, reason: from getter */
    public final q getDns() {
        return this.dns;
    }

    /* renamed from: q, reason: from getter */
    public final r.c getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    /* renamed from: t, reason: from getter */
    public final tc.h getRouteDatabase() {
        return this.routeDatabase;
    }

    /* renamed from: u, reason: from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<w> v() {
        return this.interceptors;
    }

    public final List<w> w() {
        return this.networkInterceptors;
    }

    public z() {
        this(new a());
    }
}

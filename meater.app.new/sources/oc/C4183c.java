package oc;

import Cc.C0982e;
import Cc.h;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.V;
import oa.C4153F;
import oc.C4178B;
import oc.C4180D;
import oc.u;
import rc.d;
import xc.InterfaceC5088a;
import yc.j;
import za.C5220a;

/* compiled from: Cache.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0004\u0010\u001571B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0018\u00010\fR\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0000¢\u0006\u0004\b(\u0010\"R\u001a\u0010-\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00109\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u00102\"\u0004\b8\u00104R\u0016\u0010;\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00100R\u0016\u0010=\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00100R\u0016\u0010?\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00100¨\u0006A"}, d2 = {"Loc/c;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Ljava/io/File;", "directory", "", "maxSize", "Lxc/a;", "fileSystem", "<init>", "(Ljava/io/File;JLxc/a;)V", "(Ljava/io/File;J)V", "Lrc/d$b;", "Lrc/d;", "editor", "Loa/F;", "a", "(Lrc/d$b;)V", "Loc/B;", "request", "Loc/D;", "b", "(Loc/B;)Loc/D;", "response", "Lrc/b;", "e", "(Loc/D;)Lrc/b;", "f", "(Loc/B;)V", "cached", "network", "m", "(Loc/D;Loc/D;)V", "flush", "()V", "close", "Lrc/c;", "cacheStrategy", "l", "(Lrc/c;)V", "k", "B", "Lrc/d;", "getCache$okhttp", "()Lrc/d;", "cache", "", "C", "I", "d", "()I", "j", "(I)V", "writeSuccessCount", "D", "c", "g", "writeAbortCount", "E", "networkCount", "F", "hitCount", "G", "requestCount", "H", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: oc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4183c implements Closeable, Flushable {

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final rc.d cache;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private int writeSuccessCount;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private int writeAbortCount;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private int networkCount;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private int hitCount;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private int requestCount;

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Loc/c$a;", "Loc/E;", "Lrc/d$d;", "Lrc/d;", "snapshot", "", "contentType", "contentLength", "<init>", "(Lrc/d$d;Ljava/lang/String;Ljava/lang/String;)V", "Loc/x;", "e", "()Loc/x;", "", "d", "()J", "LCc/g;", "g", "()LCc/g;", "D", "Lrc/d$d;", "k", "()Lrc/d$d;", "E", "Ljava/lang/String;", "F", "G", "LCc/g;", "bodySource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.c$a */
    private static final class a extends E {

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private final d.C0682d snapshot;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private final String contentType;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private final String contentLength;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private final Cc.g bodySource;

        /* compiled from: Cache.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"oc/c$a$a", "LCc/j;", "Loa/F;", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: oc.c$a$a, reason: collision with other inner class name */
        public static final class C0648a extends Cc.j {

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ a f46847C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0648a(Cc.B b10, a aVar) {
                super(b10);
                this.f46847C = aVar;
            }

            @Override // Cc.j, Cc.B, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f46847C.getSnapshot().close();
                super.close();
            }
        }

        public a(d.C0682d snapshot, String str, String str2) {
            C3862t.g(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = Cc.o.d(new C0648a(snapshot.b(1), this));
        }

        @Override // oc.E
        /* renamed from: d */
        public long getContentLength() {
            String str = this.contentLength;
            if (str != null) {
                return pc.d.V(str, -1L);
            }
            return -1L;
        }

        @Override // oc.E
        /* renamed from: e */
        public x getF46807D() {
            String str = this.contentType;
            if (str != null) {
                return x.INSTANCE.b(str);
            }
            return null;
        }

        @Override // oc.E
        /* renamed from: g, reason: from getter */
        public Cc.g getSource() {
            return this.bodySource;
        }

        /* renamed from: k, reason: from getter */
        public final d.C0682d getSnapshot() {
            return this.snapshot;
        }
    }

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u001b*\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u00020\u0004*\u00020\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, d2 = {"Loc/c$b;", "", "<init>", "()V", "Loc/u;", "", "", "d", "(Loc/u;)Ljava/util/Set;", "requestHeaders", "responseHeaders", "e", "(Loc/u;Loc/u;)Loc/u;", "Loc/v;", "url", "b", "(Loc/v;)Ljava/lang/String;", "LCc/g;", "source", "", "c", "(LCc/g;)I", "Loc/D;", "cachedResponse", "cachedRequest", "Loc/B;", "newRequest", "", "g", "(Loc/D;Loc/u;Loc/B;)Z", "a", "(Loc/D;)Z", "f", "(Loc/D;)Loc/u;", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private final Set<String> d(u uVar) {
            int size = uVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (Ub.n.t("Vary", uVar.h(i10), true)) {
                    String strW = uVar.w(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(Ub.n.v(V.f43983a));
                    }
                    Iterator it = Ub.n.w0(strW, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(Ub.n.U0((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? kotlin.collections.V.d() : treeSet;
        }

        private final u e(u requestHeaders, u responseHeaders) {
            Set<String> setD = d(responseHeaders);
            if (setD.isEmpty()) {
                return pc.d.f47752b;
            }
            u.a aVar = new u.a();
            int size = requestHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strH = requestHeaders.h(i10);
                if (setD.contains(strH)) {
                    aVar.a(strH, requestHeaders.w(i10));
                }
            }
            return aVar.e();
        }

        public final boolean a(C4180D c4180d) {
            C3862t.g(c4180d, "<this>");
            return d(c4180d.getHeaders()).contains("*");
        }

        public final String b(v url) {
            C3862t.g(url, "url");
            return Cc.h.INSTANCE.d(url.getUrl()).B().y();
        }

        public final int c(Cc.g source) throws IOException {
            C3862t.g(source, "source");
            try {
                long jM0 = source.m0();
                String strY0 = source.Y0();
                if (jM0 >= 0 && jM0 <= 2147483647L && strY0.length() <= 0) {
                    return (int) jM0;
                }
                throw new IOException("expected an int but was \"" + jM0 + strY0 + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final u f(C4180D c4180d) {
            C3862t.g(c4180d, "<this>");
            C4180D networkResponse = c4180d.getNetworkResponse();
            C3862t.d(networkResponse);
            return e(networkResponse.getRequest().getHeaders(), c4180d.getHeaders());
        }

        public final boolean g(C4180D cachedResponse, u cachedRequest, C4178B newRequest) {
            C3862t.g(cachedResponse, "cachedResponse");
            C3862t.g(cachedRequest, "cachedRequest");
            C3862t.g(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.getHeaders());
            if ((setD instanceof Collection) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!C3862t.b(cachedRequest.x(str), newRequest.e(str))) {
                    return false;
                }
            }
            return true;
        }

        private Companion() {
        }
    }

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Loc/c$d;", "Lrc/b;", "Lrc/d$b;", "Lrc/d;", "editor", "<init>", "(Loc/c;Lrc/d$b;)V", "Loa/F;", "a", "()V", "LCc/z;", "b", "()LCc/z;", "Lrc/d$b;", "LCc/z;", "cacheOut", "c", "body", "", "d", "Z", "()Z", "e", "(Z)V", "done", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.c$d */
    private final class d implements rc.b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final d.b editor;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Cc.z cacheOut;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Cc.z body;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4183c f46865e;

        /* compiled from: Cache.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"oc/c$d$a", "LCc/i;", "Loa/F;", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: oc.c$d$a */
        public static final class a extends Cc.i {

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C4183c f46866C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ d f46867D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C4183c c4183c, d dVar, Cc.z zVar) {
                super(zVar);
                this.f46866C = c4183c;
                this.f46867D = dVar;
            }

            @Override // Cc.i, Cc.z, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                C4183c c4183c = this.f46866C;
                d dVar = this.f46867D;
                synchronized (c4183c) {
                    if (dVar.getDone()) {
                        return;
                    }
                    dVar.e(true);
                    c4183c.j(c4183c.getWriteSuccessCount() + 1);
                    super.close();
                    this.f46867D.editor.b();
                }
            }
        }

        public d(C4183c c4183c, d.b editor) {
            C3862t.g(editor, "editor");
            this.f46865e = c4183c;
            this.editor = editor;
            Cc.z zVarF = editor.f(1);
            this.cacheOut = zVarF;
            this.body = new a(c4183c, this, zVarF);
        }

        @Override // rc.b
        public void a() throws IOException {
            C4183c c4183c = this.f46865e;
            synchronized (c4183c) {
                if (this.done) {
                    return;
                }
                this.done = true;
                c4183c.g(c4183c.getWriteAbortCount() + 1);
                pc.d.m(this.cacheOut);
                try {
                    this.editor.a();
                } catch (IOException unused) {
                }
            }
        }

        @Override // rc.b
        /* renamed from: b, reason: from getter */
        public Cc.z getBody() {
            return this.body;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getDone() {
            return this.done;
        }

        public final void e(boolean z10) {
            this.done = z10;
        }
    }

    public C4183c(File directory, long j10, InterfaceC5088a fileSystem) {
        C3862t.g(directory, "directory");
        C3862t.g(fileSystem, "fileSystem");
        this.cache = new rc.d(fileSystem, directory, 201105, 2, j10, sc.e.f49702i);
    }

    private final void a(d.b editor) {
        if (editor != null) {
            try {
                editor.a();
            } catch (IOException unused) {
            }
        }
    }

    public final C4180D b(C4178B request) throws IOException {
        C3862t.g(request, "request");
        try {
            d.C0682d c0682dP = this.cache.p(INSTANCE.b(request.getUrl()));
            if (c0682dP == null) {
                return null;
            }
            try {
                C0649c c0649c = new C0649c(c0682dP.b(0));
                C4180D c4180dD = c0649c.d(c0682dP);
                if (c0649c.b(request, c4180dD)) {
                    return c4180dD;
                }
                E body = c4180dD.getBody();
                if (body != null) {
                    pc.d.m(body);
                }
                return null;
            } catch (IOException unused) {
                pc.d.m(c0682dP);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    /* renamed from: c, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    /* renamed from: d, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final rc.b e(C4180D response) {
        d.b bVarO;
        C3862t.g(response, "response");
        String method = response.getRequest().getMethod();
        if (uc.f.f50537a.a(response.getRequest().getMethod())) {
            try {
                f(response.getRequest());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!C3862t.b(method, "GET")) {
            return null;
        }
        Companion companion = INSTANCE;
        if (companion.a(response)) {
            return null;
        }
        C0649c c0649c = new C0649c(response);
        try {
            bVarO = rc.d.o(this.cache, companion.b(response.getRequest().getUrl()), 0L, 2, null);
            if (bVarO == null) {
                return null;
            }
            try {
                c0649c.f(bVarO);
                return new d(this, bVarO);
            } catch (IOException unused2) {
                a(bVarO);
                return null;
            }
        } catch (IOException unused3) {
            bVarO = null;
        }
    }

    public final void f(C4178B request) {
        C3862t.g(request, "request");
        this.cache.P(INSTANCE.b(request.getUrl()));
    }

    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    public final void g(int i10) {
        this.writeAbortCount = i10;
    }

    public final void j(int i10) {
        this.writeSuccessCount = i10;
    }

    public final synchronized void k() {
        this.hitCount++;
    }

    public final synchronized void l(rc.c cacheStrategy) {
        try {
            C3862t.g(cacheStrategy, "cacheStrategy");
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void m(C4180D cached, C4180D network) {
        d.b bVarA;
        C3862t.g(cached, "cached");
        C3862t.g(network, "network");
        C0649c c0649c = new C0649c(network);
        E body = cached.getBody();
        C3862t.e(body, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVarA = ((a) body).getSnapshot().a();
            if (bVarA == null) {
                return;
            }
            try {
                c0649c.f(bVarA);
                bVarA.b();
            } catch (IOException unused) {
                a(bVarA);
            }
        } catch (IOException unused2) {
            bVarA = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4183c(File directory, long j10) {
        this(directory, j10, InterfaceC5088a.f52921b);
        C3862t.g(directory, "directory");
    }

    /* compiled from: Cache.kt */
    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0002\u0018\u0000 B2\u00020\u0001:\u0001$B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0015R\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00062\n\u0010 \u001a\u00060\u001fR\u00020\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u00103\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0014\u00105\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010(R\u0016\u00109\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010A\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010@¨\u0006C"}, d2 = {"Loc/c$c;", "", "LCc/B;", "rawSource", "<init>", "(LCc/B;)V", "Loc/D;", "response", "(Loc/D;)V", "LCc/g;", "source", "", "Ljava/security/cert/Certificate;", "c", "(LCc/g;)Ljava/util/List;", "LCc/f;", "sink", "certificates", "Loa/F;", "e", "(LCc/f;Ljava/util/List;)V", "Lrc/d$b;", "Lrc/d;", "editor", "f", "(Lrc/d$b;)V", "Loc/B;", "request", "", "b", "(Loc/B;Loc/D;)Z", "Lrc/d$d;", "snapshot", "d", "(Lrc/d$d;)Loc/D;", "Loc/v;", "a", "Loc/v;", "url", "Loc/u;", "Loc/u;", "varyHeaders", "", "Ljava/lang/String;", "requestMethod", "Loc/A;", "Loc/A;", "protocol", "", "I", "code", "message", "g", "responseHeaders", "Loc/t;", "h", "Loc/t;", "handshake", "", "i", "J", "sentRequestMillis", "j", "receivedResponseMillis", "()Z", "isHttps", "k", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.c$c, reason: collision with other inner class name */
    private static final class C0649c {

        /* renamed from: l, reason: collision with root package name */
        private static final String f46849l;

        /* renamed from: m, reason: collision with root package name */
        private static final String f46850m;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final v url;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final u varyHeaders;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String requestMethod;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final EnumC4177A protocol;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int code;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final u responseHeaders;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final t handshake;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final long sentRequestMillis;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final long receivedResponseMillis;

        static {
            StringBuilder sb2 = new StringBuilder();
            j.Companion companion = yc.j.INSTANCE;
            sb2.append(companion.g().g());
            sb2.append("-Sent-Millis");
            f46849l = sb2.toString();
            f46850m = companion.g().g() + "-Received-Millis";
        }

        public C0649c(Cc.B rawSource) {
            C3862t.g(rawSource, "rawSource");
            try {
                Cc.g gVarD = Cc.o.d(rawSource);
                String strY0 = gVarD.Y0();
                v vVarF = v.INSTANCE.f(strY0);
                if (vVarF == null) {
                    IOException iOException = new IOException("Cache corruption for " + strY0);
                    yc.j.INSTANCE.g().k("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = vVarF;
                this.requestMethod = gVarD.Y0();
                u.a aVar = new u.a();
                int iC = C4183c.INSTANCE.c(gVarD);
                for (int i10 = 0; i10 < iC; i10++) {
                    aVar.c(gVarD.Y0());
                }
                this.varyHeaders = aVar.e();
                uc.k kVarA = uc.k.INSTANCE.a(gVarD.Y0());
                this.protocol = kVarA.protocol;
                this.code = kVarA.code;
                this.message = kVarA.message;
                u.a aVar2 = new u.a();
                int iC2 = C4183c.INSTANCE.c(gVarD);
                for (int i11 = 0; i11 < iC2; i11++) {
                    aVar2.c(gVarD.Y0());
                }
                String str = f46849l;
                String strF = aVar2.f(str);
                String str2 = f46850m;
                String strF2 = aVar2.f(str2);
                aVar2.h(str);
                aVar2.h(str2);
                this.sentRequestMillis = strF != null ? Long.parseLong(strF) : 0L;
                this.receivedResponseMillis = strF2 != null ? Long.parseLong(strF2) : 0L;
                this.responseHeaders = aVar2.e();
                if (a()) {
                    String strY02 = gVarD.Y0();
                    if (strY02.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strY02 + '\"');
                    }
                    this.handshake = t.INSTANCE.b(!gVarD.c0() ? G.INSTANCE.a(gVarD.Y0()) : G.SSL_3_0, i.INSTANCE.b(gVarD.Y0()), c(gVarD), c(gVarD));
                } else {
                    this.handshake = null;
                }
                C4153F c4153f = C4153F.f46609a;
                C5220a.a(rawSource, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    C5220a.a(rawSource, th);
                    throw th2;
                }
            }
        }

        private final boolean a() {
            return C3862t.b(this.url.getScheme(), "https");
        }

        private final List<Certificate> c(Cc.g source) throws IOException, CertificateException {
            int iC = C4183c.INSTANCE.c(source);
            if (iC == -1) {
                return kotlin.collections.r.m();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i10 = 0; i10 < iC; i10++) {
                    String strY0 = source.Y0();
                    C0982e c0982e = new C0982e();
                    Cc.h hVarA = Cc.h.INSTANCE.a(strY0);
                    if (hVarA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    c0982e.t0(hVarA);
                    arrayList.add(certificateFactory.generateCertificate(c0982e.A1()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void e(Cc.f sink, List<? extends Certificate> certificates) throws IOException, CertificateEncodingException {
            try {
                sink.v1(certificates.size()).d0(10);
                Iterator<? extends Certificate> it = certificates.iterator();
                while (it.hasNext()) {
                    byte[] bytes = it.next().getEncoded();
                    h.Companion companion = Cc.h.INSTANCE;
                    C3862t.f(bytes, "bytes");
                    sink.A0(h.Companion.g(companion, bytes, 0, 0, 3, null).c()).d0(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean b(C4178B request, C4180D response) {
            C3862t.g(request, "request");
            C3862t.g(response, "response");
            return C3862t.b(this.url, request.getUrl()) && C3862t.b(this.requestMethod, request.getMethod()) && C4183c.INSTANCE.g(response, this.varyHeaders, request);
        }

        public final C4180D d(d.C0682d snapshot) {
            C3862t.g(snapshot, "snapshot");
            String strC = this.responseHeaders.c("Content-Type");
            String strC2 = this.responseHeaders.c("Content-Length");
            return new C4180D.a().r(new C4178B.a().j(this.url).f(this.requestMethod, null).e(this.varyHeaders).b()).p(this.protocol).g(this.code).m(this.message).k(this.responseHeaders).b(new a(snapshot, strC, strC2)).i(this.handshake).s(this.sentRequestMillis).q(this.receivedResponseMillis).c();
        }

        public final void f(d.b editor) {
            C3862t.g(editor, "editor");
            Cc.f fVarC = Cc.o.c(editor.f(0));
            try {
                fVarC.A0(this.url.getUrl()).d0(10);
                fVarC.A0(this.requestMethod).d0(10);
                fVarC.v1(this.varyHeaders.size()).d0(10);
                int size = this.varyHeaders.size();
                for (int i10 = 0; i10 < size; i10++) {
                    fVarC.A0(this.varyHeaders.h(i10)).A0(": ").A0(this.varyHeaders.w(i10)).d0(10);
                }
                fVarC.A0(new uc.k(this.protocol, this.code, this.message).toString()).d0(10);
                fVarC.v1(this.responseHeaders.size() + 2).d0(10);
                int size2 = this.responseHeaders.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    fVarC.A0(this.responseHeaders.h(i11)).A0(": ").A0(this.responseHeaders.w(i11)).d0(10);
                }
                fVarC.A0(f46849l).A0(": ").v1(this.sentRequestMillis).d0(10);
                fVarC.A0(f46850m).A0(": ").v1(this.receivedResponseMillis).d0(10);
                if (a()) {
                    fVarC.d0(10);
                    t tVar = this.handshake;
                    C3862t.d(tVar);
                    fVarC.A0(tVar.getCipherSuite().getJavaName()).d0(10);
                    e(fVarC, this.handshake.d());
                    e(fVarC, this.handshake.c());
                    fVarC.A0(this.handshake.getTlsVersion().getJavaName()).d0(10);
                }
                C4153F c4153f = C4153F.f46609a;
                C5220a.a(fVarC, null);
            } finally {
            }
        }

        public C0649c(C4180D response) {
            C3862t.g(response, "response");
            this.url = response.getRequest().getUrl();
            this.varyHeaders = C4183c.INSTANCE.f(response);
            this.requestMethod = response.getRequest().getMethod();
            this.protocol = response.getProtocol();
            this.code = response.getCode();
            this.message = response.getMessage();
            this.responseHeaders = response.getHeaders();
            this.handshake = response.getHandshake();
            this.sentRequestMillis = response.getSentRequestAtMillis();
            this.receivedResponseMillis = response.getReceivedResponseAtMillis();
        }
    }
}

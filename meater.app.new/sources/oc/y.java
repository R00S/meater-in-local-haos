package oc;

import Cc.C0982e;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oc.x;

/* compiled from: MultipartBody.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0003\u0014\u0012\u001aB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0005\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\b\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0016\u0010#\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Loc/y;", "Loc/C;", "LCc/h;", "boundaryByteString", "Loc/x;", "type", "", "Loc/y$c;", "parts", "<init>", "(LCc/h;Loc/x;Ljava/util/List;)V", "LCc/f;", "sink", "", "countBytes", "", "j", "(LCc/f;Z)J", "b", "()Loc/x;", "a", "()J", "Loa/F;", "h", "(LCc/f;)V", "LCc/h;", "c", "Loc/x;", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "contentType", "f", "J", "contentLength", "", "i", "()Ljava/lang/String;", "boundary", "g", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y extends AbstractC4179C {

    /* renamed from: h, reason: collision with root package name */
    public static final x f47121h;

    /* renamed from: i, reason: collision with root package name */
    public static final x f47122i;

    /* renamed from: j, reason: collision with root package name */
    public static final x f47123j;

    /* renamed from: k, reason: collision with root package name */
    public static final x f47124k;

    /* renamed from: l, reason: collision with root package name */
    public static final x f47125l;

    /* renamed from: m, reason: collision with root package name */
    private static final byte[] f47126m;

    /* renamed from: n, reason: collision with root package name */
    private static final byte[] f47127n;

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f47128o;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Cc.h boundaryByteString;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<c> parts;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x contentType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long contentLength;

    /* compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"Loc/y$a;", "", "", "boundary", "<init>", "(Ljava/lang/String;)V", "Loc/x;", "type", "d", "(Loc/x;)Loc/y$a;", "Loc/u;", "headers", "Loc/C;", "body", "a", "(Loc/u;Loc/C;)Loc/y$a;", "Loc/y$c;", "part", "b", "(Loc/y$c;)Loc/y$a;", "Loc/y;", "c", "()Loc/y;", "LCc/h;", "LCc/h;", "Loc/x;", "", "Ljava/util/List;", "parts", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Cc.h boundary;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private x type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<c> parts;

        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(u headers, AbstractC4179C body) {
            C3862t.g(body, "body");
            b(c.INSTANCE.a(headers, body));
            return this;
        }

        public final a b(c part) {
            C3862t.g(part, "part");
            this.parts.add(part);
            return this;
        }

        public final y c() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new y(this.boundary, this.type, pc.d.T(this.parts));
        }

        public final a d(x type) {
            C3862t.g(type, "type");
            if (C3862t.b(type.getType(), "multipart")) {
                this.type = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public a(String boundary) {
            C3862t.g(boundary, "boundary");
            this.boundary = Cc.h.INSTANCE.d(boundary);
            this.type = y.f47121h;
            this.parts = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i10, C3854k c3854k) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                C3862t.f(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    /* compiled from: MultipartBody.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Loc/y$c;", "", "Loc/u;", "headers", "Loc/C;", "body", "<init>", "(Loc/u;Loc/C;)V", "a", "Loc/u;", "b", "()Loc/u;", "Loc/C;", "()Loc/C;", "c", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final u headers;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final AbstractC4179C body;

        /* compiled from: MultipartBody.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Loc/y$c$a;", "", "<init>", "()V", "Loc/u;", "headers", "Loc/C;", "body", "Loc/y$c;", "a", "(Loc/u;Loc/C;)Loc/y$c;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: oc.y$c$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final c a(u headers, AbstractC4179C body) {
                C3862t.g(body, "body");
                C3854k c3854k = null;
                if ((headers != null ? headers.c("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((headers != null ? headers.c("Content-Length") : null) == null) {
                    return new c(headers, body, c3854k);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            private Companion() {
            }
        }

        public /* synthetic */ c(u uVar, AbstractC4179C abstractC4179C, C3854k c3854k) {
            this(uVar, abstractC4179C);
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC4179C getBody() {
            return this.body;
        }

        /* renamed from: b, reason: from getter */
        public final u getHeaders() {
            return this.headers;
        }

        private c(u uVar, AbstractC4179C abstractC4179C) {
            this.headers = uVar;
            this.body = abstractC4179C;
        }
    }

    static {
        x.Companion companion = x.INSTANCE;
        f47121h = companion.a("multipart/mixed");
        f47122i = companion.a("multipart/alternative");
        f47123j = companion.a("multipart/digest");
        f47124k = companion.a("multipart/parallel");
        f47125l = companion.a("multipart/form-data");
        f47126m = new byte[]{58, 32};
        f47127n = new byte[]{13, 10};
        f47128o = new byte[]{45, 45};
    }

    public y(Cc.h boundaryByteString, x type, List<c> parts) {
        C3862t.g(boundaryByteString, "boundaryByteString");
        C3862t.g(type, "type");
        C3862t.g(parts, "parts");
        this.boundaryByteString = boundaryByteString;
        this.type = type;
        this.parts = parts;
        this.contentType = x.INSTANCE.a(type + "; boundary=" + i());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long j(Cc.f sink, boolean countBytes) throws EOFException {
        C0982e c0982e;
        if (countBytes) {
            sink = new C0982e();
            c0982e = sink;
        } else {
            c0982e = 0;
        }
        int size = this.parts.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.parts.get(i10);
            u headers = cVar.getHeaders();
            AbstractC4179C body = cVar.getBody();
            C3862t.d(sink);
            sink.i1(f47128o);
            sink.t0(this.boundaryByteString);
            sink.i1(f47127n);
            if (headers != null) {
                int size2 = headers.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    sink.A0(headers.h(i11)).i1(f47126m).A0(headers.w(i11)).i1(f47127n);
                }
            }
            x contentType = body.getContentType();
            if (contentType != null) {
                sink.A0("Content-Type: ").A0(contentType.getMediaType()).i1(f47127n);
            }
            long jA = body.a();
            if (jA != -1) {
                sink.A0("Content-Length: ").v1(jA).i1(f47127n);
            } else if (countBytes) {
                C3862t.d(c0982e);
                c0982e.b();
                return -1L;
            }
            byte[] bArr = f47127n;
            sink.i1(bArr);
            if (countBytes) {
                j10 += jA;
            } else {
                body.h(sink);
            }
            sink.i1(bArr);
        }
        C3862t.d(sink);
        byte[] bArr2 = f47128o;
        sink.i1(bArr2);
        sink.t0(this.boundaryByteString);
        sink.i1(bArr2);
        sink.i1(f47127n);
        if (!countBytes) {
            return j10;
        }
        C3862t.d(c0982e);
        long size3 = j10 + c0982e.getSize();
        c0982e.b();
        return size3;
    }

    @Override // oc.AbstractC4179C
    public long a() throws EOFException {
        long j10 = this.contentLength;
        if (j10 != -1) {
            return j10;
        }
        long j11 = j(null, true);
        this.contentLength = j11;
        return j11;
    }

    @Override // oc.AbstractC4179C
    /* renamed from: b, reason: from getter */
    public x getContentType() {
        return this.contentType;
    }

    @Override // oc.AbstractC4179C
    public void h(Cc.f sink) throws EOFException {
        C3862t.g(sink, "sink");
        j(sink, false);
    }

    public final String i() {
        return this.boundaryByteString.N();
    }
}

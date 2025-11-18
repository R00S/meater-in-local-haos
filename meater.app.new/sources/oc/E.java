package oc;

import Cc.C0982e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.InterfaceC4156a;
import za.C5220a;

/* compiled from: ResponseBody.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0011\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u0003R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Loc/E;", "Ljava/io/Closeable;", "<init>", "()V", "Ljava/nio/charset/Charset;", "c", "()Ljava/nio/charset/Charset;", "Loc/x;", "e", "()Loc/x;", "", "d", "()J", "LCc/g;", "g", "()LCc/g;", "", "a", "()[B", "Ljava/io/Reader;", "b", "()Ljava/io/Reader;", "", "j", "()Ljava/lang/String;", "Loa/F;", "close", "B", "Ljava/io/Reader;", "reader", "C", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class E implements Closeable {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private Reader reader;

    /* compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Loc/E$a;", "Ljava/io/Reader;", "LCc/g;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(LCc/g;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "Loa/F;", "close", "()V", "B", "LCc/g;", "C", "Ljava/nio/charset/Charset;", "", "D", "Z", "closed", "E", "Ljava/io/Reader;", "delegate", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Reader {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final Cc.g source;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private final Charset charset;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private Reader delegate;

        public a(Cc.g source, Charset charset) {
            C3862t.g(source, "source");
            C3862t.g(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C4153F c4153f;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                c4153f = C4153F.f46609a;
            } else {
                c4153f = null;
            }
            if (c4153f == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws IOException {
            C3862t.g(cbuf, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.A1(), pc.d.J(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    /* compiled from: ResponseBody.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Loc/E$b;", "", "<init>", "()V", "", "Loc/x;", "contentType", "Loc/E;", "c", "([BLoc/x;)Loc/E;", "LCc/g;", "", "contentLength", "a", "(LCc/g;Loc/x;J)Loc/E;", "content", "b", "(Loc/x;JLCc/g;)Loc/E;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.E$b, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: ResponseBody.kt */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"oc/E$b$a", "Loc/E;", "Loc/x;", "e", "()Loc/x;", "", "d", "()J", "LCc/g;", "g", "()LCc/g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: oc.E$b$a */
        public static final class a extends E {

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ x f46807D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ long f46808E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ Cc.g f46809F;

            a(x xVar, long j10, Cc.g gVar) {
                this.f46807D = xVar;
                this.f46808E = j10;
                this.f46809F = gVar;
            }

            @Override // oc.E
            /* renamed from: d, reason: from getter */
            public long getF46808E() {
                return this.f46808E;
            }

            @Override // oc.E
            /* renamed from: e, reason: from getter */
            public x getF46807D() {
                return this.f46807D;
            }

            @Override // oc.E
            /* renamed from: g, reason: from getter */
            public Cc.g getF46809F() {
                return this.f46809F;
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public static /* synthetic */ E d(Companion companion, byte[] bArr, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return companion.c(bArr, xVar);
        }

        public final E a(Cc.g gVar, x xVar, long j10) {
            C3862t.g(gVar, "<this>");
            return new a(xVar, j10, gVar);
        }

        @InterfaceC4156a
        public final E b(x contentType, long contentLength, Cc.g content) {
            C3862t.g(content, "content");
            return a(content, contentType, contentLength);
        }

        public final E c(byte[] bArr, x xVar) {
            C3862t.g(bArr, "<this>");
            return a(new C0982e().i1(bArr), xVar, bArr.length);
        }

        private Companion() {
        }
    }

    private final Charset c() {
        Charset charsetC;
        x f46807d = getF46807D();
        return (f46807d == null || (charsetC = f46807d.c(Ub.d.UTF_8)) == null) ? Ub.d.UTF_8 : charsetC;
    }

    @InterfaceC4156a
    public static final E f(x xVar, long j10, Cc.g gVar) {
        return INSTANCE.b(xVar, j10, gVar);
    }

    public final byte[] a() throws IOException {
        long f46808e = getF46808E();
        if (f46808e > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + f46808e);
        }
        Cc.g f46809f = getF46809F();
        try {
            byte[] bArrZ = f46809f.Z();
            C5220a.a(f46809f, null);
            int length = bArrZ.length;
            if (f46808e == -1 || f46808e == length) {
                return bArrZ;
            }
            throw new IOException("Content-Length (" + f46808e + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    public final Reader b() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(getF46809F(), c());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        pc.d.m(getF46809F());
    }

    /* renamed from: d */
    public abstract long getF46808E();

    /* renamed from: e */
    public abstract x getF46807D();

    /* renamed from: g */
    public abstract Cc.g getF46809F();

    public final String j() {
        Cc.g f46809f = getF46809F();
        try {
            String strE0 = f46809f.E0(pc.d.J(f46809f, c()));
            C5220a.a(f46809f, null);
            return strE0;
        } finally {
        }
    }
}

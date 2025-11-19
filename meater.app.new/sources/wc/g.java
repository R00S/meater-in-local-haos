package wc;

import Cc.B;
import Cc.C;
import Cc.C0982e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import wc.c;

/* compiled from: Http2Reader.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u0001:\u00034# B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J/\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0010J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J/\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J/\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u0010J/\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u0010J/\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u0010J\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lwc/g;", "Ljava/io/Closeable;", "LCc/g;", "source", "", "client", "<init>", "(LCc/g;Z)V", "Lwc/g$c;", "handler", "", "length", "flags", "streamId", "Loa/F;", "g", "(Lwc/g$c;III)V", "padding", "", "Lwc/b;", "f", "(IIII)Ljava/util/List;", "d", "l", "k", "(Lwc/g$c;I)V", "n", "o", "m", "j", "e", "p", "c", "(Lwc/g$c;)V", "requireSettings", "b", "(ZLwc/g$c;)Z", "close", "()V", "B", "LCc/g;", "C", "Z", "Lwc/g$b;", "D", "Lwc/g$b;", "continuation", "Lwc/c$a;", "E", "Lwc/c$a;", "hpackReader", "F", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements Closeable {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: G, reason: collision with root package name */
    private static final Logger f52156G;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Cc.g source;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final boolean client;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final b continuation;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final c.a hpackReader;

    /* compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwc/g$a;", "", "<init>", "()V", "", "length", "flags", "padding", "b", "(III)I", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: wc.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final Logger a() {
            return g.f52156G;
        }

        public final int b(int length, int flags, int padding) throws IOException {
            if ((flags & 8) != 0) {
                length--;
            }
            if (padding <= length) {
                return length - padding;
            }
            throw new IOException("PROTOCOL_ERROR padding " + padding + " > remaining length " + length);
        }

        private Companion() {
        }
    }

    /* compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H&¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J/\u0010.\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010/J-\u00102\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lwc/g$c;", "", "", "inFinished", "", "streamId", "LCc/g;", "source", "length", "Loa/F;", "d", "(ZILCc/g;I)V", "associatedStreamId", "", "Lwc/b;", "headerBlock", "b", "(ZIILjava/util/List;)V", "Lwc/a;", "errorCode", "n", "(ILwc/a;)V", "clearPrevious", "Lwc/l;", "settings", "o", "(ZLwc/l;)V", "a", "()V", "ack", "payload1", "payload2", "i", "(ZII)V", "lastGoodStreamId", "LCc/h;", "debugData", "j", "(ILwc/a;LCc/h;)V", "", "windowSizeIncrement", "c", "(IJ)V", "streamDependency", "weight", "exclusive", "m", "(IIIZ)V", "promisedStreamId", "requestHeaders", "p", "(IILjava/util/List;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {
        void a();

        void b(boolean inFinished, int streamId, int associatedStreamId, List<wc.b> headerBlock);

        void c(int streamId, long windowSizeIncrement);

        void d(boolean inFinished, int streamId, Cc.g source, int length);

        void i(boolean ack, int payload1, int payload2);

        void j(int lastGoodStreamId, a errorCode, Cc.h debugData);

        void m(int streamId, int streamDependency, int weight, boolean exclusive);

        void n(int streamId, a errorCode);

        void o(boolean clearPrevious, l settings);

        void p(int streamId, int promisedStreamId, List<wc.b> requestHeaders);
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        C3862t.f(logger, "getLogger(Http2::class.java.name)");
        f52156G = logger;
    }

    public g(Cc.g source, boolean z10) {
        C3862t.g(source, "source");
        this.source = source;
        this.client = z10;
        b bVar = new b(source);
        this.continuation = bVar;
        this.hpackReader = new c.a(bVar, 4096, 0, 4, null);
    }

    private final void d(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (flags & 1) != 0;
        if ((flags & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int iD = (flags & 8) != 0 ? pc.d.d(this.source.readByte(), 255) : 0;
        handler.d(z10, streamId, this.source, INSTANCE.b(length, flags, iD));
        this.source.w(iD);
    }

    private final void e(c handler, int length, int flags, int streamId) throws IOException {
        if (length < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i10 = this.source.readInt();
        int i11 = this.source.readInt();
        int i12 = length - 8;
        a aVarA = a.INSTANCE.a(i11);
        if (aVarA == null) {
            throw new IOException("TYPE_GOAWAY unexpected error code: " + i11);
        }
        Cc.h hVarH = Cc.h.f3238F;
        if (i12 > 0) {
            hVarH = this.source.H(i12);
        }
        handler.j(i10, aVarA, hVarH);
    }

    private final List<wc.b> f(int length, int padding, int flags, int streamId) throws IOException {
        this.continuation.d(length);
        b bVar = this.continuation;
        bVar.e(bVar.getLeft());
        this.continuation.f(padding);
        this.continuation.c(flags);
        this.continuation.g(streamId);
        this.hpackReader.k();
        return this.hpackReader.e();
    }

    private final void g(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z10 = (flags & 1) != 0;
        int iD = (flags & 8) != 0 ? pc.d.d(this.source.readByte(), 255) : 0;
        if ((flags & 32) != 0) {
            k(handler, streamId);
            length -= 5;
        }
        handler.b(z10, streamId, -1, f(INSTANCE.b(length, flags, iD), iD, flags, streamId));
    }

    private final void j(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 8) {
            throw new IOException("TYPE_PING length != 8: " + length);
        }
        if (streamId != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.i((flags & 1) != 0, this.source.readInt(), this.source.readInt());
    }

    private final void k(c handler, int streamId) {
        int i10 = this.source.readInt();
        handler.m(streamId, i10 & Integer.MAX_VALUE, pc.d.d(this.source.readByte(), 255) + 1, (Integer.MIN_VALUE & i10) != 0);
    }

    private final void l(c handler, int length, int flags, int streamId) throws IOException {
        if (length == 5) {
            if (streamId == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            k(handler, streamId);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + length + " != 5");
        }
    }

    private final void m(c handler, int length, int flags, int streamId) throws IOException {
        if (streamId == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int iD = (flags & 8) != 0 ? pc.d.d(this.source.readByte(), 255) : 0;
        handler.p(streamId, this.source.readInt() & Integer.MAX_VALUE, f(INSTANCE.b(length - 4, flags, iD), iD, flags, streamId));
    }

    private final void n(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + length + " != 4");
        }
        if (streamId == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int i10 = this.source.readInt();
        a aVarA = a.INSTANCE.a(i10);
        if (aVarA != null) {
            handler.n(streamId, aVarA);
            return;
        }
        throw new IOException("TYPE_RST_STREAM unexpected error code: " + i10);
    }

    private final void o(c handler, int length, int flags, int streamId) throws IOException {
        int i10;
        if (streamId != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((flags & 1) != 0) {
            if (length != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.a();
            return;
        }
        if (length % 6 != 0) {
            throw new IOException("TYPE_SETTINGS length % 6 != 0: " + length);
        }
        l lVar = new l();
        Ha.d dVarO = Ha.g.o(Ha.g.p(0, length), 6);
        int first = dVarO.getFirst();
        int last = dVarO.getLast();
        int step = dVarO.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                int iE = pc.d.e(this.source.readShort(), 65535);
                i10 = this.source.readInt();
                if (iE != 2) {
                    if (iE == 3) {
                        iE = 4;
                    } else if (iE != 4) {
                        if (iE == 5 && (i10 < 16384 || i10 > 16777215)) {
                            break;
                        }
                    } else {
                        if (i10 < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        iE = 7;
                    }
                } else if (i10 != 0 && i10 != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                lVar.h(iE, i10);
                if (first == last) {
                    break;
                } else {
                    first += step;
                }
            }
            throw new IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + i10);
        }
        handler.o(false, lVar);
    }

    private final void p(c handler, int length, int flags, int streamId) throws IOException {
        if (length != 4) {
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + length);
        }
        long jF = pc.d.f(this.source.readInt(), 2147483647L);
        if (jF == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.c(streamId, jF);
    }

    public final boolean b(boolean requireSettings, c handler) throws IOException {
        C3862t.g(handler, "handler");
        try {
            this.source.t1(9L);
            int iK = pc.d.K(this.source);
            if (iK > 16384) {
                throw new IOException("FRAME_SIZE_ERROR: " + iK);
            }
            int iD = pc.d.d(this.source.readByte(), 255);
            int iD2 = pc.d.d(this.source.readByte(), 255);
            int i10 = this.source.readInt() & Integer.MAX_VALUE;
            Logger logger = f52156G;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(d.f52064a.c(true, i10, iK, iD, iD2));
            }
            if (requireSettings && iD != 4) {
                throw new IOException("Expected a SETTINGS frame but was " + d.f52064a.b(iD));
            }
            switch (iD) {
                case 0:
                    d(handler, iK, iD2, i10);
                    return true;
                case 1:
                    g(handler, iK, iD2, i10);
                    return true;
                case 2:
                    l(handler, iK, iD2, i10);
                    return true;
                case 3:
                    n(handler, iK, iD2, i10);
                    return true;
                case 4:
                    o(handler, iK, iD2, i10);
                    return true;
                case 5:
                    m(handler, iK, iD2, i10);
                    return true;
                case 6:
                    j(handler, iK, iD2, i10);
                    return true;
                case 7:
                    e(handler, iK, iD2, i10);
                    return true;
                case 8:
                    p(handler, iK, iD2, i10);
                    return true;
                default:
                    this.source.w(iK);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(c handler) throws IOException {
        C3862t.g(handler, "handler");
        if (this.client) {
            if (!b(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        Cc.g gVar = this.source;
        Cc.h hVar = d.CONNECTION_PREFACE;
        Cc.h hVarH = gVar.H(hVar.J());
        Logger logger = f52156G;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(pc.d.t("<< CONNECTION " + hVarH.y(), new Object[0]));
        }
        if (C3862t.b(hVar, hVarH)) {
            return;
        }
        throw new IOException("Expected a connection header but was " + hVarH.N());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    /* compiled from: Http2Reader.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010$\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\"\u0010(\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\"\u0010,\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001b¨\u0006-"}, d2 = {"Lwc/g$b;", "LCc/B;", "LCc/g;", "source", "<init>", "(LCc/g;)V", "Loa/F;", "b", "()V", "LCc/e;", "sink", "", "byteCount", "I0", "(LCc/e;J)J", "LCc/C;", "r", "()LCc/C;", "close", "B", "LCc/g;", "", "C", "I", "getLength", "()I", "e", "(I)V", "length", "D", "getFlags", "c", "flags", "E", "getStreamId", "g", "streamId", "F", "a", "d", "left", "G", "getPadding", "f", "padding", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements B {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final Cc.g source;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private int length;

        /* renamed from: D, reason: collision with root package name and from kotlin metadata */
        private int flags;

        /* renamed from: E, reason: collision with root package name and from kotlin metadata */
        private int streamId;

        /* renamed from: F, reason: collision with root package name and from kotlin metadata */
        private int left;

        /* renamed from: G, reason: collision with root package name and from kotlin metadata */
        private int padding;

        public b(Cc.g source) {
            C3862t.g(source, "source");
            this.source = source;
        }

        private final void b() throws IOException {
            int i10 = this.streamId;
            int iK = pc.d.K(this.source);
            this.left = iK;
            this.length = iK;
            int iD = pc.d.d(this.source.readByte(), 255);
            this.flags = pc.d.d(this.source.readByte(), 255);
            Companion companion = g.INSTANCE;
            if (companion.a().isLoggable(Level.FINE)) {
                companion.a().fine(d.f52064a.c(true, this.streamId, this.length, iD, this.flags));
            }
            int i11 = this.source.readInt() & Integer.MAX_VALUE;
            this.streamId = i11;
            if (iD == 9) {
                if (i11 != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(iD + " != TYPE_CONTINUATION");
            }
        }

        @Override // Cc.B
        public long I0(C0982e sink, long byteCount) throws IOException {
            C3862t.g(sink, "sink");
            while (true) {
                int i10 = this.left;
                if (i10 != 0) {
                    long jI0 = this.source.I0(sink, Math.min(byteCount, i10));
                    if (jI0 == -1) {
                        return -1L;
                    }
                    this.left -= (int) jI0;
                    return jI0;
                }
                this.source.w(this.padding);
                this.padding = 0;
                if ((this.flags & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        /* renamed from: a, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        public final void c(int i10) {
            this.flags = i10;
        }

        public final void d(int i10) {
            this.left = i10;
        }

        public final void e(int i10) {
            this.length = i10;
        }

        public final void f(int i10) {
            this.padding = i10;
        }

        public final void g(int i10) {
            this.streamId = i10;
        }

        @Override // Cc.B
        /* renamed from: r */
        public C getTimeout() {
            return this.source.getTimeout();
        }

        @Override // Cc.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}

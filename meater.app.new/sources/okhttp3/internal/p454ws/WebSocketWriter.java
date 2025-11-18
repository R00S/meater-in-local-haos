package okhttp3.internal.p454ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p353j.C9703f;
import p353j.C9710i;
import p353j.InterfaceC9705g;

/* compiled from: WebSocketWriter.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010.\u001a\u00020\u0017\u0012\u0006\u0010'\u001a\u00020\u0017\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b4\u00105J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0019\u0010#\u001a\u00020\"8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u0016\u0010/\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010!R\u0016\u00100\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, m32267d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", HttpUrl.FRAGMENT_ENCODE_SET, "opcode", "Lj/i;", "payload", "Lkotlin/u;", "writeControlFrame", "(ILj/i;)V", "writePing", "(Lj/i;)V", "writePong", "code", "reason", "writeClose", "formatOpcode", "data", "writeMessageFrame", "close", "()V", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", HttpUrl.FRAGMENT_ENCODE_SET, "isClient", "Z", "Ljava/util/Random;", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "Lj/f;", "sinkBuffer", "Lj/f;", "Lj/g;", "sink", "Lj/g;", "getSink", "()Lj/g;", "noContextTakeover", HttpUrl.FRAGMENT_ENCODE_SET, "minimumDeflateSize", "J", HttpUrl.FRAGMENT_ENCODE_SET, "maskKey", "[B", "perMessageDeflate", "messageBuffer", "writerClosed", "Lj/f$a;", "maskCursor", "Lj/f$a;", "<init>", "(ZLj/g;Ljava/util/Random;ZZJ)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final C9703f.a maskCursor;
    private final byte[] maskKey;
    private final C9703f messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final InterfaceC9705g sink;
    private final C9703f sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, InterfaceC9705g interfaceC9705g, Random random, boolean z2, boolean z3, long j2) {
        C9801m.m32346f(interfaceC9705g, "sink");
        C9801m.m32346f(random, "random");
        this.isClient = z;
        this.sink = interfaceC9705g;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j2;
        this.messageBuffer = new C9703f();
        this.sinkBuffer = interfaceC9705g.mo32042i();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new C9703f.a() : null;
    }

    private final void writeControlFrame(int opcode, C9710i payload) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int iM32093P = payload.m32093P();
        if (!(((long) iM32093P) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.sinkBuffer.writeByte(opcode | 128);
        if (this.isClient) {
            this.sinkBuffer.writeByte(iM32093P | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            C9801m.m32343c(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (iM32093P > 0) {
                long size = this.sinkBuffer.size();
                this.sinkBuffer.mo32023U0(payload);
                C9703f c9703f = this.sinkBuffer;
                C9703f.a aVar = this.maskCursor;
                C9801m.m32343c(aVar);
                c9703f.m32008I(aVar);
                this.maskCursor.m32066d(size);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.writeByte(iM32093P);
            this.sinkBuffer.mo32023U0(payload);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final InterfaceC9705g getSink() {
        return this.sink;
    }

    public final void writeClose(int code, C9710i reason) throws IOException {
        C9710i c9710iMo32003D0 = C9710i.f37051f;
        if (code != 0 || reason != null) {
            if (code != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(code);
            }
            C9703f c9703f = new C9703f();
            c9703f.writeShort(code);
            if (reason != null) {
                c9703f.mo32023U0(reason);
            }
            c9710iMo32003D0 = c9703f.mo32003D0();
        }
        try {
            writeControlFrame(8, c9710iMo32003D0);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int formatOpcode, C9710i data) throws IOException {
        C9801m.m32346f(data, "data");
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.mo32023U0(data);
        int i2 = formatOpcode | 128;
        if (this.perMessageDeflate && data.m32093P() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i2 |= 64;
        }
        long size = this.messageBuffer.size();
        this.sinkBuffer.writeByte(i2);
        int i3 = this.isClient ? 128 : 0;
        if (size <= 125) {
            this.sinkBuffer.writeByte(((int) size) | i3);
        } else if (size <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.writeByte(i3 | WebSocketProtocol.PAYLOAD_SHORT);
            this.sinkBuffer.writeShort((int) size);
        } else {
            this.sinkBuffer.writeByte(i3 | 127);
            this.sinkBuffer.m32018Q0(size);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            C9801m.m32343c(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.write(this.maskKey);
            if (size > 0) {
                C9703f c9703f = this.messageBuffer;
                C9703f.a aVar = this.maskCursor;
                C9801m.m32343c(aVar);
                c9703f.m32008I(aVar);
                this.maskCursor.m32066d(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, size);
        this.sink.mo32000C();
    }

    public final void writePing(C9710i payload) throws IOException {
        C9801m.m32346f(payload, "payload");
        writeControlFrame(9, payload);
    }

    public final void writePong(C9710i payload) throws IOException {
        C9801m.m32346f(payload, "payload");
        writeControlFrame(10, payload);
    }
}

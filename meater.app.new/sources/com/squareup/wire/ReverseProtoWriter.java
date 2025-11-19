package com.squareup.wire;

import Ba.l;
import Cc.C0982e;
import Cc.f;
import Cc.h;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: ReverseProtoWriter.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0012\u0018\u0000 @2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b \u0010\bJ\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\bJ\u0015\u0010$\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\bJ\u0015\u0010'\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020#¢\u0006\u0004\b'\u0010%R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00108\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001b\u0010<\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010;R\u0011\u0010?\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/squareup/wire/ReverseProtoWriter;", "", "<init>", "()V", "", "minByteCount", "Loa/F;", "require", "(I)V", "emitCurrentSegment", "LCc/f;", "sink", "writeTo", "(LCc/f;)V", "Lkotlin/Function1;", "Lcom/squareup/wire/ProtoWriter;", "block", "writeForward$wire_runtime", "(LBa/l;)V", "writeForward", "LCc/h;", "value", "writeBytes", "(LCc/h;)V", "", "writeString", "(Ljava/lang/String;)V", "fieldNumber", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", "writeTag", "(ILcom/squareup/wire/FieldEncoding;)V", "writeSignedVarint32$wire_runtime", "writeSignedVarint32", "writeVarint32", "", "writeVarint64", "(J)V", "writeFixed32", "writeFixed64", "LCc/e;", "tail", "LCc/e;", "head", "LCc/e$a;", "cursor", "LCc/e$a;", "", "array", "[B", "arrayLimit", "I", "forwardBuffer$delegate", "Loa/i;", "getForwardBuffer", "()LCc/e;", "forwardBuffer", "forwardWriter$delegate", "getForwardWriter", "()Lcom/squareup/wire/ProtoWriter;", "forwardWriter", "getByteCount", "()I", "byteCount", "Companion", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReverseProtoWriter {
    private static final Companion Companion = new Companion(null);
    private static final byte[] EMPTY_ARRAY = new byte[0];
    private int arrayLimit;

    /* renamed from: forwardBuffer$delegate, reason: from kotlin metadata */
    private final InterfaceC4164i forwardBuffer;

    /* renamed from: forwardWriter$delegate, reason: from kotlin metadata */
    private final InterfaceC4164i forwardWriter;
    private C0982e tail = new C0982e();
    private C0982e head = new C0982e();
    private final C0982e.a cursor = new C0982e.a();
    private byte[] array = EMPTY_ARRAY;

    /* compiled from: ReverseProtoWriter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/squareup/wire/ReverseProtoWriter$Companion;", "", "()V", "EMPTY_ARRAY", "", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private Companion() {
        }
    }

    public ReverseProtoWriter() {
        EnumC4168m enumC4168m = EnumC4168m.f46628D;
        this.forwardBuffer = C4165j.b(enumC4168m, ReverseProtoWriter$forwardBuffer$2.INSTANCE);
        this.forwardWriter = C4165j.b(enumC4168m, new ReverseProtoWriter$forwardWriter$2(this));
    }

    private final void emitCurrentSegment() throws EOFException {
        byte[] bArr = this.array;
        byte[] bArr2 = EMPTY_ARRAY;
        if (bArr == bArr2) {
            return;
        }
        this.cursor.close();
        this.head.w(this.arrayLimit);
        this.head.S(this.tail);
        C0982e c0982e = this.tail;
        this.tail = this.head;
        this.head = c0982e;
        this.array = bArr2;
        this.arrayLimit = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0982e getForwardBuffer() {
        return (C0982e) this.forwardBuffer.getValue();
    }

    private final ProtoWriter getForwardWriter() {
        return (ProtoWriter) this.forwardWriter.getValue();
    }

    private final void require(int minByteCount) throws EOFException {
        if (this.arrayLimit >= minByteCount) {
            return;
        }
        emitCurrentSegment();
        this.head.t(this.cursor);
        this.cursor.a(minByteCount);
        C0982e.a aVar = this.cursor;
        if (aVar.offset == 0) {
            int i10 = aVar.end;
            byte[] bArr = aVar.data;
            C3862t.d(bArr);
            if (i10 == bArr.length) {
                byte[] bArr2 = this.cursor.data;
                C3862t.d(bArr2);
                this.array = bArr2;
                this.arrayLimit = this.cursor.end;
                return;
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int getByteCount() {
        return ((int) this.tail.getSize()) + (this.array.length - this.arrayLimit);
    }

    public final void writeBytes(h value) {
        C3862t.g(value, "value");
        int iJ = value.J();
        while (iJ != 0) {
            require(1);
            int iMin = Math.min(this.arrayLimit, iJ);
            int i10 = this.arrayLimit - iMin;
            this.arrayLimit = i10;
            iJ -= iMin;
            value.n(iJ, this.array, i10, iMin);
        }
    }

    public final void writeFixed32(int value) {
        require(4);
        int i10 = this.arrayLimit;
        int i11 = i10 - 4;
        this.arrayLimit = i11;
        byte[] bArr = this.array;
        bArr[i11] = (byte) (value & 255);
        bArr[i10 - 3] = (byte) ((value >>> 8) & 255);
        bArr[i10 - 2] = (byte) ((value >>> 16) & 255);
        bArr[i10 - 1] = (byte) ((value >>> 24) & 255);
    }

    public final void writeFixed64(long value) {
        require(8);
        int i10 = this.arrayLimit;
        int i11 = i10 - 8;
        this.arrayLimit = i11;
        byte[] bArr = this.array;
        bArr[i11] = (byte) (value & 255);
        bArr[i10 - 7] = (byte) ((value >>> 8) & 255);
        bArr[i10 - 6] = (byte) ((value >>> 16) & 255);
        bArr[i10 - 5] = (byte) ((value >>> 24) & 255);
        bArr[i10 - 4] = (byte) ((value >>> 32) & 255);
        bArr[i10 - 3] = (byte) ((value >>> 40) & 255);
        bArr[i10 - 2] = (byte) ((value >>> 48) & 255);
        bArr[i10 - 1] = (byte) ((value >>> 56) & 255);
    }

    public final void writeForward$wire_runtime(l<? super ProtoWriter, C4153F> block) {
        C3862t.g(block, "block");
        block.invoke(getForwardWriter());
        writeBytes(getForwardBuffer().u());
    }

    public final void writeSignedVarint32$wire_runtime(int value) {
        if (value >= 0) {
            writeVarint32(value);
        } else {
            writeVarint64(value);
        }
    }

    public final void writeString(String value) {
        C3862t.g(value, "value");
        int length = value.length() - 1;
        while (length >= 0) {
            int i10 = length - 1;
            char cCharAt = value.charAt(length);
            if (cCharAt < 128) {
                require(1);
                int i11 = this.arrayLimit;
                byte[] bArr = this.array;
                int i12 = i11 - 1;
                bArr[i12] = (byte) cCharAt;
                int iMax = Math.max(-1, i10 - i12);
                int i13 = i12;
                length = i10;
                while (length > iMax) {
                    char cCharAt2 = value.charAt(length);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    length--;
                    i13--;
                    bArr[i13] = (byte) cCharAt2;
                }
                this.arrayLimit = i13;
            } else {
                if (cCharAt < 2048) {
                    require(2);
                    byte[] bArr2 = this.array;
                    int i14 = this.arrayLimit;
                    int i15 = i14 - 1;
                    this.arrayLimit = i15;
                    bArr2[i15] = (byte) (128 | (cCharAt & '?'));
                    int i16 = i14 - 2;
                    this.arrayLimit = i16;
                    bArr2[i16] = (byte) ((cCharAt >> 6) | 192);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    require(3);
                    byte[] bArr3 = this.array;
                    int i17 = this.arrayLimit;
                    int i18 = i17 - 1;
                    this.arrayLimit = i18;
                    bArr3[i18] = (byte) ((cCharAt & '?') | 128);
                    int i19 = i17 - 2;
                    this.arrayLimit = i19;
                    bArr3[i19] = (byte) (128 | (63 & (cCharAt >> 6)));
                    int i20 = i17 - 3;
                    this.arrayLimit = i20;
                    bArr3[i20] = (byte) ((cCharAt >> '\f') | 224);
                } else {
                    char cCharAt3 = i10 >= 0 ? value.charAt(i10) : (char) 65535;
                    if (cCharAt3 > 56319 || 56320 > cCharAt || cCharAt >= 57344) {
                        require(1);
                        byte[] bArr4 = this.array;
                        int i21 = this.arrayLimit - 1;
                        this.arrayLimit = i21;
                        bArr4[i21] = 63;
                    } else {
                        length -= 2;
                        int i22 = (((cCharAt3 & 1023) << 10) | (cCharAt & 1023)) + 65536;
                        require(4);
                        byte[] bArr5 = this.array;
                        int i23 = this.arrayLimit;
                        int i24 = i23 - 1;
                        this.arrayLimit = i24;
                        bArr5[i24] = (byte) ((i22 & 63) | 128);
                        int i25 = i23 - 2;
                        this.arrayLimit = i25;
                        bArr5[i25] = (byte) (((i22 >> 6) & 63) | 128);
                        int i26 = i23 - 3;
                        this.arrayLimit = i26;
                        bArr5[i26] = (byte) (128 | (63 & (i22 >> 12)));
                        int i27 = i23 - 4;
                        this.arrayLimit = i27;
                        bArr5[i27] = (byte) ((i22 >> 18) | 240);
                    }
                }
                length = i10;
            }
        }
    }

    public final void writeTag(int fieldNumber, FieldEncoding fieldEncoding) {
        C3862t.g(fieldEncoding, "fieldEncoding");
        writeVarint32(ProtoWriter.INSTANCE.makeTag$wire_runtime(fieldNumber, fieldEncoding));
    }

    public final void writeTo(f sink) {
        C3862t.g(sink, "sink");
        emitCurrentSegment();
        sink.S(this.tail);
    }

    public final void writeVarint32(int value) {
        int iVarint32Size$wire_runtime = ProtoWriter.INSTANCE.varint32Size$wire_runtime(value);
        require(iVarint32Size$wire_runtime);
        int i10 = this.arrayLimit - iVarint32Size$wire_runtime;
        this.arrayLimit = i10;
        while ((value & (-128)) != 0) {
            this.array[i10] = (byte) ((value & 127) | 128);
            value >>>= 7;
            i10++;
        }
        this.array[i10] = (byte) value;
    }

    public final void writeVarint64(long value) {
        int iVarint64Size$wire_runtime = ProtoWriter.INSTANCE.varint64Size$wire_runtime(value);
        require(iVarint64Size$wire_runtime);
        int i10 = this.arrayLimit - iVarint64Size$wire_runtime;
        this.arrayLimit = i10;
        while (((-128) & value) != 0) {
            this.array[i10] = (byte) ((127 & value) | 128);
            value >>>= 7;
            i10++;
        }
        this.array[i10] = (byte) value;
    }
}

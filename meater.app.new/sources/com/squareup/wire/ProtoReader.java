package com.squareup.wire;

import Ba.l;
import Cc.C0982e;
import Cc.g;
import Cc.h;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4156a;

/* compiled from: ProtoReader.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 G2\u00020\u0001:\u0001GB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\bJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\"J\u000f\u0010&\u001a\u00020#H\u0000¢\u0006\u0004\b$\u0010%J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\bJ\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u0012J\r\u0010,\u001a\u00020\u0006¢\u0006\u0004\b,\u0010\bJ\r\u0010-\u001a\u00020\u0010¢\u0006\u0004\b-\u0010\u0012J'\u00102\u001a\u00020\u00152\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010.H\u0087\bø\u0001\u0000¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020\n2\u0006\u00103\u001a\u00020\u0006¢\u0006\u0004\b4\u0010\fJ'\u00106\u001a\u00020\n2\u0006\u00103\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001c2\b\u00105\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0010¢\u0006\u0004\b8\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0016\u0010:\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010>R\u0016\u0010@\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010;R\u0018\u0010A\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006H"}, d2 = {"Lcom/squareup/wire/ProtoReader;", "", "LCc/g;", "source", "<init>", "(LCc/g;)V", "", "internalNextLengthDelimited", "()I", "expectedEndTag", "Loa/F;", "skipGroup", "(I)V", "internalReadVarint32", "fieldEncoding", "afterPackableScalar", "", "beforeLengthDelimitedScalar", "()J", "beginMessage", "token", "LCc/h;", "endMessageAndGetUnknownFields", "(J)LCc/h;", "endMessage", "(J)V", "nextLengthDelimited", "nextTag", "Lcom/squareup/wire/FieldEncoding;", "peekFieldEncoding", "()Lcom/squareup/wire/FieldEncoding;", "skip", "()V", "readBytes", "()LCc/h;", "", "beforePossiblyPackedScalar$wire_runtime", "()Z", "beforePossiblyPackedScalar", "", "readString", "()Ljava/lang/String;", "readVarint32", "readVarint64", "readFixed32", "readFixed64", "Lkotlin/Function1;", "tagHandler", "-forEachTag", "(LBa/l;)LCc/h;", "forEachTag", "tag", "readUnknownField", "value", "addUnknownField", "(ILcom/squareup/wire/FieldEncoding;Ljava/lang/Object;)V", "nextFieldMinLengthInBytes", "LCc/g;", "pos", "J", "limit", "recursionDepth", "I", "state", "pushedLimit", "nextFieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "", "LCc/e;", "bufferStack", "Ljava/util/List;", "Companion", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProtoReader {
    private static final int FIELD_ENCODING_MASK = 7;
    private static final int RECURSION_LIMIT = 65;
    private static final int STATE_END_GROUP = 4;
    private static final int STATE_FIXED32 = 5;
    private static final int STATE_FIXED64 = 1;
    private static final int STATE_LENGTH_DELIMITED = 2;
    private static final int STATE_PACKED_TAG = 7;
    private static final int STATE_START_GROUP = 3;
    private static final int STATE_TAG = 6;
    private static final int STATE_VARINT = 0;
    public static final int TAG_FIELD_ENCODING_BITS = 3;
    private final List<C0982e> bufferStack;
    private long limit;
    private FieldEncoding nextFieldEncoding;
    private long pos;
    private long pushedLimit;
    private int recursionDepth;
    private final g source;
    private int state;
    private int tag;

    /* compiled from: ProtoReader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            try {
                iArr[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ProtoReader(g source) {
        C3862t.g(source, "source");
        this.source = source;
        this.limit = Long.MAX_VALUE;
        this.state = 2;
        this.tag = -1;
        this.pushedLimit = -1L;
        this.bufferStack = new ArrayList();
    }

    private final void afterPackableScalar(int fieldEncoding) throws IOException {
        if (this.state == fieldEncoding) {
            this.state = 6;
            return;
        }
        long j10 = this.pos;
        long j11 = this.limit;
        if (j10 > j11) {
            throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
        }
        if (j10 != j11) {
            this.state = 7;
            return;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
    }

    private final long beforeLengthDelimitedScalar() throws ProtocolException {
        if (this.state != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.state);
        }
        long j10 = this.limit - this.pos;
        this.source.t1(j10);
        this.state = 6;
        this.pos = this.limit;
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        return j10;
    }

    private final int internalNextLengthDelimited() throws ProtocolException, EOFException {
        this.nextFieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        this.state = 2;
        int iInternalReadVarint32 = internalReadVarint32();
        if (iInternalReadVarint32 < 0) {
            throw new ProtocolException("Negative length: " + iInternalReadVarint32);
        }
        if (this.pushedLimit != -1) {
            throw new IllegalStateException();
        }
        long j10 = this.limit;
        this.pushedLimit = j10;
        long j11 = this.pos + iInternalReadVarint32;
        this.limit = j11;
        if (j11 <= j10) {
            return iInternalReadVarint32;
        }
        throw new EOFException();
    }

    private final int internalReadVarint32() throws ProtocolException {
        int i10;
        this.source.t1(1L);
        this.pos++;
        byte b10 = this.source.readByte();
        if (b10 >= 0) {
            return b10;
        }
        int i11 = b10 & 127;
        this.source.t1(1L);
        this.pos++;
        byte b11 = this.source.readByte();
        if (b11 >= 0) {
            i10 = b11 << 7;
        } else {
            i11 |= (b11 & 127) << 7;
            this.source.t1(1L);
            this.pos++;
            byte b12 = this.source.readByte();
            if (b12 >= 0) {
                i10 = b12 << 14;
            } else {
                i11 |= (b12 & 127) << 14;
                this.source.t1(1L);
                this.pos++;
                byte b13 = this.source.readByte();
                if (b13 < 0) {
                    int i12 = i11 | ((b13 & 127) << 21);
                    this.source.t1(1L);
                    this.pos++;
                    byte b14 = this.source.readByte();
                    int i13 = i12 | (b14 << 28);
                    if (b14 >= 0) {
                        return i13;
                    }
                    for (int i14 = 0; i14 < 5; i14++) {
                        this.source.t1(1L);
                        this.pos++;
                        if (this.source.readByte() >= 0) {
                            return i13;
                        }
                    }
                    throw new ProtocolException("Malformed VARINT");
                }
                i10 = b13 << 21;
            }
        }
        return i11 | i10;
    }

    private final void skipGroup(int expectedEndTag) throws IOException {
        while (this.pos < this.limit && !this.source.c0()) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i10 = iInternalReadVarint32 >> 3;
            int i11 = iInternalReadVarint32 & 7;
            if (i11 == 0) {
                this.state = 0;
                readVarint64();
            } else if (i11 == 1) {
                this.state = 1;
                readFixed64();
            } else if (i11 == 2) {
                long jInternalReadVarint32 = internalReadVarint32();
                this.pos += jInternalReadVarint32;
                this.source.w(jInternalReadVarint32);
            } else if (i11 == 3) {
                skipGroup(i10);
            } else if (i11 == 4) {
                if (i10 != expectedEndTag) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i11 != 5) {
                    throw new ProtocolException("Unexpected field encoding: " + i11);
                }
                this.state = 5;
                readFixed32();
            }
        }
        throw new EOFException();
    }

    /* renamed from: -forEachTag, reason: not valid java name */
    public final h m7forEachTag(l<? super Integer, ? extends Object> tagHandler) throws IOException {
        C3862t.g(tagHandler, "tagHandler");
        long jBeginMessage = beginMessage();
        while (true) {
            int iNextTag = nextTag();
            if (iNextTag == -1) {
                return endMessageAndGetUnknownFields(jBeginMessage);
            }
            tagHandler.invoke(Integer.valueOf(iNextTag));
        }
    }

    public final void addUnknownField(int tag, FieldEncoding fieldEncoding, Object value) {
        C3862t.g(fieldEncoding, "fieldEncoding");
        ProtoWriter protoWriter = new ProtoWriter(this.bufferStack.get(this.recursionDepth - 1));
        ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
        C3862t.e(protoAdapterRawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        protoAdapterRawProtoAdapter.encodeWithTag(protoWriter, tag, (int) value);
    }

    public final boolean beforePossiblyPackedScalar$wire_runtime() throws ProtocolException {
        int i10 = this.state;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            if (i10 == 5) {
                return true;
            }
            throw new ProtocolException("unexpected state: " + this.state);
        }
        if (this.pos < this.limit) {
            return true;
        }
        this.limit = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return false;
    }

    public final long beginMessage() throws IOException {
        if (this.state != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i10 = this.recursionDepth + 1;
        this.recursionDepth = i10;
        if (i10 > RECURSION_LIMIT) {
            throw new IOException("Wire recursion limit exceeded");
        }
        if (i10 > this.bufferStack.size()) {
            this.bufferStack.add(new C0982e());
        }
        long j10 = this.pushedLimit;
        this.pushedLimit = -1L;
        this.state = 6;
        return j10;
    }

    @InterfaceC4156a
    public final void endMessage(long token) throws IOException {
        endMessageAndGetUnknownFields(token);
    }

    public final h endMessageAndGetUnknownFields(long token) throws IOException {
        if (this.state != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i10 = this.recursionDepth - 1;
        this.recursionDepth = i10;
        if (i10 < 0 || this.pushedLimit != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.pos == this.limit || i10 == 0) {
            this.limit = token;
            C0982e c0982e = this.bufferStack.get(i10);
            return c0982e.getSize() > 0 ? c0982e.u() : h.f3238F;
        }
        throw new IOException("Expected to end at " + this.limit + " but was " + this.pos);
    }

    public final long nextFieldMinLengthInBytes() {
        FieldEncoding fieldEncoding = this.nextFieldEncoding;
        int i10 = fieldEncoding == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fieldEncoding.ordinal()];
        if (i10 == -1) {
            throw new IllegalStateException("nextFieldEncoding is not set");
        }
        if (i10 == 1) {
            return this.limit - this.pos;
        }
        if (i10 == 2) {
            return 4L;
        }
        if (i10 == 3) {
            return 8L;
        }
        if (i10 == 4) {
            return 1L;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int nextLengthDelimited() {
        int i10 = this.state;
        if (i10 == 6 || i10 == 2) {
            return internalNextLengthDelimited();
        }
        throw new IllegalStateException("Unexpected call to nextDelimited()");
    }

    public final int nextTag() throws IOException {
        int i10 = this.state;
        if (i10 == 7) {
            this.state = 2;
            return this.tag;
        }
        if (i10 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.pos < this.limit && !this.source.c0()) {
            int iInternalReadVarint32 = internalReadVarint32();
            if (iInternalReadVarint32 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i11 = iInternalReadVarint32 >> 3;
            this.tag = i11;
            int i12 = iInternalReadVarint32 & 7;
            if (i12 == 0) {
                this.nextFieldEncoding = FieldEncoding.VARINT;
                this.state = 0;
                return i11;
            }
            if (i12 == 1) {
                this.nextFieldEncoding = FieldEncoding.FIXED64;
                this.state = 1;
                return i11;
            }
            if (i12 == 2) {
                internalNextLengthDelimited();
                return this.tag;
            }
            if (i12 != 3) {
                if (i12 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i12 == 5) {
                    this.nextFieldEncoding = FieldEncoding.FIXED32;
                    this.state = 5;
                    return i11;
                }
                throw new ProtocolException("Unexpected field encoding: " + i12);
            }
            skipGroup(i11);
        }
        return -1;
    }

    /* renamed from: peekFieldEncoding, reason: from getter */
    public final FieldEncoding getNextFieldEncoding() {
        return this.nextFieldEncoding;
    }

    public final h readBytes() throws ProtocolException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.t1(jBeforeLengthDelimitedScalar);
        return this.source.H(jBeforeLengthDelimitedScalar);
    }

    public final int readFixed32() throws IOException {
        int i10 = this.state;
        if (i10 != 5 && i10 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.t1(4L);
        this.pos += 4;
        int iZ0 = this.source.Z0();
        afterPackableScalar(5);
        return iZ0;
    }

    public final long readFixed64() throws IOException {
        int i10 = this.state;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.state);
        }
        this.source.t1(8L);
        this.pos += 8;
        long jM1 = this.source.m1();
        afterPackableScalar(1);
        return jM1;
    }

    public final String readString() throws ProtocolException {
        long jBeforeLengthDelimitedScalar = beforeLengthDelimitedScalar();
        this.source.t1(jBeforeLengthDelimitedScalar);
        return this.source.D(jBeforeLengthDelimitedScalar);
    }

    public final void readUnknownField(int tag) {
        FieldEncoding nextFieldEncoding = getNextFieldEncoding();
        C3862t.d(nextFieldEncoding);
        addUnknownField(tag, nextFieldEncoding, nextFieldEncoding.rawProtoAdapter().decode(this));
    }

    public final int readVarint32() {
        int i10 = this.state;
        if (i10 == 0 || i10 == 2) {
            int iInternalReadVarint32 = internalReadVarint32();
            afterPackableScalar(0);
            return iInternalReadVarint32;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
    }

    public final long readVarint64() throws IOException {
        int i10 = this.state;
        if (i10 != 0 && i10 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.state);
        }
        long j10 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            this.source.t1(1L);
            this.pos++;
            j10 |= (r4 & 127) << i11;
            if ((this.source.readByte() & 128) == 0) {
                afterPackableScalar(0);
                return j10;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void skip() throws IOException {
        int i10 = this.state;
        if (i10 == 0) {
            readVarint64();
            return;
        }
        if (i10 == 1) {
            readFixed64();
            return;
        }
        if (i10 == 2) {
            this.source.w(beforeLengthDelimitedScalar());
        } else {
            if (i10 != 5) {
                throw new IllegalStateException("Unexpected call to skip()");
            }
            readFixed32();
        }
    }
}

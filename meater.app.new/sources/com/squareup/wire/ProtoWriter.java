package com.squareup.wire;

import Cc.f;
import Cc.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ProtoWriter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u0015J\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/squareup/wire/ProtoWriter;", "", "LCc/f;", "sink", "<init>", "(LCc/f;)V", "LCc/h;", "value", "Loa/F;", "writeBytes", "(LCc/h;)V", "", "writeString", "(Ljava/lang/String;)V", "", "fieldNumber", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", "writeTag", "(ILcom/squareup/wire/FieldEncoding;)V", "writeSignedVarint32$wire_runtime", "(I)V", "writeSignedVarint32", "writeVarint32", "", "writeVarint64", "(J)V", "writeFixed32", "writeFixed64", "LCc/f;", "Companion", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProtoWriter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final f sink;

    /* compiled from: ProtoWriter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0000¢\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0010J\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u001aJ\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/squareup/wire/ProtoWriter$Companion;", "", "()V", "decodeZigZag32", "", "n", "decodeZigZag32$wire_runtime", "decodeZigZag64", "", "decodeZigZag64$wire_runtime", "encodeZigZag32", "encodeZigZag32$wire_runtime", "encodeZigZag64", "encodeZigZag64$wire_runtime", "int32Size", "value", "int32Size$wire_runtime", "makeTag", "fieldNumber", "fieldEncoding", "Lcom/squareup/wire/FieldEncoding;", "makeTag$wire_runtime", "tagSize", "tag", "tagSize$wire_runtime", "varint32Size", "varint32Size$wire_runtime", "varint64Size", "varint64Size$wire_runtime", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final int decodeZigZag32$wire_runtime(int n10) {
            return (-(n10 & 1)) ^ (n10 >>> 1);
        }

        public final long decodeZigZag64$wire_runtime(long n10) {
            return (-(n10 & 1)) ^ (n10 >>> 1);
        }

        public final int encodeZigZag32$wire_runtime(int n10) {
            return (n10 >> 31) ^ (n10 << 1);
        }

        public final long encodeZigZag64$wire_runtime(long n10) {
            return (n10 >> 63) ^ (n10 << 1);
        }

        public final int int32Size$wire_runtime(int value) {
            if (value >= 0) {
                return varint32Size$wire_runtime(value);
            }
            return 10;
        }

        public final int makeTag$wire_runtime(int fieldNumber, FieldEncoding fieldEncoding) {
            C3862t.g(fieldEncoding, "fieldEncoding");
            return (fieldNumber << 3) | fieldEncoding.getValue();
        }

        public final int tagSize$wire_runtime(int tag) {
            return varint32Size$wire_runtime(makeTag$wire_runtime(tag, FieldEncoding.VARINT));
        }

        public final int varint32Size$wire_runtime(int value) {
            if ((value & (-128)) == 0) {
                return 1;
            }
            if ((value & (-16384)) == 0) {
                return 2;
            }
            if (((-2097152) & value) == 0) {
                return 3;
            }
            return (value & (-268435456)) == 0 ? 4 : 5;
        }

        public final int varint64Size$wire_runtime(long value) {
            if (((-128) & value) == 0) {
                return 1;
            }
            if (((-16384) & value) == 0) {
                return 2;
            }
            if (((-2097152) & value) == 0) {
                return 3;
            }
            if (((-268435456) & value) == 0) {
                return 4;
            }
            if (((-34359738368L) & value) == 0) {
                return 5;
            }
            if (((-4398046511104L) & value) == 0) {
                return 6;
            }
            if (((-562949953421312L) & value) == 0) {
                return 7;
            }
            if (((-72057594037927936L) & value) == 0) {
                return 8;
            }
            return (value & Long.MIN_VALUE) == 0 ? 9 : 10;
        }

        private Companion() {
        }
    }

    public ProtoWriter(f sink) {
        C3862t.g(sink, "sink");
        this.sink = sink;
    }

    public final void writeBytes(h value) {
        C3862t.g(value, "value");
        this.sink.t0(value);
    }

    public final void writeFixed32(int value) {
        this.sink.b0(value);
    }

    public final void writeFixed64(long value) {
        this.sink.V(value);
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
        this.sink.A0(value);
    }

    public final void writeTag(int fieldNumber, FieldEncoding fieldEncoding) {
        C3862t.g(fieldEncoding, "fieldEncoding");
        writeVarint32(INSTANCE.makeTag$wire_runtime(fieldNumber, fieldEncoding));
    }

    public final void writeVarint32(int value) {
        while ((value & (-128)) != 0) {
            this.sink.d0((value & 127) | 128);
            value >>>= 7;
        }
        this.sink.d0(value);
    }

    public final void writeVarint64(long value) {
        while (((-128) & value) != 0) {
            this.sink.d0((((int) value) & 127) | 128);
            value >>>= 7;
        }
        this.sink.d0((int) value);
    }
}

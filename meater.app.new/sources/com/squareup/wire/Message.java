package com.squareup.wire;

import Cc.C0982e;
import Cc.f;
import Cc.h;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.EOFException;
import java.io.OutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Message.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b&\u0018\u0000 ,*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0002-,B\u001f\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0001H&¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u0018\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0018\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\"R\u0017\u0010\b\u001a\u00020\u00078G¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010\u001dR\"\u0010%\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020$8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b+\u0010&¨\u0006."}, d2 = {"Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "Ljava/io/Serializable;", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "LCc/h;", "unknownFields", "<init>", "(Lcom/squareup/wire/ProtoAdapter;LCc/h;)V", "newBuilder", "()Lcom/squareup/wire/Message$Builder;", "withoutUnknownFields", "()Lcom/squareup/wire/Message;", "", "toString", "()Ljava/lang/String;", "", "writeReplace", "()Ljava/lang/Object;", "LCc/f;", "sink", "Loa/F;", "encode", "(LCc/f;)V", "", "()[B", "encodeByteString", "()LCc/h;", "Ljava/io/OutputStream;", "stream", "(Ljava/io/OutputStream;)V", "Lcom/squareup/wire/ProtoAdapter;", "()Lcom/squareup/wire/ProtoAdapter;", "LCc/h;", "", "cachedSerializedSize", "I", "getCachedSerializedSize$wire_runtime", "()I", "setCachedSerializedSize$wire_runtime", "(I)V", "hashCode", "Companion", "Builder", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    private transient int cachedSerializedSize;
    protected transient int hashCode;
    private final transient h unknownFields;

    /* compiled from: Message.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0014\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001*\u0014\b\u0003\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00028\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/wire/Message;", "M", "B", "", "<init>", "()V", "Loa/F;", "prepareForNewUnknownFields", "LCc/h;", "unknownFields", "addUnknownFields", "(LCc/h;)Lcom/squareup/wire/Message$Builder;", "", "tag", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", "value", "addUnknownField", "(ILcom/squareup/wire/FieldEncoding;Ljava/lang/Object;)Lcom/squareup/wire/Message$Builder;", "clearUnknownFields", "()Lcom/squareup/wire/Message$Builder;", "buildUnknownFields", "()LCc/h;", "build", "()Lcom/squareup/wire/Message;", "unknownFieldsByteString", "LCc/h;", "getUnknownFieldsByteString$wire_runtime", "setUnknownFieldsByteString$wire_runtime", "(LCc/h;)V", "LCc/e;", "unknownFieldsBuffer", "LCc/e;", "getUnknownFieldsBuffer$wire_runtime", "()LCc/e;", "setUnknownFieldsBuffer$wire_runtime", "(LCc/e;)V", "Lcom/squareup/wire/ProtoWriter;", "unknownFieldsWriter", "Lcom/squareup/wire/ProtoWriter;", "getUnknownFieldsWriter$wire_runtime", "()Lcom/squareup/wire/ProtoWriter;", "setUnknownFieldsWriter$wire_runtime", "(Lcom/squareup/wire/ProtoWriter;)V", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        private transient C0982e unknownFieldsBuffer;
        private transient h unknownFieldsByteString = h.f3238F;
        private transient ProtoWriter unknownFieldsWriter;

        protected Builder() {
        }

        private final void prepareForNewUnknownFields() {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new C0982e();
                C0982e c0982e = this.unknownFieldsBuffer;
                C3862t.d(c0982e);
                ProtoWriter protoWriter = new ProtoWriter(c0982e);
                this.unknownFieldsWriter = protoWriter;
                C3862t.d(protoWriter);
                protoWriter.writeBytes(this.unknownFieldsByteString);
                this.unknownFieldsByteString = h.f3238F;
            }
        }

        public final Builder<M, B> addUnknownField(int tag, FieldEncoding fieldEncoding, Object value) {
            C3862t.g(fieldEncoding, "fieldEncoding");
            prepareForNewUnknownFields();
            ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
            C3862t.e(protoAdapterRawProtoAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            ProtoWriter protoWriter = this.unknownFieldsWriter;
            C3862t.d(protoWriter);
            protoAdapterRawProtoAdapter.encodeWithTag(protoWriter, tag, (int) value);
            return this;
        }

        public final Builder<M, B> addUnknownFields(h unknownFields) {
            C3862t.g(unknownFields, "unknownFields");
            if (unknownFields.J() > 0) {
                prepareForNewUnknownFields();
                ProtoWriter protoWriter = this.unknownFieldsWriter;
                C3862t.d(protoWriter);
                protoWriter.writeBytes(unknownFields);
            }
            return this;
        }

        public abstract M build();

        public final h buildUnknownFields() {
            C0982e c0982e = this.unknownFieldsBuffer;
            if (c0982e != null) {
                C3862t.d(c0982e);
                this.unknownFieldsByteString = c0982e.u();
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() throws EOFException {
            this.unknownFieldsByteString = h.f3238F;
            C0982e c0982e = this.unknownFieldsBuffer;
            if (c0982e != null) {
                C3862t.d(c0982e);
                c0982e.b();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }

        /* renamed from: getUnknownFieldsBuffer$wire_runtime, reason: from getter */
        public final C0982e getUnknownFieldsBuffer() {
            return this.unknownFieldsBuffer;
        }

        /* renamed from: getUnknownFieldsByteString$wire_runtime, reason: from getter */
        public final h getUnknownFieldsByteString() {
            return this.unknownFieldsByteString;
        }

        /* renamed from: getUnknownFieldsWriter$wire_runtime, reason: from getter */
        public final ProtoWriter getUnknownFieldsWriter() {
            return this.unknownFieldsWriter;
        }

        public final void setUnknownFieldsBuffer$wire_runtime(C0982e c0982e) {
            this.unknownFieldsBuffer = c0982e;
        }

        public final void setUnknownFieldsByteString$wire_runtime(h hVar) {
            C3862t.g(hVar, "<set-?>");
            this.unknownFieldsByteString = hVar;
        }

        public final void setUnknownFieldsWriter$wire_runtime(ProtoWriter protoWriter) {
            this.unknownFieldsWriter = protoWriter;
        }
    }

    /* compiled from: Message.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/squareup/wire/Message$Companion;", "", "()V", "serialVersionUID", "", "getSerialVersionUID$annotations", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private Companion() {
        }

        private static /* synthetic */ void getSerialVersionUID$annotations() {
        }
    }

    protected Message(ProtoAdapter<M> adapter, h unknownFields) {
        C3862t.g(adapter, "adapter");
        C3862t.g(unknownFields, "unknownFields");
        this.adapter = adapter;
        this.unknownFields = unknownFields;
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(f sink) {
        C3862t.g(sink, "sink");
        ProtoAdapter<M> protoAdapter = this.adapter;
        C3862t.e(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        protoAdapter.encode(sink, (f) this);
    }

    public final h encodeByteString() {
        ProtoAdapter<M> protoAdapter = this.adapter;
        C3862t.e(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        return protoAdapter.encodeByteString(this);
    }

    /* renamed from: getCachedSerializedSize$wire_runtime, reason: from getter */
    public final int getCachedSerializedSize() {
        return this.cachedSerializedSize;
    }

    public abstract B newBuilder();

    public final void setCachedSerializedSize$wire_runtime(int i10) {
        this.cachedSerializedSize = i10;
    }

    public String toString() {
        ProtoAdapter<M> protoAdapter = this.adapter;
        C3862t.e(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        return protoAdapter.toString(this);
    }

    public final h unknownFields() {
        h hVar = this.unknownFields;
        return hVar == null ? h.f3238F : hVar;
    }

    public final M withoutUnknownFields() {
        return (M) newBuilder().clearUnknownFields().build();
    }

    protected final Object writeReplace() {
        byte[] bArrEncode = encode();
        Class<?> cls = getClass();
        C3862t.e(cls, "null cannot be cast to non-null type java.lang.Class<M of com.squareup.wire.Message>");
        return new MessageSerializedForm(bArrEncode, cls);
    }

    public final byte[] encode() {
        ProtoAdapter<M> protoAdapter = this.adapter;
        C3862t.e(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        return protoAdapter.encode(this);
    }

    public final void encode(OutputStream stream) {
        C3862t.g(stream, "stream");
        ProtoAdapter<M> protoAdapter = this.adapter;
        C3862t.e(this, "null cannot be cast to non-null type M of com.squareup.wire.Message");
        protoAdapter.encode(stream, (OutputStream) this);
    }
}

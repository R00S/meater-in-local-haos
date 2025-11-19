package com.squareup.wire;

import Cc.h;
import Ia.d;
import com.squareup.wire.Message;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.InterfaceC4156a;

/* compiled from: AnyMessage.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/squareup/wire/AnyMessage;", "Lcom/squareup/wire/Message;", "", "", "typeUrl", "LCc/h;", "value", "<init>", "(Ljava/lang/String;LCc/h;)V", "T", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "unpack", "(Lcom/squareup/wire/ProtoAdapter;)Ljava/lang/Object;", "unpackOrNull", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;LCc/h;)Lcom/squareup/wire/AnyMessage;", "Ljava/lang/String;", "getTypeUrl", "LCc/h;", "getValue", "()LCc/h;", "Companion", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnyMessage extends Message {
    public static final ProtoAdapter<AnyMessage> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String typeUrl;
    private final h value;

    /* compiled from: AnyMessage.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\bR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/wire/AnyMessage$Companion;", "", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/wire/AnyMessage;", "pack", "message", "Lcom/squareup/wire/Message;", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final AnyMessage pack(Message<?, ?> message) {
            C3862t.g(message, "message");
            String typeUrl = message.adapter().getTypeUrl();
            if (typeUrl != null) {
                return new AnyMessage(typeUrl, message.encodeByteString());
            }
            throw new IllegalStateException(("recompile " + P.b(message.getClass()) + " to use it with AnyMessage").toString());
        }

        private Companion() {
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final d dVarB = P.b(AnyMessage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AnyMessage>(fieldEncoding, dVarB, syntax) { // from class: com.squareup.wire.AnyMessage$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AnyMessage decode(ProtoReader reader) throws IOException {
                C3862t.g(reader, "reader");
                h hVarDecode = h.f3238F;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return new AnyMessage(strDecode, hVarDecode);
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        hVarDecode = ProtoAdapter.BYTES.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AnyMessage value) {
                C3862t.g(value, "value");
                return ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTypeUrl()) + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AnyMessage redact(AnyMessage value) {
                C3862t.g(value, "value");
                return new AnyMessage("square.github.io/wire/redacted", h.f3238F);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AnyMessage value) {
                C3862t.g(writer, "writer");
                C3862t.g(value, "value");
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTypeUrl());
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AnyMessage value) {
                C3862t.g(writer, "writer");
                C3862t.g(value, "value");
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, (int) value.getValue());
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTypeUrl());
            }
        };
    }

    public /* synthetic */ AnyMessage(String str, h hVar, int i10, C3854k c3854k) {
        this(str, (i10 & 2) != 0 ? h.f3238F : hVar);
    }

    public static /* synthetic */ AnyMessage copy$default(AnyMessage anyMessage, String str, h hVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = anyMessage.typeUrl;
        }
        if ((i10 & 2) != 0) {
            hVar = anyMessage.value;
        }
        return anyMessage.copy(str, hVar);
    }

    public final AnyMessage copy(String typeUrl, h value) {
        C3862t.g(typeUrl, "typeUrl");
        C3862t.g(value, "value");
        return new AnyMessage(typeUrl, value);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AnyMessage)) {
            return false;
        }
        AnyMessage anyMessage = (AnyMessage) other;
        return C3862t.b(this.typeUrl, anyMessage.typeUrl) && C3862t.b(this.value, anyMessage.value);
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final h getValue() {
        return this.value;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = (((i10 * 37) + this.typeUrl.hashCode()) * 37) + this.value.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m6newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        return "Any{type_url=" + this.typeUrl + ", value=" + this.value + '}';
    }

    public final <T> T unpack(ProtoAdapter<T> adapter) {
        C3862t.g(adapter, "adapter");
        if (C3862t.b(this.typeUrl, adapter.getTypeUrl())) {
            return adapter.decode(this.value);
        }
        throw new IllegalStateException(("type mismatch: " + this.typeUrl + " != " + adapter.getTypeUrl()).toString());
    }

    public final <T> T unpackOrNull(ProtoAdapter<T> adapter) {
        C3862t.g(adapter, "adapter");
        if (C3862t.b(this.typeUrl, adapter.getTypeUrl())) {
            return adapter.decode(this.value);
        }
        return null;
    }

    @InterfaceC4156a
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m6newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnyMessage(String typeUrl, h value) {
        super(ADAPTER, h.f3238F);
        C3862t.g(typeUrl, "typeUrl");
        C3862t.g(value, "value");
        this.typeUrl = typeUrl;
        this.value = value;
    }
}

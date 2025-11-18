package com.squareup.wire;

import Aa.a;
import Ia.d;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: EnumAdapter.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\fB\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\t\u0010\rB\u001f\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000eB\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\t\u0010\u000fB\u001f\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u0012H$¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/squareup/wire/EnumAdapter;", "Lcom/squareup/wire/WireEnum;", "E", "Lcom/squareup/wire/ProtoAdapter;", "LIa/d;", "type", "Lcom/squareup/wire/Syntax;", "syntax", "identity", "<init>", "(LIa/d;Lcom/squareup/wire/Syntax;Lcom/squareup/wire/WireEnum;)V", "Ljava/lang/Class;", "(Ljava/lang/Class;Lcom/squareup/wire/Syntax;Lcom/squareup/wire/WireEnum;)V", "(Ljava/lang/Class;)V", "(Ljava/lang/Class;Lcom/squareup/wire/Syntax;)V", "(LIa/d;)V", "(LIa/d;Lcom/squareup/wire/Syntax;)V", "value", "", "encodedSize", "(Lcom/squareup/wire/WireEnum;)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "Loa/F;", "encode", "(Lcom/squareup/wire/ProtoWriter;Lcom/squareup/wire/WireEnum;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Lcom/squareup/wire/WireEnum;)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Lcom/squareup/wire/WireEnum;", "redact", "(Lcom/squareup/wire/WireEnum;)Lcom/squareup/wire/WireEnum;", "fromValue", "(I)Lcom/squareup/wire/WireEnum;", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected EnumAdapter(d<E> type, Syntax syntax, E e10) {
        super(FieldEncoding.VARINT, (d<?>) type, (String) null, syntax, e10);
        C3862t.g(type, "type");
        C3862t.g(syntax, "syntax");
    }

    protected abstract E fromValue(int value);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(Class<E> type, Syntax syntax, E e10) {
        this(a.e(type), syntax, e10);
        C3862t.g(type, "type");
        C3862t.g(syntax, "syntax");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public E decode(ProtoReader reader) {
        C3862t.g(reader, "reader");
        int varint32 = reader.readVarint32();
        E e10 = (E) fromValue(varint32);
        if (e10 != null) {
            return e10;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, getType());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(E value) {
        C3862t.g(value, "value");
        return ProtoWriter.INSTANCE.varint32Size$wire_runtime(value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public E redact(E value) {
        C3862t.g(value, "value");
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(Class<E> type) {
        this((d<WireEnum>) a.e(type), Syntax.PROTO_2, Internal.getIdentityOrNull(type));
        C3862t.g(type, "type");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, E value) {
        C3862t.g(writer, "writer");
        C3862t.g(value, "value");
        writer.writeVarint32(value.getValue());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(Class<E> type, Syntax syntax) {
        this((d<WireEnum>) a.e(type), syntax, Internal.getIdentityOrNull(type));
        C3862t.g(type, "type");
        C3862t.g(syntax, "syntax");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, E value) {
        C3862t.g(writer, "writer");
        C3862t.g(value, "value");
        writer.writeVarint32(value.getValue());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(d<E> type) {
        this(type, Syntax.PROTO_2, Internal.getIdentityOrNull(a.b(type)));
        C3862t.g(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(d<E> type, Syntax syntax) {
        this(type, syntax, Internal.getIdentityOrNull(a.b(type)));
        C3862t.g(type, "type");
        C3862t.g(syntax, "syntax");
    }
}

package com.squareup.wire;

import Ba.l;
import com.squareup.wire.ProtoAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: EnumAdapter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\"\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\t\u0010\f\u001aE\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0010H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\"\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Lcom/squareup/wire/WireEnum;", "E", "value", "", "commonEncodedSize", "(Lcom/squareup/wire/WireEnum;)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "Loa/F;", "commonEncode", "(Lcom/squareup/wire/ProtoWriter;Lcom/squareup/wire/WireEnum;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Lcom/squareup/wire/WireEnum;)V", "Lcom/squareup/wire/EnumAdapter;", "Lcom/squareup/wire/ProtoReader;", "reader", "Lkotlin/Function1;", "fromValue", "commonDecode", "(Lcom/squareup/wire/EnumAdapter;Lcom/squareup/wire/ProtoReader;LBa/l;)Lcom/squareup/wire/WireEnum;", "commonRedact", "(Lcom/squareup/wire/WireEnum;)Lcom/squareup/wire/WireEnum;", "wire-runtime"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnumAdapterKt {
    public static final <E extends WireEnum> E commonDecode(EnumAdapter<E> enumAdapter, ProtoReader reader, l<? super Integer, ? extends E> fromValue) {
        C3862t.g(enumAdapter, "<this>");
        C3862t.g(reader, "reader");
        C3862t.g(fromValue, "fromValue");
        int varint32 = reader.readVarint32();
        E eInvoke = fromValue.invoke(Integer.valueOf(varint32));
        if (eInvoke != null) {
            return eInvoke;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, enumAdapter.getType());
    }

    public static final <E extends WireEnum> void commonEncode(ProtoWriter writer, E value) {
        C3862t.g(writer, "writer");
        C3862t.g(value, "value");
        writer.writeVarint32(value.getValue());
    }

    public static final <E extends WireEnum> int commonEncodedSize(E value) {
        C3862t.g(value, "value");
        return ProtoWriter.INSTANCE.varint32Size$wire_runtime(value.getValue());
    }

    public static final <E extends WireEnum> E commonRedact(E value) {
        C3862t.g(value, "value");
        throw new UnsupportedOperationException();
    }

    public static final <E extends WireEnum> void commonEncode(ReverseProtoWriter writer, E value) {
        C3862t.g(writer, "writer");
        C3862t.g(value, "value");
        writer.writeVarint32(value.getValue());
    }
}

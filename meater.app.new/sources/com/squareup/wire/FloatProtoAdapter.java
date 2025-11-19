package com.squareup.wire;

import Ia.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C3856m;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;

/* compiled from: ProtoAdapter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/squareup/wire/FloatProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "Lcom/squareup/wire/ProtoWriter;", "writer", "value", "Loa/F;", "encode", "(Lcom/squareup/wire/ProtoWriter;F)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;F)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Float;", "", "encodedSize", "(F)I", "redact", "(F)Ljava/lang/Float;", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FloatProtoAdapter extends ProtoAdapter<Float> {
    public FloatProtoAdapter() {
        super(FieldEncoding.FIXED32, (d<?>) P.b(Float.TYPE), (String) null, Syntax.PROTO_2, Float.valueOf(0.0f));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Float f10) {
        encode(protoWriter, f10.floatValue());
    }

    public int encodedSize(float value) {
        return 4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ Float redact(Float f10) {
        return redact(f10.floatValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Float decode(ProtoReader reader) {
        C3862t.g(reader, "reader");
        C3856m c3856m = C3856m.f44008a;
        return Float.valueOf(Float.intBitsToFloat(reader.readFixed32()));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Float f10) {
        encode(reverseProtoWriter, f10.floatValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ int encodedSize(Float f10) {
        return encodedSize(f10.floatValue());
    }

    public Float redact(float value) {
        throw new UnsupportedOperationException();
    }

    public void encode(ProtoWriter writer, float value) {
        C3862t.g(writer, "writer");
        writer.writeFixed32(Float.floatToIntBits(value));
    }

    public void encode(ReverseProtoWriter writer, float value) {
        C3862t.g(writer, "writer");
        writer.writeFixed32(Float.floatToIntBits(value));
    }
}

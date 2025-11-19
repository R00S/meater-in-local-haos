package com.squareup.wire;

import Ia.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C3855l;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;

/* compiled from: ProtoAdapter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/squareup/wire/DoubleProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "value", "", "encodedSize", "(D)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "Loa/F;", "encode", "(Lcom/squareup/wire/ProtoWriter;D)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;D)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Double;", "redact", "(D)Ljava/lang/Double;", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DoubleProtoAdapter extends ProtoAdapter<Double> {
    public DoubleProtoAdapter() {
        super(FieldEncoding.FIXED64, (d<?>) P.b(Double.TYPE), (String) null, Syntax.PROTO_2, Double.valueOf(0.0d));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Double d10) {
        encode(protoWriter, d10.doubleValue());
    }

    public int encodedSize(double value) {
        return 8;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ Double redact(Double d10) {
        return redact(d10.doubleValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Double decode(ProtoReader reader) {
        C3862t.g(reader, "reader");
        C3855l c3855l = C3855l.f44007a;
        return Double.valueOf(Double.longBitsToDouble(reader.readFixed64()));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Double d10) {
        encode(reverseProtoWriter, d10.doubleValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ int encodedSize(Double d10) {
        return encodedSize(d10.doubleValue());
    }

    public Double redact(double value) {
        throw new UnsupportedOperationException();
    }

    public void encode(ProtoWriter writer, double value) {
        C3862t.g(writer, "writer");
        writer.writeFixed64(Double.doubleToLongBits(value));
    }

    public void encode(ReverseProtoWriter writer, double value) {
        C3862t.g(writer, "writer");
        writer.writeFixed64(Double.doubleToLongBits(value));
    }
}

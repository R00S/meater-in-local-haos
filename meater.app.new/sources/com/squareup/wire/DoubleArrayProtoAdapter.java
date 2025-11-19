package com.squareup.wire;

import Ia.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C3855l;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;

/* compiled from: ProtoAdapter.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/squareup/wire/DoubleArrayProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "", "originalAdapter", "<init>", "(Lcom/squareup/wire/ProtoAdapter;)V", "Lcom/squareup/wire/ProtoWriter;", "writer", "", "tag", "value", "Loa/F;", "encodeWithTag", "(Lcom/squareup/wire/ProtoWriter;I[D)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;I[D)V", "encodedSize", "([D)I", "encodedSizeWithTag", "(I[D)I", "encode", "(Lcom/squareup/wire/ProtoWriter;[D)V", "(Lcom/squareup/wire/ReverseProtoWriter;[D)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)[D", "redact", "([D)[D", "Lcom/squareup/wire/ProtoAdapter;", "wire-runtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DoubleArrayProtoAdapter extends ProtoAdapter<double[]> {
    private final ProtoAdapter<Double> originalAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleArrayProtoAdapter(ProtoAdapter<Double> originalAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, (d<?>) P.b(double[].class), (String) null, originalAdapter.getSyntax(), new double[0]);
        C3862t.g(originalAdapter, "originalAdapter");
        this.originalAdapter = originalAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public double[] redact(double[] value) {
        C3862t.g(value, "value");
        return new double[0];
    }

    @Override // com.squareup.wire.ProtoAdapter
    public double[] decode(ProtoReader reader) {
        C3862t.g(reader, "reader");
        C3855l c3855l = C3855l.f44007a;
        return new double[]{Double.longBitsToDouble(reader.readFixed64())};
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(double[] value) {
        C3862t.g(value, "value");
        int iEncodedSize = 0;
        for (double d10 : value) {
            iEncodedSize += this.originalAdapter.encodedSize(Double.valueOf(d10));
        }
        return iEncodedSize;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSizeWithTag(int tag, double[] value) {
        if (value == null || value.length == 0) {
            return 0;
        }
        return super.encodedSizeWithTag(tag, (int) value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, double[] value) {
        C3862t.g(writer, "writer");
        C3862t.g(value, "value");
        for (double d10 : value) {
            this.originalAdapter.encode(writer, (ProtoWriter) Double.valueOf(d10));
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ProtoWriter writer, int tag, double[] value) {
        C3862t.g(writer, "writer");
        if (value != null) {
            if (value.length == 0) {
                return;
            }
            super.encodeWithTag(writer, tag, (int) value);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, double[] value) {
        C3862t.g(writer, "writer");
        C3862t.g(value, "value");
        int length = value.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            } else {
                writer.writeFixed64(Double.doubleToLongBits(value[length]));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encodeWithTag(ReverseProtoWriter writer, int tag, double[] value) {
        C3862t.g(writer, "writer");
        if (value != null) {
            if (value.length == 0) {
                return;
            }
            super.encodeWithTag(writer, tag, (int) value);
        }
    }
}

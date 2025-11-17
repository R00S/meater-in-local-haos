package com.apptionlabs.meater_app.v2protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class V2MLDevice extends Message<V2MLDevice, Builder> {
    public static final ProtoAdapter<V2MLDevice> ADAPTER = new ProtoAdapter_V2MLDevice();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MLAmber#ADAPTER", tag = 4)
    public final V2MLAmber amber;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MLBlock#ADAPTER", tag = 3)
    public final V2MLBlock block;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MLPlus#ADAPTER", tag = 2)
    public final V2MLPlus plus;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MLProbe#ADAPTER", tag = 1)
    public final V2MLProbe probe;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2MLDevice, Builder> {
        public V2MLAmber amber;
        public V2MLBlock block;
        public V2MLPlus plus;
        public V2MLProbe probe;

        public Builder amber(V2MLAmber v2MLAmber) {
            this.amber = v2MLAmber;
            this.probe = null;
            this.plus = null;
            this.block = null;
            return this;
        }

        public Builder block(V2MLBlock v2MLBlock) {
            this.block = v2MLBlock;
            this.probe = null;
            this.plus = null;
            this.amber = null;
            return this;
        }

        public Builder plus(V2MLPlus v2MLPlus) {
            this.plus = v2MLPlus;
            this.probe = null;
            this.block = null;
            this.amber = null;
            return this;
        }

        public Builder probe(V2MLProbe v2MLProbe) {
            this.probe = v2MLProbe;
            this.plus = null;
            this.block = null;
            this.amber = null;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2MLDevice m72build() {
            return new V2MLDevice(this.probe, this.plus, this.block, this.amber, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2MLDevice extends ProtoAdapter<V2MLDevice> {
        ProtoAdapter_V2MLDevice() {
            super(FieldEncoding.LENGTH_DELIMITED, V2MLDevice.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2MLDevice m73decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m72build();
                }
                if (nextTag == 1) {
                    builder.probe((V2MLProbe) V2MLProbe.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.plus((V2MLPlus) V2MLPlus.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.block((V2MLBlock) V2MLBlock.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.amber((V2MLAmber) V2MLAmber.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2MLDevice v2MLDevice) {
            V2MLProbe v2MLProbe = v2MLDevice.probe;
            if (v2MLProbe != null) {
                V2MLProbe.ADAPTER.encodeWithTag(protoWriter, 1, v2MLProbe);
            }
            V2MLPlus v2MLPlus = v2MLDevice.plus;
            if (v2MLPlus != null) {
                V2MLPlus.ADAPTER.encodeWithTag(protoWriter, 2, v2MLPlus);
            }
            V2MLBlock v2MLBlock = v2MLDevice.block;
            if (v2MLBlock != null) {
                V2MLBlock.ADAPTER.encodeWithTag(protoWriter, 3, v2MLBlock);
            }
            V2MLAmber v2MLAmber = v2MLDevice.amber;
            if (v2MLAmber != null) {
                V2MLAmber.ADAPTER.encodeWithTag(protoWriter, 4, v2MLAmber);
            }
            protoWriter.writeBytes(v2MLDevice.unknownFields());
        }

        public int encodedSize(V2MLDevice v2MLDevice) {
            V2MLProbe v2MLProbe = v2MLDevice.probe;
            int encodedSizeWithTag = v2MLProbe != null ? V2MLProbe.ADAPTER.encodedSizeWithTag(1, v2MLProbe) : 0;
            V2MLPlus v2MLPlus = v2MLDevice.plus;
            int encodedSizeWithTag2 = encodedSizeWithTag + (v2MLPlus != null ? V2MLPlus.ADAPTER.encodedSizeWithTag(2, v2MLPlus) : 0);
            V2MLBlock v2MLBlock = v2MLDevice.block;
            int encodedSizeWithTag3 = encodedSizeWithTag2 + (v2MLBlock != null ? V2MLBlock.ADAPTER.encodedSizeWithTag(3, v2MLBlock) : 0);
            V2MLAmber v2MLAmber = v2MLDevice.amber;
            return encodedSizeWithTag3 + (v2MLAmber != null ? V2MLAmber.ADAPTER.encodedSizeWithTag(4, v2MLAmber) : 0) + v2MLDevice.unknownFields().I();
        }

        public V2MLDevice redact(V2MLDevice v2MLDevice) {
            Builder m71newBuilder = v2MLDevice.m71newBuilder();
            V2MLProbe v2MLProbe = m71newBuilder.probe;
            if (v2MLProbe != null) {
                m71newBuilder.probe = (V2MLProbe) V2MLProbe.ADAPTER.redact(v2MLProbe);
            }
            V2MLPlus v2MLPlus = m71newBuilder.plus;
            if (v2MLPlus != null) {
                m71newBuilder.plus = (V2MLPlus) V2MLPlus.ADAPTER.redact(v2MLPlus);
            }
            V2MLBlock v2MLBlock = m71newBuilder.block;
            if (v2MLBlock != null) {
                m71newBuilder.block = (V2MLBlock) V2MLBlock.ADAPTER.redact(v2MLBlock);
            }
            V2MLAmber v2MLAmber = m71newBuilder.amber;
            if (v2MLAmber != null) {
                m71newBuilder.amber = (V2MLAmber) V2MLAmber.ADAPTER.redact(v2MLAmber);
            }
            m71newBuilder.clearUnknownFields();
            return m71newBuilder.m72build();
        }
    }

    public V2MLDevice(V2MLProbe v2MLProbe, V2MLPlus v2MLPlus, V2MLBlock v2MLBlock, V2MLAmber v2MLAmber) {
        this(v2MLProbe, v2MLPlus, v2MLBlock, v2MLAmber, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2MLDevice)) {
            return false;
        }
        V2MLDevice v2MLDevice = (V2MLDevice) obj;
        if (Internal.equals(unknownFields(), v2MLDevice.unknownFields()) && Internal.equals(this.probe, v2MLDevice.probe) && Internal.equals(this.plus, v2MLDevice.plus) && Internal.equals(this.block, v2MLDevice.block) && Internal.equals(this.amber, v2MLDevice.amber)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((Message) this).hashCode;
        if (i13 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            V2MLProbe v2MLProbe = this.probe;
            int i14 = 0;
            if (v2MLProbe != null) {
                i10 = v2MLProbe.hashCode();
            } else {
                i10 = 0;
            }
            int i15 = (hashCode + i10) * 37;
            V2MLPlus v2MLPlus = this.plus;
            if (v2MLPlus != null) {
                i11 = v2MLPlus.hashCode();
            } else {
                i11 = 0;
            }
            int i16 = (i15 + i11) * 37;
            V2MLBlock v2MLBlock = this.block;
            if (v2MLBlock != null) {
                i12 = v2MLBlock.hashCode();
            } else {
                i12 = 0;
            }
            int i17 = (i16 + i12) * 37;
            V2MLAmber v2MLAmber = this.amber;
            if (v2MLAmber != null) {
                i14 = v2MLAmber.hashCode();
            }
            int i18 = i17 + i14;
            ((Message) this).hashCode = i18;
            return i18;
        }
        return i13;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.probe != null) {
            sb.append(", probe=");
            sb.append(this.probe);
        }
        if (this.plus != null) {
            sb.append(", plus=");
            sb.append(this.plus);
        }
        if (this.block != null) {
            sb.append(", block=");
            sb.append(this.block);
        }
        if (this.amber != null) {
            sb.append(", amber=");
            sb.append(this.amber);
        }
        StringBuilder replace = sb.replace(0, 2, "V2MLDevice{");
        replace.append('}');
        return replace.toString();
    }

    public V2MLDevice(V2MLProbe v2MLProbe, V2MLPlus v2MLPlus, V2MLBlock v2MLBlock, V2MLAmber v2MLAmber, h hVar) {
        super(ADAPTER, hVar);
        if (Internal.countNonNull(v2MLProbe, v2MLPlus, v2MLBlock, v2MLAmber, new Object[0]) > 1) {
            throw new IllegalArgumentException("at most one of probe, plus, block, amber may be non-null");
        }
        this.probe = v2MLProbe;
        this.plus = v2MLPlus;
        this.block = v2MLBlock;
        this.amber = v2MLAmber;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m71newBuilder() {
        Builder builder = new Builder();
        builder.probe = this.probe;
        builder.plus = this.plus;
        builder.block = this.block;
        builder.amber = this.amber;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

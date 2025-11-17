package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class ProbeReadTempLogEvent extends Message<ProbeReadTempLogEvent, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer diffFromMaster;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer interval;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean needToReadAgain;
    public static final ProtoAdapter<ProbeReadTempLogEvent> ADAPTER = new ProtoAdapter_ProbeReadTempLogEvent();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Integer DEFAULT_INTERVAL = 0;
    public static final Integer DEFAULT_DIFFFROMMASTER = 0;
    public static final Boolean DEFAULT_NEEDTOREADAGAIN = Boolean.FALSE;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<ProbeReadTempLogEvent, Builder> {
        public Integer count;
        public Integer diffFromMaster;
        public Integer interval;
        public Boolean needToReadAgain;

        public Builder count(Integer num) {
            this.count = num;
            return this;
        }

        public Builder diffFromMaster(Integer num) {
            this.diffFromMaster = num;
            return this;
        }

        public Builder interval(Integer num) {
            this.interval = num;
            return this;
        }

        public Builder needToReadAgain(Boolean bool) {
            this.needToReadAgain = bool;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public ProbeReadTempLogEvent m342build() {
            Integer num = this.count;
            if (num != null && this.interval != null && this.diffFromMaster != null) {
                return new ProbeReadTempLogEvent(this.count, this.interval, this.diffFromMaster, this.needToReadAgain, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "count", this.interval, "interval", this.diffFromMaster, "diffFromMaster"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_ProbeReadTempLogEvent extends ProtoAdapter<ProbeReadTempLogEvent> {
        ProtoAdapter_ProbeReadTempLogEvent() {
            super(FieldEncoding.LENGTH_DELIMITED, ProbeReadTempLogEvent.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public ProbeReadTempLogEvent m343decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m342build();
                }
                if (nextTag == 1) {
                    builder.count((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.interval((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.diffFromMaster((Integer) ProtoAdapter.SINT32.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.needToReadAgain((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ProbeReadTempLogEvent probeReadTempLogEvent) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, probeReadTempLogEvent.count);
            protoAdapter.encodeWithTag(protoWriter, 2, probeReadTempLogEvent.interval);
            ProtoAdapter.SINT32.encodeWithTag(protoWriter, 3, probeReadTempLogEvent.diffFromMaster);
            Boolean bool = probeReadTempLogEvent.needToReadAgain;
            if (bool != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, bool);
            }
            protoWriter.writeBytes(probeReadTempLogEvent.unknownFields());
        }

        public int encodedSize(ProbeReadTempLogEvent probeReadTempLogEvent) {
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, probeReadTempLogEvent.count) + protoAdapter.encodedSizeWithTag(2, probeReadTempLogEvent.interval) + ProtoAdapter.SINT32.encodedSizeWithTag(3, probeReadTempLogEvent.diffFromMaster);
            Boolean bool = probeReadTempLogEvent.needToReadAgain;
            return encodedSizeWithTag + (bool != null ? ProtoAdapter.BOOL.encodedSizeWithTag(4, bool) : 0) + probeReadTempLogEvent.unknownFields().I();
        }

        public ProbeReadTempLogEvent redact(ProbeReadTempLogEvent probeReadTempLogEvent) {
            Builder m341newBuilder = probeReadTempLogEvent.m341newBuilder();
            m341newBuilder.clearUnknownFields();
            return m341newBuilder.m342build();
        }
    }

    public ProbeReadTempLogEvent(Integer num, Integer num2, Integer num3, Boolean bool) {
        this(num, num2, num3, bool, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProbeReadTempLogEvent)) {
            return false;
        }
        ProbeReadTempLogEvent probeReadTempLogEvent = (ProbeReadTempLogEvent) obj;
        if (Internal.equals(unknownFields(), probeReadTempLogEvent.unknownFields()) && Internal.equals(this.count, probeReadTempLogEvent.count) && Internal.equals(this.interval, probeReadTempLogEvent.interval) && Internal.equals(this.diffFromMaster, probeReadTempLogEvent.diffFromMaster) && Internal.equals(this.needToReadAgain, probeReadTempLogEvent.needToReadAgain)) {
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
            Integer num = this.count;
            int i14 = 0;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i15 = (hashCode + i10) * 37;
            Integer num2 = this.interval;
            if (num2 != null) {
                i11 = num2.hashCode();
            } else {
                i11 = 0;
            }
            int i16 = (i15 + i11) * 37;
            Integer num3 = this.diffFromMaster;
            if (num3 != null) {
                i12 = num3.hashCode();
            } else {
                i12 = 0;
            }
            int i17 = (i16 + i12) * 37;
            Boolean bool = this.needToReadAgain;
            if (bool != null) {
                i14 = bool.hashCode();
            }
            int i18 = i17 + i14;
            ((Message) this).hashCode = i18;
            return i18;
        }
        return i13;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.interval != null) {
            sb.append(", interval=");
            sb.append(this.interval);
        }
        if (this.diffFromMaster != null) {
            sb.append(", diffFromMaster=");
            sb.append(this.diffFromMaster);
        }
        if (this.needToReadAgain != null) {
            sb.append(", needToReadAgain=");
            sb.append(this.needToReadAgain);
        }
        StringBuilder replace = sb.replace(0, 2, "ProbeReadTempLogEvent{");
        replace.append('}');
        return replace.toString();
    }

    public ProbeReadTempLogEvent(Integer num, Integer num2, Integer num3, Boolean bool, h hVar) {
        super(ADAPTER, hVar);
        this.count = num;
        this.interval = num2;
        this.diffFromMaster = num3;
        this.needToReadAgain = bool;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m341newBuilder() {
        Builder builder = new Builder();
        builder.count = this.count;
        builder.interval = this.interval;
        builder.diffFromMaster = this.diffFromMaster;
        builder.needToReadAgain = this.needToReadAgain;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

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
public final class ProbeBatteryLevelChange extends Message<ProbeBatteryLevelChange, Builder> {
    public static final ProtoAdapter<ProbeBatteryLevelChange> ADAPTER = new ProtoAdapter_ProbeBatteryLevelChange();
    public static final Integer DEFAULT_BATTERYLEVELPERCENT = 0;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer batteryLevelPercent;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<ProbeBatteryLevelChange, Builder> {
        public Integer batteryLevelPercent;

        public Builder batteryLevelPercent(Integer num) {
            this.batteryLevelPercent = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public ProbeBatteryLevelChange m318build() {
            Integer num = this.batteryLevelPercent;
            if (num != null) {
                return new ProbeBatteryLevelChange(this.batteryLevelPercent, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "batteryLevelPercent"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_ProbeBatteryLevelChange extends ProtoAdapter<ProbeBatteryLevelChange> {
        ProtoAdapter_ProbeBatteryLevelChange() {
            super(FieldEncoding.LENGTH_DELIMITED, ProbeBatteryLevelChange.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public ProbeBatteryLevelChange m319decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m318build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.batteryLevelPercent((Integer) ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ProbeBatteryLevelChange probeBatteryLevelChange) {
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, probeBatteryLevelChange.batteryLevelPercent);
            protoWriter.writeBytes(probeBatteryLevelChange.unknownFields());
        }

        public int encodedSize(ProbeBatteryLevelChange probeBatteryLevelChange) {
            return ProtoAdapter.UINT32.encodedSizeWithTag(1, probeBatteryLevelChange.batteryLevelPercent) + probeBatteryLevelChange.unknownFields().I();
        }

        public ProbeBatteryLevelChange redact(ProbeBatteryLevelChange probeBatteryLevelChange) {
            Builder m317newBuilder = probeBatteryLevelChange.m317newBuilder();
            m317newBuilder.clearUnknownFields();
            return m317newBuilder.m318build();
        }
    }

    public ProbeBatteryLevelChange(Integer num) {
        this(num, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProbeBatteryLevelChange)) {
            return false;
        }
        ProbeBatteryLevelChange probeBatteryLevelChange = (ProbeBatteryLevelChange) obj;
        if (Internal.equals(unknownFields(), probeBatteryLevelChange.unknownFields()) && Internal.equals(this.batteryLevelPercent, probeBatteryLevelChange.batteryLevelPercent)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.batteryLevelPercent;
            if (num != null) {
                i10 = num.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = hashCode + i10;
            ((Message) this).hashCode = i12;
            return i12;
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.batteryLevelPercent != null) {
            sb.append(", batteryLevelPercent=");
            sb.append(this.batteryLevelPercent);
        }
        StringBuilder replace = sb.replace(0, 2, "ProbeBatteryLevelChange{");
        replace.append('}');
        return replace.toString();
    }

    public ProbeBatteryLevelChange(Integer num, h hVar) {
        super(ADAPTER, hVar);
        this.batteryLevelPercent = num;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m317newBuilder() {
        Builder builder = new Builder();
        builder.batteryLevelPercent = this.batteryLevelPercent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

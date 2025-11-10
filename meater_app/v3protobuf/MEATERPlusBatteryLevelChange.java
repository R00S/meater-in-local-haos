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
public final class MEATERPlusBatteryLevelChange extends Message<MEATERPlusBatteryLevelChange, Builder> {
    public static final ProtoAdapter<MEATERPlusBatteryLevelChange> ADAPTER = new ProtoAdapter_MEATERPlusBatteryLevelChange();
    public static final Integer DEFAULT_BATTERYLEVELPERCENT = 0;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer batteryLevelPercent;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MEATERPlusBatteryLevelChange, Builder> {
        public Integer batteryLevelPercent;

        public Builder batteryLevelPercent(Integer num) {
            this.batteryLevelPercent = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MEATERPlusBatteryLevelChange m234build() {
            Integer num = this.batteryLevelPercent;
            if (num != null) {
                return new MEATERPlusBatteryLevelChange(this.batteryLevelPercent, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "batteryLevelPercent"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MEATERPlusBatteryLevelChange extends ProtoAdapter<MEATERPlusBatteryLevelChange> {
        ProtoAdapter_MEATERPlusBatteryLevelChange() {
            super(FieldEncoding.LENGTH_DELIMITED, MEATERPlusBatteryLevelChange.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MEATERPlusBatteryLevelChange m235decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m234build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.batteryLevelPercent((Integer) ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MEATERPlusBatteryLevelChange mEATERPlusBatteryLevelChange) {
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, mEATERPlusBatteryLevelChange.batteryLevelPercent);
            protoWriter.writeBytes(mEATERPlusBatteryLevelChange.unknownFields());
        }

        public int encodedSize(MEATERPlusBatteryLevelChange mEATERPlusBatteryLevelChange) {
            return ProtoAdapter.UINT32.encodedSizeWithTag(1, mEATERPlusBatteryLevelChange.batteryLevelPercent) + mEATERPlusBatteryLevelChange.unknownFields().I();
        }

        public MEATERPlusBatteryLevelChange redact(MEATERPlusBatteryLevelChange mEATERPlusBatteryLevelChange) {
            Builder m233newBuilder = mEATERPlusBatteryLevelChange.m233newBuilder();
            m233newBuilder.clearUnknownFields();
            return m233newBuilder.m234build();
        }
    }

    public MEATERPlusBatteryLevelChange(Integer num) {
        this(num, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MEATERPlusBatteryLevelChange)) {
            return false;
        }
        MEATERPlusBatteryLevelChange mEATERPlusBatteryLevelChange = (MEATERPlusBatteryLevelChange) obj;
        if (Internal.equals(unknownFields(), mEATERPlusBatteryLevelChange.unknownFields()) && Internal.equals(this.batteryLevelPercent, mEATERPlusBatteryLevelChange.batteryLevelPercent)) {
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
        StringBuilder replace = sb.replace(0, 2, "MEATERPlusBatteryLevelChange{");
        replace.append('}');
        return replace.toString();
    }

    public MEATERPlusBatteryLevelChange(Integer num, h hVar) {
        super(ADAPTER, hVar);
        this.batteryLevelPercent = num;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m233newBuilder() {
        Builder builder = new Builder();
        builder.batteryLevelPercent = this.batteryLevelPercent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

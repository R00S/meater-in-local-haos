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
public final class MEATERBlockBLERSSIChange extends Message<MEATERBlockBLERSSIChange, Builder> {
    public static final ProtoAdapter<MEATERBlockBLERSSIChange> ADAPTER = new ProtoAdapter_MEATERBlockBLERSSIChange();
    public static final Integer DEFAULT_RSSI = 0;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer rssi;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MEATERBlockBLERSSIChange, Builder> {
        public Integer rssi;

        public Builder rssi(Integer num) {
            this.rssi = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MEATERBlockBLERSSIChange m207build() {
            Integer num = this.rssi;
            if (num != null) {
                return new MEATERBlockBLERSSIChange(this.rssi, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "rssi"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MEATERBlockBLERSSIChange extends ProtoAdapter<MEATERBlockBLERSSIChange> {
        ProtoAdapter_MEATERBlockBLERSSIChange() {
            super(FieldEncoding.LENGTH_DELIMITED, MEATERBlockBLERSSIChange.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MEATERBlockBLERSSIChange m208decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m207build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.rssi((Integer) ProtoAdapter.SINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MEATERBlockBLERSSIChange mEATERBlockBLERSSIChange) {
            ProtoAdapter.SINT32.encodeWithTag(protoWriter, 1, mEATERBlockBLERSSIChange.rssi);
            protoWriter.writeBytes(mEATERBlockBLERSSIChange.unknownFields());
        }

        public int encodedSize(MEATERBlockBLERSSIChange mEATERBlockBLERSSIChange) {
            return ProtoAdapter.SINT32.encodedSizeWithTag(1, mEATERBlockBLERSSIChange.rssi) + mEATERBlockBLERSSIChange.unknownFields().I();
        }

        public MEATERBlockBLERSSIChange redact(MEATERBlockBLERSSIChange mEATERBlockBLERSSIChange) {
            Builder m206newBuilder = mEATERBlockBLERSSIChange.m206newBuilder();
            m206newBuilder.clearUnknownFields();
            return m206newBuilder.m207build();
        }
    }

    public MEATERBlockBLERSSIChange(Integer num) {
        this(num, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MEATERBlockBLERSSIChange)) {
            return false;
        }
        MEATERBlockBLERSSIChange mEATERBlockBLERSSIChange = (MEATERBlockBLERSSIChange) obj;
        if (Internal.equals(unknownFields(), mEATERBlockBLERSSIChange.unknownFields()) && Internal.equals(this.rssi, mEATERBlockBLERSSIChange.rssi)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.rssi;
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
        if (this.rssi != null) {
            sb.append(", rssi=");
            sb.append(this.rssi);
        }
        StringBuilder replace = sb.replace(0, 2, "MEATERBlockBLERSSIChange{");
        replace.append('}');
        return replace.toString();
    }

    public MEATERBlockBLERSSIChange(Integer num, h hVar) {
        super(ADAPTER, hVar);
        this.rssi = num;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m206newBuilder() {
        Builder builder = new Builder();
        builder.rssi = this.rssi;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

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
public final class MCBlockStatsMessage extends Message<MCBlockStatsMessage, Builder> {
    public static final ProtoAdapter<MCBlockStatsMessage> ADAPTER = new ProtoAdapter_MCBlockStatsMessage();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MCBlockChargingStatsMessage#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final MCBlockChargingStatsMessage chargingStats;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MCBlockStandaloneStatsMessage#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final MCBlockStandaloneStatsMessage standaloneStats;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MCBlockStatsMessage, Builder> {
        public MCBlockChargingStatsMessage chargingStats;
        public MCBlockStandaloneStatsMessage standaloneStats;

        public Builder chargingStats(MCBlockChargingStatsMessage mCBlockChargingStatsMessage) {
            this.chargingStats = mCBlockChargingStatsMessage;
            return this;
        }

        public Builder standaloneStats(MCBlockStandaloneStatsMessage mCBlockStandaloneStatsMessage) {
            this.standaloneStats = mCBlockStandaloneStatsMessage;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MCBlockStatsMessage m195build() {
            MCBlockStandaloneStatsMessage mCBlockStandaloneStatsMessage = this.standaloneStats;
            if (mCBlockStandaloneStatsMessage != null && this.chargingStats != null) {
                return new MCBlockStatsMessage(this.standaloneStats, this.chargingStats, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{mCBlockStandaloneStatsMessage, "standaloneStats", this.chargingStats, "chargingStats"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MCBlockStatsMessage extends ProtoAdapter<MCBlockStatsMessage> {
        ProtoAdapter_MCBlockStatsMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, MCBlockStatsMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MCBlockStatsMessage m196decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m195build();
                }
                if (nextTag == 1) {
                    builder.standaloneStats((MCBlockStandaloneStatsMessage) MCBlockStandaloneStatsMessage.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.chargingStats((MCBlockChargingStatsMessage) MCBlockChargingStatsMessage.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MCBlockStatsMessage mCBlockStatsMessage) {
            MCBlockStandaloneStatsMessage.ADAPTER.encodeWithTag(protoWriter, 1, mCBlockStatsMessage.standaloneStats);
            MCBlockChargingStatsMessage.ADAPTER.encodeWithTag(protoWriter, 2, mCBlockStatsMessage.chargingStats);
            protoWriter.writeBytes(mCBlockStatsMessage.unknownFields());
        }

        public int encodedSize(MCBlockStatsMessage mCBlockStatsMessage) {
            return MCBlockStandaloneStatsMessage.ADAPTER.encodedSizeWithTag(1, mCBlockStatsMessage.standaloneStats) + MCBlockChargingStatsMessage.ADAPTER.encodedSizeWithTag(2, mCBlockStatsMessage.chargingStats) + mCBlockStatsMessage.unknownFields().I();
        }

        public MCBlockStatsMessage redact(MCBlockStatsMessage mCBlockStatsMessage) {
            Builder m194newBuilder = mCBlockStatsMessage.m194newBuilder();
            MCBlockStandaloneStatsMessage mCBlockStandaloneStatsMessage = m194newBuilder.standaloneStats;
            if (mCBlockStandaloneStatsMessage != null) {
                m194newBuilder.standaloneStats = (MCBlockStandaloneStatsMessage) MCBlockStandaloneStatsMessage.ADAPTER.redact(mCBlockStandaloneStatsMessage);
            }
            MCBlockChargingStatsMessage mCBlockChargingStatsMessage = m194newBuilder.chargingStats;
            if (mCBlockChargingStatsMessage != null) {
                m194newBuilder.chargingStats = (MCBlockChargingStatsMessage) MCBlockChargingStatsMessage.ADAPTER.redact(mCBlockChargingStatsMessage);
            }
            m194newBuilder.clearUnknownFields();
            return m194newBuilder.m195build();
        }
    }

    public MCBlockStatsMessage(MCBlockStandaloneStatsMessage mCBlockStandaloneStatsMessage, MCBlockChargingStatsMessage mCBlockChargingStatsMessage) {
        this(mCBlockStandaloneStatsMessage, mCBlockChargingStatsMessage, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MCBlockStatsMessage)) {
            return false;
        }
        MCBlockStatsMessage mCBlockStatsMessage = (MCBlockStatsMessage) obj;
        if (Internal.equals(unknownFields(), mCBlockStatsMessage.unknownFields()) && Internal.equals(this.standaloneStats, mCBlockStatsMessage.standaloneStats) && Internal.equals(this.chargingStats, mCBlockStatsMessage.chargingStats)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            MCBlockStandaloneStatsMessage mCBlockStandaloneStatsMessage = this.standaloneStats;
            int i12 = 0;
            if (mCBlockStandaloneStatsMessage != null) {
                i10 = mCBlockStandaloneStatsMessage.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            MCBlockChargingStatsMessage mCBlockChargingStatsMessage = this.chargingStats;
            if (mCBlockChargingStatsMessage != null) {
                i12 = mCBlockChargingStatsMessage.hashCode();
            }
            int i14 = i13 + i12;
            ((Message) this).hashCode = i14;
            return i14;
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.standaloneStats != null) {
            sb.append(", standaloneStats=");
            sb.append(this.standaloneStats);
        }
        if (this.chargingStats != null) {
            sb.append(", chargingStats=");
            sb.append(this.chargingStats);
        }
        StringBuilder replace = sb.replace(0, 2, "MCBlockStatsMessage{");
        replace.append('}');
        return replace.toString();
    }

    public MCBlockStatsMessage(MCBlockStandaloneStatsMessage mCBlockStandaloneStatsMessage, MCBlockChargingStatsMessage mCBlockChargingStatsMessage, h hVar) {
        super(ADAPTER, hVar);
        this.standaloneStats = mCBlockStandaloneStatsMessage;
        this.chargingStats = mCBlockChargingStatsMessage;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m194newBuilder() {
        Builder builder = new Builder();
        builder.standaloneStats = this.standaloneStats;
        builder.chargingStats = this.chargingStats;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

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
public final class MCBlockStandaloneStatsMessage extends Message<MCBlockStandaloneStatsMessage, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 3)
    public final Integer cookCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long deviceID;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 4)
    public final Integer freezingCrashCount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer sessionCount;
    public static final ProtoAdapter<MCBlockStandaloneStatsMessage> ADAPTER = new ProtoAdapter_MCBlockStandaloneStatsMessage();
    public static final Long DEFAULT_DEVICEID = 0L;
    public static final Integer DEFAULT_SESSIONCOUNT = 0;
    public static final Integer DEFAULT_COOKCOUNT = 0;
    public static final Integer DEFAULT_FREEZINGCRASHCOUNT = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MCBlockStandaloneStatsMessage, Builder> {
        public Integer cookCount;
        public Long deviceID;
        public Integer freezingCrashCount;
        public Integer sessionCount;

        public Builder cookCount(Integer num) {
            this.cookCount = num;
            return this;
        }

        public Builder deviceID(Long l10) {
            this.deviceID = l10;
            return this;
        }

        public Builder freezingCrashCount(Integer num) {
            this.freezingCrashCount = num;
            return this;
        }

        public Builder sessionCount(Integer num) {
            this.sessionCount = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MCBlockStandaloneStatsMessage m192build() {
            Long l10 = this.deviceID;
            if (l10 != null && this.sessionCount != null && this.cookCount != null) {
                return new MCBlockStandaloneStatsMessage(this.deviceID, this.sessionCount, this.cookCount, this.freezingCrashCount, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{l10, "deviceID", this.sessionCount, "sessionCount", this.cookCount, "cookCount"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MCBlockStandaloneStatsMessage extends ProtoAdapter<MCBlockStandaloneStatsMessage> {
        ProtoAdapter_MCBlockStandaloneStatsMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, MCBlockStandaloneStatsMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MCBlockStandaloneStatsMessage m193decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m192build();
                }
                if (nextTag == 1) {
                    builder.deviceID((Long) ProtoAdapter.FIXED64.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.sessionCount((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.cookCount((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.freezingCrashCount((Integer) ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MCBlockStandaloneStatsMessage mCBlockStandaloneStatsMessage) {
            ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, mCBlockStandaloneStatsMessage.deviceID);
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 2, mCBlockStandaloneStatsMessage.sessionCount);
            protoAdapter.encodeWithTag(protoWriter, 3, mCBlockStandaloneStatsMessage.cookCount);
            Integer num = mCBlockStandaloneStatsMessage.freezingCrashCount;
            if (num != null) {
                protoAdapter.encodeWithTag(protoWriter, 4, num);
            }
            protoWriter.writeBytes(mCBlockStandaloneStatsMessage.unknownFields());
        }

        public int encodedSize(MCBlockStandaloneStatsMessage mCBlockStandaloneStatsMessage) {
            int encodedSizeWithTag = ProtoAdapter.FIXED64.encodedSizeWithTag(1, mCBlockStandaloneStatsMessage.deviceID);
            ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
            int encodedSizeWithTag2 = encodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, mCBlockStandaloneStatsMessage.sessionCount) + protoAdapter.encodedSizeWithTag(3, mCBlockStandaloneStatsMessage.cookCount);
            Integer num = mCBlockStandaloneStatsMessage.freezingCrashCount;
            return encodedSizeWithTag2 + (num != null ? protoAdapter.encodedSizeWithTag(4, num) : 0) + mCBlockStandaloneStatsMessage.unknownFields().I();
        }

        public MCBlockStandaloneStatsMessage redact(MCBlockStandaloneStatsMessage mCBlockStandaloneStatsMessage) {
            Builder m191newBuilder = mCBlockStandaloneStatsMessage.m191newBuilder();
            m191newBuilder.clearUnknownFields();
            return m191newBuilder.m192build();
        }
    }

    public MCBlockStandaloneStatsMessage(Long l10, Integer num, Integer num2, Integer num3) {
        this(l10, num, num2, num3, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MCBlockStandaloneStatsMessage)) {
            return false;
        }
        MCBlockStandaloneStatsMessage mCBlockStandaloneStatsMessage = (MCBlockStandaloneStatsMessage) obj;
        if (Internal.equals(unknownFields(), mCBlockStandaloneStatsMessage.unknownFields()) && Internal.equals(this.deviceID, mCBlockStandaloneStatsMessage.deviceID) && Internal.equals(this.sessionCount, mCBlockStandaloneStatsMessage.sessionCount) && Internal.equals(this.cookCount, mCBlockStandaloneStatsMessage.cookCount) && Internal.equals(this.freezingCrashCount, mCBlockStandaloneStatsMessage.freezingCrashCount)) {
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
            Long l10 = this.deviceID;
            int i14 = 0;
            if (l10 != null) {
                i10 = l10.hashCode();
            } else {
                i10 = 0;
            }
            int i15 = (hashCode + i10) * 37;
            Integer num = this.sessionCount;
            if (num != null) {
                i11 = num.hashCode();
            } else {
                i11 = 0;
            }
            int i16 = (i15 + i11) * 37;
            Integer num2 = this.cookCount;
            if (num2 != null) {
                i12 = num2.hashCode();
            } else {
                i12 = 0;
            }
            int i17 = (i16 + i12) * 37;
            Integer num3 = this.freezingCrashCount;
            if (num3 != null) {
                i14 = num3.hashCode();
            }
            int i18 = i17 + i14;
            ((Message) this).hashCode = i18;
            return i18;
        }
        return i13;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.deviceID != null) {
            sb.append(", deviceID=");
            sb.append(this.deviceID);
        }
        if (this.sessionCount != null) {
            sb.append(", sessionCount=");
            sb.append(this.sessionCount);
        }
        if (this.cookCount != null) {
            sb.append(", cookCount=");
            sb.append(this.cookCount);
        }
        if (this.freezingCrashCount != null) {
            sb.append(", freezingCrashCount=");
            sb.append(this.freezingCrashCount);
        }
        StringBuilder replace = sb.replace(0, 2, "MCBlockStandaloneStatsMessage{");
        replace.append('}');
        return replace.toString();
    }

    public MCBlockStandaloneStatsMessage(Long l10, Integer num, Integer num2, Integer num3, h hVar) {
        super(ADAPTER, hVar);
        this.deviceID = l10;
        this.sessionCount = num;
        this.cookCount = num2;
        this.freezingCrashCount = num3;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m191newBuilder() {
        Builder builder = new Builder();
        builder.deviceID = this.deviceID;
        builder.sessionCount = this.sessionCount;
        builder.cookCount = this.cookCount;
        builder.freezingCrashCount = this.freezingCrashCount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

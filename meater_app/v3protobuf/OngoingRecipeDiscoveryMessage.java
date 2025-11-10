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
public final class OngoingRecipeDiscoveryMessage extends Message<OngoingRecipeDiscoveryMessage, Builder> {
    public static final String DEFAULT_APPVERSION = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String appVersion;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MasterType#ADAPTER", tag = 1)
    public final MasterType clientType;
    public static final ProtoAdapter<OngoingRecipeDiscoveryMessage> ADAPTER = new ProtoAdapter_OngoingRecipeDiscoveryMessage();
    public static final MasterType DEFAULT_CLIENTTYPE = MasterType.MASTER_TYPE_BLOCK;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<OngoingRecipeDiscoveryMessage, Builder> {
        public String appVersion;
        public MasterType clientType;

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public Builder clientType(MasterType masterType) {
            this.clientType = masterType;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public OngoingRecipeDiscoveryMessage m303build() {
            return new OngoingRecipeDiscoveryMessage(this.clientType, this.appVersion, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_OngoingRecipeDiscoveryMessage extends ProtoAdapter<OngoingRecipeDiscoveryMessage> {
        ProtoAdapter_OngoingRecipeDiscoveryMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, OngoingRecipeDiscoveryMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public OngoingRecipeDiscoveryMessage m304decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m303build();
                }
                if (nextTag == 1) {
                    try {
                        builder.clientType((MasterType) MasterType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.appVersion((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, OngoingRecipeDiscoveryMessage ongoingRecipeDiscoveryMessage) {
            MasterType masterType = ongoingRecipeDiscoveryMessage.clientType;
            if (masterType != null) {
                MasterType.ADAPTER.encodeWithTag(protoWriter, 1, masterType);
            }
            String str = ongoingRecipeDiscoveryMessage.appVersion;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str);
            }
            protoWriter.writeBytes(ongoingRecipeDiscoveryMessage.unknownFields());
        }

        public int encodedSize(OngoingRecipeDiscoveryMessage ongoingRecipeDiscoveryMessage) {
            MasterType masterType = ongoingRecipeDiscoveryMessage.clientType;
            int encodedSizeWithTag = masterType != null ? MasterType.ADAPTER.encodedSizeWithTag(1, masterType) : 0;
            String str = ongoingRecipeDiscoveryMessage.appVersion;
            return encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, str) : 0) + ongoingRecipeDiscoveryMessage.unknownFields().I();
        }

        public OngoingRecipeDiscoveryMessage redact(OngoingRecipeDiscoveryMessage ongoingRecipeDiscoveryMessage) {
            Builder m302newBuilder = ongoingRecipeDiscoveryMessage.m302newBuilder();
            m302newBuilder.clearUnknownFields();
            return m302newBuilder.m303build();
        }
    }

    public OngoingRecipeDiscoveryMessage(MasterType masterType, String str) {
        this(masterType, str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OngoingRecipeDiscoveryMessage)) {
            return false;
        }
        OngoingRecipeDiscoveryMessage ongoingRecipeDiscoveryMessage = (OngoingRecipeDiscoveryMessage) obj;
        if (Internal.equals(unknownFields(), ongoingRecipeDiscoveryMessage.unknownFields()) && Internal.equals(this.clientType, ongoingRecipeDiscoveryMessage.clientType) && Internal.equals(this.appVersion, ongoingRecipeDiscoveryMessage.appVersion)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            MasterType masterType = this.clientType;
            int i12 = 0;
            if (masterType != null) {
                i10 = masterType.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            String str = this.appVersion;
            if (str != null) {
                i12 = str.hashCode();
            }
            int i14 = i13 + i12;
            ((Message) this).hashCode = i14;
            return i14;
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.clientType != null) {
            sb.append(", clientType=");
            sb.append(this.clientType);
        }
        if (this.appVersion != null) {
            sb.append(", appVersion=");
            sb.append(this.appVersion);
        }
        StringBuilder replace = sb.replace(0, 2, "OngoingRecipeDiscoveryMessage{");
        replace.append('}');
        return replace.toString();
    }

    public OngoingRecipeDiscoveryMessage(MasterType masterType, String str, h hVar) {
        super(ADAPTER, hVar);
        this.clientType = masterType;
        this.appVersion = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m302newBuilder() {
        Builder builder = new Builder();
        builder.clientType = this.clientType;
        builder.appVersion = this.appVersion;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

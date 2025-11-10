package com.apptionlabs.meater_app.v3protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.List;
import ql.h;

/* loaded from: /tmp/meat/meat/classes.dex */
public final class MasterMessage extends Message<MasterMessage, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.CloudConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final CloudConnectionState cloudConnectionState;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MLDevice#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<MLDevice> devices;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MasterType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final MasterType masterType;
    public static final ProtoAdapter<MasterMessage> ADAPTER = new ProtoAdapter_MasterMessage();
    public static final MasterType DEFAULT_MASTERTYPE = MasterType.MASTER_TYPE_BLOCK;
    public static final CloudConnectionState DEFAULT_CLOUDCONNECTIONSTATE = CloudConnectionState.CLOUD_CONNECTION_STATE_DISABLED;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MasterMessage, Builder> {
        public CloudConnectionState cloudConnectionState;
        public List<MLDevice> devices = Internal.newMutableList();
        public MasterType masterType;

        public Builder cloudConnectionState(CloudConnectionState cloudConnectionState) {
            this.cloudConnectionState = cloudConnectionState;
            return this;
        }

        public Builder devices(List<MLDevice> list) {
            Internal.checkElementsNotNull(list);
            this.devices = list;
            return this;
        }

        public Builder masterType(MasterType masterType) {
            this.masterType = masterType;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MasterMessage m270build() {
            MasterType masterType = this.masterType;
            if (masterType != null && this.cloudConnectionState != null) {
                return new MasterMessage(this.masterType, this.cloudConnectionState, this.devices, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{masterType, "masterType", this.cloudConnectionState, "cloudConnectionState"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MasterMessage extends ProtoAdapter<MasterMessage> {
        ProtoAdapter_MasterMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, MasterMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MasterMessage m271decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m270build();
                }
                if (nextTag == 1) {
                    try {
                        builder.masterType((MasterType) MasterType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        builder.cloudConnectionState((CloudConnectionState) CloudConnectionState.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.devices.add((MLDevice) MLDevice.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MasterMessage masterMessage) {
            MasterType.ADAPTER.encodeWithTag(protoWriter, 1, masterMessage.masterType);
            CloudConnectionState.ADAPTER.encodeWithTag(protoWriter, 2, masterMessage.cloudConnectionState);
            if (masterMessage.devices != null) {
                MLDevice.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, masterMessage.devices);
            }
            protoWriter.writeBytes(masterMessage.unknownFields());
        }

        public int encodedSize(MasterMessage masterMessage) {
            return MasterType.ADAPTER.encodedSizeWithTag(1, masterMessage.masterType) + CloudConnectionState.ADAPTER.encodedSizeWithTag(2, masterMessage.cloudConnectionState) + MLDevice.ADAPTER.asRepeated().encodedSizeWithTag(3, masterMessage.devices) + masterMessage.unknownFields().I();
        }

        public MasterMessage redact(MasterMessage masterMessage) {
            Builder m269newBuilder = masterMessage.m269newBuilder();
            Internal.redactElements(m269newBuilder.devices, MLDevice.ADAPTER);
            m269newBuilder.clearUnknownFields();
            return m269newBuilder.m270build();
        }
    }

    public MasterMessage(MasterType masterType, CloudConnectionState cloudConnectionState, List<MLDevice> list) {
        this(masterType, cloudConnectionState, list, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MasterMessage)) {
            return false;
        }
        MasterMessage masterMessage = (MasterMessage) obj;
        if (Internal.equals(unknownFields(), masterMessage.unknownFields()) && Internal.equals(this.masterType, masterMessage.masterType) && Internal.equals(this.cloudConnectionState, masterMessage.cloudConnectionState) && Internal.equals(this.devices, masterMessage.devices)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12 = ((Message) this).hashCode;
        if (i12 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            MasterType masterType = this.masterType;
            int i13 = 0;
            if (masterType != null) {
                i10 = masterType.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            CloudConnectionState cloudConnectionState = this.cloudConnectionState;
            if (cloudConnectionState != null) {
                i13 = cloudConnectionState.hashCode();
            }
            int i15 = (i14 + i13) * 37;
            List<MLDevice> list = this.devices;
            if (list != null) {
                i11 = list.hashCode();
            } else {
                i11 = 1;
            }
            int i16 = i15 + i11;
            ((Message) this).hashCode = i16;
            return i16;
        }
        return i12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.masterType != null) {
            sb.append(", masterType=");
            sb.append(this.masterType);
        }
        if (this.cloudConnectionState != null) {
            sb.append(", cloudConnectionState=");
            sb.append(this.cloudConnectionState);
        }
        if (this.devices != null) {
            sb.append(", devices=");
            sb.append(this.devices);
        }
        StringBuilder replace = sb.replace(0, 2, "MasterMessage{");
        replace.append('}');
        return replace.toString();
    }

    public MasterMessage(MasterType masterType, CloudConnectionState cloudConnectionState, List<MLDevice> list, h hVar) {
        super(ADAPTER, hVar);
        this.masterType = masterType;
        this.cloudConnectionState = cloudConnectionState;
        this.devices = Internal.immutableCopyOf("devices", list);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m269newBuilder() {
        Builder builder = new Builder();
        builder.masterType = this.masterType;
        builder.cloudConnectionState = this.cloudConnectionState;
        builder.devices = Internal.copyOf("devices", this.devices);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

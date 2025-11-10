package com.apptionlabs.meater_app.v2protobuf;

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
public final class V2MasterMessage extends Message<V2MasterMessage, Builder> {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2CloudConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final V2CloudConnectionState cloudConnectionState;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MLDevice#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<V2MLDevice> devices;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MasterType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final V2MasterType masterType;
    public static final ProtoAdapter<V2MasterMessage> ADAPTER = new ProtoAdapter_V2MasterMessage();
    public static final V2MasterType DEFAULT_MASTERTYPE = V2MasterType.V2MASTER_TYPE_BLOCK;
    public static final V2CloudConnectionState DEFAULT_CLOUDCONNECTIONSTATE = V2CloudConnectionState.V2CLOUD_CONNECTION_STATE_DISABLED;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2MasterMessage, Builder> {
        public V2CloudConnectionState cloudConnectionState;
        public List<V2MLDevice> devices = Internal.newMutableList();
        public V2MasterType masterType;

        public Builder cloudConnectionState(V2CloudConnectionState v2CloudConnectionState) {
            this.cloudConnectionState = v2CloudConnectionState;
            return this;
        }

        public Builder devices(List<V2MLDevice> list) {
            Internal.checkElementsNotNull(list);
            this.devices = list;
            return this;
        }

        public Builder masterType(V2MasterType v2MasterType) {
            this.masterType = v2MasterType;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2MasterMessage m81build() {
            V2MasterType v2MasterType = this.masterType;
            if (v2MasterType != null && this.cloudConnectionState != null) {
                return new V2MasterMessage(this.masterType, this.cloudConnectionState, this.devices, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{v2MasterType, "masterType", this.cloudConnectionState, "cloudConnectionState"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2MasterMessage extends ProtoAdapter<V2MasterMessage> {
        ProtoAdapter_V2MasterMessage() {
            super(FieldEncoding.LENGTH_DELIMITED, V2MasterMessage.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2MasterMessage m82decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m81build();
                }
                if (nextTag == 1) {
                    try {
                        builder.masterType((V2MasterType) V2MasterType.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (nextTag == 2) {
                    try {
                        builder.cloudConnectionState((V2CloudConnectionState) V2CloudConnectionState.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                    }
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.devices.add((V2MLDevice) V2MLDevice.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2MasterMessage v2MasterMessage) {
            V2MasterType.ADAPTER.encodeWithTag(protoWriter, 1, v2MasterMessage.masterType);
            V2CloudConnectionState.ADAPTER.encodeWithTag(protoWriter, 2, v2MasterMessage.cloudConnectionState);
            if (v2MasterMessage.devices != null) {
                V2MLDevice.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, v2MasterMessage.devices);
            }
            protoWriter.writeBytes(v2MasterMessage.unknownFields());
        }

        public int encodedSize(V2MasterMessage v2MasterMessage) {
            return V2MasterType.ADAPTER.encodedSizeWithTag(1, v2MasterMessage.masterType) + V2CloudConnectionState.ADAPTER.encodedSizeWithTag(2, v2MasterMessage.cloudConnectionState) + V2MLDevice.ADAPTER.asRepeated().encodedSizeWithTag(3, v2MasterMessage.devices) + v2MasterMessage.unknownFields().I();
        }

        public V2MasterMessage redact(V2MasterMessage v2MasterMessage) {
            Builder m80newBuilder = v2MasterMessage.m80newBuilder();
            Internal.redactElements(m80newBuilder.devices, V2MLDevice.ADAPTER);
            m80newBuilder.clearUnknownFields();
            return m80newBuilder.m81build();
        }
    }

    public V2MasterMessage(V2MasterType v2MasterType, V2CloudConnectionState v2CloudConnectionState, List<V2MLDevice> list) {
        this(v2MasterType, v2CloudConnectionState, list, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2MasterMessage)) {
            return false;
        }
        V2MasterMessage v2MasterMessage = (V2MasterMessage) obj;
        if (Internal.equals(unknownFields(), v2MasterMessage.unknownFields()) && Internal.equals(this.masterType, v2MasterMessage.masterType) && Internal.equals(this.cloudConnectionState, v2MasterMessage.cloudConnectionState) && Internal.equals(this.devices, v2MasterMessage.devices)) {
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
            V2MasterType v2MasterType = this.masterType;
            int i13 = 0;
            if (v2MasterType != null) {
                i10 = v2MasterType.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            V2CloudConnectionState v2CloudConnectionState = this.cloudConnectionState;
            if (v2CloudConnectionState != null) {
                i13 = v2CloudConnectionState.hashCode();
            }
            int i15 = (i14 + i13) * 37;
            List<V2MLDevice> list = this.devices;
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
        StringBuilder replace = sb.replace(0, 2, "V2MasterMessage{");
        replace.append('}');
        return replace.toString();
    }

    public V2MasterMessage(V2MasterType v2MasterType, V2CloudConnectionState v2CloudConnectionState, List<V2MLDevice> list, h hVar) {
        super(ADAPTER, hVar);
        this.masterType = v2MasterType;
        this.cloudConnectionState = v2CloudConnectionState;
        this.devices = Internal.immutableCopyOf("devices", list);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m80newBuilder() {
        Builder builder = new Builder();
        builder.masterType = this.masterType;
        builder.cloudConnectionState = this.cloudConnectionState;
        builder.devices = Internal.copyOf("devices", this.devices);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

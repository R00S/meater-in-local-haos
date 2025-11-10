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
public final class BLEProbeConnectionEvent extends Message<BLEProbeConnectionEvent, Builder> {
    public static final String DEFAULT_ERRORMESSAGE = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String errorMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.BLEProbeConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final BLEProbeConnectionState state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 2)
    public final Integer timeToConnect;
    public static final ProtoAdapter<BLEProbeConnectionEvent> ADAPTER = new ProtoAdapter_BLEProbeConnectionEvent();
    public static final BLEProbeConnectionState DEFAULT_STATE = BLEProbeConnectionState.BLE_PROBE_DISCONNECTED;
    public static final Integer DEFAULT_TIMETOCONNECT = 0;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<BLEProbeConnectionEvent, Builder> {
        public String errorMessage;
        public BLEProbeConnectionState state;
        public Integer timeToConnect;

        public Builder errorMessage(String str) {
            this.errorMessage = str;
            return this;
        }

        public Builder state(BLEProbeConnectionState bLEProbeConnectionState) {
            this.state = bLEProbeConnectionState;
            return this;
        }

        public Builder timeToConnect(Integer num) {
            this.timeToConnect = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public BLEProbeConnectionEvent m150build() {
            BLEProbeConnectionState bLEProbeConnectionState = this.state;
            if (bLEProbeConnectionState != null && this.timeToConnect != null) {
                return new BLEProbeConnectionEvent(this.state, this.timeToConnect, this.errorMessage, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{bLEProbeConnectionState, "state", this.timeToConnect, "timeToConnect"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_BLEProbeConnectionEvent extends ProtoAdapter<BLEProbeConnectionEvent> {
        ProtoAdapter_BLEProbeConnectionEvent() {
            super(FieldEncoding.LENGTH_DELIMITED, BLEProbeConnectionEvent.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public BLEProbeConnectionEvent m151decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m150build();
                }
                if (nextTag == 1) {
                    try {
                        builder.state((BLEProbeConnectionState) BLEProbeConnectionState.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (nextTag == 2) {
                    builder.timeToConnect((Integer) ProtoAdapter.UINT32.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.errorMessage((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, BLEProbeConnectionEvent bLEProbeConnectionEvent) {
            BLEProbeConnectionState.ADAPTER.encodeWithTag(protoWriter, 1, bLEProbeConnectionEvent.state);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, bLEProbeConnectionEvent.timeToConnect);
            String str = bLEProbeConnectionEvent.errorMessage;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, str);
            }
            protoWriter.writeBytes(bLEProbeConnectionEvent.unknownFields());
        }

        public int encodedSize(BLEProbeConnectionEvent bLEProbeConnectionEvent) {
            int encodedSizeWithTag = BLEProbeConnectionState.ADAPTER.encodedSizeWithTag(1, bLEProbeConnectionEvent.state) + ProtoAdapter.UINT32.encodedSizeWithTag(2, bLEProbeConnectionEvent.timeToConnect);
            String str = bLEProbeConnectionEvent.errorMessage;
            return encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(3, str) : 0) + bLEProbeConnectionEvent.unknownFields().I();
        }

        public BLEProbeConnectionEvent redact(BLEProbeConnectionEvent bLEProbeConnectionEvent) {
            Builder m149newBuilder = bLEProbeConnectionEvent.m149newBuilder();
            m149newBuilder.clearUnknownFields();
            return m149newBuilder.m150build();
        }
    }

    public BLEProbeConnectionEvent(BLEProbeConnectionState bLEProbeConnectionState, Integer num, String str) {
        this(bLEProbeConnectionState, num, str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLEProbeConnectionEvent)) {
            return false;
        }
        BLEProbeConnectionEvent bLEProbeConnectionEvent = (BLEProbeConnectionEvent) obj;
        if (Internal.equals(unknownFields(), bLEProbeConnectionEvent.unknownFields()) && Internal.equals(this.state, bLEProbeConnectionEvent.state) && Internal.equals(this.timeToConnect, bLEProbeConnectionEvent.timeToConnect) && Internal.equals(this.errorMessage, bLEProbeConnectionEvent.errorMessage)) {
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
            BLEProbeConnectionState bLEProbeConnectionState = this.state;
            int i13 = 0;
            if (bLEProbeConnectionState != null) {
                i10 = bLEProbeConnectionState.hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (hashCode + i10) * 37;
            Integer num = this.timeToConnect;
            if (num != null) {
                i11 = num.hashCode();
            } else {
                i11 = 0;
            }
            int i15 = (i14 + i11) * 37;
            String str = this.errorMessage;
            if (str != null) {
                i13 = str.hashCode();
            }
            int i16 = i15 + i13;
            ((Message) this).hashCode = i16;
            return i16;
        }
        return i12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.state != null) {
            sb.append(", state=");
            sb.append(this.state);
        }
        if (this.timeToConnect != null) {
            sb.append(", timeToConnect=");
            sb.append(this.timeToConnect);
        }
        if (this.errorMessage != null) {
            sb.append(", errorMessage=");
            sb.append(this.errorMessage);
        }
        StringBuilder replace = sb.replace(0, 2, "BLEProbeConnectionEvent{");
        replace.append('}');
        return replace.toString();
    }

    public BLEProbeConnectionEvent(BLEProbeConnectionState bLEProbeConnectionState, Integer num, String str, h hVar) {
        super(ADAPTER, hVar);
        this.state = bLEProbeConnectionState;
        this.timeToConnect = num;
        this.errorMessage = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m149newBuilder() {
        Builder builder = new Builder();
        builder.state = this.state;
        builder.timeToConnect = this.timeToConnect;
        builder.errorMessage = this.errorMessage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

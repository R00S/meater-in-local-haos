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
public final class MEATERPlusProbeConnectionEvent extends Message<MEATERPlusProbeConnectionEvent, Builder> {
    public static final ProtoAdapter<MEATERPlusProbeConnectionEvent> ADAPTER = new ProtoAdapter_MEATERPlusProbeConnectionEvent();
    public static final BLEProbeConnectionState DEFAULT_STATE = BLEProbeConnectionState.BLE_PROBE_DISCONNECTED;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.BLEProbeConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final BLEProbeConnectionState state;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MEATERPlusProbeConnectionEvent, Builder> {
        public BLEProbeConnectionState state;

        public Builder state(BLEProbeConnectionState bLEProbeConnectionState) {
            this.state = bLEProbeConnectionState;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MEATERPlusProbeConnectionEvent m237build() {
            BLEProbeConnectionState bLEProbeConnectionState = this.state;
            if (bLEProbeConnectionState != null) {
                return new MEATERPlusProbeConnectionEvent(this.state, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{bLEProbeConnectionState, "state"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MEATERPlusProbeConnectionEvent extends ProtoAdapter<MEATERPlusProbeConnectionEvent> {
        ProtoAdapter_MEATERPlusProbeConnectionEvent() {
            super(FieldEncoding.LENGTH_DELIMITED, MEATERPlusProbeConnectionEvent.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MEATERPlusProbeConnectionEvent m238decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m237build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.state((BLEProbeConnectionState) BLEProbeConnectionState.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MEATERPlusProbeConnectionEvent mEATERPlusProbeConnectionEvent) {
            BLEProbeConnectionState.ADAPTER.encodeWithTag(protoWriter, 1, mEATERPlusProbeConnectionEvent.state);
            protoWriter.writeBytes(mEATERPlusProbeConnectionEvent.unknownFields());
        }

        public int encodedSize(MEATERPlusProbeConnectionEvent mEATERPlusProbeConnectionEvent) {
            return BLEProbeConnectionState.ADAPTER.encodedSizeWithTag(1, mEATERPlusProbeConnectionEvent.state) + mEATERPlusProbeConnectionEvent.unknownFields().I();
        }

        public MEATERPlusProbeConnectionEvent redact(MEATERPlusProbeConnectionEvent mEATERPlusProbeConnectionEvent) {
            Builder m236newBuilder = mEATERPlusProbeConnectionEvent.m236newBuilder();
            m236newBuilder.clearUnknownFields();
            return m236newBuilder.m237build();
        }
    }

    public MEATERPlusProbeConnectionEvent(BLEProbeConnectionState bLEProbeConnectionState) {
        this(bLEProbeConnectionState, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MEATERPlusProbeConnectionEvent)) {
            return false;
        }
        MEATERPlusProbeConnectionEvent mEATERPlusProbeConnectionEvent = (MEATERPlusProbeConnectionEvent) obj;
        if (Internal.equals(unknownFields(), mEATERPlusProbeConnectionEvent.unknownFields()) && Internal.equals(this.state, mEATERPlusProbeConnectionEvent.state)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            BLEProbeConnectionState bLEProbeConnectionState = this.state;
            if (bLEProbeConnectionState != null) {
                i10 = bLEProbeConnectionState.hashCode();
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
        if (this.state != null) {
            sb.append(", state=");
            sb.append(this.state);
        }
        StringBuilder replace = sb.replace(0, 2, "MEATERPlusProbeConnectionEvent{");
        replace.append('}');
        return replace.toString();
    }

    public MEATERPlusProbeConnectionEvent(BLEProbeConnectionState bLEProbeConnectionState, h hVar) {
        super(ADAPTER, hVar);
        this.state = bLEProbeConnectionState;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m236newBuilder() {
        Builder builder = new Builder();
        builder.state = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

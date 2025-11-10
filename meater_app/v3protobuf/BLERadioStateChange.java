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
public final class BLERadioStateChange extends Message<BLERadioStateChange, Builder> {
    public static final ProtoAdapter<BLERadioStateChange> ADAPTER = new ProtoAdapter_BLERadioStateChange();
    public static final BLERadioState DEFAULT_STATE = BLERadioState.BLE_STATE_UNKNOWN;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.BLERadioState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final BLERadioState state;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<BLERadioStateChange, Builder> {
        public BLERadioState state;

        public Builder state(BLERadioState bLERadioState) {
            this.state = bLERadioState;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public BLERadioStateChange m153build() {
            BLERadioState bLERadioState = this.state;
            if (bLERadioState != null) {
                return new BLERadioStateChange(this.state, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{bLERadioState, "state"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_BLERadioStateChange extends ProtoAdapter<BLERadioStateChange> {
        ProtoAdapter_BLERadioStateChange() {
            super(FieldEncoding.LENGTH_DELIMITED, BLERadioStateChange.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public BLERadioStateChange m154decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m153build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.state((BLERadioState) BLERadioState.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                }
            }
        }

        public void encode(ProtoWriter protoWriter, BLERadioStateChange bLERadioStateChange) {
            BLERadioState.ADAPTER.encodeWithTag(protoWriter, 1, bLERadioStateChange.state);
            protoWriter.writeBytes(bLERadioStateChange.unknownFields());
        }

        public int encodedSize(BLERadioStateChange bLERadioStateChange) {
            return BLERadioState.ADAPTER.encodedSizeWithTag(1, bLERadioStateChange.state) + bLERadioStateChange.unknownFields().I();
        }

        public BLERadioStateChange redact(BLERadioStateChange bLERadioStateChange) {
            Builder m152newBuilder = bLERadioStateChange.m152newBuilder();
            m152newBuilder.clearUnknownFields();
            return m152newBuilder.m153build();
        }
    }

    public BLERadioStateChange(BLERadioState bLERadioState) {
        this(bLERadioState, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLERadioStateChange)) {
            return false;
        }
        BLERadioStateChange bLERadioStateChange = (BLERadioStateChange) obj;
        if (Internal.equals(unknownFields(), bLERadioStateChange.unknownFields()) && Internal.equals(this.state, bLERadioStateChange.state)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            BLERadioState bLERadioState = this.state;
            if (bLERadioState != null) {
                i10 = bLERadioState.hashCode();
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
        StringBuilder replace = sb.replace(0, 2, "BLERadioStateChange{");
        replace.append('}');
        return replace.toString();
    }

    public BLERadioStateChange(BLERadioState bLERadioState, h hVar) {
        super(ADAPTER, hVar);
        this.state = bLERadioState;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m152newBuilder() {
        Builder builder = new Builder();
        builder.state = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

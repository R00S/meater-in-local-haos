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
public final class MEATERCloudStateChange extends Message<MEATERCloudStateChange, Builder> {
    public static final String DEFAULT_ERRORMESSAGE = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String errorMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERCloudState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final MEATERCloudState state;
    public static final ProtoAdapter<MEATERCloudStateChange> ADAPTER = new ProtoAdapter_MEATERCloudStateChange();
    public static final MEATERCloudState DEFAULT_STATE = MEATERCloudState.MEATER_CLOUD_STATE_DISABLED;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MEATERCloudStateChange, Builder> {
        public String errorMessage;
        public MEATERCloudState state;

        public Builder errorMessage(String str) {
            this.errorMessage = str;
            return this;
        }

        public Builder state(MEATERCloudState mEATERCloudState) {
            this.state = mEATERCloudState;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MEATERCloudStateChange m210build() {
            MEATERCloudState mEATERCloudState = this.state;
            if (mEATERCloudState != null) {
                return new MEATERCloudStateChange(this.state, this.errorMessage, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{mEATERCloudState, "state"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MEATERCloudStateChange extends ProtoAdapter<MEATERCloudStateChange> {
        ProtoAdapter_MEATERCloudStateChange() {
            super(FieldEncoding.LENGTH_DELIMITED, MEATERCloudStateChange.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MEATERCloudStateChange m211decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m210build();
                }
                if (nextTag == 1) {
                    try {
                        builder.state((MEATERCloudState) MEATERCloudState.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.errorMessage((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MEATERCloudStateChange mEATERCloudStateChange) {
            MEATERCloudState.ADAPTER.encodeWithTag(protoWriter, 1, mEATERCloudStateChange.state);
            String str = mEATERCloudStateChange.errorMessage;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str);
            }
            protoWriter.writeBytes(mEATERCloudStateChange.unknownFields());
        }

        public int encodedSize(MEATERCloudStateChange mEATERCloudStateChange) {
            int encodedSizeWithTag = MEATERCloudState.ADAPTER.encodedSizeWithTag(1, mEATERCloudStateChange.state);
            String str = mEATERCloudStateChange.errorMessage;
            return encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, str) : 0) + mEATERCloudStateChange.unknownFields().I();
        }

        public MEATERCloudStateChange redact(MEATERCloudStateChange mEATERCloudStateChange) {
            Builder m209newBuilder = mEATERCloudStateChange.m209newBuilder();
            m209newBuilder.clearUnknownFields();
            return m209newBuilder.m210build();
        }
    }

    public MEATERCloudStateChange(MEATERCloudState mEATERCloudState, String str) {
        this(mEATERCloudState, str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MEATERCloudStateChange)) {
            return false;
        }
        MEATERCloudStateChange mEATERCloudStateChange = (MEATERCloudStateChange) obj;
        if (Internal.equals(unknownFields(), mEATERCloudStateChange.unknownFields()) && Internal.equals(this.state, mEATERCloudStateChange.state) && Internal.equals(this.errorMessage, mEATERCloudStateChange.errorMessage)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            MEATERCloudState mEATERCloudState = this.state;
            int i12 = 0;
            if (mEATERCloudState != null) {
                i10 = mEATERCloudState.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = (hashCode + i10) * 37;
            String str = this.errorMessage;
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
        if (this.state != null) {
            sb.append(", state=");
            sb.append(this.state);
        }
        if (this.errorMessage != null) {
            sb.append(", errorMessage=");
            sb.append(this.errorMessage);
        }
        StringBuilder replace = sb.replace(0, 2, "MEATERCloudStateChange{");
        replace.append('}');
        return replace.toString();
    }

    public MEATERCloudStateChange(MEATERCloudState mEATERCloudState, String str, h hVar) {
        super(ADAPTER, hVar);
        this.state = mEATERCloudState;
        this.errorMessage = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m209newBuilder() {
        Builder builder = new Builder();
        builder.state = this.state;
        builder.errorMessage = this.errorMessage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

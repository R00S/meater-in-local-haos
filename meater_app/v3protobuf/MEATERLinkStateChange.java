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
public final class MEATERLinkStateChange extends Message<MEATERLinkStateChange, Builder> {
    public static final String DEFAULT_ERRORMESSAGE = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String errorMessage;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERLinkState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final MEATERLinkState state;
    public static final ProtoAdapter<MEATERLinkStateChange> ADAPTER = new ProtoAdapter_MEATERLinkStateChange();
    public static final MEATERLinkState DEFAULT_STATE = MEATERLinkState.MEATER_LINK_STATE_DISABLED;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MEATERLinkStateChange, Builder> {
        public String errorMessage;
        public MEATERLinkState state;

        public Builder errorMessage(String str) {
            this.errorMessage = str;
            return this;
        }

        public Builder state(MEATERLinkState mEATERLinkState) {
            this.state = mEATERLinkState;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MEATERLinkStateChange m231build() {
            MEATERLinkState mEATERLinkState = this.state;
            if (mEATERLinkState != null) {
                return new MEATERLinkStateChange(this.state, this.errorMessage, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{mEATERLinkState, "state"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MEATERLinkStateChange extends ProtoAdapter<MEATERLinkStateChange> {
        ProtoAdapter_MEATERLinkStateChange() {
            super(FieldEncoding.LENGTH_DELIMITED, MEATERLinkStateChange.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MEATERLinkStateChange m232decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m231build();
                }
                if (nextTag == 1) {
                    try {
                        builder.state((MEATERLinkState) MEATERLinkState.ADAPTER.decode(protoReader));
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

        public void encode(ProtoWriter protoWriter, MEATERLinkStateChange mEATERLinkStateChange) {
            MEATERLinkState.ADAPTER.encodeWithTag(protoWriter, 1, mEATERLinkStateChange.state);
            String str = mEATERLinkStateChange.errorMessage;
            if (str != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, str);
            }
            protoWriter.writeBytes(mEATERLinkStateChange.unknownFields());
        }

        public int encodedSize(MEATERLinkStateChange mEATERLinkStateChange) {
            int encodedSizeWithTag = MEATERLinkState.ADAPTER.encodedSizeWithTag(1, mEATERLinkStateChange.state);
            String str = mEATERLinkStateChange.errorMessage;
            return encodedSizeWithTag + (str != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, str) : 0) + mEATERLinkStateChange.unknownFields().I();
        }

        public MEATERLinkStateChange redact(MEATERLinkStateChange mEATERLinkStateChange) {
            Builder m230newBuilder = mEATERLinkStateChange.m230newBuilder();
            m230newBuilder.clearUnknownFields();
            return m230newBuilder.m231build();
        }
    }

    public MEATERLinkStateChange(MEATERLinkState mEATERLinkState, String str) {
        this(mEATERLinkState, str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MEATERLinkStateChange)) {
            return false;
        }
        MEATERLinkStateChange mEATERLinkStateChange = (MEATERLinkStateChange) obj;
        if (Internal.equals(unknownFields(), mEATERLinkStateChange.unknownFields()) && Internal.equals(this.state, mEATERLinkStateChange.state) && Internal.equals(this.errorMessage, mEATERLinkStateChange.errorMessage)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            MEATERLinkState mEATERLinkState = this.state;
            int i12 = 0;
            if (mEATERLinkState != null) {
                i10 = mEATERLinkState.hashCode();
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
        StringBuilder replace = sb.replace(0, 2, "MEATERLinkStateChange{");
        replace.append('}');
        return replace.toString();
    }

    public MEATERLinkStateChange(MEATERLinkState mEATERLinkState, String str, h hVar) {
        super(ADAPTER, hVar);
        this.state = mEATERLinkState;
        this.errorMessage = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m230newBuilder() {
        Builder builder = new Builder();
        builder.state = this.state;
        builder.errorMessage = this.errorMessage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

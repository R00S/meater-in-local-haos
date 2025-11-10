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
public final class MEATERErrorEvent extends Message<MEATERErrorEvent, Builder> {
    public static final ProtoAdapter<MEATERErrorEvent> ADAPTER = new ProtoAdapter_MEATERErrorEvent();
    public static final String DEFAULT_ERRORMESSAGE = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String errorMessage;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MEATERErrorEvent, Builder> {
        public String errorMessage;

        public Builder errorMessage(String str) {
            this.errorMessage = str;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MEATERErrorEvent m219build() {
            String str = this.errorMessage;
            if (str != null) {
                return new MEATERErrorEvent(this.errorMessage, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{str, "errorMessage"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MEATERErrorEvent extends ProtoAdapter<MEATERErrorEvent> {
        ProtoAdapter_MEATERErrorEvent() {
            super(FieldEncoding.LENGTH_DELIMITED, MEATERErrorEvent.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MEATERErrorEvent m220decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m219build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.errorMessage((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MEATERErrorEvent mEATERErrorEvent) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mEATERErrorEvent.errorMessage);
            protoWriter.writeBytes(mEATERErrorEvent.unknownFields());
        }

        public int encodedSize(MEATERErrorEvent mEATERErrorEvent) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, mEATERErrorEvent.errorMessage) + mEATERErrorEvent.unknownFields().I();
        }

        public MEATERErrorEvent redact(MEATERErrorEvent mEATERErrorEvent) {
            Builder m218newBuilder = mEATERErrorEvent.m218newBuilder();
            m218newBuilder.clearUnknownFields();
            return m218newBuilder.m219build();
        }
    }

    public MEATERErrorEvent(String str) {
        this(str, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MEATERErrorEvent)) {
            return false;
        }
        MEATERErrorEvent mEATERErrorEvent = (MEATERErrorEvent) obj;
        if (Internal.equals(unknownFields(), mEATERErrorEvent.unknownFields()) && Internal.equals(this.errorMessage, mEATERErrorEvent.errorMessage)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.errorMessage;
            if (str != null) {
                i10 = str.hashCode();
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
        if (this.errorMessage != null) {
            sb.append(", errorMessage=");
            sb.append(this.errorMessage);
        }
        StringBuilder replace = sb.replace(0, 2, "MEATERErrorEvent{");
        replace.append('}');
        return replace.toString();
    }

    public MEATERErrorEvent(String str, h hVar) {
        super(ADAPTER, hVar);
        this.errorMessage = str;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m218newBuilder() {
        Builder builder = new Builder();
        builder.errorMessage = this.errorMessage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

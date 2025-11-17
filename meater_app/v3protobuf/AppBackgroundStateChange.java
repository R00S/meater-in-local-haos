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
public final class AppBackgroundStateChange extends Message<AppBackgroundStateChange, Builder> {
    public static final ProtoAdapter<AppBackgroundStateChange> ADAPTER = new ProtoAdapter_AppBackgroundStateChange();
    public static final AppBackgroundState DEFAULT_STATE = AppBackgroundState.APP_BACKGROUND_STATE_FOREGROUND;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.AppBackgroundState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final AppBackgroundState state;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<AppBackgroundStateChange, Builder> {
        public AppBackgroundState state;

        public Builder state(AppBackgroundState appBackgroundState) {
            this.state = appBackgroundState;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public AppBackgroundStateChange m147build() {
            AppBackgroundState appBackgroundState = this.state;
            if (appBackgroundState != null) {
                return new AppBackgroundStateChange(this.state, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{appBackgroundState, "state"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_AppBackgroundStateChange extends ProtoAdapter<AppBackgroundStateChange> {
        ProtoAdapter_AppBackgroundStateChange() {
            super(FieldEncoding.LENGTH_DELIMITED, AppBackgroundStateChange.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public AppBackgroundStateChange m148decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m147build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.state((AppBackgroundState) AppBackgroundState.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                }
            }
        }

        public void encode(ProtoWriter protoWriter, AppBackgroundStateChange appBackgroundStateChange) {
            AppBackgroundState.ADAPTER.encodeWithTag(protoWriter, 1, appBackgroundStateChange.state);
            protoWriter.writeBytes(appBackgroundStateChange.unknownFields());
        }

        public int encodedSize(AppBackgroundStateChange appBackgroundStateChange) {
            return AppBackgroundState.ADAPTER.encodedSizeWithTag(1, appBackgroundStateChange.state) + appBackgroundStateChange.unknownFields().I();
        }

        public AppBackgroundStateChange redact(AppBackgroundStateChange appBackgroundStateChange) {
            Builder m146newBuilder = appBackgroundStateChange.m146newBuilder();
            m146newBuilder.clearUnknownFields();
            return m146newBuilder.m147build();
        }
    }

    public AppBackgroundStateChange(AppBackgroundState appBackgroundState) {
        this(appBackgroundState, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppBackgroundStateChange)) {
            return false;
        }
        AppBackgroundStateChange appBackgroundStateChange = (AppBackgroundStateChange) obj;
        if (Internal.equals(unknownFields(), appBackgroundStateChange.unknownFields()) && Internal.equals(this.state, appBackgroundStateChange.state)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            AppBackgroundState appBackgroundState = this.state;
            if (appBackgroundState != null) {
                i10 = appBackgroundState.hashCode();
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
        StringBuilder replace = sb.replace(0, 2, "AppBackgroundStateChange{");
        replace.append('}');
        return replace.toString();
    }

    public AppBackgroundStateChange(AppBackgroundState appBackgroundState, h hVar) {
        super(ADAPTER, hVar);
        this.state = appBackgroundState;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m146newBuilder() {
        Builder builder = new Builder();
        builder.state = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

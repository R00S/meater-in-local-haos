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
public final class ProbeReadCookSetupEvent extends Message<ProbeReadCookSetupEvent, Builder> {
    public static final ProtoAdapter<ProbeReadCookSetupEvent> ADAPTER = new ProtoAdapter_ProbeReadCookSetupEvent();
    public static final ProbeCookSetupState DEFAULT_STATE = ProbeCookSetupState.PROBE_COOK_SETUP_STATE_NONE;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.ProbeCookSetupState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final ProbeCookSetupState state;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<ProbeReadCookSetupEvent, Builder> {
        public ProbeCookSetupState state;

        public Builder state(ProbeCookSetupState probeCookSetupState) {
            this.state = probeCookSetupState;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public ProbeReadCookSetupEvent m339build() {
            ProbeCookSetupState probeCookSetupState = this.state;
            if (probeCookSetupState != null) {
                return new ProbeReadCookSetupEvent(this.state, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{probeCookSetupState, "state"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_ProbeReadCookSetupEvent extends ProtoAdapter<ProbeReadCookSetupEvent> {
        ProtoAdapter_ProbeReadCookSetupEvent() {
            super(FieldEncoding.LENGTH_DELIMITED, ProbeReadCookSetupEvent.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public ProbeReadCookSetupEvent m340decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m339build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.state((ProbeCookSetupState) ProbeCookSetupState.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ProbeReadCookSetupEvent probeReadCookSetupEvent) {
            ProbeCookSetupState.ADAPTER.encodeWithTag(protoWriter, 1, probeReadCookSetupEvent.state);
            protoWriter.writeBytes(probeReadCookSetupEvent.unknownFields());
        }

        public int encodedSize(ProbeReadCookSetupEvent probeReadCookSetupEvent) {
            return ProbeCookSetupState.ADAPTER.encodedSizeWithTag(1, probeReadCookSetupEvent.state) + probeReadCookSetupEvent.unknownFields().I();
        }

        public ProbeReadCookSetupEvent redact(ProbeReadCookSetupEvent probeReadCookSetupEvent) {
            Builder m338newBuilder = probeReadCookSetupEvent.m338newBuilder();
            m338newBuilder.clearUnknownFields();
            return m338newBuilder.m339build();
        }
    }

    public ProbeReadCookSetupEvent(ProbeCookSetupState probeCookSetupState) {
        this(probeCookSetupState, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProbeReadCookSetupEvent)) {
            return false;
        }
        ProbeReadCookSetupEvent probeReadCookSetupEvent = (ProbeReadCookSetupEvent) obj;
        if (Internal.equals(unknownFields(), probeReadCookSetupEvent.unknownFields()) && Internal.equals(this.state, probeReadCookSetupEvent.state)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            ProbeCookSetupState probeCookSetupState = this.state;
            if (probeCookSetupState != null) {
                i10 = probeCookSetupState.hashCode();
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
        StringBuilder replace = sb.replace(0, 2, "ProbeReadCookSetupEvent{");
        replace.append('}');
        return replace.toString();
    }

    public ProbeReadCookSetupEvent(ProbeCookSetupState probeCookSetupState, h hVar) {
        super(ADAPTER, hVar);
        this.state = probeCookSetupState;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m338newBuilder() {
        Builder builder = new Builder();
        builder.state = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

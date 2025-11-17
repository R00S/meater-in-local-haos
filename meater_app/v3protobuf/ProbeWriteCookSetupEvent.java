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
public final class ProbeWriteCookSetupEvent extends Message<ProbeWriteCookSetupEvent, Builder> {
    public static final ProtoAdapter<ProbeWriteCookSetupEvent> ADAPTER = new ProtoAdapter_ProbeWriteCookSetupEvent();
    public static final Integer DEFAULT_SEQUENCENUMBER = 0;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REQUIRED, tag = 1)
    public final Integer sequenceNumber;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<ProbeWriteCookSetupEvent, Builder> {
        public Integer sequenceNumber;

        public Builder sequenceNumber(Integer num) {
            this.sequenceNumber = num;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public ProbeWriteCookSetupEvent m351build() {
            Integer num = this.sequenceNumber;
            if (num != null) {
                return new ProbeWriteCookSetupEvent(this.sequenceNumber, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{num, "sequenceNumber"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_ProbeWriteCookSetupEvent extends ProtoAdapter<ProbeWriteCookSetupEvent> {
        ProtoAdapter_ProbeWriteCookSetupEvent() {
            super(FieldEncoding.LENGTH_DELIMITED, ProbeWriteCookSetupEvent.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public ProbeWriteCookSetupEvent m352decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m351build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.sequenceNumber((Integer) ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ProbeWriteCookSetupEvent probeWriteCookSetupEvent) {
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, probeWriteCookSetupEvent.sequenceNumber);
            protoWriter.writeBytes(probeWriteCookSetupEvent.unknownFields());
        }

        public int encodedSize(ProbeWriteCookSetupEvent probeWriteCookSetupEvent) {
            return ProtoAdapter.UINT32.encodedSizeWithTag(1, probeWriteCookSetupEvent.sequenceNumber) + probeWriteCookSetupEvent.unknownFields().I();
        }

        public ProbeWriteCookSetupEvent redact(ProbeWriteCookSetupEvent probeWriteCookSetupEvent) {
            Builder m350newBuilder = probeWriteCookSetupEvent.m350newBuilder();
            m350newBuilder.clearUnknownFields();
            return m350newBuilder.m351build();
        }
    }

    public ProbeWriteCookSetupEvent(Integer num) {
        this(num, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProbeWriteCookSetupEvent)) {
            return false;
        }
        ProbeWriteCookSetupEvent probeWriteCookSetupEvent = (ProbeWriteCookSetupEvent) obj;
        if (Internal.equals(unknownFields(), probeWriteCookSetupEvent.unknownFields()) && Internal.equals(this.sequenceNumber, probeWriteCookSetupEvent.sequenceNumber)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.sequenceNumber;
            if (num != null) {
                i10 = num.hashCode();
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
        if (this.sequenceNumber != null) {
            sb.append(", sequenceNumber=");
            sb.append(this.sequenceNumber);
        }
        StringBuilder replace = sb.replace(0, 2, "ProbeWriteCookSetupEvent{");
        replace.append('}');
        return replace.toString();
    }

    public ProbeWriteCookSetupEvent(Integer num, h hVar) {
        super(ADAPTER, hVar);
        this.sequenceNumber = num;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m350newBuilder() {
        Builder builder = new Builder();
        builder.sequenceNumber = this.sequenceNumber;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

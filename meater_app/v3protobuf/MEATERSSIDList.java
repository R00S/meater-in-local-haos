package com.apptionlabs.meater_app.v3protobuf;

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
public final class MEATERSSIDList extends Message<MEATERSSIDList, Builder> {
    public static final ProtoAdapter<MEATERSSIDList> ADAPTER = new ProtoAdapter_MEATERSSIDList();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.MEATERSSID#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<MEATERSSID> SSIDs;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<MEATERSSIDList, Builder> {
        public List<MEATERSSID> SSIDs = Internal.newMutableList();

        public Builder SSIDs(List<MEATERSSID> list) {
            Internal.checkElementsNotNull(list);
            this.SSIDs = list;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public MEATERSSIDList m246build() {
            return new MEATERSSIDList(this.SSIDs, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_MEATERSSIDList extends ProtoAdapter<MEATERSSIDList> {
        ProtoAdapter_MEATERSSIDList() {
            super(FieldEncoding.LENGTH_DELIMITED, MEATERSSIDList.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public MEATERSSIDList m247decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m246build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.SSIDs.add((MEATERSSID) MEATERSSID.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, MEATERSSIDList mEATERSSIDList) {
            if (mEATERSSIDList.SSIDs != null) {
                MEATERSSID.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mEATERSSIDList.SSIDs);
            }
            protoWriter.writeBytes(mEATERSSIDList.unknownFields());
        }

        public int encodedSize(MEATERSSIDList mEATERSSIDList) {
            return MEATERSSID.ADAPTER.asRepeated().encodedSizeWithTag(1, mEATERSSIDList.SSIDs) + mEATERSSIDList.unknownFields().I();
        }

        public MEATERSSIDList redact(MEATERSSIDList mEATERSSIDList) {
            Builder m245newBuilder = mEATERSSIDList.m245newBuilder();
            Internal.redactElements(m245newBuilder.SSIDs, MEATERSSID.ADAPTER);
            m245newBuilder.clearUnknownFields();
            return m245newBuilder.m246build();
        }
    }

    public MEATERSSIDList(List<MEATERSSID> list) {
        this(list, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MEATERSSIDList)) {
            return false;
        }
        MEATERSSIDList mEATERSSIDList = (MEATERSSIDList) obj;
        if (Internal.equals(unknownFields(), mEATERSSIDList.unknownFields()) && Internal.equals(this.SSIDs, mEATERSSIDList.SSIDs)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            List<MEATERSSID> list = this.SSIDs;
            if (list != null) {
                i10 = list.hashCode();
            } else {
                i10 = 1;
            }
            int i12 = hashCode + i10;
            ((Message) this).hashCode = i12;
            return i12;
        }
        return i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.SSIDs != null) {
            sb.append(", SSIDs=");
            sb.append(this.SSIDs);
        }
        StringBuilder replace = sb.replace(0, 2, "MEATERSSIDList{");
        replace.append('}');
        return replace.toString();
    }

    public MEATERSSIDList(List<MEATERSSID> list, h hVar) {
        super(ADAPTER, hVar);
        this.SSIDs = Internal.immutableCopyOf("SSIDs", list);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m245newBuilder() {
        Builder builder = new Builder();
        builder.SSIDs = Internal.copyOf("SSIDs", this.SSIDs);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

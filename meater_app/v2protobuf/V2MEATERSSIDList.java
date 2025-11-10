package com.apptionlabs.meater_app.v2protobuf;

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
public final class V2MEATERSSIDList extends Message<V2MEATERSSIDList, Builder> {
    public static final ProtoAdapter<V2MEATERSSIDList> ADAPTER = new ProtoAdapter_V2MEATERSSIDList();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v2protobuf.V2MEATERSSID#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<V2MEATERSSID> SSIDs;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<V2MEATERSSIDList, Builder> {
        public List<V2MEATERSSID> SSIDs = Internal.newMutableList();

        public Builder SSIDs(List<V2MEATERSSID> list) {
            Internal.checkElementsNotNull(list);
            this.SSIDs = list;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public V2MEATERSSIDList m63build() {
            return new V2MEATERSSIDList(this.SSIDs, buildUnknownFields());
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_V2MEATERSSIDList extends ProtoAdapter<V2MEATERSSIDList> {
        ProtoAdapter_V2MEATERSSIDList() {
            super(FieldEncoding.LENGTH_DELIMITED, V2MEATERSSIDList.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public V2MEATERSSIDList m64decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m63build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.SSIDs.add((V2MEATERSSID) V2MEATERSSID.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, V2MEATERSSIDList v2MEATERSSIDList) {
            if (v2MEATERSSIDList.SSIDs != null) {
                V2MEATERSSID.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, v2MEATERSSIDList.SSIDs);
            }
            protoWriter.writeBytes(v2MEATERSSIDList.unknownFields());
        }

        public int encodedSize(V2MEATERSSIDList v2MEATERSSIDList) {
            return V2MEATERSSID.ADAPTER.asRepeated().encodedSizeWithTag(1, v2MEATERSSIDList.SSIDs) + v2MEATERSSIDList.unknownFields().I();
        }

        public V2MEATERSSIDList redact(V2MEATERSSIDList v2MEATERSSIDList) {
            Builder m62newBuilder = v2MEATERSSIDList.m62newBuilder();
            Internal.redactElements(m62newBuilder.SSIDs, V2MEATERSSID.ADAPTER);
            m62newBuilder.clearUnknownFields();
            return m62newBuilder.m63build();
        }
    }

    public V2MEATERSSIDList(List<V2MEATERSSID> list) {
        this(list, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V2MEATERSSIDList)) {
            return false;
        }
        V2MEATERSSIDList v2MEATERSSIDList = (V2MEATERSSIDList) obj;
        if (Internal.equals(unknownFields(), v2MEATERSSIDList.unknownFields()) && Internal.equals(this.SSIDs, v2MEATERSSIDList.SSIDs)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            List<V2MEATERSSID> list = this.SSIDs;
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
        StringBuilder replace = sb.replace(0, 2, "V2MEATERSSIDList{");
        replace.append('}');
        return replace.toString();
    }

    public V2MEATERSSIDList(List<V2MEATERSSID> list, h hVar) {
        super(ADAPTER, hVar);
        this.SSIDs = Internal.immutableCopyOf("SSIDs", list);
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m62newBuilder() {
        Builder builder = new Builder();
        builder.SSIDs = Internal.copyOf("SSIDs", this.SSIDs);
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

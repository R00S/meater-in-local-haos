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
public final class NetworkConnectivityStateChange extends Message<NetworkConnectivityStateChange, Builder> {
    public static final ProtoAdapter<NetworkConnectivityStateChange> ADAPTER = new ProtoAdapter_NetworkConnectivityStateChange();
    public static final NetworkState DEFAULT_STATE = NetworkState.NETWORK_STATE_NO_CONNECTION;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.apptionlabs.meater_app.v3protobuf.NetworkState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final NetworkState state;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Builder extends Message.Builder<NetworkConnectivityStateChange, Builder> {
        public NetworkState state;

        public Builder state(NetworkState networkState) {
            this.state = networkState;
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public NetworkConnectivityStateChange m288build() {
            NetworkState networkState = this.state;
            if (networkState != null) {
                return new NetworkConnectivityStateChange(this.state, buildUnknownFields());
            }
            throw Internal.missingRequiredFields(new Object[]{networkState, "state"});
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    private static final class ProtoAdapter_NetworkConnectivityStateChange extends ProtoAdapter<NetworkConnectivityStateChange> {
        ProtoAdapter_NetworkConnectivityStateChange() {
            super(FieldEncoding.LENGTH_DELIMITED, NetworkConnectivityStateChange.class);
        }

        /* renamed from: decode, reason: merged with bridge method [inline-methods] */
        public NetworkConnectivityStateChange m289decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.m288build();
                }
                if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.state((NetworkState) NetworkState.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                    }
                }
            }
        }

        public void encode(ProtoWriter protoWriter, NetworkConnectivityStateChange networkConnectivityStateChange) {
            NetworkState.ADAPTER.encodeWithTag(protoWriter, 1, networkConnectivityStateChange.state);
            protoWriter.writeBytes(networkConnectivityStateChange.unknownFields());
        }

        public int encodedSize(NetworkConnectivityStateChange networkConnectivityStateChange) {
            return NetworkState.ADAPTER.encodedSizeWithTag(1, networkConnectivityStateChange.state) + networkConnectivityStateChange.unknownFields().I();
        }

        public NetworkConnectivityStateChange redact(NetworkConnectivityStateChange networkConnectivityStateChange) {
            Builder m287newBuilder = networkConnectivityStateChange.m287newBuilder();
            m287newBuilder.clearUnknownFields();
            return m287newBuilder.m288build();
        }
    }

    public NetworkConnectivityStateChange(NetworkState networkState) {
        this(networkState, h.u);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkConnectivityStateChange)) {
            return false;
        }
        NetworkConnectivityStateChange networkConnectivityStateChange = (NetworkConnectivityStateChange) obj;
        if (Internal.equals(unknownFields(), networkConnectivityStateChange.unknownFields()) && Internal.equals(this.state, networkConnectivityStateChange.state)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11 = ((Message) this).hashCode;
        if (i11 == 0) {
            int hashCode = unknownFields().hashCode() * 37;
            NetworkState networkState = this.state;
            if (networkState != null) {
                i10 = networkState.hashCode();
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
        StringBuilder replace = sb.replace(0, 2, "NetworkConnectivityStateChange{");
        replace.append('}');
        return replace.toString();
    }

    public NetworkConnectivityStateChange(NetworkState networkState, h hVar) {
        super(ADAPTER, hVar);
        this.state = networkState;
    }

    /* renamed from: newBuilder, reason: merged with bridge method [inline-methods] */
    public Builder m287newBuilder() {
        Builder builder = new Builder();
        builder.state = this.state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}

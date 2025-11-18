package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* loaded from: classes2.dex */
public class InetSocketAddressSerializer extends StdScalarSerializer<InetSocketAddress> {
    public InetSocketAddressSerializer() {
        super(InetSocketAddress.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String strSubstring;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int iIndexOf = hostName.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0) {
                if (address instanceof Inet6Address) {
                    strSubstring = "[" + hostName.substring(1) + "]";
                } else {
                    strSubstring = hostName.substring(1);
                }
                hostName = strSubstring;
            } else {
                hostName = hostName.substring(0, iIndexOf);
            }
        }
        jsonGenerator.writeString(hostName + ":" + inetSocketAddress.getPort());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        typeSerializer.writeTypePrefixForScalar(inetSocketAddress, jsonGenerator, InetSocketAddress.class);
        serialize(inetSocketAddress, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForScalar(inetSocketAddress, jsonGenerator);
    }
}

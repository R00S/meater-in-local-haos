package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes2.dex */
public class UUIDSerializer extends StdScalarSerializer<UUID> {
    static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();

    public UUIDSerializer() {
        super(UUID.class);
    }

    private static void _appendInt(int i2, char[] cArr, int i3) {
        _appendShort(i2 >> 16, cArr, i3);
        _appendShort(i2, cArr, i3 + 4);
    }

    private static void _appendShort(int i2, char[] cArr, int i3) {
        char[] cArr2 = HEX_CHARS;
        cArr[i3] = cArr2[(i2 >> 12) & 15];
        int i4 = i3 + 1;
        cArr[i4] = cArr2[(i2 >> 8) & 15];
        int i5 = i4 + 1;
        cArr[i5] = cArr2[(i2 >> 4) & 15];
        cArr[i5 + 1] = cArr2[i2 & 15];
    }

    private static final byte[] _asBytes(UUID uuid) {
        byte[] bArr = new byte[16];
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        _appendInt((int) (mostSignificantBits >> 32), bArr, 0);
        _appendInt((int) mostSignificantBits, bArr, 4);
        _appendInt((int) (leastSignificantBits >> 32), bArr, 8);
        _appendInt((int) leastSignificantBits, bArr, 12);
        return bArr;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, UUID uuid) {
        if (uuid == null) {
            return true;
        }
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(UUID uuid, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (jsonGenerator.canWriteBinaryNatively() && !(jsonGenerator instanceof TokenBuffer)) {
            jsonGenerator.writeBinary(_asBytes(uuid));
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits = uuid.getMostSignificantBits();
        _appendInt((int) (mostSignificantBits >> 32), cArr, 0);
        cArr[8] = '-';
        int i2 = (int) mostSignificantBits;
        _appendShort(i2 >>> 16, cArr, 9);
        cArr[13] = '-';
        _appendShort(i2, cArr, 14);
        cArr[18] = '-';
        long leastSignificantBits = uuid.getLeastSignificantBits();
        _appendShort((int) (leastSignificantBits >>> 48), cArr, 19);
        cArr[23] = '-';
        _appendShort((int) (leastSignificantBits >>> 32), cArr, 24);
        _appendInt((int) leastSignificantBits, cArr, 28);
        jsonGenerator.writeString(cArr, 0, 36);
    }

    private static final void _appendInt(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) (i2 >> 24);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i2 >> 16);
        int i5 = i4 + 1;
        bArr[i5] = (byte) (i2 >> 8);
        bArr[i5 + 1] = (byte) i2;
    }
}

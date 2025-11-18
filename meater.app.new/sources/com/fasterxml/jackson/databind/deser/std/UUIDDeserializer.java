package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes2.dex */
public class UUIDDeserializer extends FromStringDeserializer<UUID> {
    static final int[] HEX_DIGITS;

    static {
        int[] iArr = new int[127];
        HEX_DIGITS = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < 10; i2++) {
            HEX_DIGITS[i2 + 48] = i2;
        }
        for (int i3 = 0; i3 < 6; i3++) {
            int[] iArr2 = HEX_DIGITS;
            int i4 = i3 + 10;
            iArr2[i3 + 97] = i4;
            iArr2[i3 + 65] = i4;
        }
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    private UUID _badFormat(String str, DeserializationContext deserializationContext) throws IOException {
        return (UUID) deserializationContext.handleWeirdStringValue(handledType(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
    }

    private UUID _fromBytes(byte[] bArr, DeserializationContext deserializationContext) throws JsonMappingException {
        if (bArr.length == 16) {
            return new UUID(_long(bArr, 0), _long(bArr, 8));
        }
        throw InvalidFormatException.from(deserializationContext.getParser(), "Can only construct UUIDs from byte[16]; got " + bArr.length + " bytes", bArr, handledType());
    }

    private static int _int(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | (bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    private static long _long(byte[] bArr, int i2) {
        return ((_int(bArr, i2 + 4) << 32) >>> 32) | (_int(bArr, i2) << 32);
    }

    int _badChar(String str, int i2, DeserializationContext deserializationContext, char c2) throws JsonMappingException {
        throw deserializationContext.weirdStringException(str, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(c2), Integer.toHexString(c2)));
    }

    int byteFromChars(String str, int i2, DeserializationContext deserializationContext) throws JsonMappingException {
        char cCharAt = str.charAt(i2);
        int i3 = i2 + 1;
        char cCharAt2 = str.charAt(i3);
        if (cCharAt <= 127 && cCharAt2 <= 127) {
            int[] iArr = HEX_DIGITS;
            int i4 = iArr[cCharAt2] | (iArr[cCharAt] << 4);
            if (i4 >= 0) {
                return i4;
            }
        }
        return (cCharAt > 127 || HEX_DIGITS[cCharAt] < 0) ? _badChar(str, i2, deserializationContext, cCharAt) : _badChar(str, i3, deserializationContext, cCharAt2);
    }

    int intFromChars(String str, int i2, DeserializationContext deserializationContext) throws JsonMappingException {
        return (byteFromChars(str, i2, deserializationContext) << 24) + (byteFromChars(str, i2 + 2, deserializationContext) << 16) + (byteFromChars(str, i2 + 4, deserializationContext) << 8) + byteFromChars(str, i2 + 6, deserializationContext);
    }

    int shortFromChars(String str, int i2, DeserializationContext deserializationContext) throws JsonMappingException {
        return (byteFromChars(str, i2, deserializationContext) << 8) + byteFromChars(str, i2 + 2, deserializationContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public UUID _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
        if (str.length() != 36) {
            return str.length() == 24 ? _fromBytes(Base64Variants.getDefaultVariant().decode(str), deserializationContext) : _badFormat(str, deserializationContext);
        }
        if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
            _badFormat(str, deserializationContext);
        }
        return new UUID((intFromChars(str, 0, deserializationContext) << 32) + ((shortFromChars(str, 9, deserializationContext) << 16) | shortFromChars(str, 14, deserializationContext)), ((intFromChars(str, 28, deserializationContext) << 32) >>> 32) | ((shortFromChars(str, 24, deserializationContext) | (shortFromChars(str, 19, deserializationContext) << 16)) << 32));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws IOException {
        if (obj instanceof byte[]) {
            return _fromBytes((byte[]) obj, deserializationContext);
        }
        super._deserializeEmbedded(obj, deserializationContext);
        return null;
    }
}

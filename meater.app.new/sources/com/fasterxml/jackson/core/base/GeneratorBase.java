package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes2.dex */
public abstract class GeneratorBase extends JsonGenerator {
    protected static final int DERIVED_FEATURES_MASK = (JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
    protected boolean _cfgNumbersAsStrings;
    protected boolean _closed;
    protected int _features;
    protected ObjectCodec _objectCodec;
    protected JsonWriteContext _writeContext;

    protected GeneratorBase(int i2, ObjectCodec objectCodec) {
        this._features = i2;
        this._objectCodec = objectCodec;
        this._writeContext = JsonWriteContext.createRootContext(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i2) ? DupDetector.rootDetector(this) : null);
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i2);
    }

    protected String _asString(BigDecimal bigDecimal) throws IOException {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._features)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale < -9999 || iScale > 9999) {
            _reportError(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        }
        return bigDecimal.toPlainString();
    }

    protected void _checkStdFeatureChanges(int i2, int i3) {
        if ((DERIVED_FEATURES_MASK & i3) == 0) {
            return;
        }
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i2);
        JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
        if (feature.enabledIn(i3)) {
            if (feature.enabledIn(i2)) {
                setHighestNonEscapedChar(127);
            } else {
                setHighestNonEscapedChar(0);
            }
        }
        JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        if (feature2.enabledIn(i3)) {
            if (!feature2.enabledIn(i2)) {
                this._writeContext = this._writeContext.withDupDetector(null);
            } else if (this._writeContext.getDupDetector() == null) {
                this._writeContext = this._writeContext.withDupDetector(DupDetector.rootDetector(this));
            }
        }
    }

    protected final int _decodeSurrogate(int i2, int i3) throws IOException {
        if (i3 < 56320 || i3 > 57343) {
            _reportError("Incomplete surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i3));
        }
        return ((i2 - 55296) << 10) + 65536 + (i3 - 56320);
    }

    protected abstract void _verifyValueWrite(String str) throws IOException;

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this._closed = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this._features &= mask ^ (-1);
        if ((mask & DERIVED_FEATURES_MASK) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = false;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(0);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                this._writeContext = this._writeContext.withDupDetector(null);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getFeatureMask() {
        return this._features;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonStreamContext getOutputContext() {
        return this._writeContext;
    }

    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._features) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator overrideStdFeatures(int i2, int i3) {
        int i4 = this._features;
        int i5 = (i2 & i3) | ((i3 ^ (-1)) & i4);
        int i6 = i4 ^ i5;
        if (i6 != 0) {
            this._features = i5;
            _checkStdFeatureChanges(i5, i6);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void setCurrentValue(Object obj) {
        this._writeContext.setCurrentValue(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    public JsonGenerator setFeatureMask(int i2) {
        int i3 = this._features ^ i2;
        this._features = i2;
        if (i3 != 0) {
            _checkStdFeatureChanges(i2, i3);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec != null) {
            objectCodec.writeValue(this, obj);
        } else {
            _writeSimpleObject(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(serializableString);
    }
}

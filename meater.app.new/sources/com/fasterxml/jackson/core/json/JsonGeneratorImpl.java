package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.p176io.CharTypes;
import com.fasterxml.jackson.core.p176io.CharacterEscapes;
import com.fasterxml.jackson.core.p176io.IOContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class JsonGeneratorImpl extends GeneratorBase {
    protected static final int[] sOutputEscapes = CharTypes.get7BitOutputEscapes();
    protected boolean _cfgUnqNames;
    protected CharacterEscapes _characterEscapes;
    protected final IOContext _ioContext;
    protected int _maximumNonEscapedChar;
    protected int[] _outputEscapes;
    protected SerializableString _rootValueSeparator;

    public JsonGeneratorImpl(IOContext iOContext, int i2, ObjectCodec objectCodec) {
        super(i2, objectCodec);
        this._outputEscapes = sOutputEscapes;
        this._rootValueSeparator = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        this._ioContext = iOContext;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i2)) {
            this._maximumNonEscapedChar = 127;
        }
        this._cfgUnqNames = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i2);
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    protected void _checkStdFeatureChanges(int i2, int i3) {
        super._checkStdFeatureChanges(i2, i3);
        this._cfgUnqNames = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i2);
    }

    protected void _reportCantWriteValueExpectName(String str) throws IOException {
        _reportError(String.format("Can not %s, expecting field name (context: %s)", str, this._writeContext.typeDesc()));
    }

    protected void _verifyPrettyValueWrite(String str, int i2) throws IOException {
        if (i2 == 0) {
            if (this._writeContext.inArray()) {
                this._cfgPrettyPrinter.beforeArrayValues(this);
                return;
            } else {
                if (this._writeContext.inObject()) {
                    this._cfgPrettyPrinter.beforeObjectEntries(this);
                    return;
                }
                return;
            }
        }
        if (i2 == 1) {
            this._cfgPrettyPrinter.writeArrayValueSeparator(this);
            return;
        }
        if (i2 == 2) {
            this._cfgPrettyPrinter.writeObjectFieldValueSeparator(this);
            return;
        }
        if (i2 == 3) {
            this._cfgPrettyPrinter.writeRootValueSeparator(this);
        } else if (i2 != 5) {
            _throwInternal();
        } else {
            _reportCantWriteValueExpectName(str);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        super.disable(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this._cfgUnqNames = true;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        if (characterEscapes != null) {
            throw null;
        }
        this._outputEscapes = sOutputEscapes;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setHighestNonEscapedChar(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this._maximumNonEscapedChar = i2;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        this._rootValueSeparator = serializableString;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStringField(String str, String str2) throws IOException {
        writeFieldName(str);
        writeString(str2);
    }
}

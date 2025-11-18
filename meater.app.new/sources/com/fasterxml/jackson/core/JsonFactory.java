package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.p176io.CharacterEscapes;
import com.fasterxml.jackson.core.p176io.IOContext;
import com.fasterxml.jackson.core.p176io.InputDecorator;
import com.fasterxml.jackson.core.p176io.OutputDecorator;
import com.fasterxml.jackson.core.p176io.UTF8Writer;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;

/* loaded from: classes2.dex */
public class JsonFactory implements Serializable {
    protected final transient ByteQuadsCanonicalizer _byteSymbolCanonicalizer;
    protected CharacterEscapes _characterEscapes;
    protected int _factoryFeatures;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected ObjectCodec _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected final transient CharsToNameCanonicalizer _rootCharSymbols;
    protected SerializableString _rootValueSeparator;
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    private static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
    protected static final ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef = new ThreadLocal<>();

    public enum Feature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);

        private final boolean _defaultState;

        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i2) {
            return (i2 & getMask()) != 0;
        }

        public int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this(null);
    }

    protected IOContext _createContext(Object obj, boolean z) {
        return new IOContext(_getBufferRecycler(), obj, z);
    }

    protected JsonGenerator _createGenerator(Writer writer, IOContext iOContext) throws IOException {
        WriterBasedJsonGenerator writerBasedJsonGenerator = new WriterBasedJsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, writer);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            writerBasedJsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            writerBasedJsonGenerator.setRootValueSeparator(serializableString);
        }
        return writerBasedJsonGenerator;
    }

    protected JsonParser _createParser(InputStream inputStream, IOContext iOContext) throws IOException {
        return new ByteSourceJsonBootstrapper(iOContext, inputStream).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    protected JsonGenerator _createUTF8Generator(OutputStream outputStream, IOContext iOContext) throws IOException {
        UTF8JsonGenerator uTF8JsonGenerator = new UTF8JsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, outputStream);
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            uTF8JsonGenerator.setCharacterEscapes(characterEscapes);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            uTF8JsonGenerator.setRootValueSeparator(serializableString);
        }
        return uTF8JsonGenerator;
    }

    protected Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, IOContext iOContext) throws IOException {
        return jsonEncoding == JsonEncoding.UTF8 ? new UTF8Writer(iOContext, outputStream) : new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    protected final InputStream _decorate(InputStream inputStream, IOContext iOContext) throws IOException {
        if (this._inputDecorator == null) {
            return inputStream;
        }
        throw null;
    }

    public BufferRecycler _getBufferRecycler() {
        if (!isEnabled(Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING)) {
            return new BufferRecycler();
        }
        ThreadLocal<SoftReference<BufferRecycler>> threadLocal = _recyclerRef;
        SoftReference<BufferRecycler> softReference = threadLocal.get();
        BufferRecycler bufferRecycler = softReference == null ? null : softReference.get();
        if (bufferRecycler != null) {
            return bufferRecycler;
        }
        BufferRecycler bufferRecycler2 = new BufferRecycler();
        threadLocal.set(new SoftReference<>(bufferRecycler2));
        return bufferRecycler2;
    }

    public boolean canUseCharArrays() {
        return true;
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        IOContext iOContext_createContext = _createContext(outputStream, false);
        iOContext_createContext.setEncoding(jsonEncoding);
        return jsonEncoding == JsonEncoding.UTF8 ? _createUTF8Generator(_decorate(outputStream, iOContext_createContext), iOContext_createContext) : _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, iOContext_createContext), iOContext_createContext), iOContext_createContext);
    }

    public JsonParser createParser(File file) throws IOException {
        IOContext iOContext_createContext = _createContext(file, true);
        return _createParser(_decorate(new FileInputStream(file), iOContext_createContext), iOContext_createContext);
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._factoryFeatures) != 0;
    }

    protected Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    public boolean requiresPropertyOrdering() {
        return false;
    }

    public JsonFactory setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    public JsonFactory(ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = objectCodec;
    }

    protected JsonParser _createParser(Reader reader, IOContext iOContext) throws IOException {
        return new ReaderBasedJsonParser(iOContext, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.makeChild(this._factoryFeatures));
    }

    protected JsonParser _createParser(char[] cArr, int i2, int i3, IOContext iOContext, boolean z) throws IOException {
        return new ReaderBasedJsonParser(iOContext, this._parserFeatures, null, this._objectCodec, this._rootCharSymbols.makeChild(this._factoryFeatures), cArr, i2, i2 + i3, z);
    }

    protected final Reader _decorate(Reader reader, IOContext iOContext) throws IOException {
        if (this._inputDecorator == null) {
            return reader;
        }
        throw null;
    }

    public JsonParser createParser(Reader reader) throws IOException {
        IOContext iOContext_createContext = _createContext(reader, false);
        return _createParser(_decorate(reader, iOContext_createContext), iOContext_createContext);
    }

    protected final OutputStream _decorate(OutputStream outputStream, IOContext iOContext) throws IOException {
        if (this._outputDecorator == null) {
            return outputStream;
        }
        throw null;
    }

    public JsonParser createParser(String str) throws IOException {
        int length = str.length();
        if (this._inputDecorator == null && length <= 32768 && canUseCharArrays()) {
            IOContext iOContext_createContext = _createContext(str, true);
            char[] cArrAllocTokenBuffer = iOContext_createContext.allocTokenBuffer(length);
            str.getChars(0, length, cArrAllocTokenBuffer, 0);
            return _createParser(cArrAllocTokenBuffer, 0, length, iOContext_createContext, true);
        }
        return createParser(new StringReader(str));
    }

    protected final Writer _decorate(Writer writer, IOContext iOContext) throws IOException {
        if (this._outputDecorator == null) {
            return writer;
        }
        throw null;
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        IOContext iOContext_createContext = _createContext(writer, false);
        return _createGenerator(_decorate(writer, iOContext_createContext), iOContext_createContext);
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream(file);
        IOContext iOContext_createContext = _createContext(fileOutputStream, true);
        iOContext_createContext.setEncoding(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(fileOutputStream, iOContext_createContext), iOContext_createContext);
        }
        return _createGenerator(_decorate(_createWriter(fileOutputStream, jsonEncoding, iOContext_createContext), iOContext_createContext), iOContext_createContext);
    }

    protected JsonFactory(JsonFactory jsonFactory, ObjectCodec objectCodec) {
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot();
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
    }
}

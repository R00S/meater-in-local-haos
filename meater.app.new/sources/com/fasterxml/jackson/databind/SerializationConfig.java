package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;

/* loaded from: classes2.dex */
public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig> implements Serializable {
    protected final PrettyPrinter _defaultPrettyPrinter;
    protected final FilterProvider _filterProvider;
    protected final int _formatWriteFeatures;
    protected final int _formatWriteFeaturesToChange;
    protected final int _generatorFeatures;
    protected final int _generatorFeaturesToChange;
    protected final int _serFeatures;
    protected final JsonInclude.Value _serializationInclusion;
    protected static final PrettyPrinter DEFAULT_PRETTY_PRINTER = new DefaultPrettyPrinter();
    protected static final JsonInclude.Value DEFAULT_INCLUSION = JsonInclude.Value.empty();

    public SerializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = MapperConfig.collectFeatureDefaults(SerializationFeature.class);
        this._defaultPrettyPrinter = DEFAULT_PRETTY_PRINTER;
        this._generatorFeatures = 0;
        this._generatorFeaturesToChange = 0;
        this._formatWriteFeatures = 0;
        this._formatWriteFeaturesToChange = 0;
        this._serializationInclusion = DEFAULT_INCLUSION;
    }

    private final SerializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new SerializationConfig(this, baseSettings);
    }

    public PrettyPrinter constructDefaultPrettyPrinter() {
        PrettyPrinter prettyPrinter = this._defaultPrettyPrinter;
        return prettyPrinter instanceof Instantiatable ? (PrettyPrinter) ((Instantiatable) prettyPrinter).createInstance() : prettyPrinter;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public AnnotationIntrospector getAnnotationIntrospector() {
        return isEnabled(MapperFeature.USE_ANNOTATIONS) ? super.getAnnotationIntrospector() : AnnotationIntrospector.nopInstance();
    }

    public JsonInclude.Value getDefaultPropertyInclusion() {
        return this._serializationInclusion;
    }

    public FilterProvider getFilterProvider() {
        return this._filterProvider;
    }

    public void initialize(JsonGenerator jsonGenerator) {
        PrettyPrinter prettyPrinterConstructDefaultPrettyPrinter;
        if (SerializationFeature.INDENT_OUTPUT.enabledIn(this._serFeatures) && jsonGenerator.getPrettyPrinter() == null && (prettyPrinterConstructDefaultPrettyPrinter = constructDefaultPrettyPrinter()) != null) {
            jsonGenerator.setPrettyPrinter(prettyPrinterConstructDefaultPrettyPrinter);
        }
        boolean zEnabledIn = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._serFeatures);
        int i2 = this._generatorFeaturesToChange;
        if (i2 != 0 || zEnabledIn) {
            int i3 = this._generatorFeatures;
            if (zEnabledIn) {
                int mask = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i3 |= mask;
                i2 |= mask;
            }
            jsonGenerator.overrideStdFeatures(i3, i2);
        }
        int i4 = this._formatWriteFeaturesToChange;
        if (i4 != 0) {
            jsonGenerator.overrideFormatFeatures(this._formatWriteFeatures, i4);
        }
    }

    public <T extends BeanDescription> T introspect(JavaType javaType) {
        return (T) getClassIntrospector().forSerialization(this, javaType, this);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public BeanDescription introspectClassAnnotations(JavaType javaType) {
        return getClassIntrospector().forClassAnnotations(this, javaType, this);
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return (serializationFeature.getMask() & this._serFeatures) != 0;
    }

    public String toString() {
        return "[SerializationConfig: flags=0x" + Integer.toHexString(this._serFeatures) + "]";
    }

    public SerializationConfig with(MapperFeature... mapperFeatureArr) {
        int mask = this._mapperFeatures;
        for (MapperFeature mapperFeature : mapperFeatureArr) {
            mask |= mapperFeature.getMask();
        }
        return mask == this._mapperFeatures ? this : new SerializationConfig(this, mask, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withPropertyInclusion(JsonInclude.Value value) {
        return this._serializationInclusion.equals(value) ? this : new SerializationConfig(this, value);
    }

    public SerializationConfig withVisibility(PropertyAccessor propertyAccessor, JsonAutoDetect.Visibility visibility) {
        return _withBase(this._base.withVisibility(propertyAccessor, visibility));
    }

    public SerializationConfig without(MapperFeature... mapperFeatureArr) {
        int mask = this._mapperFeatures;
        for (MapperFeature mapperFeature : mapperFeatureArr) {
            mask &= mapperFeature.getMask() ^ (-1);
        }
        return mask == this._mapperFeatures ? this : new SerializationConfig(this, mask, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls) {
        JsonInclude.Value include;
        ConfigOverride configOverrideFindConfigOverride = findConfigOverride(cls);
        return (configOverrideFindConfigOverride == null || (include = configOverrideFindConfigOverride.getInclude()) == null) ? this._serializationInclusion : include;
    }

    public JsonInclude.Value getDefaultPropertyInclusion(Class<?> cls, JsonInclude.Value value) {
        JsonInclude.Value include;
        ConfigOverride configOverrideFindConfigOverride = findConfigOverride(cls);
        return (configOverrideFindConfigOverride == null || (include = configOverrideFindConfigOverride.getInclude()) == null) ? value : include;
    }

    public SerializationConfig with(DateFormat dateFormat) {
        SerializationConfig serializationConfig = new SerializationConfig(this, this._base.withDateFormat(dateFormat));
        if (dateFormat == null) {
            return serializationConfig.with(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        return serializationConfig.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public SerializationConfig without(SerializationFeature serializationFeature) {
        int mask = this._serFeatures & (serializationFeature.getMask() ^ (-1));
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig with(PropertyNamingStrategy propertyNamingStrategy) {
        return _withBase(this._base.withPropertyNamingStrategy(propertyNamingStrategy));
    }

    private SerializationConfig(SerializationConfig serializationConfig, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(serializationConfig, i2);
        this._serFeatures = i3;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = i4;
        this._generatorFeaturesToChange = i5;
        this._formatWriteFeatures = i6;
        this._formatWriteFeaturesToChange = i7;
    }

    public SerializationConfig with(SerializationFeature serializationFeature) {
        int mask = this._serFeatures | serializationFeature.getMask();
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    private SerializationConfig(SerializationConfig serializationConfig, BaseSettings baseSettings) {
        super(serializationConfig, baseSettings);
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = serializationConfig._serializationInclusion;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, JsonInclude.Value value) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._serializationInclusion = value;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }
}

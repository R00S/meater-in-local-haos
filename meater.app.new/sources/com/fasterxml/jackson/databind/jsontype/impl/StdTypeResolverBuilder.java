package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.Collection;

/* loaded from: classes2.dex */
public class StdTypeResolverBuilder implements TypeResolverBuilder<StdTypeResolverBuilder> {
    protected TypeIdResolver _customIdResolver;
    protected Class<?> _defaultImpl;
    protected JsonTypeInfo.EnumC5962Id _idType;
    protected JsonTypeInfo.EnumC5961As _includeAs;
    protected boolean _typeIdVisible = false;
    protected String _typeProperty;

    /* renamed from: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder$1 */
    static /* synthetic */ class C59811 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As;
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id;

        static {
            int[] iArr = new int[JsonTypeInfo.EnumC5962Id.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id = iArr;
            try {
                iArr[JsonTypeInfo.EnumC5962Id.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[JsonTypeInfo.EnumC5962Id.MINIMAL_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[JsonTypeInfo.EnumC5962Id.NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[JsonTypeInfo.EnumC5962Id.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[JsonTypeInfo.EnumC5962Id.CUSTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonTypeInfo.EnumC5961As.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = iArr2;
            try {
                iArr2[JsonTypeInfo.EnumC5961As.WRAPPER_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.EnumC5961As.PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.EnumC5961As.WRAPPER_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.EnumC5961As.EXTERNAL_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.EnumC5961As.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static StdTypeResolverBuilder noTypeInfoBuilder() {
        return new StdTypeResolverBuilder().init(JsonTypeInfo.EnumC5962Id.NONE, (TypeIdResolver) null);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
        JavaType javaTypeConstructType = null;
        if (this._idType == JsonTypeInfo.EnumC5962Id.NONE || javaType.isPrimitive()) {
            return null;
        }
        TypeIdResolver typeIdResolverIdResolver = idResolver(deserializationConfig, javaType, collection, false, true);
        Class<?> cls = this._defaultImpl;
        if (cls != null) {
            javaTypeConstructType = (cls == Void.class || cls == NoClass.class) ? deserializationConfig.getTypeFactory().constructType(this._defaultImpl) : deserializationConfig.getTypeFactory().constructSpecializedType(javaType, this._defaultImpl);
        }
        JavaType javaType2 = javaTypeConstructType;
        int i2 = C59811.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[this._includeAs.ordinal()];
        if (i2 == 1) {
            return new AsArrayTypeDeserializer(javaType, typeIdResolverIdResolver, this._typeProperty, this._typeIdVisible, javaType2);
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return new AsWrapperTypeDeserializer(javaType, typeIdResolverIdResolver, this._typeProperty, this._typeIdVisible, javaType2);
            }
            if (i2 == 4) {
                return new AsExternalTypeDeserializer(javaType, typeIdResolverIdResolver, this._typeProperty, this._typeIdVisible, javaType2);
            }
            if (i2 != 5) {
                throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
            }
        }
        return new AsPropertyTypeDeserializer(javaType, typeIdResolverIdResolver, this._typeProperty, this._typeIdVisible, javaType2, this._includeAs);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.EnumC5962Id.NONE || javaType.isPrimitive()) {
            return null;
        }
        TypeIdResolver typeIdResolverIdResolver = idResolver(serializationConfig, javaType, collection, true, false);
        int i2 = C59811.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[this._includeAs.ordinal()];
        if (i2 == 1) {
            return new AsArrayTypeSerializer(typeIdResolverIdResolver, null);
        }
        if (i2 == 2) {
            return new AsPropertyTypeSerializer(typeIdResolverIdResolver, null, this._typeProperty);
        }
        if (i2 == 3) {
            return new AsWrapperTypeSerializer(typeIdResolverIdResolver, null);
        }
        if (i2 == 4) {
            return new AsExternalTypeSerializer(typeIdResolverIdResolver, null, this._typeProperty);
        }
        if (i2 == 5) {
            return new AsExistingPropertyTypeSerializer(typeIdResolverIdResolver, null, this._typeProperty);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public /* bridge */ /* synthetic */ TypeResolverBuilder defaultImpl(Class cls) {
        return defaultImpl((Class<?>) cls);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public Class<?> getDefaultImpl() {
        return this._defaultImpl;
    }

    protected TypeIdResolver idResolver(MapperConfig<?> mapperConfig, JavaType javaType, Collection<NamedType> collection, boolean z, boolean z2) {
        TypeIdResolver typeIdResolver = this._customIdResolver;
        if (typeIdResolver != null) {
            return typeIdResolver;
        }
        JsonTypeInfo.EnumC5962Id enumC5962Id = this._idType;
        if (enumC5962Id == null) {
            throw new IllegalStateException("Can not build, 'init()' not yet called");
        }
        int i2 = C59811.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[enumC5962Id.ordinal()];
        if (i2 == 1) {
            return new ClassNameIdResolver(javaType, mapperConfig.getTypeFactory());
        }
        if (i2 == 2) {
            return new MinimalClassNameIdResolver(javaType, mapperConfig.getTypeFactory());
        }
        if (i2 == 3) {
            return TypeNameIdResolver.construct(mapperConfig, javaType, collection, z, z2);
        }
        if (i2 == 4) {
            return null;
        }
        throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this._idType);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder defaultImpl(Class<?> cls) {
        this._defaultImpl = cls;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder inclusion(JsonTypeInfo.EnumC5961As enumC5961As) {
        if (enumC5961As == null) {
            throw new IllegalArgumentException("includeAs can not be null");
        }
        this._includeAs = enumC5961As;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder init(JsonTypeInfo.EnumC5962Id enumC5962Id, TypeIdResolver typeIdResolver) {
        if (enumC5962Id == null) {
            throw new IllegalArgumentException("idType can not be null");
        }
        this._idType = enumC5962Id;
        this._customIdResolver = typeIdResolver;
        this._typeProperty = enumC5962Id.getDefaultPropertyName();
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder typeIdVisibility(boolean z) {
        this._typeIdVisible = z;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder typeProperty(String str) {
        if (str == null || str.length() == 0) {
            str = this._idType.getDefaultPropertyName();
        }
        this._typeProperty = str;
        return this;
    }
}

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class TypeNameIdResolver extends TypeIdResolverBase {
    protected final MapperConfig<?> _config;
    protected final Map<String, JavaType> _idToType;
    protected final Map<String, String> _typeToId;

    protected TypeNameIdResolver(MapperConfig<?> mapperConfig, JavaType javaType, Map<String, String> map, Map<String, JavaType> map2) {
        super(javaType, mapperConfig.getTypeFactory());
        this._config = mapperConfig;
        this._typeToId = map;
        this._idToType = map2;
    }

    protected static String _defaultTypeId(Class<?> cls) {
        String name = cls.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf < 0 ? name : name.substring(iLastIndexOf + 1);
    }

    public static TypeNameIdResolver construct(MapperConfig<?> mapperConfig, JavaType javaType, Collection<NamedType> collection, boolean z, boolean z2) {
        JavaType javaType2;
        if (z == z2) {
            throw new IllegalArgumentException();
        }
        HashMap map = null;
        Map map2 = z ? new HashMap() : null;
        if (z2) {
            map = new HashMap();
            map2 = new TreeMap();
        }
        if (collection != null) {
            for (NamedType namedType : collection) {
                Class<?> type = namedType.getType();
                String name = namedType.hasName() ? namedType.getName() : _defaultTypeId(type);
                if (z) {
                    map2.put(type.getName(), name);
                }
                if (z2 && ((javaType2 = (JavaType) map.get(name)) == null || !type.isAssignableFrom(javaType2.getRawClass()))) {
                    map.put(name, mapperConfig.constructType(type));
                }
            }
        }
        return new TypeNameIdResolver(mapperConfig, javaType, map2, map);
    }

    protected JavaType _typeFromId(String str) {
        return this._idToType.get(str);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String getDescForKnownTypeIds() {
        return new TreeSet(this._idToType.keySet()).toString();
    }

    protected String idFromClass(Class<?> cls) {
        String str_defaultTypeId;
        if (cls == null) {
            return null;
        }
        Class<?> rawClass = this._typeFactory.constructType(cls).getRawClass();
        String name = rawClass.getName();
        synchronized (this._typeToId) {
            str_defaultTypeId = this._typeToId.get(name);
            if (str_defaultTypeId == null) {
                if (this._config.isAnnotationProcessingEnabled()) {
                    str_defaultTypeId = this._config.getAnnotationIntrospector().findTypeName(this._config.introspectClassAnnotations(rawClass).getClassInfo());
                }
                if (str_defaultTypeId == null) {
                    str_defaultTypeId = _defaultTypeId(rawClass);
                }
                this._typeToId.put(name, str_defaultTypeId);
            }
        }
        return str_defaultTypeId;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromValue(Object obj) {
        return idFromClass(obj.getClass());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromValueAndType(Object obj, Class<?> cls) {
        return obj == null ? idFromClass(cls) : idFromValue(obj);
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", TypeNameIdResolver.class.getName(), this._idToType);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public JavaType typeFromId(DatabindContext databindContext, String str) {
        return _typeFromId(str);
    }
}
